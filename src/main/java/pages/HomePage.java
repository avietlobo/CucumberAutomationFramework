package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import dataProvider.ConfigFileReader;

public class HomePage {

	WebDriver driver;
	ConfigFileReader configFileReader;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader= new ConfigFileReader();

	}

	@FindBy(how = How.XPATH, using = "//*[@href='/hotels/']//span[contains(text(),'Hotels')]")
	private WebElement hotels;

	@FindBy(how = How.XPATH, using = "//*[@href='/sbus/']//span[contains(text(),'Bus')]")
	private WebElement bus;

	public void findHotels() {
		hotels.click();
	}

}
