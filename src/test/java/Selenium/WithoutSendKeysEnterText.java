package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSendKeysEnterText {

	public static void main(String[] args) {
		
		  String projectPath = System.getProperty("user.dir");
		  System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://tutorialsninja.com/demo/");
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  WebElement searchBox = driver.findElement(By.name("search"));
		  
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].value='Pratixa'", searchBox);
		  
		  //how to get the entered text from textbox
		  String retrievedText = driver.findElement(By.name("search")).getAttribute("value");
		  System.out.println("Retrieved text is :" + retrievedText);
		}

}
