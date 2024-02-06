package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Pratixa\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/au/");
		driver.findElement(By.xpath("(//a[@class='cta_button'])[1]")).click();
		
		Thread.sleep(5000);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		Iterator<String> itr = windowHandles.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		
		driver.switchTo().window(childWindow);
		String childWindowTitle = driver.getTitle();
		System.out.println("childWindowTitle:" + childWindowTitle);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Pratixa");
		driver.findElement(By.name("UserLastName")).sendKeys("Patel");
		
		driver.switchTo().window(parentWindow);
		String parentWindowTitle = driver.getTitle();
		System.out.println("parentWindowTitle:" + parentWindowTitle);
		

	}

}
