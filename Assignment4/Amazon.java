package Assignment4;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		            ChromeDriver driver = new ChromeDriver();
	
					driver.manage().window().maximize();
				    
					 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
					 driver.get("https://www.amazon.in/"); 
			
						driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);	
						Thread.sleep(3000);
						
						//get the price of the first product
						//Prints the msg
						String msg = driver.findElement(By.xpath("(//span[@class = 'a-price-whole'])[1]")).getText();
						System.out.println("The Price of the first product is:"+msg);

						
						//Prints the number of customer ratings for the first displayed product.
						String off = driver.findElement(By.xpath("(//span[contains(@class, 'a-size-base s')])[1]")).getText();;
						
			            // Print the number of ratings
			            System.out.println("Number of customer ratings: " + off);
						
						// Click the first text link of the first image
						driver.findElement(By.xpath("(//span[@class = 'a-size-medium a-color-base a-text-normal'])[1]")).click();
						Thread.sleep(5000);
						
						//Take a screenshot of the product displayed.
			            File src = driver.getScreenshotAs(OutputType.FILE);
			    		File trgt = new File("./snapshot/amazon.png");
			    		FileUtils.copyFile(src, trgt);
			    		
						
						//Switch to child window to perform action
						Set<String> parentWindow = driver.getWindowHandles();
						List<String> childWindow = new ArrayList<String>(parentWindow);
						driver.switchTo().window(childWindow.get(1));
						
						
						//Click the 'Add to Cart' button
						driver.findElement(By.xpath("(//span[@id='submit.add-to-cart']//input)[2]")).click();
						
						//Get the cart subtotal and verify if it is correct.
						driver.findElement(By.xpath("//span[contains(@id,'view-cart-button')]//input")).click();
						String text = driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base sc-price sc')])[1]")).getText();
						System.out.println("Cart Subtotal:"+text);	
						
						
						

			}

		}

	


