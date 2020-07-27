package week4.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindMultipleElements 
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
		driver.get("https://play.letcode.in/button");
		List<WebElement> button = driver.findElements(By.tagName("button"));
		int size = button.size();
		
		if(size==7)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Failed");
		}
		
		//Print button names
		for (WebElement btn : button) 
		{
			System.out.println(btn.getText());
			System.out.println(btn.getLocation());
			//get color
			System.out.println(btn.getCssValue("background-color"));
		}
		
		//second button
		WebElement webElement = button.get(1);
		System.out.println("Printing values for second button....");
		System.out.println(webElement.getText());
		System.out.println(webElement.getLocation());
		System.out.println(webElement.getCssValue("background-color"));
		
		
		driver.quit();

	}

}
