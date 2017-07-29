package locators;


public class ExpediaLocators {
	
		//For Home Link
		public String expHomeLocator = "//a[@id='primary-header-home']";
		
		//For Flight Link
		public String expFlightLocator = "//button[@id='tab-flight-tab-hp']";
				
		//For RoundTrip object in Flight section 
		public String expRTLocator = "//label[@id='flight-type-roundtrip-label-hp-flight']";
							
		//For FlyingFrom textBox object in Flight section 
		public String expFlyFtxtLocator = "//input[@id='flight-origin-hp-flight']";
				
		//For FlyingTo textBox object in Flight section
		public String expFlyTtxtLocator = "//input[@id= 'flight-destination-hp-flight']";
				
		//For Departing date object in Flight section 
		public String expDepDateLocator = "//input[@id='flight-departing-hp-flight']";
					
		//For random selection of departing date in Flight section 
		public String expRDepDateLocator = "//div[@id='flight-departing-wrapper-hp-flight']/div/div/div[3]";
				
		//For Returning date object in Flight section
		public String expRtrDateLoacator = "//input[@id='flight-returning-hp-flight']";
					
		//For random selection of returning date in Flight section
		public String expRRtrDateLocator = "//div[@id='flight-returning-wrapper-hp-flight']/div/div/div[3]";
		
		//For Search Button
		public String expSearchBtnLocator = "//button[@class= 'btn-primary btn-action gcw-submit']";
		
}
