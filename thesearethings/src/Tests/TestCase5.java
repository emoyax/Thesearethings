package Tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import thesearethings.AddToCartPage;
import thesearethings.ThingDetail;

public class TestCase5 {
	
	WebDriver driver;
	AddToCartPage acp;
	
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
	public void TestAddItem(){
		acp = new AddToCartPage(driver);
		acp.AddItem();
	}
}
