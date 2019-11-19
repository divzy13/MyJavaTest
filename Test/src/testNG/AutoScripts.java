package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoScripts {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.raveendran\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void somename() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.seleniumeasy.com/test/");
		System.out.println(driver.getCurrentUrl().equalsIgnoreCase("https://www.seleniumeasy.com/test/"));
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
