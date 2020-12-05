package stepDefinition;

import cucumber.TestContext;
import dataProvider.ConfigFileReader;
import enums.Context;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import managers.FileReaderManager;
import pages.HomePage;
import pages.HotelsPage;

public class HomePageSteps {

	HomePage homePage;
	ConfigFileReader configFileReader;
	TestContext testContext;
	HotelsPage hotelsPage;

	public HomePageSteps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
		hotelsPage = testContext.getPageObjectManager().getHotelsPage();
	}

	
	@Given("I am on the Home Page")
	public void i_am_on_the_home_page() {
		configFileReader = new ConfigFileReader();
		System.setProperty("webdriver.chrome.driver",
				FileReaderManager.getInstance().getConfigReader().getDriverPath());
		testContext.getWebDriverManager().getDriver().get(configFileReader.getApplicationUrl());
	}

	@When("I navigate to hotels page")
	public void i_navigate_to_hotels_page() throws InterruptedException {
		homePage.findHotels();
		String location = hotelsPage.getLocation(); 
		testContext.scenarioContext.setContext(Context.LOCATION, location);
	}

}
