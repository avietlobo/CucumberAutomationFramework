package stepDefinition;

import org.testng.Assert;

import cucumber.TestContext;
import dataProvider.ConfigFileReader;
import enums.Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import managers.FileReaderManager;
import pages.HotelsPage;
import testDataTypes.Customer;

public class HotelsPageSteps {

	HotelsPage hotelsPage;
	ConfigFileReader configFileReader;
	TestContext testContext;

	public HotelsPageSteps(TestContext context) {
		testContext = context;
		hotelsPage = testContext.getPageObjectManager().getHotelsPage();
	}

	@Then("I see the hotels displayed")
	public void i_see_the_hotels_displayed() {
		Assert.assertTrue(testContext.getWebDriverManager().getDriver().getCurrentUrl().contains("hotels"));
	}

	@And("I search for hotels at {string}")
	public void i_search_for_hotels_at(String location) {
		Customer customer = FileReaderManager.getInstance().getJsonReader().getCustomerByName("Aviet");
		hotelsPage.searchHotels(customer.address.city);
		String productName = (String)testContext.scenarioContext.getContext(Context.LOCATION);
		System.out.println(productName);
	}

}
