package My_Automation_Challenge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftNDHardAssert {
	
	WebDriver driver;
	
		@Test
		public void getMyPassNDFail() {
			
			SoftAssert obj = new SoftAssert();
			
			WebDriverManager.chromedriver().setup();
			System.out.println("Get My Chrome Thread Count :" + " " + Thread.currentThread().getId());
			driver = new ChromeDriver();
			driver.get("https://www.guru99.com/");
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			System.out.println("Browser is open");
			
			String title = "Meet Guru99 – Free Training Tutorials & Video for IT Courses";
			obj.assertEquals(driver.getTitle(),title);
			WebElement elm = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div/div/div/div/div/div[1]/div/div/a/img"));
			
			obj.assertTrue(elm.isDisplayed());
			System.out.println("Test case Pass 1");
			
			WebElement text = driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div/div[1]/h1"));
			obj.assertEquals(text.getText(), "Tutorials Library");
			System.out.println("Test case Pass 2");
			
			WebElement Message1 = driver.findElement(By.xpath("//*[@id=\"kt-layout-id_5c1b91-c0\"]/div/div[1]/div/span[1]/strong"));
			obj.assertEquals(Message1.getText(), "Career Suggestion" );
			System.out.println("Text Match");
			 
			
			
			obj.assertAll();
			driver.quit();
		
		}

}
