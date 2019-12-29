package managers;



import org.openqa.selenium.WebDriver;

import pageObjects.Files;

import pageObjects.AddImage;

import pageObjects.LoginPage;
import pageObjects.Dashboard;



public class PageObjectManager {

	private WebDriver driver;

	private Dashboard dashboard;

	private Files files;

	private LoginPage loginPage;

	private AddImage addImage;

	//private ConfirmationPage confirmationPage;

	

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	

	public LoginPage getLoginPage(){

		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;

	}

	

	public Dashboard getDashboard() {

		return (dashboard == null) ? dashboard = new Dashboard(driver) : dashboard;

	}

	

	public Files getFilesPage() {

		return (files == null) ? files = new Files(driver) : files;

	}

	

	public AddImage getAddImagePage() {

		return (addImage == null) ? addImage = new AddImage(driver) : addImage;

	}
}