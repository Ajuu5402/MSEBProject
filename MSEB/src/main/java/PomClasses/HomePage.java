package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath = "//span[text()='New User Registration']")
	private WebElement newregister;
	
	@FindBy  (xpath = "//span[text()='Login']")
	private WebElement logintab;
	
	@FindBy (xpath = "//span[text()='Forgot Login Name/Password?']")
	private WebElement forgetlogin;
	
	@FindBy (xpath = "//span[text()='View/Pay Bill']")
	private WebElement paybill;
	
	@FindBy (xpath = "//span[text()='Consumption Calculator']")
	private WebElement consumtion;
	
	@FindBy (xpath = "//span[text()='Energy Bill Calculator']")
	private WebElement energybill;
	
	@FindBy (xpath = "//span[text()='New Connection Request']")
	private WebElement newconnection;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void newRegister() {
		newregister.click();
	}
	
	public void clickOnLogin() {
		logintab.click();
	}
	
	public void forgetLogin() {
		forgetlogin.click();
	}
	
	public void paybill() {
		paybill.click();
	}
	
	public void Consumtion() {
		consumtion.click();
	}
	
	public void energyBill() {
		energybill.click();
	}
	
	public void newConnection() {
		newconnection.click();
	}


}


