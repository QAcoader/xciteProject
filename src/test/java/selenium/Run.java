package selenium;


	
	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Run {
	public static void main(String[] args) throws InterruptedException {
		
		
		

	    WebDriverManager.chromedriver().setup();
	    
	    

	   // WebDriver driver = new ChromeDriver();
	    ChromeOptions options = new ChromeOptions();
	    
	    options.addArguments("--start-maximized");
	    
	    WebDriver driver = new ChromeDriver(options);

	    driver.get("https://www.xcite.com/");
	    
	  
	}
	    
	    public static void assertTitle1(WebDriver driver, String expectedTitle) throws InterruptedException {
	        String actualTitle = driver.getTitle();
	        assert actualTitle.equals(expectedTitle) : "Page title assertion failed! Expected: " + expectedTitle + ", Actual: " + actualTitle;
	        System.out.println("Page title assertion passed!");
	        
	        
	    
	    // Wait for the page to load
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("xcite-logo")));

        // Perform assertions
        assertTitle1(driver, "Xcite | Online Shopping in Kuwait | Alghanim Electronics");
        assertElementText(driver, By.className("global-message"), "We Deliver To Your Doorstep!");
        assertElementExists(driver, By.id("search"));
	    
	    WebElement searchBox = driver.findElement(By.id("search"));
        searchBox.sendKeys("iphone");
        searchBox.submit();
     
        Thread.sleep(5000);
        
        WebElement secondiPhone = driver.findElement
        		(By.xpath("//body/div[@id='__next']/main[@class='flex flex-col']/div[@class='bg-gray-50']/div/div[@class='grid grid-cols-4 gap-x-5 w-full mx-auto px-2 sm:grid-cols-12 sm:px-10 lg:px-20 xl:container ProductList_listWrapper__lbO7T']/div[@class='col-span-4 sm:col-span-12 md:col-span-9']/ul[@class='grid grid-cols-4 gap-2 sm:grid-cols-12 xl:grid-cols-10 mb-28']/li[2]/div[1]/a[1]/div[2]"));
        secondiPhone.click();
        
        Thread.sleep(5000);
        
        
        
        WebElement addToCartButton = driver.findElement(By.id("//body/div[@id='__next']/main[@class='flex flex-col']/div[@class='bg-gray-50']/div/div[@class='grid grid-cols-4 gap-x-5 w-full mx-auto px-2 sm:grid-cols-12 sm:px-10 lg:px-20 xl:container ProductList_listWrapper__lbO7T']/div[@class='col-span-4 sm:col-span-12 md:col-span-9']/ul[@class='grid grid-cols-4 gap-2 sm:grid-cols-12 xl:grid-cols-10 mb-28']/li[2]/div[1]/a[1]/div[2]"));
        addToCartButton.click();
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


