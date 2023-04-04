package rough;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import pages.HomePage;
import pages.NewCarsPage;

public class findNewCarTest {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		//driver.navigate().to("https://www.carsguide.com.au/");
		driver.get("https://www.carsguide.com.au/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		HomePage home = new HomePage(driver);		
		NewCarsPage newCar = home.findNewCars();
		newCar.gotoBMW();
		
//		new HomePage(driver).findNewCars().gotoBMW();
		
//		NewCarsPage newCar = new NewCarsPage(driver);
//		newCar.gotoBMW();
		
//		HomePage home = PageFactory.initElements(driver, HomePage.class);	
//		home.findNewCars();
//		
//		NewCarsPage newCar = PageFactory.initElements(driver, NewCarsPage.class);
//		newCar.gotoBMW();
		
	}

}
