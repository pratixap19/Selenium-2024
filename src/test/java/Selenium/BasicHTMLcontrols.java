package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicHTMLcontrols {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		//textbox
		driver.findElement(By.id("firstName")).sendKeys("Priti");
		//radio button
		driver.findElement(By.name("gender")).click();
		//checkbox
		driver.findElement(By.id("englishchbx")).click();
		//link
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		//button
		driver.findElement(By.id("registerbtn")).click();
		

	}

}
