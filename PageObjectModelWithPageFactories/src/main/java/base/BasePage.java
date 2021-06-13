package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
public static WebDriver driver;
public static carBase car;
	
	public  BasePage(WebDriver driver) {
		
		this.driver=driver;
		car = new carBase(driver);
		PageFactory.initElements(driver, this);
	}

}
