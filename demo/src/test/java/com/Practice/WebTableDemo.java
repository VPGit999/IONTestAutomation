package com.Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/indices");
		driver.manage().window().maximize();
		//S1->Switch to the frame which has existed in the website
		//s2->get the number of rows
		//s3>get the number of coloumns
		//s4->Iterate the rows and coloumns and get the text and print it.
		//*[@id="dataTable"]/tbody/tr
		//*[@id="dataTable"]/tbody/tr[1]/td
		driver.findElement(By.id("showMoreLess")).click();
		
		Thread.sleep(50000);
		List<WebElement> rowelements=driver.findElements(By.xpath("//*[@id=\"dataTable\"]/tbody/tr"));
		System.out.println(rowelements.size());
		int rowsize=rowelements.size();
		
		List<WebElement> columnelements=driver.findElements(By.xpath("//*[@id=\"dataTable\"]/tbody/tr[1]/td"));
	    System.out.println(columnelements.size());
	    int columnsize=columnelements.size();
	    
	    for(int i=1;i<rowsize; i++){
	    	for(int j=1;j<columnsize; j++){
	    		
	    		//System.out.print(driver.findElement(By.xpath("//*[@id=\"dataTable\"]/tbody/tr["+ i +"]/td["+ j +"]")).getText()+ " ");
	    		
	    	
	    	}
	    	System.out.println(columnelements.get(1).getText());
	    }
		
	}

}
