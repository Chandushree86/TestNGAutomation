package PracticeSelenium.Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApp 
{
	public void LaunchingBrowser() 
	{
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:/Coding/Automation/TestNGPractice/Selenium_Testng/Testng/drivers/chromedriver.exe"
		 * );
		 */	
		System.setProperty("webdriver.gecko.driver","D:/Coding/Automation/TestNGPractice/Selenium_Testng/Testng/drivers/geckodriver.exe" );

		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.google.com/");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * driver.manage().timeouts().implicitlyWait(null).equals(driver.getTitle().)
		 */		
		driver.quit();
	}
	
}
