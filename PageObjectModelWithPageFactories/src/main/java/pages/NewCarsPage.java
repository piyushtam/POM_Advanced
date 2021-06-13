package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class NewCarsPage extends BasePage {

	public NewCarsPage() {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/section[1]/div/div/div[1]/div/ul/li[1]/a")
	public WebElement maruti;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/section[1]/div/div/div[1]/div/ul/li[2]/a/div[2]")
	public WebElement hyundai;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/section[1]/div/div/div[1]/div/ul/li[8]/a/div[2]")
	public WebElement ford;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/section[1]/div/div/div[1]/div/ul/li[6]/a/div[2]")
	public WebElement kia;
	
	public MarutiCarPage selectMarutiCar() {
		
		maruti.click();
		return new MarutiCarPage(driver);
	}
	
	public HyundaiCarPage selectHyundaiCar() {
		
		hyundai.click();
		return new HyundaiCarPage(driver);
	}
	
	public void selectFordCar() {
		
		ford.click();
	}
	
	public void selectKiaCar() {
		
		kia.click();
	}

}
