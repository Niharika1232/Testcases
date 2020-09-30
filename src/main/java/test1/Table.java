package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import reusable.CommonMethods;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	CommonMethods.url("https://www.techlistic.com/p/demo-selenium-practice.html", driver);
	List<WebElement> tablevalues=driver.findElements(By.xpath("//table//tbody//th"));
	int a= tablevalues.size();
	WebElement value=driver.findElement(By.xpath("//table//tfoot//td"));
	String b=value.getText();
	int temp= 0;
	for( char ch1 :b.toCharArray())
	{
		
		if(Character.isDigit(ch1))
		{
			
			
			temp=Character.getNumericValue(ch1);
			System.out.println(ch1 + " ");
		
		}
	}
	if(temp==a)
	{
		System.out.println("Both are equal");
	}
	else
	{
		System.out.println("Both are not equal");
	}
	
	





	}

	
	}


