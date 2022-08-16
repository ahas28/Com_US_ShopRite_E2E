package shoprite.us.stepdefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import shoprite.us.baseclass.BaseClass;
import shoprite.us.elementpage.LoginElementPage;

public class LoginTest extends BaseClass {
	LoginElementPage pf;
	
	@Given("User able to open any browsers.")
	public void user_able_to_open_any_browsers() {
		BaseClass.initializations();
		 pf = new LoginElementPage(); 
	    
	}
	@Given("User able enter {string} URL")
	public void user_able_enter_url(String url) {
		driver.get(url);
	   
	}
	@When("user able to click sign in button")
	public void user_able_to_click_sign_in_button() {
		pf.getClickOnSignButton().click();
	    
	}
	@When("User able to enter username")
	public void user_able_to_enter_username() throws InterruptedException {
	driver.findElement(By.xpath("//*[@class='HeaderSubtitle--5xucaa gQDiRY']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys("loganbond977@yahoo.com");
	}
	@When("User able to enter password")
	public void user_able_to_enter_password() {
	     
	}
	@When("User able to login in button")
	public void user_able_to_login_in_button() {
	    
	}
	@Then("User able to verify the user information {string} on the UI")
	public void user_able_to_verify_the_user_information_on_the_ui(String text) {
	     
	}

}
