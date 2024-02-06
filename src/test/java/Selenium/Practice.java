package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Set<Cookie> cookie = driver.manage().getCookies();
		
		driver.manage().deleteCookie((Cookie) cookie);
		driver.manage().addCookie(cookie);
		
		//how to add our own cookie
		Cookie cookie1 = new Cookie("cookieName", "cookieValue");
		
		//How to click on element using Actions class
		Actions action = new Actions(driver);
		action.click().build().perform();
		
		//findElement & Findelements
		WebElement button = driver.findElement(By.xpath(""));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		driver.findElement(By.id("uploadfile")).sendKeys("path");
		
		driver.findElement(By.xpath("//input[@class='upload_txt']")).sendKeys("");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		System.setProperty("webDriver.chrome.driver", "");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("");
		driver.findElement(By.xpath("")).click();
		
		(Keys.Enter);
	}

	

}
