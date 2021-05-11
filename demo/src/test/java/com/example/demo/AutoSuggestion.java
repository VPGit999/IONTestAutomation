package com.example.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium");
		List<WebElement> listofwebelements=driver.findElements(By.className("erkvQe"));
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		//Thread.sleep(50000);
		System.out.println(listofwebelements.size());
		for (WebElement webElement : listofwebelements) {
			//System.out.println(webElement.getText());
			if(webElement.getText().trim().equals("selenium testing")){
				webElement.click();
				break;
			}
		}
		
		Thread.sleep(5000);
		driver.close();
	}

}
