package org.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles",
				monochrome=true,
				 glue="org.automation.stepdefinition",
				 plugin= {"html:target/cucumber-report/", 
						 "json:target/cucumber.json",
						 "pretty:target/cucumber-pretty.txt",
						 "junit:target/cucumber-results.xml"
					 }
				)
public class RunnerTest {
	
/* @BeforeClass
public static void setReportConfiguration() {
	
	ExtentProperties property = ExtentProperties.INSTANCE;
	property.setReportPath("./Reports/Reports.html");
	
}
@AfterClass
public static void setConfiguration() {
	Reporter.loadXMLConfig("./ConfigFiles/extent-config.xml");
}*/
	

}
