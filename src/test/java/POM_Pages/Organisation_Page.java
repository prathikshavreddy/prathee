package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Base_Test;

public class Organisation_Page extends Base_Test{
	
	public Organisation_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	WebElement organisation;
	
	public WebElement organisation() {
		return organisation;
	}
}
