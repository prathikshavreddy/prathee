package framework_utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class Base_Test {
	
public WebDriver driver;
	
	@BeforeClass
	public void BrowserSetup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("http://elftestingserver:8888/index.php?action=Login&module=Users");
		driver.get("http://elftestingserver:8888/index.php?action=Login&module=Users");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void Login() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		WebElement as=driver.findElement(By.xpath("//input[@type='password']"));
		Utility_Methods.Enter_Value_In_Edit_Field(as, "admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	
//	@AfterClass
//	public void TearDown() {
//		driver.close();
//	}

}
