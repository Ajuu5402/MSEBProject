package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	
	public static void screenshot() throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\AUTOMATION\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dmart.in/category/dals-aesc-dals");
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File img = new File("D:\\Vaibhav\\selnium\\IMG1.jpeg");
		 FileHandler.copy(source, img);
		 		
	}

}
