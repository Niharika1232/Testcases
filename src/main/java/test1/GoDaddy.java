package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoDaddy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.godaddy.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
        driver.close();
	}

}
