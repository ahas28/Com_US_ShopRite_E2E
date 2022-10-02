package My_Automation_Challenge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectRadioButton {
	
	 WebDriver driver;
		
		@Test
		public void ClickMyButtons() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		System.out.println("Get My Chrome Thread Count :" + " " + Thread.currentThread().getId());
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_css_custom_checkbox.asp");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("Browser is open");
		
	//	JavascriptExecutor jse =(JavascriptExecutor)driver;
	//	WebElement elementName = driver.findElement(By.xpath("//*[@id=\"main\"]/p[2]/a"));
	//	jse.executeScript("arguments[0].scrolltoView(true);",elementName);
	//    Thread.sleep(2000);
		
		WebElement RoundButton = driver.findElement(By.xpath("(//*[@class='radiobtn'])[3]"));
		boolean isSelected = RoundButton.isSelected();
		if (!isSelected) {
		RoundButton.click(); 
		Thread.sleep(3000);
		
		
	    WebElement CheckButton = driver.findElement(By.xpath("(//*[@class='checkmark'])[3]"));
		boolean isSelected2 = CheckButton.isSelected();
		if (!isSelected2) {
		CheckButton.click(); 
		 
			
			 
		}
		
			}
		}

}