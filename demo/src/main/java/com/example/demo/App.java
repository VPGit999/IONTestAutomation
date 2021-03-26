package com.example.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 System.out.println( "Hello World!" );
    	 WebDriver driver = initBrowser();
    	 driver.get("http://www.google.com");
    }
    
    public static WebDriver initBrowser() {
    	System.setProperty("webdriver.chrome.driver","C:\\PersonalDocs\\Driver\\chromedriver.exe");
        return new ChromeDriver();
       }
}
