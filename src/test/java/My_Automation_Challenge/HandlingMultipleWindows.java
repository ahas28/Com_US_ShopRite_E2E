package My_Automation_Challenge;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleWindows {
	
	 WebDriver driver;
	 
	 @BeforeSuite
	 public void getMYPreRequisite() {
		    WebDriverManager.chromedriver().setup();
			System.out.println("Get My Chrome Thread Count :" + " " + Thread.currentThread().getId());
			driver = new ChromeDriver();
	 }
	
	@Test
	public void getMYHandleMultiWindows() throws InterruptedException {
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("Browser is open");
		driver.findElement(By.xpath("(//*[@type='button'])[3]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//*[@type='button'])[3]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//*[@type='button'])[3]")).click();
		String myDadWindow = driver.getWindowHandle();
		Set<String>s1 = driver.getWindowHandles();
		Iterator<String>i1 = s1.iterator();
		while(i1.hasNext()) {
		String SonWindow = i1.next();
		if(!myDadWindow.equalsIgnoreCase(SonWindow)) {
		driver.switchTo().window(SonWindow);
		driver.close();
		System.out.println("SonWindow is close");
		}
	
		driver.switchTo().window(myDadWindow);
		}
	}

		
	
	
	@AfterSuite
	public void getMyTearDown() {
		
		
		driver.manage().deleteAllCookies();
		driver.quit();
	}

}
