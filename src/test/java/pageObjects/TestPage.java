package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.GenericUtils;
//import utils.TestBase;
import utils.TestContextSetup;

public class TestPage  {
	public String offerPageProductName;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	 WebDriver driver;
	
	
//	LandingPage l=new LandingPage(driver);
	
	public TestPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	
	By searchField = By.name("q");
	By searchButton =By.name("btnK");
	By search = By.xpath("//input[@type='search']");
	By cartButton =By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	By cart= By.xpath("//*[@id='root']/div/header/div/div[3]/a[4]/img");
	
	
	public void typeText() {
		
		System.out.println("Type text");
		testContextSetup.genericUtils.elementSendKeys(search, "Search Text"); 
		
	}
	
	public void buttonClick() throws InterruptedException {
		testContextSetup.genericUtils.elementClick(cart); 
		Thread.sleep(3000);
		
	}
	
	public void proceedCheckout() {
		testContextSetup.genericUtils.elementClick(cartButton); 
		
	}
	
//	public void switchToOffersPage()
//	{
//		LandingPage landingPage  =testContextSetup.pageObjectManager.getLandingPage();
//		landingPage.selectTopDealsPage();
//		testContextSetup.genericUtils.SwitchWindowToChild();
//		
//		
//	}

}
