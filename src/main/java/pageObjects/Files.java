package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Files {
	
	public Files(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Add Images") 
	private WebElement btn_AddImage;
	
	
	public void clickOn_AddImage() {
		btn_AddImage.click();
	}
	
	/*
	 * public void clickOn_ContinueToCheckout(){ btn_ContinueToCheckout.click(); try
	 * { Thread.sleep(5000);} catch (InterruptedException e) {} }
	 */
	
}