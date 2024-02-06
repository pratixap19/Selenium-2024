package Selenium;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
//Get methods
//1. GetOptions method will return all options availble inside single selection and multiselection dropdowns
//2. GetFirstSelectedOption will return first selected option only
//3. GelAllSelectedOptions method will return only selected options from the multiple dropdown

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Pratixa\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		//single selection dropdown
		WebElement dropdown = driver.findElement(By.id("course"));
		Select select = new Select(dropdown);
		
		select.selectByVisibleText("Java");
		
		List<WebElement> coursesAvailable = select.getOptions();
		for(WebElement course:coursesAvailable) {
			System.out.println("All available courses:" + course.getText());
		}
		
		select.selectByIndex(2);
		Thread.sleep(2000);
		
		select.selectByValue("python");
		Thread.sleep(2000);
		
		String selectedOption = select.getFirstSelectedOption().getText();
		System.out.println("First selected option:" + selectedOption);
		Thread.sleep(2000);
		
		//multiselection dropdown
		WebElement multiSelectionDropdown = driver.findElement(By.id("ide"));
		Select select1 = new Select(multiSelectionDropdown);
		
		select1.selectByIndex(0);
		Thread.sleep(2000);
		
		select1.selectByValue("ij");
		Thread.sleep(2000);
		
		select1.selectByVisibleText("Visual Studio");
		Thread.sleep(2000);
		
		List<WebElement> multiSelectionDD_AllCoursesAvailable = select1.getOptions();
		for(WebElement course:multiSelectionDD_AllCoursesAvailable) {
			System.out.println("All available courses from multiselection dropdown:" + course.getText());
		}
		
		List<WebElement> multiSelectionDD_selectedCourses = select1.getAllSelectedOptions();
		for(WebElement selectedOptions:multiSelectionDD_selectedCourses) {
			System.out.println("returns only selected options:" + selectedOptions.getText());
		}
		
		//deselection
		select1.deselectByIndex(0);
		Thread.sleep(2000);
		
		select1.deselectByValue("vs");
		Thread.sleep(2000);
		
		select1.deselectByVisibleText("IntelliJ IDEA");
		Thread.sleep(2000);
		
		
		
		
		

		
		
		
		
		
		
		

	}

}
