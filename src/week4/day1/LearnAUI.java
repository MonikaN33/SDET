package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI 
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
		driver.get("https://www.flipkart.com/");
		
		
		/*Navigation navigate = driver.navigate();
		driver.navigate().to("https://www.flipkart.com/");*/
		
		WebElement electronics = driver.findElementByXPath("//span[.='Electronics']");
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).perform();
		
		WebElement apple = driver.findElementByLinkText("Apple");
		apple.click();
		
		
		
		

	}

}
