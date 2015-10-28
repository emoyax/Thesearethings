package Tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import thesearethings.AddToCartPage;
import thesearethings.ShoppingThingPage;

public class TestCase6 {
	WebDriver driver;
	AddToCartPage acp;
	ShoppingThingPage stp;
	
	@Before
	public void setup(){
		System.setProperty("webdriver.ie.driver","C:\\SELENIUM\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("http://www.thesearethings.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown(){
		driver.quit();
		
	}
	
	@Test
	public void TestSubscribe(){
		acp = new AddToCartPage(driver);
		acp.AddItem();
		stp = new ShoppingThingPage(driver);
		stp.fillCheckoutForm("emoya@xperius.net", "eli", "ln", "addr", "addc", 1234);
	}
}
