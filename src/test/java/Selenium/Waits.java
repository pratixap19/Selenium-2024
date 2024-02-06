package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {

		// geckoDriver exe path
		System.setProperty("webdriver.gecko.driver", "C:\\Pratixa\\Drivers\\geckodriver.exe");

		// create object of FirefoxDriver class
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement signInBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
		signInBtn.click();
	}

}
