package Selenium;

import java.io.File;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public static String getTestData(int rowNum, int cellNum) throws InvalidFormatException, IOException {
		
		//create file class object
		File file = new File("C:\\Users\\prati\\Desktop\\TestData.xlsx");
		
		//create workbook object
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		//create sheet object
		Sheet sheet = book.getSheetAt(0);
		
		//specify the row and cell number
		return sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		
	}

	public static void main(String[] args) {
		
		
	}

}
