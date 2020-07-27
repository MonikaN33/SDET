package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Login
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
		
		/*driver.get("http://play.letcode.in/edit");
		driver.findElementById("fullName").sendKeys("Monika");*/
		
		driver.get("https://play.letcode.in/signin");
		driver.findElementById("username").sendKeys("admin");
		driver.findElementById("password").sendKeys("admin");
		
		
		
		

	}

}
