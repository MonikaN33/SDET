package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MercuryToursRegistration 
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
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.findElementByName("firstName").sendKeys("Monika");
		driver.findElementByName("lastName").sendKeys("Gupta");
		driver.findElementByName("phone").sendKeys("1234567890");
		driver.findElementByName("userName").sendKeys("abc@we");
		driver.findElementByName("address1").sendKeys("Panathur");
		driver.findElementByName("address2").sendKeys("Kadubeesanahalli");
		driver.findElementByName("city").sendKeys("Bengaluru");
		driver.findElementByName("state").sendKeys("Karnataka");
		driver.findElementByName("postalCode").sendKeys("112233");
		driver.findElementById("email").sendKeys("abc@we");
		driver.findElementByName("password").sendKeys("password");
		driver.findElementByName("confirmPassword").sendKeys("password");
		driver.findElementByName("register").click();

	}

}
