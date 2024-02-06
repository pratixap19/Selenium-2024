package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://theautomationzone.blogspot.com/2020/07/basic-dropdown.html");
		
		//single selection dropdown		
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='mySelect']"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Pineapple");
		System.out.println("Text from the dropdown is: " + select.getFirstSelectedOption().getText());
		
		System.out.println("***********************************************");
		
		List<WebElement> elements = select.getOptions();
		for(WebElement element:elements) {
			System.out.println("Option available under single selection dropdown: " + element.getText());
		}
		
		System.out.println("***********************************************");
		
		//multiple selection dropdown
		
		WebElement multiSelectDD = driver.findElement(By.id("cars"));
		Select multiSelect = new Select(multiSelectDD);
		
		List<WebElement> allElements = multiSelect.getOptions();
		for(WebElement e :allElements) {
			System.out.println("Option available under multiple selection dropdown: " + e.getText());
		}
		
		System.out.println("***********************************************");
		
		multiSelect.selectByVisibleText("Volvo");
		multiSelect.selectByVisibleText("Saab");
		multiSelect.selectByVisibleText("Audi");
		multiSelect.selectByVisibleText("Opel");
		
		multiSelect.deselectByVisibleText("Opel");
		
		List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
		for(WebElement option:selectedOptions) {
			System.out.println("Selected option from the multiple selection dropdown:" + option.getText());
		}
	}

}
