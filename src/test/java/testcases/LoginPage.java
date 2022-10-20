package testcases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utilities.BaseClass;

public class LoginPage extends BaseClass {

	@Test(priority = 1)
	public void SignIn() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='basic-navbar-nav']/div/a[2]"))).click();
		System.out.println("Click on SignIn Header");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")))
				.sendKeys("test@gmail.com");
		System.out.println("Enter Username");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password']")))
				.sendKeys("Wynisco@123");
		System.out.println("Enter Password");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Sign In')]"))).click();
		System.out.println("Click on Signin button");
	}

}
