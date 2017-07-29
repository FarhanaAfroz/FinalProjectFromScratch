package testcases;

import org.testng.annotations.Test;

import base.Configuration;
import locators.ExpediaLocators;
import locatorvalue.ExpediaLocatorsValue;


public class TC1 extends Configuration {
	
	ExpediaLocators expL = new ExpediaLocators ();
	ExpediaLocatorsValue   expV = new ExpediaLocatorsValue ();

	
	@Test
	public void FlightInfoTC(){
	System.out.println("First test case");
	
	// click Home Link
	clickByXpath (expL.expHomeLocator);
	
	// click Flight Link
	clickByXpath (expL.expFlightLocator);
	
	////click RoundTrip object in Flight section
	clickByXpath (expL.expRTLocator);
	
	//FlyingFrom textBox  
	typeByXpath (expL.expFlyFtxtLocator, expV.expFlyFtxtLocatorValue);
					
	//FlyingTo textBox 
	typeByXpath (expL.expFlyTtxtLocator , expV.expFlyTtxtLocatorValue);
					
	//click Departing date object in Flight section 
	clickByXpath (expL.expDepDateLocator);					
	
	//click random selection of departing date in Flight section 
	clickByXpath (expL.expRDepDateLocator) ;
					
	//click Returning date object
	clickByXpath (expL.expRtrDateLoacator);
						
	//click random selection of returning date 
	clickByXpath (expL.expRRtrDateLocator);
	
	//click search button
	clickByXpath(expL.expSearchBtnLocator);


	
	}

}
