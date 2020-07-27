package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
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
		driver.get("https://play.letcode.in/aui");
		WebElement src = driver.findElementById("draggable");
		WebElement tgt = driver.findElementById("droppable");
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(src, tgt).perform();
		
		
		
		

	}

}
