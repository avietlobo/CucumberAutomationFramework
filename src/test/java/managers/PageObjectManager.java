package managers;

import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.HotelsPage;

public class PageObjectManager {

	private WebDriver driver;

	private HomePage homePage;
	private HotelsPage hotelsPage;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	public HomePage getHomePage() {

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;

	}

	public HotelsPage getHotelsPage() {

		return (hotelsPage == null) ? hotelsPage = new HotelsPage(driver) : hotelsPage;

	}

}
