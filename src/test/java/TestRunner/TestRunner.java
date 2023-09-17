package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", 
glue = "StepDefinition",
dryRun = false,
monochrome = true,
plugin = {"pretty", "html:target/Report/loginReport.html","html:target/Report/loginReport.xml","html:target/Report/loginReport.json"})
public class TestRunner {

}
