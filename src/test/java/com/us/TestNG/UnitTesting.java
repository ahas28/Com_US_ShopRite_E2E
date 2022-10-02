package com.us.TestNG;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnitTesting {
	WebDriver driver;
	
	@BeforeTest
	public void getMySetUp() {
		WebDriverManager.chromedriver().setup();
		System.out.println("Get My Chrome Thread Count :" + " " + Thread.currentThread().getId());
		driver = new ChromeDriver();
		driver.get("https://www.shoprite.com/sm/planning/rsid/218/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Browser is open");
	}
	
	@Test
	public void getMyFunctionTest1() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='HeaderSubtitle--5xucaa gQDiRY']")).click();
		Thread.sleep(3000);
		System.out.println(" My Test Case One");
		
	}
	 
	@AfterTest
	public void driverDown() {
	//	driver.quit();
		System.out.println("Browser is close");
	}
}
