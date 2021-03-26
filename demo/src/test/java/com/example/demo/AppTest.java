package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
    public void test() {
    	WebDriver driver = App.initBrowser();
    	driver.get("http://www.google.com");
    	String url = driver.getCurrentUrl();
    	System.out.println("URL: " + url);
    	Assert.assertTrue(url.contains("google.com"));
    	driver.quit();
    }
}
