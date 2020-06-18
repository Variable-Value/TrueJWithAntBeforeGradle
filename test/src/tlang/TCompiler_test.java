/**
 *
 */
package tlang;

import static org.junit.Assert.*;
import org.junit.Test;
import tlang.TCompiler;

/**
 * @author cowan
 *
 */
public class TCompiler_test {

@Test
public void new_test() throws Exception {
  String unitMarker = "-unit";
  String compileUnit = "class class {}";
  String[] args = {unitMarker, compileUnit};
  TCompiler truejCompiler = TCompiler.runTrueJCompiler(args);
  assertTrue("TrueJ Compiler Messages Issued: "
              +"\n"+ truejCompiler.msgCollector().toString()
              +"\n"+ truejCompiler.javaMessages().toString()
              , truejCompiler.msgCollector().hasMsgContaining(
                          "mismatched input 'class' expecting UndecoratedIdentifier"));
}

@Test
public void commandLineCompileUnit_error() throws Exception {
  String unitMarker = "-unit";
  String compileUnit = "class class {}";
  String[] args = {unitMarker, compileUnit};
  TCompiler truejCompiler = TCompiler.runTrueJCompiler(args);
  assertTrue("TrueJ Compiler Messages Issued: "
                +"\n"+ truejCompiler.msgCollector().toString()
                +"\n"+ truejCompiler.javaMessages().toString()
            , truejCompiler.msgCollector().hasMsgContaining(
                       "mismatched input 'class' expecting UndecoratedIdentifier"));
}

@Test
public void commandLineCompileUnit_present() throws Exception {
  String unitMarker = "-unit";
  String compileUnit = "class XXX {}";
  String[] args = {unitMarker, compileUnit};
  TCompiler truejCompiler = TCompiler.runTrueJCompiler(args);
  assertTrue("TrueJ Compiler Messages Issued: "
                +"\n"+ truejCompiler.msgCollector().toString()
                +"\n"+ truejCompiler.javaMessages().toString()
            , truejCompiler.counts().noErrors());
}

}
