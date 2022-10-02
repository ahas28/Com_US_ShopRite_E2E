package com.us.TestNG;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	
	static WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void GoogleChrome(String browser) {
		System.out.println("Testing as cross browser test");
		
		if(browser.equalsIgnoreCase("Chrome")) {
		//	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("User able to open Chrome Driver");
		
		
		}
		
		else if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
			System.out.println("User able to open Edge Driver");
		}
	}
	
	
		@Test
		public static void CrossBrowserTest() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		
			driver.get("https://www.shoprite.com/sm/planning/rsid/218/");
			
			//Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@class='HeaderSubtitle--5xucaa gQDiRY']")).click();
			
		//	Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys("loganbond977@yahoo.com");
			
		//	Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys("SmartTech21$");
	    	
		//	Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains(@type,'mit')]")).click();
		}
		
		@AfterTest
		public void TearDown() {
		//	driver.quit();
			driver.manage().deleteAllCookies();
		}
}
