package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ultimate {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
		WebDriver d=new ChromeDriver();
		d.get("https://www.calculator.net/age-calculator.html");
		Select s=new Select(d.findElement(By.xpath("//select[@id='today_Month_ID']")));
		s.selectByValue("11");
		TimeUnit.SECONDS.sleep(2);
		Select q=new Select(d.findElement(By.xpath("//select[@id='today_Day_ID']")));
		q.selectByValue("29");
		WebElement e=d.findElement(By.xpath("//input[@id='today_Year_ID']"));
		e.sendKeys(Keys.CONTROL+"a");
		e.sendKeys(Keys.DELETE);
		e.sendKeys("2000");
		
		
		//d.findElement(By.linkText("Sign in")).click();
		//d.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("azeemmohd.azeem752@gmail.com");
		//d.findElement(By.linkText("Next")).click();
		
		
		// TODO Auto-generated method stub
		


	}

}
