package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOperations {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		//right click
		WebElement rightClickBtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		Actions action = new Actions(driver);
		action.contextClick(rightClickBtn).build().perform();
		
		//double click
		WebElement doubleClickBtn =driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(doubleClickBtn).build().perform();
		
	}

}
