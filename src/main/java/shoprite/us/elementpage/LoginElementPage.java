package shoprite.us.elementpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import shoprite.us.baseclass.BaseClass;

public class LoginElementPage extends BaseClass {
	
	public LoginElementPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//*[@class='HeaderSubtitle--5xucaa gQDiRY']")
	@CacheLookup
	private WebElement clickOnSignButton;
	
	public WebElement getClickOnSignButton() {
	return clickOnSignButton;
	}

}
