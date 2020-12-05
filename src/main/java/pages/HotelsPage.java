package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import dataProvider.ConfigFileReader;
import selenium.Wait;

public class HotelsPage {

	WebDriver driver;
	ConfigFileReader configFileReader;

	public HotelsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader = new ConfigFileReader();

	}

	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Explore More')]")
	private WebElement exploreMore;

	@FindBy(how = How.XPATH, using = "//input[@id='downshift-1-input']")
	private WebElement where;

	@FindBy(how = How.XPATH, using = "//*[@data-testid='searchHotelBtn']")
	private WebElement search;

	public void explore() {
		exploreMore.click();

	}

	public void searchHotels(String location) {
		where.click();
		where.sendKeys(location);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		Wait.untilJqueryIsDone(driver);
		// search.click();

	}

	public String getLocation() {
		return "Mumbai";
	}

}
