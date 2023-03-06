package testRunner3;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import utility.BaseClass;

//Cucumber options

	@CucumberOptions(features = {"src/test/resources/FeatureFolder"},
			plugin = {"json:target/cucumber.json"},
			glue ="stepDefination" 
		)

public class TestRunner4 extends AbstractTestNGCucumberTests {
		
		@BeforeTest
		
		public void setup()throws IOException {
			
			BaseClass test = new BaseClass ();
			
			test.browserinit();
			
		}
	
	@AfterTest
	
	public void closureURL()throws IOException {
	
	BaseClass test = new BaseClass ();
	test.driver.quit();
	
	}

}
