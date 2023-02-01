package POM_TestCases;

import org.testng.annotations.Test;

import POM_Pages.VTiger_homepage;
import framework_utility.Base_Test;

public class Organisation_Test extends Base_Test{
	
	@Test
	public void org() {
		VTiger_homepage hp=new VTiger_homepage(driver);
		hp.organization().click();
	}

}
