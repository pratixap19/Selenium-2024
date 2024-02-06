package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageTitleWithJavascriptExecutor {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title = (String) js.executeScript("return document.title");
		System.out.println("Title of the page is :" + title);

	}

}
