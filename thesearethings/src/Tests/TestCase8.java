package Tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import thesearethings.AddToCartPage;

public class TestCase8 {
	
	WebDriver driver;
	AddToCartPage acp;
	By cartToggle = By.xpath("html/body/header/div/div/div[2]/a");
	By counter = By.id("CartCount");
	By Message = By.id("AjaxifyCart");
	
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
	public void TestCartEmpty(){
		acp = new AddToCartPage(driver);
		driver.findElement(cartToggle).click();
		WebElement element = driver.findElement(Message);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(element));
		}
	
}