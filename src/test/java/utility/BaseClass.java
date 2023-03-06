package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	

	public static Properties prop;
	public static 	WebDriver driver;
	
	public BaseClass() {
		
	
	try {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\framework\\config\\FWconfig.Properties");
		
		prop = new Properties();
		
		prop.load(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}	
	
	public void browserinit() {
		
	String browser = prop.getProperty("Browser1");
	
	if (browser.equalsIgnoreCase("Chrome")) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\WebDriver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestData.implicitywait));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestData.pageLoadwait));
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		
	}
		
	else if (browser.equalsIgnoreCase("FireFox")) {
		
				
	}
		
	}
	
	public static void launchURL(String URL) {
		
		driver.get(prop.getProperty("URL"));
		
	}
	
	
}