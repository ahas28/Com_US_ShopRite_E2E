package shoprite.us.generic;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import shoprite.us.baseclass.BaseClass;

public class MyWaitHelper extends BaseClass{
	
	public static void ExplicitWaitStatement(WebElement Waiter) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(Waiter));
	}
	
	public static void waitForMeThenClick (WebElement element, WebDriver driver) {
		Wait<WebDriver>fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
		.pollingEvery(Duration.ofMillis(2000)).ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
