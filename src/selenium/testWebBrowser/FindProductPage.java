package selenium.testWebBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindProductPage extends BasePage {

	
	//locators
		By carouserLocator = By.className("a-carousel-row-inner");
		
		
	public FindProductPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean pageDisplayed()
	{
		return isDisplayed(carouserLocator);
		
	}
}
