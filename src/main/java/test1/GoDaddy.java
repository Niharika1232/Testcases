package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import reusable.CommonMethods;

public class GoDaddy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		CommonMethods.url("https://in.godaddy.com/", driver);
		CommonMethods.maximize(driver);
		System.out.println(driver.getCurrentUrl());
        driver.close();
	}

}
