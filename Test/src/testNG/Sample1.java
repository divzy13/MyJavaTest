package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sample1 {

	@Test
	public static void main(String[] args) throws InterruptedException {

		
		String strpathSeperator = System.getProperty("file.separator");
		//define browser driver in system properties
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.home") + strpathSeperator + "Downloads" + strpathSeperator + "chromedriver_win32" + strpathSeperator + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open CGI page
		driver.manage().window().maximize();
		driver.navigate().to("https://www.cgi.com/en");
				
		//print page title
		System.out.println("CGI Page Title is : "+driver.getTitle());
		
		//print page URL
		System.out.println("CGI Page URL is : "+driver.getCurrentUrl());
		
		//wait for 5 seconds
		Thread.sleep(5000);
		
		//close the browser
		driver.quit();
	}

}
