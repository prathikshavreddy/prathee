package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework_utility.Base_Test;

public class VTiger_Login_Page extends Base_Test{
	
	public VTiger_Login_Page(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@type='text']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(id="submitButton")
	WebElement login_btn;
	
	
	public void Enter_username(String value){
		username.sendKeys(value);
	}
	
	public void Enter_password(String value){
		password.sendKeys(value);
	}
	
	public void click_Login(){
		login_btn.click();
	}

	
}
