package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverAction {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sellglobal.ebay.in/");
		WebElement shippingMenu = driver.findElement(By.linkText("Shipping"));
		WebElement subMenu = driver.findElement(By.xpath("(//span[text()='Shipping Options'])[3]"));
		Actions action = new Actions(driver);
		action.moveToElement(shippingMenu).pause(3000).moveToElement(subMenu).pause(3000).click().build().perform();
	}

}
