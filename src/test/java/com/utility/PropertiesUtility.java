//followed Udemy - Shelendra's video
package com.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
	
	public static String getData(String key) throws IOException {
		
		//Create File class object
		File file = new File("C:\\Pratixa\\Selenium\\Data\\TestData.properties");
		
		//Create FileReader class object
		//FileReader class from Java reads data from the file character by character
		FileReader reader = new FileReader(file);
		
		//Properties class object
		//Properties class from Java is used to perform operation on properties file
		Properties prop = new Properties();
		
		//Load properties file
		prop.load(reader);
		
		
		//call getValue() method
		return (String) prop.get(key);
		
		
	}
}
