package Assignment4;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class WebTable {
	
	   public static void main(String[] args) throws InterruptedException 
	   {
		
		   ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			 driver.get("https://finance.yahoo.com/"); 
	
			 WebElement mouseOver = driver.findElement(By.xpath("//span[text()='More']"));	
	
				Actions builder = new Actions(driver);
				builder.moveToElement(mouseOver).perform();
				
				WebElement value = driver.findElement(By.linkText("Crypto"));
				Actions object = new Actions(driver);
				object.scrollToElement(value).perform();
				Thread.sleep(5000);
				value.click();
	
	            List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'markets-table')]/tbody/tr"));
	            int rowCount = rows.size();
	    		System.out.println("Total No.of rows:"+rowCount);
	 
	    		 List<WebElement> column = driver.findElements(By.xpath("//table[contains(@class,'markets-table')]/thead/tr/th"));
	             int colCount = column.size();
	     		 System.out.println("No.of columns:"+colCount);
	   
	     		 System.out.println("Names of cryptoCurrencies are:");
	     		 //Use loop to iterate the cryptocurrency names
	     		 for (int i = 1; i <= rowCount ; i++) 
	     		 {
	              String cryptoName = driver.findElement(By.xpath("//table[contains(@class,'markets-table')]/tbody/tr["+i+"]/td[2]")).getText();  
	              System.out.println(cryptoName);
	                
	            }
	     		
				
	           
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	   }	

	}


