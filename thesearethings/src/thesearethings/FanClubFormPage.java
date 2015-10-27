package thesearethings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FanClubFormPage {
	
	WebDriver driver;
	By joinButton = By.id("subscribe");
	By eAddress = By.id("MERGE0");
	By fName = By.id("MERGE1");
	By lNane = By.id("MERGE2");
	By signButton = By.name("submit");
	
	public FanClubFormPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void OpenForm(){
		driver.findElement(joinButton).click();
	}
	
	public void setEmailAddress(String eAdd){
		driver.findElement(eAddress).sendKeys(eAdd);
	}
	
	public void setFirstName(String fn){
		driver.findElement(fName).sendKeys(fn);
	}
	
	public void setLastName(String ln){
		driver.findElement(lNane).sendKeys(ln);
	}
	
	public void clickSign(){
		driver.findElement(signButton).click();
	}
	
	public void FilltheForm(String eAdd, String fn, String ln){
		this.OpenForm();
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		this.setEmailAddress(eAdd);
		this.setFirstName(fn);
		this.setLastName(ln);
		this.clickSign();
		driver.switchTo().window(winHandleBefore);
		driver.close();
	}

}
