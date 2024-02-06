package Selenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonScenario {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Pratixa\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		WebElement signInLink = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		Actions action = new Actions(driver);
		action.moveToElement(signInLink).perform();
		WebElement signInBtn = driver.findElement(By.xpath("(//a/span[text()='Sign in'])[1]"));
		action.moveToElement(signInBtn).click().build().perform();
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("6039660034");
		driver.findElement(By.xpath("(//span[@class='a-button-inner'])[1]/input")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Amazon@123");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.xpath("(//div[@class='nav-fill'])[2]/div/input")).sendKeys("apple iphone 15 pro");
		driver.findElement(By.xpath("(//div[@class='nav-right'])[1]/div/span/input")).click();
		driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[4]/div/h2/a")).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='titleSection']/h1")).getText().trim().contains("Apple iPhone 15 Pro, 128GB, Natural Titanium - Unlocked (Renewed)"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='a-button-stack'])[4]//span[@class='a-button-inner']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='a-column a-span6 a-span-last'])[2]")).click();
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(@class, 'a-size-medium-plus a-color-base sw-atc-text a-text-bold')]")).isDisplayed());
		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='a-column a-span10']/h3")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//h3[text()='Order Summary']")).isDisplayed());
	
	}

}
