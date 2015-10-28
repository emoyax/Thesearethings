package Tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import thesearethings.AddToCartPage;
import thesearethings.ShoppingThingPage;
import thesearethings.ThingSoldoutPage;

public class TestCase7 {

	WebDriver driver;
	ThingSoldoutPage tso;
	
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
	public void TestSoldout(){
		tso = new ThingSoldoutPage (driver);
		tso.selectThing();
		tso.checkText();
	}
}
