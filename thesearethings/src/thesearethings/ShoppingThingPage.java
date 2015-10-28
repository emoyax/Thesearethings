package thesearethings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingThingPage {

	By email = By.id("checkout_email");
	By firstname = By.id("checkout_shipping_address_first_name");
	By lastname = By.id("checkout_shipping_address_last_name");
	By address = By.id("checkout_shipping_address_address1");
	By addresscity = By.id("checkout_shipping_address_city");
	By zip = By.id("checkout_shipping_address_zip");
	By button = By.name("button");
	WebDriver driver;
	
	public ShoppingThingPage(WebDriver driver){
		this.driver=driver;
		
	}
	
	public void setCheckoutEmail(String em){
		driver.findElement(email).sendKeys(em);
	}
	
	public void setCheckoutfn(String fn){
		driver.findElement(firstname).sendKeys(fn);
	}
	
	public void setCheckoutln(String ln){
		driver.findElement(lastname).sendKeys(ln);
	}
	
	public void setCheckoutadd(String addr){
		driver.findElement(address).sendKeys(addr);
	}
	
	public void setCheckoutaddc(String addc){
		driver.findElement(addresscity).sendKeys(addc);
	}
	
	public void setCheckoutzip(int x){
		driver.findElement(zip).sendKeys(String.valueOf(x));
	}
	
	public void clickButton(){
		driver.findElement(button).click();
	}
	
	public void fillCheckoutForm(String em, String fn, String ln, String addr, String addc, int x){
		this.setCheckoutEmail(em);
		this.setCheckoutfn(fn);
		this.setCheckoutln(ln);
		this.setCheckoutadd(addr);
		this.setCheckoutaddc(addc);
		this.setCheckoutzip(x);
		
	}
}
