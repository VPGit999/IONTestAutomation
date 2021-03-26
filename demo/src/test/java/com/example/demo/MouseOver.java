package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com.au/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement element=driver.findElement(By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/a"));
		Actions action=new Actions(driver);
         action.moveToElement(element).perform();		
         
         System.out.println("Test is passed successfully");
		
	}

}
