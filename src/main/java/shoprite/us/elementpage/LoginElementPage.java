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
	
	@FindBy(xpath = "//*[@class='HeaderSubtitle--5xucaa gQDiRY']")//Click Sign in Button One
	@CacheLookup
	private WebElement clickOnSignButton;
	
	public WebElement getClickOnSignButton() {
	return clickOnSignButton;
	}
	
	@FindBy(xpath = "//*[@class='form-control']")//Enter My UserName
	@CacheLookup
	private WebElement myUserName;
	
	public WebElement getMyUserName() {
	return   myUserName;
	
	 
	}
	
	@FindBy(xpath = "//*[@name='password']")//Enter My PassWord
	@CacheLookup
	private WebElement myPWD;
	
	public WebElement getMyPassword() {
	return   myPWD;
	
	}
	
	@FindBy(xpath = "//*[contains(@type,'mit')]")//Enter My SignIN Button Two
	@CacheLookup
	private WebElement mySignIN;
	
	public WebElement  getMySignIN() {
	return   mySignIN;
	
	}
	
	@FindBy(xpath = "(.//*[text()='at ShopRite of Brooklyn'])[1]") 
	@CacheLookup
	private WebElement myText;
	
	public WebElement  getMyText() {
	return   myText;
	
    }
	
	@FindBy(xpath = "") 
	@CacheLookup
	private WebElement myTitle;
	
	public WebElement  getMyTitle() {
	return   myText;
	
	}
	
	public void getMyUserNameAndPWD(String MyName,String MyPWD) { //to get my password and username
		getMyUserName().sendKeys(MyName);
		getMyPassword().sendKeys(MyPWD);
	}
	
	
}
