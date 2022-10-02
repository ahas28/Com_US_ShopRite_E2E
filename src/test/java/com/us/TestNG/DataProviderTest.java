package com.us.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {
	public static WebDriver driver;
	
	@DataProvider(name = "Authentication")
	public static Object[][]credentials() {
		return new Object[][] {{"loganbond977@yahoo.com","SmartTech21$"},
							  {"loganbond977@yahoo.com","SmartTech21$"},
							  {"loganbond977@yahoo.com","SmartTech21$"}};
		
							
	}
	
	@Test(dataProvider = "Authentication")
	public void quickTest(String myUsername, String myPassword) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Get My Chrome Thread Count :" + " " + Thread.currentThread().getId());
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.shoprite.com/sm/planning/rsid/218/");
		driver.findElement(By.xpath("//*[@class='HeaderSubtitle--5xucaa gQDiRY']")).click();
		driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys(myUsername);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(myPassword);
		driver.findElement(By.xpath("//*[contains(@type,'mit')]")).click();
	}

}
