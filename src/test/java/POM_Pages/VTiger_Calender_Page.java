package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework_utility.Base_Test;

public class VTiger_Calender_Page extends Base_Test{
	
	public VTiger_Calender_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Calendar']")
	WebElement calendar;
	
	@FindBy(xpath="//td[text()='All Events & Todos']")
	WebElement all_events_todos_click;
	
	@FindBy(xpath="//input[@id='selectCurrentPageRec']")
	WebElement checkbox_click;
	
	@FindBy(xpath="(//input[@class='crmbutton small delete'])[2]")
	WebElement delete_btn;
	
	public WebElement calender() {
		return calendar;
	}
	
	public WebElement all_events_todos() {
		return all_events_todos_click;
	}
	
	public WebElement check_box() {
		return checkbox_click;
	}
	
	public WebElement delete_btn() {
		return delete_btn;
	}
}
