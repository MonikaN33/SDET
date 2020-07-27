package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MercuryTours
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
		
		driver.manage().window().maximize();
		
		
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		driver.findElementByName("userName").sendKeys("username");
		driver.findElementByName("password").sendKeys("password");
		driver.findElementByName("login").click();

	}

}
