package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	WebDriver driver;
	
	public WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","E:\\AUTOMATION\\chromedriver.exe");
		 driver = new ChromeDriver();
		return driver;
	}
	
	public WebDriver OpenFireFox() {
		System.setProperty("webdriver.gecko.driver","E:\\AUTOMATION\\geckodriver.exe");
		 driver = new FirefoxDriver();
		return driver;
	}

}
