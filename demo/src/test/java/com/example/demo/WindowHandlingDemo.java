package com.example.demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
	
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='main']/div[3]/div/div/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div[7]/div/div/div/a/span")).click();
        Set<String> windowhandles=driver.getWindowHandles();
        System.out.println(windowhandles);
        //Iterator will itarate the particular set
        //When you say iterate.next() means It will get the window handle for parent and when iterate.next() it will get the window hnadle for the child
        Iterator<String> iterator=windowhandles.iterator();
        
        String parentwindow=iterator.next();
       System.out.println(parentwindow);
       
        String childwindow=iterator.next();
	    System.out.println(childwindow);
	    
	   
        driver.switchTo().window(childwindow);
        Thread.sleep(3000);
        JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='sflive21-anz']/div[3]/div/div/div/div[1]/div/div/div[2]/div/div/button")).click();
        driver.findElement(By.name("UserFirstName")).sendKeys("Vasu");
        driver.findElement(By.name("UserLastName")).sendKeys("palavalasa");
        driver.switchTo().window(parentwindow);
        Thread.sleep(2000);
        driver.close();
        driver.quit();
        
        
	}

}
