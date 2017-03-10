package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GrigEg1
{
	@Parameters("browser")
	@Test
	public void test(String br) throws MalformedURLException
	{
		DesiredCapabilities cap=null;
		if (br.equalsIgnoreCase("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setPlatform(Platform.WINDOWS);
		}
		else if (br.equalsIgnoreCase("chrome")) 
		{
			cap=DesiredCapabilities.chrome();
			cap.setPlatform(Platform.WINDOWS);
		}
//		DesiredCapabilities cap=DesiredCapabilities.firefox();
//		cap.setPlatform(Platform.WINDOWS);
		
//		DesiredCapabilities cap=DesiredCapabilities.chrome();
//		cap.setPlatform(Platform.WINDOWS);
		 
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.244:4444/wd/hub"), cap);
		
		String date="18/november/2018";
		String[] split=date.split("/");
		
		String day=split[0];
		String month=split[1];
		String year=split[2];
		System.out.println(day+"-----"+month+"----"+year);
		
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(5);
		
		driver.findElement(By.id("DepartDate")).click();
		
		//Year Selection
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while (!calyear.equals(year)) 
		{
			driver.findElement(By.className("nextMonth ")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		//month selection
		
		String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		
		while (!calmonth.equalsIgnoreCase(month)) 
		{
			driver.findElement(By.className("nextMonth ")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		} 
		
		
		//Day Selection
		
		List<WebElement> cols=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));
		
		for (int i = 0; i < cols.size(); i++) 
		{
			String calday=cols.get(i).getText();
			System.out.println(calday);
			if (day.equals(calday)) 
			{
				cols.get(i).click();
				break;
			}
			
		}
		
	}

}
