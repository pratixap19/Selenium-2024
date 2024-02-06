package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonRating {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Pratixa\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		WebElement signInLink = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		Actions action = new Actions(driver);
		action.moveToElement(signInLink).perform();
		WebElement signInBtn = driver.findElement(By.xpath("(//a/span[text()='Sign in'])[1]"));
		action.moveToElement(signInBtn).click().build().perform();
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("6039660034");
		driver.findElement(By.xpath("(//span[@class='a-button-inner'])[1]/input")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Amazon@123");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.xpath("(//div[@class='nav-fill'])[2]/div/input")).sendKeys("apple iphone 15 pro");
		driver.findElement(By.xpath("(//div[@class='nav-right'])[1]/div/span/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[4]/div/h2/a")).click();
		Thread.sleep(1000);
		String textonPopup = driver.findElement(By.xpath("((//div[@id='averageCustomerReviews'])[1]//a/span)[1]")).getText().trim();
		System.out.println("text on Popup" + textonPopup);
		
		//WebElement ratingStars = driver.findElement(By.xpath("((//div[@id='averageCustomerReviews'])[1]//i)[1]"));
		WebElement ratingStars = driver.findElement(By.xpath("//div[@id='averageCustomerReviews_feature_div']//i[@class='a-icon a-icon-star a-star-3-5 cm-cr-review-stars-spacing-big']"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(ratingStars).perform();
		Alert alert = driver.switchTo().alert();
		//WebElement ratingText = driver.findElement(By.xpath("//div[@class='a-icon-row a-spacing-small a-padding-none']/span"));
		//action1.moveToElement(ratingText).build().perform();
		//String textonPopup = driver.findElement(By.xpath("//div[@class='a-icon-row a-spacing-small a-padding-none']/span")).getText().trim();
		//System.out.println("text on Popup" + textonPopup);
		
	}

}
