package POM_TestCases;

import org.testng.annotations.Test;
import POM_Pages.VTiger_Login_Page;
import POM_Pages.VTiger_homepage;
import framework_utility.Base_Page;
import framework_utility.Base_Test;

public class VTiger_Calender_Test extends Base_Test{
	
	@Test
	public void Login() {
		Base_Page bp=new Base_Page(driver);
		bp.calender().click();	
		
	}
}