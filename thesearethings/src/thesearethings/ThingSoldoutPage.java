package thesearethings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThingSoldoutPage {
	
	WebDriver driver;
	By thing = By.xpath("html/body/main/div/div/div[13]");
	By text = By.id("AddToCartText");
	
	public ThingSoldoutPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void selectThing(){
		driver.findElement(thing).click();
	}
	
	public void checkText(){
		driver.findElement(text).isDisplayed();
	}
	

}
