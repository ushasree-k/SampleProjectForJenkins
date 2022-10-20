package testcases;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utilities.BaseClass;


public class IphoneProduct extends BaseClass {
	
	@Test(priority=1)
	public void iphone() throws InterruptedException, IOException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));  //2sec
		WebElement Search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='q' and @type='text']")));
		Search.sendKeys("iphone");
		System.out.println("Entered iphone in search bar");
		Search.sendKeys(Keys.ENTER);
		System.out.println("Clicked on search");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//strong[contains(text(),'iPhone 11 Pro 256GB Memory')]"))).click();
		System.out.println("Clicked on product");
		Thread.sleep(3000);
		Select drpQuantity = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		drpQuantity.selectByVisibleText("3");
		System.out.println("Selected Quantity as 3");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Add To Cart')]"))).click();
		System.out.println("Clicked on Add to Cart");
	
	}
	


}
