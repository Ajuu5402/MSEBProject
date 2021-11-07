package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	private String captcha;
	@FindBy (xpath ="//input[@id='loginId']")
	private WebElement username;
	
	@FindBy (xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy (xpath = "//canvas[@id='captcha']")
	private WebElement getcaptcha;
	
	@FindBy (xpath ="//input[@id='txtInput']")
	private WebElement entercaptcha;
	
	@FindBy (xpath="//span[@id='lblLoginButton']")
	private WebElement login;
	
	@FindBy (xpath="//span[text()='My Account']")
	private WebElement myaccount;
	
	@FindBy (xpath = "//a[text()='Logout']")
	private WebElement logout;
	
	public   LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void UserName() throws InterruptedException {
		Thread.sleep(3000);
		username.sendKeys("ajjay");
	}
	
	public void Password() throws InterruptedException {
		Thread.sleep(3000);
		password.sendKeys("12345");
	}
	
	public String getCaptcha() {
		String captcha=getcaptcha.getText();
		return captcha;
	}
	
	public void enterCaptcha() throws InterruptedException {
		Thread.sleep(5000);
		entercaptcha.sendKeys();
	}
	
	public void clickLogin() {
		login.click();
	}
	
	public boolean myAccount() {
		boolean result = myaccount.isDisplayed();
		return result;
	}
	
	public void Logout() {
		logout.click();
	}
	

}



