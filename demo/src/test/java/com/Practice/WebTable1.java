package com.Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/indices");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.findElement(By.xpath("//*[@id='showMoreLess']")).click();
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='dataTable']/tbody/tr"));
        System.out.println(rows.size());
        List<WebElement> coloumn=driver.findElements(By.xpath("//*[@id='dataTable']/tbody/tr[1]/td"));
        System.out.println(coloumn.size());
        /*for(int i=1;i<rows.size();i++){
        	for(int j=1;j<coloumn.size();j++){
        		System.out.println(coloumn.get(2).getText());
        	}
        }*/
        WebElement rows1=driver.findElement(By.xpath("//*[@id='dataTable']/tbody/tr[3]/td[2]"));
     
      System.out.println("row and coloum count is:"+rows1.getText());
        
	}

}
