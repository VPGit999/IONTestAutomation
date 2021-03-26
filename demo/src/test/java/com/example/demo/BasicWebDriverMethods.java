package com.example.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWebDriverMethods {
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
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String currentUrl=driver.getCurrentUrl();//To get current url details
		System.out.println(currentUrl);
		
		String title=driver.getTitle();
		System.out.println(title);//To get current title
		
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);//To get page source
		
		driver.navigate().to("https://www.google.com/");
		driver.close();
	}
	

}
