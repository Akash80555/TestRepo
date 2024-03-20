package LearningJava;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class UiPathPocTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
	      // Maximize the browser window
	     driver.manage().window().maximize();
      
        // Launch the web application
        driver.get("https://cloud.uipath.com/inctudddqtuz/portal_/home");
        Thread.sleep(3000);
        
        
        driver.findElement(By.xpath("//*[contains(text(),'Accept and continue')]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[contains(text(),'Continue with Email')]")).click();
       
       // driver.findElement(By.name("email");
        
      //*[contains(text(),'Sign In')]
      
       //akash.mugalikatti@incture.com
       //Password@8055
        // For instance, you might wait for an element to appear on the next page after login
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//        
//        try {
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logged_in_element")));
//            System.out.println("Login successful!");
//        } catch (Exception e) {
//            System.out.println("Login failed: " + e.getMessage());
//        }

        // After successful login, you can continue interacting with the application as needed

        // Close the browser window
        driver.quit();
    }
		

	}


