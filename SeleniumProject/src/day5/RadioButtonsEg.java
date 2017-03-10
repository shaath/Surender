package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsEg {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath(".//*[@id='SearchForm']/nav"));
		
		List<WebElement> radios=block.findElements(By.tagName("input"));
		
		System.out.println("The number of Radio buttons avaiable in th block is "+radios.size());
		
		for (int i = 0; i < radios.size(); i++)
		{
			String text=radios.get(i).getAttribute("value");
			System.out.println(text);
			if (text.equalsIgnoreCase("MultiCity"))
			{
				radios.get(i).click();
				break;
			}
		}

	}

}
