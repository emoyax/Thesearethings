package Tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import thesearethings.AddToCartPage;
import thesearethings.FooterPage;
import thesearethings.StockistsSearch;

public class TestCase11 {
	WebDriver driver;
	StockistsSearch ss;
	FooterPage fp;
	
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
	public void testSearchValidLocation(){
		fp = new FooterPage (driver);
		fp.AccesstoStockists();
		ss = new StockistsSearch(driver);
		ss.Setlocation("Japan");
		ss.clickSearchB();
	}
	
	@Test
	public void testSearchInValidLocation(){
		fp = new FooterPage (driver);
		fp.AccesstoStockists();		
		ss = new StockistsSearch(driver);
		ss.Setlocation("London");
		ss.clickSearchB();
		ss.toString().contains("No locations found! Please try another search.");
	}

}
