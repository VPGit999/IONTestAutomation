package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement frame1=driver.findElement(By.id("iframeResult"));
		Thread.sleep(5000);
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		String alerttext=driver.switchTo().alert().getText();
		System.out.println(alerttext);
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().parentFrame();
		
		System.out.println(driver.getTitle());
		driver.close();

	}

}
