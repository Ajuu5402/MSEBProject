package TestPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BasePackage.Base;
import PomClasses.HomePage;
import PomClasses.LoginPage;

public class LoginPageVerification extends Base{
	
	private WebDriver driver;
	private LoginPage loginpage;
	
	@BeforeTest
//	@Parameters ("browser")
//	public void beforetest(String browser)  {
//		if(browser.equalsIgnoreCase("chrome"))
//		{
//			driver=openChromeBrowser();
//		}
//		else			
//		{
//			driver=OpenFireFox();
//		}
//		
//		driver.manage().window().maximize();
//		
//	}
//	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "E:\\AUTOMATION\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wss.mahadiscom.in/wss/wss?uiActionName=getHome");
		HomePage home=new HomePage(driver);
		home.clickOnLogin();
	}

	@BeforeMethod
	public void beforemethod() throws InterruptedException {
		loginpage=new LoginPage(driver);
		loginpage.UserName();
		loginpage.Password();
		loginpage.getCaptcha();
		loginpage.enterCaptcha();
		loginpage.clickLogin();
	}

	@Test
	public void testcase1() throws InterruptedException {
		loginpage.myAccount();
		if (loginpage.myAccount())
		{
			System.out.println("testcase1 passed");
		}
		else
		{
			System.out.println("fail");
		}
	}

	@AfterMethod
	public void aftermethod() {
		loginpage.Logout();
	}

	@AfterClass
	public void afterclass() {
		driver.close();
	}


}