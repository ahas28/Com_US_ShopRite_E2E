package My_Automation_Challenge;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownAction {
	
	static WebDriver driver;
	
	
	@Test
	public void DropDownTest() {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.wikipedia.org/");
	
	DropDownAction.getSelectMyValue("Espanol");
	
//	Select select = new Select(driver.findElement(By.xpath("(//*[@name='language'])[2]")));
	
//	select.selectByIndex(31);
//	select.selectByValue("la");
//	select.selectByVisibleText("Galego");
	}
	
	public static void getSelectMyValue(String text) {
	List<WebElement>myelements = driver.findElements(By.xpath("//*[@id='searchLanguage']"));
	
	
	
	for(WebElement value : myelements) {
		if(text.equals(value.getText()));
		value.click();
		break;
	}
		
	}
}

