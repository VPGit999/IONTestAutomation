package com.example.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	public static String browser="chrome";
	public static WebDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
	   else if(browser.equals("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
	   else if(browser.equals("edge")){
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		
		driver.get("https://www.selenium.dev/documentation/en/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
	//class name	Locates elements whose class name contains the search value (compound class names are not permitted)
	//driver.findElement(By.className("form_input")).sendKeys("standard_user");
		
		//driver.findElement(By.linkText("Getting started")).click();
		driver.findElement(By.partialLinkText("Getting")).click();
	

	}

}
