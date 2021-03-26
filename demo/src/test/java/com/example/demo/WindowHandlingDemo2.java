package com.example.demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www2.asx.com.au/");
	
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		 
		String window=driver.getWindowHandle();
				System.out.println(window);
				
			driver.switchTo().window(window);
			driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();
			
			driver.close();
		 
		 
		
        
       
        
	}

}
