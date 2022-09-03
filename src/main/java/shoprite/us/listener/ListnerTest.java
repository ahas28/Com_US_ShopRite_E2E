package shoprite.us.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Name" + " " + result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Name" + " " + result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Name" + " " + result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Name" + " " +result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Name" + " " + result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Name" + " " + context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Name" + " " +context.getName());
		
	}

}
