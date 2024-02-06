package Selenium;
//followed codeStudio
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\Drivers\\chromedriver.exe");
		//System.setProperty("webdrivr.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are:" + links.size());
		
		int resCode = 200;
		int brokenLinkCount=0;
		for (WebElement li : links) {
			String url = li.getAttribute("href");

			try {
				URL urlLink = new URL(url);
				//open url with HttpURLConnection
				HttpURLConnection huc = (HttpURLConnection) urlLink.openConnection();
				//send request
				huc.setRequestMethod("HEAD");
				//connect url
				huc.connect();
				resCode = huc.getResponseCode();
				
				if(resCode>=400){
					System.out.println(url + " broken link.");
					brokenLinkCount ++;
				}
			}

			catch (MalformedURLException e) {

			} 
			catch (Exception e) {

			}

		}
		System.out.println("Total broken links: " + brokenLinkCount);

	}

}
