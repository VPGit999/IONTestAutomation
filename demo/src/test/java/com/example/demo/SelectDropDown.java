package com.example.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		WebElement ddown=driver.findElement(By.name("employees_c"));
		Select select=new Select(ddown);
		select.selectByValue("level1");
		select.selectByVisibleText("51 – 100 employees");
		select.deselectByIndex(5);
		
		/*List<WebElement> allitems= select.getAllSelectedOptions();
		System.out.println(allitems.size());*/

	}

}
