package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnAert 
{

	public static void main(String[] args) throws InterruptedException 
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
		driver.get("https://play.letcode.in/alert");
		driver.findElementByName("qawse").click();
		driver.switchTo().alert().accept();
		driver.findElementByName("zxcvbnm").click();
		Thread.sleep(5000);
		Alert myalert = driver.switchTo().alert();
		String alerttext = myalert.getText();
		System.out.println("My alert text: "+ alerttext);
		myalert.dismiss();
		
		driver.findElementByXPath("//button[test().'Prompt']").click();
		Thread.sleep(3000);
		myalert.sendKeys("Monika");
		


		

	}

}
