/**
 *
 */
package tlang;

import static org.junit.Assert.*;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TCompiler_test {

@Test
public void DecoratedFinalFieldUsedWithoutDecoration_errorTest() throws Exception {
  String unitMarker = "-unit";
  String compileUnit =   "  class TestClass {"
              + "\n"+    "  int a, b;"
              + "\n"+    "  int n' = 5;"            // LINE 3
              + "\n"+""
              + "\n"+    "    void testMethod() {"
              + "\n"+    "      int startingA = n;" // ERROR LINE
              + "\n"+    "    }"
              + "\n"+""
              + "\n"+    "  } // end class"
              ;
  String[] args = {unitMarker, compileUnit};
  TCompiler truejCompiler = compileFresh(args);
  msgMustContain(truejCompiler, "A different final decoration, n', was defined at line 3");
}

@Test
public void UndecoratedFinalFieldUsedWithDecoration_errorTest() throws Exception {
  String unitMarker = "-unit";
  String compileUnit =   "  class TestClass {"
              + "\n"+    "  int a, b;"
              + "\n"+    "  int n = 5;"              // L3
              + "\n"+""
              + "\n"+    "    void testMethod() {"
              + "\n"+    "      int startingA = n';" // ERROR
              + "\n"+    "    }"
              + "\n"+""
              + "\n"+    "  } // end class"
              ;
  String[] args = {unitMarker, compileUnit};
  TCompiler truejCompiler = compileFresh(args);
  msgMustContain(truejCompiler, "A different final decoration, n, was defined at line 3");
}

@Test
public void DecoratedFinalVariableUsedWithoutDecoration_errorTest() throws Exception {
  String methodBody = "      int startingA' = 'a;" // L5
                  + "\n      b' = startingA';"     // L6 OK
                  + "\n      a  = startingA;"      // L7 ERROR
                  ;
  var truejCompiler = compileBody(methodBody);
  msgMustContain(truejCompiler, "A different final decoration, startingA', was defined at line 5");
}

@Test
public void UndecoratedFinalVariableUsedWithDecoration_errorTest() throws Exception {
  String methodBody = "      int startingA = 'a;" // L5
              + "\n      b' = startingA;"         // L6
              + "\n      a  = startingA';"        // L7
              ;
  var truejCompiler = compileBody(methodBody);
  msgMustContain(truejCompiler,
      "A different final decoration, startingA, was defined at line 5");
}

@Test
public void UseFinalFieldWithoutDecoration_test() throws Exception {
  String methodBody = "      int startingA = 'a;"
              + "\n      b' = startingA;"
              + "\n      a  = 'b;"
              ;
  var truejCompiler = compileBody(methodBody);
  compileMustSucceed(truejCompiler);
}

@Test
public void UseFinalVariableWithoutDecoration_test() throws Exception {
  String methodBody = "      int startingA = 'a;"
                  + "\n      b' = startingA;";
  var truejCompiler = compileBody(methodBody);
  compileMustSucceed(truejCompiler);
}

@Test
public void InitializeFinalVariableWithoutDecoration_test() throws Exception {
  String methodBody = "      int startingA = 'a;";
  var truejCompiler = compileBody(methodBody);
  compileMustSucceed(truejCompiler);
}

@Test
public void InitializeFinalFieldWithoutDecoration_test() throws Exception {
  String methodBody = "      int startingA = 'a;";
  String unitMarker = "-unit";
  String compileUnit =   "  class TestClass {"
              + "\n"+    "  int a, b;"
              + "\n"+    "  int n = a + b;"
              + "\n"+""
              + "\n"+""
              + "\n"+    "    void testMethod() {"
              + "\n"+    methodBody
              + "\n"+    "    }"
              + "\n"+""
              + "\n"+    "  } // end class"
              ;
  String[] args = new String[]{unitMarker, compileUnit};
  TCompiler truejCompiler = TCompiler.runTrueJCompiler(args);
  compileMustSucceed(truejCompiler);
}

private TCompiler compileBody(String methodBody) throws IOException, InterruptedException {
  String unitMarker = "-unit";
  String compileUnit =
           "  class TestClass {"         // L1
    + "\n"+"  int a, b;"                 // L2
    + "\n"+ ""                           // L3
    + "\n"+"    void testMethod() {"     // L4
    + "\n"+ methodBody                   // L5
    + "\n"+"    }"
    + "\n"+""
    + "\n"+"  } // end class"
    ;
  String[] args = {unitMarker, compileUnit};
  TCompiler truejCompiler = compileFresh(args);
  return truejCompiler;
}

private TCompiler compileFresh(String[] args) throws IOException, InterruptedException {
  TCompiler truejCompiler = TCompiler.runTrueJCompiler(args);
  return truejCompiler;
}

private void msgMustContain(TCompiler truejCompiler, String msgSegment) {
  System.out.println("From msgMustContain\n"+ errorMsgs(truejCompiler));
  if (truejCompiler.msgCollector().hasMsgContaining(msgSegment))
    return; // assertTrue(true);
  else
    assertEquals(msgSegment, errorMsgs(truejCompiler));
}

private void compileMustSucceed(TCompiler truejCompiler) {
  System.out.println("From compileMustSucceed\n"+ errorMsgs(truejCompiler));
  assertTrue(errorMsgs(truejCompiler)
              , truejCompiler.counts().noErrors());
}

/**
 * We print error messsages from both the regular and the Java compiler messages collector.
 * However both collectors will issue a "no messages" if they are empty, so we fiddle around to
 * prevent two "No messages" and to only issue a single one when both collectors are empty.
 */

private String errorMsgs(TCompiler truejCompiler) {
  String msgs = "\nERRORMSGS";
  if (truejCompiler.msgCollector().isEmpty())
    msgs += "\n"+ truejCompiler.javaMessages().toString();
  else if (truejCompiler.javaMessages().isEmpty())
    msgs += "\n"+ truejCompiler.msgCollector().toString();
  else
    msgs += "\n"+ truejCompiler.msgCollector().toString()
           +"\n"+ truejCompiler.javaMessages().toString();
  return "TrueJ Compiler Messages Issued: "+ msgs;
}

}
