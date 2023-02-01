package POM_TestCases;

import org.testng.annotations.Test;

import POM_Pages.VTiger_Login_Page;
import framework_utility.Base_Test;

public class VTiger_Login_Test extends Base_Test{
	
	@Test
	public void Login() {
		VTiger_Login_Page lp=new VTiger_Login_Page(driver);
		lp.Enter_username("admin");
		lp.Enter_password("admin");
		lp.click_Login();
	}
}
