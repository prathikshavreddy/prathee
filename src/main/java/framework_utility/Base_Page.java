package framework_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework_utility.Base_Test;

public class Base_Page extends Base_Test{

	public Base_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
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
	
	@FindBy(xpath = "//td[@class='tabSelected']")
	WebElement Calender;
	
	@FindBy(xpath = "(//a[text()='Leads'])[1]")
	WebElement Leads;
	
	@FindBy(xpath = "(//a[text()='Organizations'])[1]")
	WebElement Organization;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	WebElement Contacts;
	
	@FindBy(xpath = "(//a[text()='Opportunities'])[1]")
	WebElement Opportunities;
	
	@FindBy(xpath = "//a[text()='Products']")
	WebElement Products;
	
	@FindBy(xpath = "//a[text()='Documents']")
	WebElement Documents;
	
	@FindBy(xpath = "//a[text()='Email']")
	WebElement Email;
	
	@FindBy(xpath = "(//a[text()='Trouble Tickets'])[1]")
	WebElement Trouble_Tickets;
	
	@FindBy(xpath = "//a[text()='Dashboard']")
	WebElement Dashboard;
	
	@FindBy(xpath = "//a[text()='More']")
	WebElement More;
	
	@FindBy(xpath = "//select[@class='small' and @id='qccombo']")
	WebElement Quick;
	
	@FindBy(xpath = "(//img[@width=\"27\"])[1]")
	WebElement Pluse;
	
	@FindBy(xpath = "(//img[@width=\"27\"])[2]")
	WebElement OpenCalender;
	
	@FindBy(xpath = "(//img[@width=\"27\"])[3]")
	WebElement Clock;
	
	@FindBy(xpath = "(//img[@width=\"27\"])[4]")
	WebElement SecondClock;
	
	@FindBy(xpath = "(//img[@width=\"27\"])[5]")
	WebElement Chat;
	
	@FindBy(xpath = "(//img[@width=\"27\"])[6]")
	WebElement LastViewed;
	
	@FindBy(xpath = "(//img[@width=\"27\"])[7]")
	WebElement Layout;
	
	//methods
	public WebElement calender() {
		return Calender;
	}
	
	public WebElement leads() {
		return Leads;
	}
	public WebElement organization() {
		return Organization;
	}
	public WebElement products() {
		return Products;
	}
	public WebElement documents() {
		return Documents;
	}
	public WebElement trouble_Tickets () {
		return Trouble_Tickets;
	}
	public WebElement dashboard () {
		return Dashboard;
	}
	public WebElement more () {
		return More;
	}
	public WebElement quick () {
		return Quick;
	}
	public WebElement pluse () {
		return Pluse;
	}

	public WebElement openCalender () {
		return OpenCalender;
	}
	public WebElement clock() {
		return Clock;	
	}
	public WebElement secondClock() {
		return SecondClock;	
	}
	public WebElement chat() {
		return Chat;	
	}
	public WebElement lastViewed() {
		return LastViewed;	
	}
	public WebElement layout() {
		return Layout;	
	}
	
}


