package org.automation.base;

import org.automation.utility.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverInstance {
	static WebDriver driver=null;
	
	public static void startDriverInstance() {
		
		if(PropertyReader.configReader("browser_Name").equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		else if (PropertyReader.configReader("browser_Name").equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(PropertyReader.configReader("browser_Name").equalsIgnoreCase("Internet Explorer")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/InternetExplorerdriver.exe");
			driver = new InternetExplorerDriver();
		}
		
		else {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(PropertyReader.configReader("register_URL"));
	}
	public WebDriver getDriverInstance() {
		if(driver!=null) {
			return driver;
		}
		else {
			DriverInstance.startDriverInstance();
		}
		return driver;
	}
	
	public void setDriverInstance() {
		driver=null;
		
	}
	
}
