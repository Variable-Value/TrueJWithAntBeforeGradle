package tlang;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"progress", "html:build/reports/tests/cucumber/html"}, strict = true)
public class TestAllCucumberFeatures {
}
