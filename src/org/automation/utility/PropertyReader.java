package org.automation.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public static String configReader(String keyName) {
		try {
		File file = new File("./ConfigFiles/Configuration.properties");
		FileReader fr= new FileReader(file);
		Properties prop = new Properties();
		prop.load(fr);
		prop.getProperty(keyName);
		return keyName;	
		}
		catch(Exception exception) {
			exception.printStackTrace();
			throw (new RuntimeException("****** ERROR ********* : - Key with name "+" does not exists"));
		}
		
	}
	
	public static String locatorReader(String keyName) {
		try {
		File file = new File("./ConfigFiles/ElementLocators.properties");
		FileReader fr= new FileReader(file);
		Properties prop = new Properties();
		prop.load(fr);
		prop.getProperty(keyName).toString();
		return keyName;	
		}
		catch(Exception exception) {
			exception.printStackTrace();
			throw (new RuntimeException("****** ERROR ********* : - Locator with name "+" does not exists"));
		}
	}

}
