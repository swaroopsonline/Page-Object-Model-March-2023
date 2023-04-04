package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class HomePage extends BasePage{
	
//	public WebDriver driver;
//	
//	/*Note: A constructor is called whenever you create an object of a Class*/
//	
//	public HomePage(WebDriver driver) {
//		
//		this.driver = driver;
//		
//		
//	}
	
	/*Note that we're not creating the Webdriver to be static as it is to be used independently by the Methods*/
	
	
	//Note: If the BasePage constructor is parameterized with Arguments, then we've to use super keyword
	//in the HomePage Constructor here.
	public HomePage(WebDriver driver) {
		super(driver);
		//PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText = "buy + sell")
	private WebElement buySell;
	
	@FindBy(linkText = "New")
	private WebElement findNewCar;
	

	public NewCarsPage findNewCars() {
		
		//WebElement buySell = driver.findElement(By.linkText("buy + sell")); //*[contains(text(),'buy + sell')]
		new Actions(driver).moveToElement(buySell).perform();
		
		//driver.findElement(By.linkText("New")).click(); //a[@data-gtm-label = 'sub nav new cars search']
		findNewCar.click();
		
		return new NewCarsPage(driver);
		
	}

	public void searchNewCars() {

	}

	public void searchOldCars() {

	}

	public void verifyFeaturedCars() {

	}

}
