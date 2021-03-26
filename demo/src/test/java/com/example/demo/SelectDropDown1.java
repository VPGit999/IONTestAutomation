package com.example.demo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/webapp/SelectAWebSite.html");
		driver.manage().window().maximize();
		//we have to make a variable form with weblement
		WebElement e= driver.findElement(By.name("OptWeb"));
		Select sdrop=new Select(e);
		sdrop.selectByVisibleText("QAPlanet");
		Thread.sleep(3000);
		sdrop.selectByIndex(0);
		Thread.sleep(3000);
		sdrop.selectByValue("Microsoft");
		//To get list of the size
		List<WebElement> ls=sdrop.getOptions();
		System.out.println(ls.size());
		System.out.println("===========================");
		
		/*//Print all values from the dropdown using iterator
		Iterator<WebElement> it=ls.iterator();
		while(it.hasNext())
		{
			WebElement e1=it.next();
			System.out.println(e1.getText());
		}
		System.out.println("==============================");*/
		//Print all values from the dropdown using for each
		for(WebElement e1: ls){
			System.out.println(e1.getText());
		}
		
		System.out.println("====================================");
		//print all values from the dropdown using for loop
		for(int i=0;i<ls.size()-1;i++){
			WebElement e1=ls.get(i);
			System.out.println(e1.getText());
			}

		driver.close();
	}

}
