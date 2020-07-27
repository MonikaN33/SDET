package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndSort 
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
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		
		WebElement src = driver.findElementById("draggable");
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(src, 147, 140).perform();
		
		driver.get("https://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		
		WebElement item = driver.findElementByXPath("//li[text()='Item 1']");
		builder.dragAndDropBy(item, 6, 171).perform();
		
		
		

	}

}
