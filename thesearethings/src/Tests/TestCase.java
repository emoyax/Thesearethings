package Tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import thesearethings.AllCollectionPage;

public class TestCase {
	WebDriver driver;
	AllCollectionPage allp;
	
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
	public void testCase(){
		allp = new AllCollectionPage(driver);
		allp.MouseOverMainicon();
		allp.HeaderDisplayed();
		allp.ScrollPage();
	}
	

}