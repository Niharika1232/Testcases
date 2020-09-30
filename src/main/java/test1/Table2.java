package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import reusable.CommonMethods;

public class Table2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		CommonMethods.url("https://www.techlistic.com/p/demo-selenium-practice.html", driver);
		int colsize=driver.findElements(By.xpath("//table//thead//tr")).size();
		int rowsize=driver.findElements(By.xpath("//table//tbody//tr//th")).size();
		for(int i=1;i<=rowsize;i++)
		{
			
			try {
		WebElement Head=driver.findElement(By.xpath("//table//thead//tr["+i+"]"));
		String a=Head.getText();
		System.out.println(a);
			}
			catch(Exception e)
			{
				
			}
		
		

	}
	}
}
