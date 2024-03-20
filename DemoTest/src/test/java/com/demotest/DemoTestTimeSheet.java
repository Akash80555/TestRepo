package com.demotest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTestTimeSheet {

	public static void main(String[] args) throws InterruptedException {
		
		
		// Set the path to the chromedriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		
		// Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the login page
        driver.get("https://topas.cherrywork.com/");
        
        Thread.sleep(2000);
	}

	
	
	
}
