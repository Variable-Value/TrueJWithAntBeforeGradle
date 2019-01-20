package tlang;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.eclipse.jdt.annotation.Nullable;

/**
 * A Superclass for the rewriters that transform and operate on the T language trees, to simplify
 * their code and hold common components.
 *
 * In order to see the original code before rewriting, use a fake name for the program like
 * getSourceOf("NO_CHANGES", ctx)
 *
 * TODO: Extend antlr's TokenStreamRewriter to keep track of insertBefore() vs insertAfter() on a
 * Token and create another subclass of RewriteOperation, InsertAfterOp, and modify
 * InsertBeforeOp to track the info. Then in getText(), apply the after-ops after the
 * before-ops. Hopefully, this will not require actually associating them with
 * the following Token. Rewrite operations are just added to the end of the List of Rewrite
 * operations without respect of the token position, so we may need to override the
 * reduceToSingleOperationPerIndex() to
 * operate on an interval and properly sort out the before and after operations.
 */
public class ExtendedRewriter extends TokenStreamRewriter {

private static final String endOfLineCommentStart = "//";
private static final char endOfLineCommentEnd = '\n';
private static final String inLineCommentStart = "/\\*";
private static final String inLineCommentEnd = "*/";

public ExtendedRewriter(TokenStream tokens) {
  super(tokens);
}

@Override // to provide @Nullable String parameter
public final String
getText(@Nullable String programName) {
  return super.getText(programName, Interval.of(0, tokens.size() - 1));
}

/** Get the full source, including any changes that have been made, of the parse-tree at node
 * <code>ctx</code>, including whitespace and comments. To see the source before changes use a
 * programName argument that has not been written to, like
 * <code>getSourceOf("NO_CHANGES", ctx)</code>
 * @param ctx parse-tree node
 * @return source code corresponding to the parse tree at <code>ctx</code>
 */
final String source(ParseTree ctx) {
  return source(DEFAULT_PROGRAM_NAME, ctx);
//  OR return tokens.getText(ctx.getSourceInterval());
  }

/** Get the full source, including any changes that have been made, of the parse-tree at node
 * <code>ctx</code>, including whitespace and comments. Use this in preference to the
 * <code>ctx.getText()</code> defined in <code>RuleContext</code>, which only gets info from the
 * channel that is visible to the parser, i.e., no whitespace or comments.
 * @param programName The output name, i.e., the name of the program that operates on the source to
 *                    collect all the changes into the updated form of the source. To see the
 *                    original form of the source, use a fake name, such as "NO_CHANGES" here.
 * @param ctx The root of the parse-tree node for the source code
 * @return source code corresponding to the parse tree at <code>ctx</code>
 */
final String source(String programName, ParseTree ctx) {
  return getText(programName, ctx.getSourceInterval());
}

/** Get the full source, before any changes were made, of the parse-tree at node
 * <code>ctx</code>, including whitespace and comments. Use this in preference to the
 * <code>ctx.getText()</code> defined in <code>RuleContext</code>, which only gets info from the
 * channel that is visible to the parser, i.e., no whitespace or comments.
 * @param ctx The root of the parse-tree node for the source code
 * @return original input source code corresponding to the parse tree at <code>ctx</code>
 */
final String originalSource(ParseTree ctx) {
  return getText("WITHOUT_CHANGES$T$", ctx.getSourceInterval());
}

/** Get the full source, including any changes that have been made, of the parse-tree at node
 * <code>ctx</code>, including whitespace but not comments. Use this in preference to the
 * <code>ctx.getText()</code> defined in <code>RuleContext</code>, which only gets info from the
 * channel that is visible to the parser, i.e., no whitespace or comments.
 * @param programName The output name, i.e., the name of the program that operates on the source to
 *                    collect all the changes into the updated form of the source. To see the
 *                    original form of the source, use a fake name, such as "NO_CHANGES" here.
 * @param ctx The root of the parse-tree node for the source code
 * @return source code corresponding to the parse tree at <code>ctx</code>
 */
public String sourceWithoutComments(ParseTree ctx) {
  String sourceLeft = source(ctx); // so far
  int startOfNextComment = nextCommentStart(sourceLeft);
  if (startOfNextComment < 0)
    return sourceLeft;

  int minLengthOfResult = sourceLeft.length() - startOfNextComment;
  StringBuilder newString = new StringBuilder(minLengthOfResult);

  do {
    String preCommentCode = sourceLeft.substring(0, startOfNextComment);
    newString.append(preCommentCode);

    if (isInlineComment(sourceLeft, startOfNextComment) )
      sourceLeft = afterEndOfInlineComment(sourceLeft);
    else
      sourceLeft = afterEndOfLine(sourceLeft);

    startOfNextComment = nextCommentStart(sourceLeft);
  } while (startOfNextComment > 0);

  newString.append(sourceLeft);
  return newString.toString();
}

private String afterEndOfInlineComment(String sourceLeft) {
  int positionAfterEndOfComment = sourceLeft.indexOf(inLineCommentEnd) + 2;
  return sourceLeft.substring(positionAfterEndOfComment);
}

/**
 * @param sourceLeft
 * @return
 */
private String afterEndOfLine(String sourceLeft) {
  int end = sourceLeft.length();
  int nextLine = sourceLeft.indexOf(endOfLineCommentEnd) + 1;
  return sourceLeft.substring(min(end, nextLine));
}

private boolean isInlineComment(String sourceLeft, int startOfNextComment) {
  return sourceLeft.substring(startOfNextComment, startOfNextComment+2) == inLineCommentStart;
}

/** Return the position of the first comment found in the string. If no comment is found, return -1.
 * <p>
 * Note that we can't just take the max of the positions because we want the first,
 * and we can't just take the min because any missing value would result in -1 and not the
 * position of another present substring.
 *
 * @param source The string to be searched
 * @return The position of the first substring found, or -1 if neither is found
 */
public int nextCommentStart(String source) {
  int startEolComment    = source.indexOf(endOfLineCommentStart);
  int startInLineComment = source.indexOf(inLineCommentStart);

  if      (commentMissing(startEolComment))    return startInLineComment;
  else if (commentMissing(startInLineComment)) return startEolComment;
  else                                         return min(startEolComment, startInLineComment);
}

private boolean commentMissing(int startOfComment) {
  return startOfComment == -1;
}

private int min(int n1, int n2) {
  return (n1 < n2) ? n1 : n2;
}

/**
 * Substitute the given text for that in the parse-tree node ctx.
 * @param ctx parse-tree node
 * @param text source code desired for the parse tree at <code>ctx</code>
 */
final void substituteText(ParserRuleContext ctx, String text) {
  replace(ctx.getStart(), ctx.getStop(), text);
}

/**
 * Substitute the given text for that in the parse-tree node ctx.
 * @param programName the output name, i.e., the output program created from the input source
 * @param ctx parse-tree node
 * @param text source code desired for the parse tree at <code>ctx</code>
 */
final void substituteText(String outputType, ParserRuleContext ctx, String text) {
  replace(outputType, ctx.getStart(), ctx.getStop(), text);
}

}
