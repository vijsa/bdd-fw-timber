package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import managers.PageObjectManager;
import pageObjects.Files;
import pageObjects.AddImage;
import pageObjects.LoginPage;
import pageObjects.Dashboard;

public class PageObjectSteps {
	WebDriver driver;
	LoginPage loginPage;
	Dashboard dashboard;
	Files files;
	AddImage addImage;
	PageObjectManager pageObjectManager;	
	ConfigFileReader configFileReader;
	
	@Given("^user is on Login Page$")
	public void user_is_on_Home_Page(){
		configFileReader= new ConfigFileReader();
		System.setProperty("webdriver.gecko.driver", configFileReader.getDriverPath());
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
        //capabilities.setCapability("marionette",true);  
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		pageObjectManager = new PageObjectManager(driver);
		loginPage = pageObjectManager.getLoginPage();
		loginPage.navigateTo_LoginPage();	
	}

	@When("^he enters username as \"([^\"]*)\"$")
	public void enterUser(String uName)  {
		loginPage.enter_userDetails(uName);
	}
	
	@When("^he enters password as \"([^\"]*)\"$")
	public void enterPass(String pass)  {
		loginPage.enter_passDetails(pass);
	}

	@When("^he clicks on Login$")
	public void clickLogin()  {
		loginPage.clickSubmit();
	}
	
	@When("^he clicks on Files$")
	public void click_on_files() {
		dashboard = pageObjectManager.getDashboard();
		dashboard.select_Files();
	}

	@When("^he clicks on Add Images$")
	public void click_on_AddImages(){
		files = pageObjectManager.getFilesPage();
		files.clickOn_AddImage();
	}
	
	@When("^he clicks on Manual Upload$")
	public void click_on_ManualUpload() throws IOException{
		addImage = pageObjectManager.getAddImagePage();
		addImage.click_Upload();	
	}
	
}