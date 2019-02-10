package test;

import java.util.Scanner;
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
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		driver.findElement(By.xpath("//input[@id='roundTrip']")).click();
		
		//driver.findElement(By.xpath("//input[@class='or-mob-src airport-city-field form-control']")).click();
		//driver.findElement(By.xpath("//*[@data-iata='BOM']")).click();
		///Scanner s=new Scanner(System.in);
		/*System.out.println("enter the 1 for book flight 2 for check in 3 for flight status 4 for edit booking");
		
		int x=s.nextInt();*/
		
		
		//if(x==1)
		//{
			//driver.findElement(By.xpath("//*[contains(text(),'Book Flight)]")).click();
		//}
		
		


	}

}
