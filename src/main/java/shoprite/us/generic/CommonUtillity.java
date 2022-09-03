package shoprite.us.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;
import shoprite.us.baseclass.BaseClass;

public class CommonUtillity extends BaseClass {
	
	public static void getMyActionClick(WebElement clicker) {
	Actions click = new Actions(driver);
	click.click(clicker).build().perform();
	}
	public static void getJSEClick(WebElement clicker) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clicker);
		
	}
	 
	public static void getVerifyMyResults(String Expected, String Actual) {
	Assert.assertEquals(Expected, Actual);
			
	if (Expected.equals(Actual)){
	System.out.println("Expected and Actual Match");
	}else{
	System.out.println("Expected and Actual doesnt not Match");
	}
	
	}
	
	public static void getMyTitle(String Expected, String Actual) {
	Assert.assertEquals(Expected, Actual);
				
	if (Expected.equals(Actual)){
	System.out.println("Expected and Actual Match");
	}else{
	System.out.println("Expected and Actual doesnt not Match");
	}
	//Zoopla Sign in
	////*[@id='__next']/div/header/div/div/nav/div[3]/div[2]/ul/li[3]/a
		}
}
