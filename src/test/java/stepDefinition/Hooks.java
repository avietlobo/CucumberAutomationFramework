package stepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	private final TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;
	}

	@Before
	public void beforeSteps() {
		/*
		 * What all you can perform here Starting a webdriver Setting up DB connections
		 * Setting up test data Setting up browser cookies Navigating to certain page or
		 * anything before the test
		 */
	}

	@After
	public void tearDown() {
		testContext.getWebDriverManager().closeDriver();
	}

	@AfterStep
	public void afterStep(Scenario scenario) {

		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) testContext.getWebDriverManager().getDriver())
					.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "screenshot");
		}

	}

}
