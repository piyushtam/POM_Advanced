package testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import base.BasePage;
import base.BaseTest;
import pages.HomePage;
import utilities.TestUtil;

public class CarNameAndPriceTest extends BaseTest {
	
	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void carNameAndPriceTest(String browserName, String runMode, String brandName) {
		
		
        if (runMode.equals("N")) {
			
			throw new SkipException("Skipping the test as runmode is NO");
		}
		
		setUp(browserName);
		
		if (brandName.equals("maruti")) {
			HomePage home = new HomePage(driver);
			home.findNewCar().selectMarutiCar();
			BasePage.car.getCarNamesAndPrices();
			
		}
			else if (brandName.equals("hyundai")) {
				HomePage home = new HomePage(driver);
				home.findNewCar().selectHyundaiCar();
				BasePage.car.getCarNamesAndPrices();
				
			}
			
			else if (brandName.equals("ford")) {
				HomePage home = new HomePage(driver);
				home.findNewCar().selectFordCar();
				BasePage.car.getCarNamesAndPrices();
				
			}
			
			else if (brandName.equals("kia")) {
				HomePage home = new HomePage(driver);
				home.findNewCar().selectKiaCar();
				BasePage.car.getCarNamesAndPrices();
				
			}
		
	}

}
