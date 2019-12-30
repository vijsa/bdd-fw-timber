package pageObjects;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddImage {
	
	public AddImage(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "file_manager_dropzone") 
	private WebElement form_Manual_Upload;
	
	public void click_Upload() throws IOException {
		form_Manual_Upload.click();
		Runtime.getRuntime().exec("D:\\AutoIT\\Uploadfile.exe");
	}

}
