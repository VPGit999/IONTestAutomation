package com.example.demo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(5000);
		WebElement from=driver.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(5000);
		from.sendKeys("india");
		Thread.sleep(5000);
		from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		from.sendKeys(Keys.ENTER);
	}

}
