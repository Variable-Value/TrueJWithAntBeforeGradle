package tlang;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.TokenStreamRewriter.RewriteOperation;
import org.antlr.v4.runtime.misc.Interval;
import org.eclipse.jdt.annotation.Nullable;
import tlang.TLantlrParser.T_enterExprsContext;

/**
 * A Superclass for the rewriters that transform and operate on the T language trees, to simplify
 * their code and hold common components.
 *
 * In order to see the original code before rewriting, use a fake name for the program like
 * getSourceOf("NO_CHANGES", ctx)
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
final String source(ParserRuleContext ctx) {
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
final String source(String programName, ParserRuleContext ctx) {
  return getText(programName, ctx.getSourceInterval());
}

public String sourceWithoutComments(ParserRuleContext ctx) {
  String sourceLeft = source(ctx);
  int startOfComment = firstFoundPositon(sourceLeft, endOfLineCommentStart, inLineCommentStart);
  if (startOfComment < 0)
    return sourceLeft;

  StringBuilder newString = new StringBuilder(sourceLeft.length() - startOfComment);
  do {
    newString.append(sourceLeft.substring(0, startOfComment));
    if (sourceLeft.substring(startOfComment, startOfComment+2) == inLineCommentStart )
      sourceLeft = sourceLeft.substring(sourceLeft.indexOf(inLineCommentEnd) + 2);
    else
      sourceLeft = afterEndOfLine(sourceLeft);
    startOfComment = firstFoundPositon(sourceLeft, endOfLineCommentStart, inLineCommentStart);
  } while (startOfComment > 0);
  newString.append(sourceLeft);
  return newString.toString();
}

/**
 * @param sourceLeft
 * @return
 */
private String afterEndOfLine(String sourceLeft) {
  int end = sourceLeft.length();
  int nextLine = sourceLeft.indexOf(endOfLineCommentEnd) + 1;
  return sourceLeft.substring((end < nextLine) ? end : nextLine);
}

/** Return the position of the first substring found in the string. If both are missing, return -1.
 *
 * @param source The string to be searched
 * @param first The first substring to search for
 * @param second The second substring to search for
 * @return The position of the first substring found, or -1 if neither is found
 */
public int firstFoundPositon(String source, String first, String second) {
  int startFirst = source.indexOf(first);
  int startSecond = source.indexOf(second);
  if (startFirst == -1)
    return startSecond;
  if (startSecond == -1)
    return startFirst;

  return (startFirst < startSecond) ? startFirst : startSecond;
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
