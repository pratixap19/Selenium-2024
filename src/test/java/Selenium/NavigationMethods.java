package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Pratixa");
		driver.findElement(By.name("btnK")).submit();
		driver.navigate().to("https://facebook.com");
		driver.findElement(By.name("email")).sendKeys("Pratixa@123.com");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();

	}

}
