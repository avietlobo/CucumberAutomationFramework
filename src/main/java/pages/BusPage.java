package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BusPage {

	WebDriver driver;

	public BusPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}



}
