package week2.day2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
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
		driver.get("https://play.letcode.in/dropdown");
		
		//select drop-down
		WebElement fruitDD = driver.findElementById("Index");
		Select sel = new Select(fruitDD);
		sel.selectByVisibleText("Mango");
		
		WebElement life = driver.findElementByName("text");
		Select selLife = new Select(life);
		selLife.selectByIndex(1);
		selLife.selectByValue("okok");

	}

}
