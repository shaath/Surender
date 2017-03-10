package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLogin {

	public static void main(String[] args)
	{
//		FirefoxDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.id("Email"));
		//enter the data into email text box
		
		email.sendKeys("sharathqedge449");
//		Sleeper.sleepTightInSeconds(5);
		//Deleting the text in email text box\
//		email.clear();
		
		//clicking on the next button
		driver.findElement(By.name("signIn")).click();
		Sleeper.sleepTightInSeconds(5);
		//Entering password into password field
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456789");

		//clicking on signin button
		
		driver.findElement(By.cssSelector("#signIn")).click();
	}

}
