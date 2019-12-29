package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
	public Dashboard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Files") 
	private WebElement btn_Files;
	
	public void select_Files() {
		btn_Files.click();
	}

}