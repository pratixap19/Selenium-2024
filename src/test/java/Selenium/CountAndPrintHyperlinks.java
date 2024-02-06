package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountAndPrintHyperlinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links on the page are:" + listOfLinks.size());
		for(WebElement eachLink:listOfLinks) {
			System.out.println(eachLink.getText());
		}

	}

}
