package thesearethings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ThingDetail {
	WebDriver driver;
	By firstImage = By.xpath("html/body/main/div/div/div[1]/div/a/div/div/div");
	
	public ThingDetail(WebDriver driver){
		this.driver = driver;
	}
	
	public void openDetail(){
		driver.findElement(firstImage).click();
	}
	
	public void detailTitle(){
		Assert.assertEquals("Over It Patch – These Are Things", driver.getTitle());
	}
	
	public void CheckPage(){
		this.openDetail();
		this.detailTitle();
	}

}
