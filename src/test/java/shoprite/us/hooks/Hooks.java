package shoprite.us.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import shoprite.us.baseclass.BaseClass;

public class Hooks extends BaseClass {
	
	
	@Before
	public void SettingUp() {
		BaseClass.initializations();
	}
	
	@After 
	public void TeariNGdoWN() {
		driver.quit();
	}

}
