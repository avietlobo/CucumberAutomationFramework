package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/functionalTests", plugin = { "json:target/cucumber-reports/cucumber.json",
      "pretty", "html:target/html-report/cucumber-html-reports.html",
      "junit:target/cucumber-reports/cucumber.xml" }, glue = {
              "stepDefinition" }, monochrome = true )
public class TestRunnerJUnit {

}
