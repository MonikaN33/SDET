package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Wait
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
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		driver.findElementByName("userName").sendKeys("username");
		driver.findElementByName("password").sendKeys("password");
		driver.findElementByName("login").click();

	}

}
