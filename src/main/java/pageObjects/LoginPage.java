package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import dataProviders.ConfigFileReader;

public class LoginPage {
	WebDriver driver;
	ConfigFileReader configFileReader;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader= new ConfigFileReader();
	}
	
	public void enter_userDetails(String username) {
		WebElement elemUName  = driver.findElement(By.id("user"));
		//WebElement elemPass  = driver.findElement(By.id("password"));
		//WebElement subBtn = driver.findElement(By.className("button blue"));
		elemUName.sendKeys(username);
		//elemPass.sendKeys(password);
		//subBtn.click();
		
	}
	
	public void enter_passDetails(String password) {
		//WebElement elemUName  = driver.findElement(By.id("user"));
		WebElement elemPass  = driver.findElement(By.id("password"));
		//WebElement subBtn = driver.findElement(By.className("button blue"));
		//elemUName.sendKeys(username);
		elemPass.sendKeys(password);
		//subBtn.click();
		
	}
	
	public void clickSubmit() {
		//WebElement elemUName  = driver.findElement(By.id("user"));
		//WebElement elemPass  = driver.findElement(By.id("password"));
		WebElement subBtn = driver.findElement(By.className("button blue"));
		//elemUName.sendKeys(username);
		//elemPass.sendKeys(password);
		subBtn.click();
		
	}
	
	public void navigateTo_LoginPage() {
		driver.get(configFileReader.getApplicationUrl());
	}

}