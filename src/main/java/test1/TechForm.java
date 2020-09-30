package test1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import reusable.CommonMethods;



public class TechForm {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver", "chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		CommonMethods.maximize(driver);
		CommonMethods.sendkeys(By.xpath("//input[@name='firstname']"),"aadarsha", driver);
		CommonMethods.sendkeys(By.xpath("//input[@name='lastname']"),"edara", driver);
		WebElement radio1=driver.findElement(By.id("sex-0"));
		WebElement radio2=driver.findElement(By.id("sex-1"));
		radio2.click();
		CommonMethods.click(By.id("exp-3"), driver);
		CommonMethods.sendkeys(By.id("datepicker"),"16 May 2016", driver);
		CommonMethods.click(By.id("profession-0"), driver);
		CommonMethods.click(By.id("profession-1"), driver);
		CommonMethods.click(By.id("tool-2"),driver);
		Select sc=new Select(driver.findElement(By.id("continents")));
		sc.selectByIndex(0);
		Select sc1=new Select(driver.findElement(By.name("selenium_commands")));
		List<WebElement> li=sc1.getOptions();
		//WebElement option=sc1.getFirstSelectedOption();
		//sc1.selectByIndex(0);
		//sc1.selectByIndex(2);
		System.out.println(li.size());
		
		for(int i=0;i<=li.size();i++)
		{
			try {
	sc1.selectByIndex(i);	
		}
		
		catch(Exception e)
		{
		}
		}
		
		WebElement choosefile=driver.findElement(By.xpath("//input[@type=\"file\"]"));
		choosefile.sendKeys("C:/Users/subas/Downloads/edureka.png");
		CommonMethods.click(By.xpath("//a[contains(text(), 'Click here to Download File')]"),driver);
		//driver.findElement(By.id("submit")).click();
		
		
		
	}
	
	

}
