package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsertest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement textbox=  driver.findElement(By.xpath("//*[@id='APjFqb']"));
		
		textbox.sendKeys("Automation Step by Step");
		Thread.sleep(3000);
		driver.quit();

	}

}
