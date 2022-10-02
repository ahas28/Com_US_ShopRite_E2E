package My_Automation_Challenge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingUpAndDown {
	 WebDriver driver;
	
	@Test
	public void ScrollMyPage() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	System.out.println("Get My Chrome Thread Count :" + " " + Thread.currentThread().getId());
	driver = new ChromeDriver();
	driver.get("https://www.gamestop.com/");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	System.out.println("Browser is open");
	
	JavascriptExecutor Scroller =(JavascriptExecutor) driver;
	Scroller.executeScript("window.scrollBy (0,5000)");
	
	
	//Actions Magic = new Actions(driver);
	//Magic.sendKeys(Keys.PAGE_DOWN).build().perform();
	
	Thread.sleep(2000);
	
	JavascriptExecutor Scroller2 =(JavascriptExecutor) driver;
	Scroller2.executeScript("window.scrollBy (0,-5000)");
	
	//Actions PowerUp = new Actions(driver);
	//PowerUp.sendKeys(Keys.ARROW_UP);
	
	
	
}

}
