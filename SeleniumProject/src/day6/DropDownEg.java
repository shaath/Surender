package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;


public class DropDownEg {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///F:/Sharath/Desktop/cars.html");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.xpath("html/body/select"));
		
		Select s=new Select(drop);
		
//		s.selectByIndex(2);
//		Sleeper.sleepTightInSeconds(5);
//		s.selectByValue("saab");
//		Sleeper.sleepTightInSeconds(5);
//		s.selectByVisibleText("audi");
		
		List<WebElement> list=s.getOptions();
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) 
		{
			s.selectByIndex(i);
			String city=list.get(i).getText();
			System.out.println(city);
		}
		
	}

}
