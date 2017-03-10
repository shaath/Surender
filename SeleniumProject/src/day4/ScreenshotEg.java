package day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotEg {

	public static void main(String[] args) throws IOException 
	{
		 WebDriver driver=new FirefoxDriver();
		 driver.get("http://opensource.demo.orangehrmlive.com/");
		 
		 File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src, new File("F:\\Surendar\\SeleniumProject\\src\\screenshot\\orangehrm.png"));

	}

}
