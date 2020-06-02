package BookFlight;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookFlights {
	
	
WebDriver driver;
	
	@Test()
	public void bookFlight() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.get("https://www.goibibo.com/flights/air-DEL-PAT-20200314--1-0-0-E-D/");
		
		PageObject obj = new PageObject();
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File fs= ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(fs, new File(".png"));
		
		
		

		
		
			
		
	}

}
