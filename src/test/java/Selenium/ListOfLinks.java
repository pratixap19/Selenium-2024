package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfLinks {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Pratixa\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
		Thread.sleep(5000);
		System.out.println("Number of links are : " + listOfLinks.size());
		for(int i=0; i<listOfLinks.size(); i++) {
			System.out.println("Name of the links are :" + listOfLinks.get(i).getText());
		}

	}

}
