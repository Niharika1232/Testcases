package test1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.api.Screen;


public class TechForm {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver", "chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		sendkeys(By.xpath("//input[@name='firstname']"),"aadarsha");
		sendkeys(By.xpath("//input[@name='lastname']"),"edara");
		WebElement radio1=driver.findElement(By.id("sex-0"));
		WebElement radio2=driver.findElement(By.id("sex-1"));
		radio2.click();
		click(By.id("exp-3"));
		sendkeys(By.id("datepicker"),"16 May 2016");
		click(By.id("profession-0"));
		click(By.id("profession-1"));
		click(By.id("tool-2"));
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
		driver.findElement(By.xpath("//a[contains(text(), 'Click here to Download File')]")).click();
		//driver.findElement(By.id("submit")).click();
		
		
		
	}
	public static void click(By xpath)
	{
		driver.findElement(xpath).click();
	}
	public static void sendkeys(By xpath, String data)
	{
		driver.findElement(xpath).sendKeys(data);
	}

}
