package utils;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtils {
	public  WebDriver driver;
	
	public GenericUtils(WebDriver driver)
	{
		this.driver = driver;
	}
	

	public void SwitchWindowToChild()
	{
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1 =s1.iterator();
		String parentWindow = i1.next();
		String childWindow = i1.next();
		driver.switchTo().window(childWindow);
	}
	

	public void elementSendKeys(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}
	
	
	public void elementClick(By locator) {
		driver.findElement(locator).click();
	}
	
//	public static void waitForElementClickable(By element) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//	}
	
}
