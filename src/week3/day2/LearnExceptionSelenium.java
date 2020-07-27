package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnExceptionSelenium
{
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-extensions");
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--no-sandbox");
		
		//Launch chrome browser
		ChromeDriver driver = new ChromeDriver(options);
		//one time declaration
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://play.letcode.in/frame");
		
		webdriver frameEle = driver.findElemetBy
		
		driver.switchTo().frame(frameEle);
		try
		{
			driver.findElementById("username").sendKeys("admin");
		}
		catch(NoSuchElementException e)
		{
			System.err.println("err");
		}
		
		
		driver.findElementById("password").sendKeys("admin");
	}

	

}
