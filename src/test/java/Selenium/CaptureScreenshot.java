package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prati\\eclipse-workspace\\Selenium-Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		//step:1 Convert driver to TakeseScreenshot interface
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		//step:2 Call getScreenshotAs() to create image file
		File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
		
		//step:3 Create file to copy the screenshot
		File destScreenshotFile = new File("C:\\Users\\prati\\eclipse-workspace\\Selenium-Automation\\src\\test\\java\\Screenshots\\fullPage.png");
		
		//step:4 Copy image file to destination
		//configure Apachi commons-io jar files to pom.xmi file to use FileUtils class
		FileUtils.copyFile(screenshotFile, destScreenshotFile);
		
		//take screenshot for specific element
		WebElement multiSectionBox = driver.findElement(By.xpath("//textarea[@id='ta1']"));
		File image = multiSectionBox.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\prati\\eclipse-workspace\\Selenium-Automation\\src\\test\\java\\Screenshots\\section.png");
		FileUtils.copyFile(file, image);
	}

}
