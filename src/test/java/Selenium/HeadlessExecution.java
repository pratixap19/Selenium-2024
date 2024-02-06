package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessExecution {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prati\\eclipse-workspace\\Selenium-Automation\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		
		

	}

}
