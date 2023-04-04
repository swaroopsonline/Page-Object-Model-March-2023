package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.NewCarsPage;

public class findNewCarTest extends BaseTest {
	
	@Test()
	public void findNewCarTest() {
		
//		if(runmode.equals("N")) {
//			
//			throw new SkipException("Skipping the test as the run mode is no");
//		}
		
		setUp("chrome");
		HomePage home = new HomePage(driver);		
		NewCarsPage newCar = home.findNewCars();
		newCar.gotoBMW();

		
	}

}
