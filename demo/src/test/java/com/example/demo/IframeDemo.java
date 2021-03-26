package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.switchTo().frame(0);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(5000);
		//System.out.println(driver.getTitle());
		//Thread.sleep(2000);/
		driver.close();

	}

}
