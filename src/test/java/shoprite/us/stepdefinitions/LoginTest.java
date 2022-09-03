package shoprite.us.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import shoprite.us.baseclass.BaseClass;
import shoprite.us.elementpage.LoginElementPage;
import shoprite.us.generic.CommonUtillity;

public class LoginTest extends BaseClass {
	LoginElementPage pf;
	
	@Given("User able to open any browsers.")
	public void user_able_to_open_any_browsers() {
		
		logger.info("User able to open any browsers");
		BaseClass.initializations();
		 pf = new LoginElementPage(); 
	    
	}
	@And("User able enter {string} URL")
	public void user_able_enter_url(String url) {
		
		logger.info("User able enter {string} URL");
		driver.get(url);
	   
	}
	@When("user able to click sign in button One")
	public void user_able_to_click_sign_in_button_One() {
		
		logger.info("user able to click sign in button One");
		pf.getClickOnSignButton().click();
		pf.getMyUserNameAndPWD(prop.getProperty("userName"), prop.getProperty("pwd"));
	    
	}
	@And("User able to enter username")
	public void user_able_to_enter_username()  {
		
		 logger.info("User able to enter username");
	//pf.getMyUserName().sendKeys("loganbond977@yahoo.com");
		 
	}
	@And("User able to enter password")
	public void user_able_to_enter_password() {
		
		logger.info("User able to enter password");
		//pf.getMyPassword().sendKeys("SmartTech21$");
	}     
	
	@When("User able to  click login in button Two")
	public void user_able_to_click_login_in_button_two() {
		
		logger.info("User able to  click login in button Two");
//		Actions click = new Actions(driver);
//		click.click(pf.getMySignIN()).build().perform();
	  //  pf.getMySignIN().click();
	//	CommonUtillity.getMyActionClick(pf.getMySignIN());
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", pf.getMySignIN());
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(pf.getMySignIN()));
		CommonUtillity.getJSEClick(pf.getMySignIN());
	}
	@Then("User able to verify the user information {string} on the UI and Logout")
	public void user_able_to_verify_the_user_information_on_the_ui(String text) {
		
		logger.info("User able to verify the user information {string} on the UI and Logout");
		CommonUtillity.getVerifyMyResults(text, pf.getMyText().getText());
		 driver.quit();
	}

}
