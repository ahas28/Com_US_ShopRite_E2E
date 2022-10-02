package com.us.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestINGParallel {
	
	@Test
	
	public void getMyBrowser1() {
	 
		WebDriverManager.chromedriver().setup();
		System.out.println("Get My Chrome Thread Count :" + " " + Thread.currentThread().getId());
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoprite.com/sm/planning/rsid/218/");
		
		 TestNGclaSS1.getTestA();
		 TestNGclaSS1.getTestB();
		 TestNGclaSS1.getTestC();
		 TestNGclaSS2.getTestD();
		 TestNGclaSS2.getTestE();
		 
		driver.quit();
	}
	
	@Test
	public void getMyBrowser2() {
		WebDriverManager.chromedriver().setup();
		System.out.println("Get My Chrome Thread Count :" + " " + Thread.currentThread().getId());
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoprite.com/sm/planning/rsid/218/");
		
		 TestNGclaSS2.getTestF();
		 TestNGclaSS3.getTestG();
		 TestNGclaSS3.getTestH();
		 TestNGclaSS3.getTestI();
		 
		driver.quit();
	}
	
	 
}
