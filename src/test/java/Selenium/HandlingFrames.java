package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		driver.get("https://www.rediff.com/");
//		//switch to iframe using id
//		driver.switchTo().frame("moneyiframe");
//		String nseIndex = driver.findElement(By.id("nseindex")).getText();
//		System.out.println("nseIndex:" + nseIndex);
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("Hello");
		
		driver.switchTo().frame("frm1");
		
		WebElement coursenameDropdown = driver.findElement(By.id("course"));
		Select select = new Select(coursenameDropdown);
		select.selectByVisibleText("Java");
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Hello World");
		
		
		
		
		

	}

}
