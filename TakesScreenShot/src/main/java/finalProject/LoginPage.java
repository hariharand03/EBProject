package finalProject;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	WebDriver driver;
	File ScreenShotFile;
	
	LoginPage()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.edubridgeindia.com/login");
	}

	
	By email = By.id("login_mobile");
	By pwd = By.id("login_password");
	
	By btnSubmit = By.id("btnLoginSubmit");
	
	
	public void login(String mobile,String password) {
		driver.findElement(email).sendKeys(mobile);
		driver.findElement(pwd).sendKeys(password);	
		
		driver.findElement(btnSubmit).click();		
	}
	
	public void takeScreenshot() throws Exception
	{
		// Taking ScreenShot of Login Page
				ScreenShotFile = ((TakesScreenshot) driver) .getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(ScreenShotFile,new File(".//screenshot/Login.png"));  
				
	}
	
	public void gotoHome() throws Exception
	{
		HomePage page = new HomePage(driver);
		page.handleAlert();
		page.takeHomeScreenshot();
		page.logout();
		page.teardown();
	}
	
	
}
