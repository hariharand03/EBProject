package finalProject;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	WebDriver driver;

	HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void handleAlert()
	{
		driver.findElement (By.className("close")).click();
		driver.findElement(By.id("bd-versions")).click();
	}
	
	public void takeHomeScreenshot() throws Exception
	{
		// Taking ScreenShot of Home Page
		File ScreenShotFile1 = ((TakesScreenshot) driver) .getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ScreenShotFile1,new File(".//screenshot/Home.png"));  

	}
	public void logout()
	{
		WebElement out = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[2]/div/div[6]/div/div/div[1]/div[2]/a[6]"));
	
		out.click();
		
	}
	public void teardown()
	{
		driver.quit();
	}






}
