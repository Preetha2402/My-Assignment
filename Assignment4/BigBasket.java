package Assignment4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class BigBasket {
	
	
		public static void main(String[] args) throws InterruptedException, IOException 
		{
		
			   ChromeDriver driver = new ChromeDriver();
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
				 driver.get("https://www.bigbasket.com/");
				 
				 //Click on "Shop by Category"
				 driver.findElement(By.xpath("(//button[contains(@id,'headlessui')])[4]")).click();
				 Thread.sleep(30000);
				 
				 //Mouse over "Foodgrains, Oil & Masala"
				 WebElement mouseOver = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
				 	Actions builder = new Actions(driver);
					builder.moveToElement(mouseOver).perform();
					
					//Mouse over "Rice & Rice Products"
					 WebElement mouseOver1 = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
					 	Actions obj = new Actions(driver);
						obj.moveToElement(mouseOver1).perform();
						
						//Click on "Boiled & Steam Rice
						 driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
						 Thread.sleep(3000);	
						 
						//Filter the results by selecting the brand "bb Royal
						 driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("BB Royal");
						 
						 //click the first one
						 driver.findElement(By.xpath("//input[@id='i-BBRoyal']")).click();
						 Thread.sleep(7000);
						 
						 //Click on "Tamil Ponni Boiled Rice"
						driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']")).click();
						Thread.sleep(2000);
						
						//Switch to child window to perform action
						Set<String> parentWindow = driver.getWindowHandles();
						List<String> childWindow = new ArrayList<String>(parentWindow);
						driver.switchTo().window(childWindow.get(1));	
						
						 //Select the 5 Kg bag.
						driver.findElement(By.xpath("(//div[@class='flex justify-start w-full h-full'])[5]")).click();
						
						 //Check and note the price of the rice
						
						String price = driver.findElement(By.xpath("(//span[contains(@class,'StyledLabel5')])[5]")).getText();
						System.out.println("Price of rice is:"+ price);
						
						 //Click "Add" to add the bag to your cart.
						driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
						
						 //Verify the success message that confirms the item was added to your cart.
						String msg = driver.findElement(By.xpath("//p[contains(text(),'basket successfully')]")).getText();
						System.out.println("The msg is:"+ msg);
						Thread.sleep(5000);
						
						 //Take a snapshot of the current page
						 File src = driver.getScreenshotAs(OutputType.FILE);
					    	File trgt = new File("./snapshot/bigbasket.png");
					    	FileUtils.copyFile(src, trgt);
					    	
						 //Close the current window.
					    	driver.close();
					    	
					    	driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

	}


