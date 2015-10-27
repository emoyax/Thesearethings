package thesearethings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JoinTheClub {
	WebDriver driver;
	By email = By.id("mail");
	By joinButton = By.id("subscribe");
	
	public JoinTheClub(WebDriver driver){
		this.driver= driver;
	}
	
	public void Setemail(String em){
		driver.findElement(email).sendKeys(em);
	}
	
	public void ClickJoin(){
		driver.findElement(joinButton).click();
	}
	
	public void Subscribe(String em){
		this.Setemail(em);
		this.ClickJoin();
	}

}
