package selenium.testWebBrowser;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class FindProductTest {
	
	private WebDriver driver; 
	FindProductPage findProductPage;

	@Before
	public void setUp() throws Exception {
		findProductPage = new FindProductPage(driver);	
		driver = findProductPage.chromeDriver();
		findProductPage.visit("https://www.amazon.com/ref=nav_logo");

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void VerifyFindProductPage() {
		
		assertTrue(findProductPage.pageDisplayed());
	}

}
