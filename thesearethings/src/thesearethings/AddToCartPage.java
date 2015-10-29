package thesearethings;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage {
	WebDriver driver;
	By firstImage = By.xpath("html/body/main/div/div/div[1]");
	By addButton = By.id("AddToCart");
	By checkoutButton = By.name("checkout");
	By Overlay = By.id("AjaxifyCart");
	
	By plusButton = By.xpath("html/body/div[3]/div/form/div[2]/div/div[2]/div/div[2]/div/button[2]");
	By minusButton = By.xpath("html/body/div[3]/div/form/div[2]/div/div[2]/div/div[2]/div/button[1]");
	By textArea = By.name("note");
	
	By cartCount = By.id("CartCount");
	
	
	public AddToCartPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void openDetail(){
		driver.findElement(firstImage).click();
	}
	
	public void clickAddB(){
		driver.findElement(addButton).click();
	}
	
	public void clickCheckOutB(){
		driver.findElement(checkoutButton).click();
	}
	
	public void AddItem(){
		this.openDetail();
		this.clickAddB();
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		this.clickCheckOutB();
	}
	
	public void addThingtoList(){
		driver.findElement(plusButton).click();
	}
	
	public void removeThingfromList(){
		driver.findElement(minusButton).click();
	}
	
	public void setMessage(String m){
		driver.findElement(textArea).click();
		driver.findElement(textArea).sendKeys(m);
	}
	
	public void AddMoreItemsAndText(String m){
		this.openDetail();
		this.clickAddB();
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		this.addThingtoList();
		WebDriverWait wait = new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.elementToBeClickable(textArea));
		
		this.setMessage(m);
		this.setMessage(m);
		this.clickCheckOutB();
	}
	
	public void RemoveItems(){
		this.openDetail();
		this.clickAddB();
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		this.addThingtoList();
		this.removeThingfromList();
		driver.close();
	}

}
