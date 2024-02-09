package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Launch {
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		

	    WebDriverManager.chromedriver().setup();
	    
	    

	   // WebDriver driver = new ChromeDriver();
	    ChromeOptions options = new ChromeOptions();
	    
	    options.addArguments("--start-maximized");
	    
	    WebDriver driver = new ChromeDriver(options);

	    driver.get("https://www.xcite.com/");
	    
	  	    
	    WebElement searchBox = driver.findElement(By.id("search"));
        searchBox.sendKeys("iphone");
        searchBox.submit();
     
        Thread.sleep(5000);
        
       
        
        
	    driver.close();
	    
	    
	    
	}

	private static void assertElementExists(WebDriver driver, By id) {
		// TODO Auto-generated method stub
		
	}

	private static void assertElementText(WebDriver driver, By className, String string) {
		// TODO Auto-generated method stub
		
	}

	private static void assertTitle(WebDriver driver, String string) {
		// TODO Auto-generated method stub
		
	}
	}





