package com.us.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertWindow {
	
	WebDriver driver;
	
	@Test
	public void getMyAlertWindow() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		System.out.println("Get My Chrome Thread Count :" + " " + Thread.currentThread().getId());
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("Browser is open");
		
		//WebElement element = driver.findElement(By.id("alertButton"));
	//	((JavascriptExecutor)driver).executeScript("arguments[0]).click()" , element);
		driver.findElement(By.xpath("//*[@id='alertButton']")).click();
		
		Alert popUP = driver.switchTo().alert();
		
	//	popUP.accept();
		popUP.dismiss();
		
		Thread.sleep(1000);
		
	 driver.findElement(By.xpath("//*[@id='promtButton']")).click();
	}

}
