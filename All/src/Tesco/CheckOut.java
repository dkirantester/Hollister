package Tesco;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckOut {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fi=new FileInputStream("C:\\Users\\kiran\\eclipse-workspace\\All\\Config.Properties");
		Properties pr=new Properties();
		pr.load(fi);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(pr.getProperty("URL"));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(pr.getProperty("AandC"))).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(pr.getProperty("TBank"))).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(pr.getProperty("Loans"))).click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
	}

}
