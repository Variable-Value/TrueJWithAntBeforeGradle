package tlang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.eclipse.jdt.annotation.Nullable;
import static tlang.TUtil.*;


public class    CollectingMsgListener extends BaseErrorListener {

/**
 * Pattern for significant content using code like
 * <p><code>nonWhiteSpace.matcher("a").find();</code>
 */
private static final Pattern nonWhiteSpace = Pattern.compile("[^\\h\\v]");
 /* Implementation note:
  * "\h" matches any character that is horizontal whitespace,
  *      i.e., [ \t\xA0\u1680\u180e\u2000-\u200a\u202f\u205f\u3000]
  * "\v" matches any character that is vertical whitespace,
  *      i.e., [\n\x0B\f\r\x85\u2028\u2029]
  * Therefore, "[^\h\v] matches any character that is not whitespace
  */

/**
 * Check for at least one non-whitespace character in the msg.
 *
 * @param string that may be empty or contain only whitespace
 * @return <code>true</code> if the string has at least one significant character
 */
private static boolean hasContent(String string) {
  return nonWhiteSpace.matcher(string).find();
}


private String                sourceName = "";
private ArrayList<LineMsg>    msgList = new ArrayList<LineMsg>();
private int                   errorCount = 0;
private int                   informationCount = 0;
private int                   traceBackSize = 1; // to report the violated rule
      public void setTraceBackSize(int newSize) { traceBackSize = newSize; }

public CollectingMsgListener() {}

public CollectingMsgListener(String source) {
  sourceName = source;
}

public CollectingMsgListener(int traceBackSize) {
  this.traceBackSize = traceBackSize;
}

public CollectingMsgListener(String source, int traceBackSize) {
  sourceName = source;
  this.traceBackSize = traceBackSize;
}


@Override
public void syntaxError( @Nullable Recognizer<?, ?> recognizer
                       , @Nullable Object offendingSymbol
                       , int line
                       , int charPositionInLine
                       , @Nullable String msg
                       , @Nullable RecognitionException e
                       )
{ msg = (msg != null) ? msg : "";
  String program = programName(recognizer);
  List<@Nullable String> ruleStack = createRuleStack(program, recognizer);

  final String symbol = symbolMsg(offendingSymbol);
  if (isRealError(msg)) {
    collectError( program, symbol, line, charPositionInLine, msg, ruleStack);
  } else {
    collectMsg( program, symbol, line, charPositionInLine, msg, ruleStack);
  }
}

/**
 * @param recognizer
 * @return
 */
private String programName(Recognizer<?, ?> recognizer) {
  String program;
  if (recognizer instanceof Lexer)  {
    program = "lexical";
  }
  else if (recognizer instanceof Parser) {
    program = "Parse";
  }
  else if (  recognizer == null
          || recognizer.toString().equals( ((Object)recognizer).toString() )
          ) {
    program = "Unknown program";
  } else {
    program = recognizer.toString();
  }
  // program = (program != null) ? program : "";
  return program;
}

private List<@Nullable String>
createRuleStack(String recognizerType, @Nullable Recognizer<?, ?> recognizer)
{
  if (recognizerType == "Parse") {
    Parser parser = (Parser)recognizer;
    List<@Nullable String> ruleStack = parser.getRuleInvocationStack();
    keepFirstFew(ruleStack, traceBackSize);
    return ruleStack;
  } else {
    return new ArrayList<@Nullable String>(0);
  }
}

private void keepFirstFew(List<@Nullable String> ruleStack, int dropFrom) {
  if (ruleStack.size() > dropFrom) {
    ruleStack.subList(dropFrom, ruleStack.size()).clear();
  }
}

public void collectError( String program
                        , Object offendingSymbol // e.g., token or String
                        , int line
                        , int charPositionInLine
                        , String msg
                        , List<@Nullable String> ruleStack
                        )
{ collectError(line, program+ " error at line " +line+ ":" +charPositionInLine
                 + offendingSymbol+ ": " + msg + ruleString(ruleStack)
                 );
}

public void collectMsg( String program
    , Token offendingToken
    , String msg
    )
{ collectMsg( program
            , offendingToken.getText()
            , offendingToken.getLine()
            , offendingToken.getCharPositionInLine()
            , msg
            );
}

public void collectError( String program
    , Token offendingToken
    , String msg
    )
{ collectError( program
              , offendingToken.getText()
              , offendingToken.getLine()
              , offendingToken.getCharPositionInLine()
              , msg
              );
}

public void collectMsg( String program
                      , String offendingCode
                      , int line
                      , int charPositionInLine
                      , String msg
                      , List<@Nullable String> ruleStack
                      )
{ collectMsg(line, program+ " issue at line " +line+ ":" +charPositionInLine
                   +symbolMsg(offendingCode)+ ": " + msg + ruleString(ruleStack)
            );
}

public void collectMsg( String program
                       , String offendingCode
                       , int line
                       , int charPositionInLine
                       , String msg
                       )
{ collectMsg(line, program+ " issue at line " +line+ ":" +charPositionInLine
                   +symbolMsg(offendingCode)+ ": " + msg
            );
}

public void collectError( String program
                        , String offendingCode
                        , int line
                        , int charPositionInLine
                        , String msg
                        )
{ collectError(line, program+ " error at line " +line+ ":" +charPositionInLine
                     +symbolMsg(offendingCode)+ ": " + msg
              );
}

private static boolean isRealError(@Nullable String msg) {
  if (  msg == null
     || msg.contains("reportContextSensitivity")
     || msg.contains("reportAttemptingFullContext")
     )
    return false; // information msg or null
  else
    return true;  // error  msg
}

private String symbolMsg(@Nullable Object offendingCode) {
  return (offendingCode == null) ? "" : " for <" +offendingCode +">";
}


public static String
ruleString(List<@Nullable String> ruleStack) {
  if (ruleStack.size() > 0) {
    StringBuilder ruleStrings = new StringBuilder();
    ruleStrings.append(" in rule ").append(ruleStack.get(0));
    if (ruleStack.size() > 1) {
      for (String rule : ruleStack) {
        ruleStrings.append("\n        ").append(rule);
      }
//      ruleStrings.append(" : [");
//      for (String rule : ruleStack) {
//        ruleStrings.append(rule).append(", ");
//      }
//      removeLastComma(ruleStrings);
//      ruleStrings.append("]");
    }
    return ruleStrings.toString();
  } else {
    return "";
  }
}

//private void removeLastComma(StringBuilder s) {
//  s.delete(s.length()-2, s.length());
//}

public void collectMsg(String msg) {
  collectMsg(0, msg);
}

public void collectMsg(int line, String msg) {
  if (hasContent(msg)) {
    msgList.add(new LineMsg(line, msg));
    informationCount++;
  }
}

public void collectError(String errMsg) {
  collectError(0, errMsg);
}

public void collectError(int line, String msg) {
  if (hasContent(msg)) {
    final boolean isError = true;
    msgList.add(new LineMsg(line, msg, isError));
    errorCount++;
  }
}

public List<String> lines() {
  List<String> lines = new ArrayList<>();
  for (LineMsg m : msgList) {
    lines.add(m.msg);
  }
  return lines;
}

public List<String> errLines() {
  List<String> errorLines = new ArrayList<>();
  for (LineMsg m : msgList) {
    if (m.isError()) {
      errorLines.add(m.msg);
    }
  }
  return errorLines;
}

public void newSource(String name) {
  clear();
  sourceName = name;
}

public boolean hasMsgs() {
  if (msgCount() == 0)
    return false;

  for (LineMsg lm : msgList) {
    if ( ! isWhiteSpace(lm.msg))
      return true;
  }
  return false;
}

public boolean hasErrs() {
  return errCount() > 0;
}

public boolean isEmpty() {
  return ! hasMsgs();
}

public boolean hasNoErrs() {
  return ! hasErrs();
}

public int msgCount() {
  return informationCount + errorCount;
}

public int errCount() {
  return errorCount;
}

/**
 * Reinitializes the message list to empty and resets all data to match that
 * state.
 */
public void clear() {
  msgList.clear();
  sourceName = "";
  informationCount = 0;
  errorCount = 0;
}

/**
 * Formats the list of messages as a string containing a line for each
 * message.
 * @return all messages in a single string
 */
@Override
public String toString() {
  final String emptyCollectorMsg = "No Messages";
  if (isEmpty()) {
    return emptyCollectorMsg;
  }

  Collections.sort(msgList);
  StringBuilder readyForPrint = new StringBuilder();
  if (sourceName != "") {
    readyForPrint.append(sourceName+ "\n");
  }
  for (LineMsg lm:msgList) {
    readyForPrint.append(lm.msg+ "\n");
  }
  if (readyForPrint.length() == 0) { return emptyCollectorMsg; }
                              else { return readyForPrint.toString(); }
}

    /*inner class*/ private class
LineMsg implements Comparable<LineMsg> {

  int lineNumber;
  String msg;
  boolean isError;
  boolean isError() { return isError; }

  LineMsg(int line, String msg){
    this(line, msg, false);
  }

  LineMsg(int line, String msg, boolean isError){
    this.lineNumber = line;
    this.msg = msg;
    this.isError = isError;
  }

  @Override
  public int compareTo(LineMsg lineMsg) {
    return Integer.compare(this.lineNumber, lineMsg.lineNumber);
  }

} // end inner class LineMsg


} // end class ColletingMsgListener
