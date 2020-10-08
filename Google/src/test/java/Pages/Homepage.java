package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	WebElement element=null;
	WebDriver driver=null;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void entertextinsearchboxfield(String text)
	{
		searchboxfield().sendKeys(text);
	}
	
	public void clicksearchbutton()
	{
		searchbutton().sendKeys(Keys.ENTER);
	}
	
	
	
	public WebElement searchboxfield()
	{
		return element=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		
	}
	
	public WebElement searchbutton()
	{
		return element=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]"));
	}
	
}
