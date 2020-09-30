package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import reusable.CommonMethods;

public class Amazon extends CommonMethods {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("WebDriver.Chrome.Driver", "chromedriver.exe");
		 driver=new ChromeDriver();
		 
		CommonMethods.url("https://www.amazon.in/", driver);
		CommonMethods.maximize(driver);
		String title=title(driver);
		System.out.println(title);
      CommonMethods.click(By.xpath("//a[contains(text(),'Mobiles')]"), driver);

        String title1=title(driver);
        System.out.println(title1);
        driver.navigate().back();
        String title2=title(driver);
        System.out.println(title2);
        if(title.equals(title2))
        {
	    System.out.println("Both titles are equal");
        }
        else
        {
        System.out.println("Both titles are not equal");
        }
        driver.close();
	    }
        
        
       

       }
