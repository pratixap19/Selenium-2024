package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		//simple alert
//		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
//		org.openqa.selenium.Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		
		//confirmation alert
//		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
//		org.openqa.selenium.Alert confirmationAlert = driver.switchTo().alert();
//		System.out.println(confirmationAlert.getText());
//		confirmationAlert.dismiss();
		
		//prompt alert
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		org.openqa.selenium.Alert promptAlert = driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		
		promptAlert.sendKeys("Patel");
		promptAlert.accept();
		System.out.println(driver.findElement(By.id("output")).getText());

	}

}
