package framework_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class VT_Home_Page {
		
		public VT_Home_Page(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//Elements for HomePage
			@FindBy(xpath="//img[@src='themes/softed/images/Home.PNG']")
			WebElement Home;
			
		//Elements for ADDButton
			@FindBy(xpath="//img[@width='27' and @onmouseout='fnRemoveWindow();']")
			WebElement Add_Button;
			
			//Search_Box
			@FindBy(name="query_string")
			WebElement Search_Box;
			
			// Setting_Button
			@FindBy(xpath="//img[@style='padding: 0px;padding-left:5px ']")
			WebElement Setting_Button;
			
			//Administration
			@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
			WebElement Admnistration;
			
			//information_Button
			@FindBy(xpath="//img[@src='themes/softed/images/info.PNG']")
			WebElement information_Button;
			
			//Arrow Down
			@FindBy(xpath="//img[@src='themes/images/arrow_down_black.png']")
			WebElement Arrrow_Button;
			
			//add NoteBook
			@FindBy(xpath="(//a[@class='drop_down'])[4]")
			WebElement Notebook;
			
			//Drop_Down
			@FindBy(xpath="(//select[@class='small'])[1]")
			WebElement Dropdown;
			
			//=======================implementations==========================
			
			public void dropdown_2() {
				Dropdown.click();
			}
			
			public void homepage() {
				Home.click();
			}
			public void add_Button(WebDriver d) {
				Add_Button.click();
			}
			public void search_box() {
				Search_Box.sendKeys("hello");
			}
			public void setting_button() {
				Setting_Button.click();
			}
			public void adminstration() {
				Admnistration.click();
			}
			
			public void information_Button() {
				information_Button.click();
			}
			public void Arrow_button() {
				Arrrow_Button.click();
			}
			public void notebook() {
				Notebook.click();
			}
			public void Quick_Click(int i) {
				WebElement Drop=Dropdown;
				Select select=new Select(Drop);
				select.selectByIndex(i);
}
}
