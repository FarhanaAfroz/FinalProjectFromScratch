package base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import utilities.WDFunctions;

public class Configuration extends WDFunctions {
	
	BrowserSetup brSet = new BrowserSetup();
	public static String baseUrl = "https://www.expedia.com/";
	public String browser = "Chrome";
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("*** TEST SUITE STARTED ");
		Framework_Logs.info("Test suite STARTED");
		
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("*** TEST SUITE ENDED ");
		Framework_Logs.info("Test suite ENDED");
		
	}

	@BeforeTest
	public void beforeTest (){
	
		System.out.println("Browser started");
		Framework_Logs.info(".............Browser Strated..............");
		
		brSet.browserInitialize(browser);
		Framework_Logs.info("Chrome Started");
		
		if(browser.equals("firefox") || browser.equals("safari") || browser.equals("ie")){
			maxPage();
		}
		
		Framework_Logs.info("Browser MAXIMIZE");
		driver.get(baseUrl);
		Framework_Logs.info("Site -------- www.expedia.com --------- opened");
		
	}
	 
	@AfterTest
	public void afterTest (){
		System.out.println("Close the browser");
		Framework_Logs.info("Closed the Browser");
		// driver.quit();
	}


   
 }
