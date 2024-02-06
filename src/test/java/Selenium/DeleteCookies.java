package Selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteCookies {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		
		//how to add cookies at run time
		//create cookie object
		Cookie myCookie = new Cookie("testName", "testValue");
		driver.manage().addCookie(myCookie);
		
		//how to get cookies at run time
		Set<Cookie> allCookies = driver.manage().getCookies();
		for(Cookie ck:allCookies) {
			System.out.println(ck.getName() + "=====" + ck.getExpiry() + "====" + ck.getDomain());
		}
		
		//how to delete cookie at run time
		driver.manage().deleteAllCookies();
		

	}

}
