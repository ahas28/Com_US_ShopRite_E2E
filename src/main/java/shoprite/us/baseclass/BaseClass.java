package shoprite.us.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static Logger logger;
	public static Properties prop;
	public static WebDriver driver;
	
	public BaseClass() {
		logger = Logger.getLogger("QA Boss = H@SH");
		PropertyConfigurator.configure("log4j.properties");
		
		
		try {
		prop = new Properties();
		FileInputStream CP = new FileInputStream(
		System.getProperty("user.dir") + "/src/main/java/configurate/configurate.properties");
		prop.load(CP);
		
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}}

	
	//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	public static void  initializations() {
		String browserLink = prop.getProperty("browser");
		if(browserLink.equals("chrome")){
		logger.info("User able to open chrome browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	} else if (browserLink.equals("edge")){
		logger.info("User able to open edge browser");
	System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
		driver = new EdgeDriver();
	
}
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//System.out.println(prop.getProperty("URL"));
		
}
}
	 


