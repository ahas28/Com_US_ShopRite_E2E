package shoprite.us.myrunner;

	
	import io.cucumber.java.After;
	import io.cucumber.java.Before;
	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;
	@CucumberOptions(
			
			//help of the plugin we are creating the report like Jason, HTML
			//format = {"pretty","json:target/cucumber.json"},
			
			plugin = {"pretty","json:target/cucumber.json" },
			features = {"./Features",},
			glue = {"shoprite.us.stepdefinitions", },
			dryRun = false,
			 
			tags = "@Sanity",
			//dryRun = true 
			monochrome = true
			)

	public class MyRunner extends AbstractTestNGCucumberTests {

}
