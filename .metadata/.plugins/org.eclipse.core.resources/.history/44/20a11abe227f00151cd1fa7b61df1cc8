package thesearethings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FooterPage {
	
	By About = By.partialLinkText("About");
	By WholeSale = By.linkText("Wholesale");
	By Stockists = By.xpath("html/body/footer/div/div/div[1]/p/a[3]");
	By Contact = By.xpath("//footer/div/div/div[1]/p/a[5]");
	
	WebDriver driver;
	
	public FooterPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void AccesstoAbout(){
		driver.findElement(About).click();
	}
	
	public void ComparingTitleAbout(){
		String t1 = driver.getTitle();
		Assert.assertEquals(t1, "About Us – These Are Things");
	}
	
	public void AccesstoWholeSale(){
		driver.findElement(WholeSale).click();
	}
	
	public void ComparingTitleWholeSale(){
		String t1 = driver.getTitle();
		Assert.assertEquals(t1, "Wholesale – These Are Things");
	}
	
	public void AccesstoStockists(){
		driver.findElement(Stockists).click();
	}
	
	public void ComparingTitleStockists(){
		String t1 = driver.getTitle();
		Assert.assertEquals(t1, "Stockists – These Are Things");
	}
	
	public void AccesstoContact(){
		driver.findElement(Contact).click();
	}
	
	public void ComparingTitleContact(){
		String t1 = driver.getTitle();
		Assert.assertEquals(t1, "Contact Us – These Are Things");
	}

}
