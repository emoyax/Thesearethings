package Tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import thesearethings.AddToCartPage;

public class TestCase10 {
	
	WebDriver driver;
	AddToCartPage atc;
	
	@Before
	public void setup(){
		
		System.setProperty("webdriver.ie.driver","C:\\SELENIUM\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("http://www.thesearethings.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void testRemoveitemsfromCart(){
		atc = new AddToCartPage(driver);
		atc.RemoveItems();
	}
	

}
