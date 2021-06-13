package base;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class carBase {
	
	WebDriver driver;
	public carBase(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/h1")
	public WebElement carTitle;
	
	public String getCarTitle() {
		
		return carTitle.getText();
	}
	
	@FindBy(xpath="//div/div[1]/div/a/h3")
	public List<WebElement> carNames;
	
	public void getCarNamesAndPrices() {
		
		for(int i=0; i<carNames.size(); i++) {
			
			System.out.println(carNames.get(i).getText());
		}
		
	}
	
}
