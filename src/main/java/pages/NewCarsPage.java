package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class NewCarsPage extends BasePage {
	
	

	public NewCarsPage(WebDriver driver) {
		super(driver);
		//PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath= "//span[@class='logo-manufacturer logo-kia']")
	private WebElement kia;
	
	public KiaPage gotoKia() {
		
		//driver.findElement(By.xpath("//span[@class='logo-manufacturer logo-kia']")).click();
		kia.click();
		
		return new KiaPage(driver);

	}
	
	@FindBy(xpath= "//span[@class='logo-manufacturer logo-toyota']")
	private WebElement toyota;

	public ToyotaPage gotoToyota() {
		
		//driver.findElement(By.xpath("//span[@class='logo-manufacturer logo-toyota']")).click();
		toyota.click();
		
		return new ToyotaPage(driver);

	}
	
	@FindBy(xpath= "//span[@class='logo-manufacturer logo-bmw']")
	private WebElement bmw;

	public BMWPage gotoBMW() {
		
		//driver.findElement(By.xpath("//span[@class='logo-manufacturer logo-bmw']")).click();
		bmw.click();
		
		return new BMWPage(driver);

	}
	
	@FindBy(xpath= "//span[@class='logo-manufacturer logo-honda']")
	private WebElement honda;

	public HondaPage gotoHonda() {
		
		//driver.findElement(By.xpath("//span[@class='logo-manufacturer logo-honda']")).click();
		honda.click();
		
		return new HondaPage(driver);

	}

}
