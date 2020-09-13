package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver", "chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String title=title();
		System.out.println(title);
        click(By.xpath("//a[contains(text(),'Mobiles')]"));


        String title1=title();
        System.out.println(title1);
        driver.navigate().back();
        String title2=title();
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
        public static void click(By xpath)
       {
	    driver.findElement(xpath).click();
        }
        public static String title()
        {
	    return driver.getTitle();
	
       }

       }
