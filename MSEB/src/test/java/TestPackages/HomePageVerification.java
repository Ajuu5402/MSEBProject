package TestPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import BasePackage.Base;
import PomClasses.HomePage;

public class HomePageVerification extends Base {
//	private static final String Assert = null;
	private WebDriver driver;
	private HomePage home;
	
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
//		driver.manage().window().maximize();
//		
//	}
	
	@BeforeClass
	public void beforeclass() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\AUTOMATION\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://wss.mahadiscom.in/wss/wss?uiActionName=getHome");
	}
	
	@BeforeMethod
	public void beforemethod() {
		home=new HomePage(driver);
	}
	
	@Test  
	public void testcase1() {
		home.newRegister();
		String url=driver.getCurrentUrl();
		if(url.equals("https://wss.mahadiscom.in/wss/wss?uiActionName=getCreateUpdateCustProfile_new"))
		{
			System.out.println("testcase1 Passed");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@Test  
	public void testcase2() {
		home.clickOnLogin();
		String url=driver.getCurrentUrl();
		if(url.equals("https://wss.mahadiscom.in/wss/wss?uiActionName=getCustAccountLogin"))
		{
			System.out.println("testcase2 Passed");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@Test  
	public void testcase3() {
		home.forgetLogin();
		String url=driver.getCurrentUrl();
		if(url.equals("https://wss.mahadiscom.in/wss/wss?uiActionName=getForgotLoginPassword"))
		{
			System.out.println("testcase3 Passed");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@Test  
	public void testcase4() {
		home.paybill();
		String url=driver.getCurrentUrl();
		if(url.equals("https://wss.mahadiscom.in/wss/wss?uiActionName=getViewPayBill"))
		{
			System.out.println("testcase4 Passed");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@Test  
	public void testcase5() {
		home.Consumtion();
		String url=driver.getCurrentUrl();
		if(url.equals("https://wss.mahadiscom.in/wss/wss?uiActionName=getApplianceParticulars"))
		{
			System.out.println("testcase5 Passed");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@Test  
	public void testcase6() {
		home.energyBill();
		String url=driver.getCurrentUrl();
		if(url.equals("https://wss.mahadiscom.in/wss/wss?uiActionName=getEnergyBillCalculator"))
		{
			System.out.println("testcase6 Passed");
		}
		else          
		{
			System.out.println("fail");
		}
	}
	
	@Test  
	public void testcase7() {
		home.newConnection();
		String url=driver.getCurrentUrl();
		if(url.equals("https://wss.mahadiscom.in/wss/wss?uiActionName=getNewConnectionRequest"))
		{
			System.out.println("testcase7 Passed");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	
	
	@AfterMethod
	public void aftermethod() {
		driver.navigate().back();
	}
	
	@AfterClass
	public void afterclass() {
		driver.close();
	}

}


