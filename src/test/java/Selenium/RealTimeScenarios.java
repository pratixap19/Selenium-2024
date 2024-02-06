package Selenium;

public class RealTimeScenarios {

	//1. how to get the entered text from textbox
	//driver.findelement(By.name("q")).getAttribute("value");
	
	//2. How to get link text
	//driver.findElement(By.tagname("a")).getText();
	
	//3. How to get all values in dropdown
	// Select select = new Select(driver.findElement(By.xpath("")));
	// List<WebElement>  options = select.getOptions();
	// int size =options.size();
	for(Webelement option:options) {
		 String value=option.getText();
		 Syso(value);
	}
	
	//System.out.println("Total no. of options are:" + size);
	for(int i=0;i<size;i++) {
		Syso(options.get(i).getText());
	}
	
	//how to get radio group and select one option
	//List<Webelement> radioButtons= driver.findElements(By.name("");
	//System.out.println(radioButtons.size());
	//radioButtons.get(2).click();
	
	//4. 
	
	
	

}
