package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {
	//static WebDriver driver;
	
	public static void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public static void url(String url,WebDriver driver)
	{
		driver.get(url);
	}

	

	public static void click(By xpath, WebDriver driver) {
		// TODO Auto-generated method stub
		driver.findElement(xpath).click();
		
	}
	 public static String title(WebDriver driver)
     {
	    return driver.getTitle();
	
    }
	 public static void sendkeys(By xpath, String data, WebDriver driver)
		{
			driver.findElement(xpath).sendKeys(data);
		}
	
	

	
}

