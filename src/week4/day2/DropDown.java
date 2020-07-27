package week4.day2;

import java.util.List;
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
		
		WebElement dd = driver.findElementById("Index");
		Select sel = new Select(dd);
		List<WebElement> option = sel.getOptions();
		
		System.out.println(option.size());
		
		for (WebElement eachop : option) 
		{
			System.out.println(eachop.getText());
			
		}
		
		WebElement first = sel.getFirstSelectedOption();
		System.out.println(first.getText());
		
		
		

	}

}
