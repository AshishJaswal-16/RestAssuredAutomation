package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	
	}
	
	public static void googleSearch() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//go to google.com
		driver.get("https://www.google.com/");
		
		//We have to enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		//Click on search button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[2]//input[@value='Google Search']")).sendKeys(Keys.RETURN);
		
		driver.close();
		
		System.out.println("Test Completed Successfully");
		
	}

}
