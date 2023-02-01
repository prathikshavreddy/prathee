package POM_TestCases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import framework_utility.Base_Test;
import framework_utility.Utility_Methods;

public class VT_Login_Test extends Base_Test{
	
	@DataProvider(name="log")
	public Object []testsearch() throws IOException{
		Object [][] data=Utility_Methods.getTestData("vtiger");
		return data;
	}
	
	@Test(dataProvider = "log")
	
	public void register(String un,String pwd) {
		
		WebElement usnm=driver.findElement(By.xpath("//input[@name=\"user_name\"]"));
		Utility_Methods.Enter_Value_In_Edit_Field(usnm, un);
		
		WebElement pass=driver.findElement(By.xpath("//input[@name=\"user_password\"]"));
		Utility_Methods.Enter_Value_In_Edit_Field(pass, pwd);
		
		WebElement lo= driver.findElement(By.xpath("//input[@id='submitButton']"));
		Utility_Methods.Click_Element(lo);
	
	}


}
