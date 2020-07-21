/**
 *
 */
package tlang;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Ignore;
import org.junit.Test;

public class TCompiler_test {

@Test
public void DecoratedFinalFieldUsedWithoutDecoration_errorTest() throws Exception {
  String unitMarker = "-unit";
  String compileUnit =   "  class TestClass {"
              + "\n"+    "  int a, b;"
              + "\n"+    "  int n' = 5;"
              + "\n"+""
              + "\n"+    "    void testMethod() {"
              + "\n"+    "      int startingA = n;"
              + "\n"+    "    }"
              + "\n"+""
              + "\n"+    "  } // end class"
              ;
  String[] args = {unitMarker, compileUnit};
  TCompiler truejCompiler = TCompiler.runTrueJCompiler(args);
  msgMustContain(truejCompiler, "n must be decorated");
}

@Test
public void UndecoratedFinalFieldUsedWithDecoration_errorTest() throws Exception {
  String unitMarker = "-unit";
  String compileUnit =   "  class TestClass {"
              + "\n"+    "  int a, b;"
              + "\n"+    "  int n = 5;"
              + "\n"+""
              + "\n"+    "    void testMethod() {"
              + "\n"+    "      int startingA = n';"
              + "\n"+    "    }"
              + "\n"+""
              + "\n"+    "  } // end class"
              ;
  String[] args = {unitMarker, compileUnit};
  TCompiler truejCompiler = TCompiler.runTrueJCompiler(args);
  msgMustContain(truejCompiler, "Value n' has not been defined for the variable n");
}

@Test
public void DecoratedFinalVariableUsedWithoutDecoration_errorTest() throws Exception {
  String methodBody = "      int startingA' = 'a;" // L5
              + "\n      b' = startingA';"         // L6
              + "\n      a  = startingA;"        // L7
              ;
  var truejCompiler = compileBody(methodBody);
  msgMustContain(truejCompiler, "startingA must be decorated");
}

@Test
public void UndecoratedFinalVariableUsedWithDecoration_errorTest() throws Exception {
  String methodBody = "      int startingA = 'a;" // L5
              + "\n      b' = startingA;"         // L6
              + "\n      a  = startingA';"        // L7
              ;
  var truejCompiler = compileBody(methodBody);
  msgMustContain(truejCompiler, "Value startingA' has not been defined for the variable startingA");
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
  String[] args = {unitMarker, compileUnit};
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
  TCompiler truejCompiler = TCompiler.runTrueJCompiler(args);
  return truejCompiler;
}

private void msgMustContain(TCompiler truejCompiler, String msgSegment) {
  assertTrue(errorMsgs(truejCompiler)
            , truejCompiler.msgCollector().hasMsgContaining(msgSegment));
}

private String errorMsgs(TCompiler truejCompiler) {
  return "TrueJ Compiler Messages Issued: "
              +"\n"+ truejCompiler.msgCollector().toString()
              +"\n"+ truejCompiler.javaMessages().toString();
}

private void compileMustSucceed(TCompiler truejCompiler) {
  assertTrue(errorMsgs(truejCompiler)
              , truejCompiler.counts().noErrors());
}



}
