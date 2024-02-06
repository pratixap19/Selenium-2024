package com.utility;

import java.io.File;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	
	public static String getTrestData(int rowNumber, int cellNumber) throws InvalidFormatException, IOException {
		//Create File class object
		File file = new File("C:\\Pratixa\\Selenium\\Data\\TestData.xlsx");
		
		//Create Workbook object.Workbook is an interface so we need to create object of 
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		//Create Sheet object
		 Sheet sheet = book.getSheetAt(0);//0 index specify sheet1 in excel file
		
		//Specify the row and cell number
		  return sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();
	}

}
