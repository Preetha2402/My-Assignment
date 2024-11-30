package List;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com/");
		
	    //In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		
		driver.findElement(By.className("ic-search")).click();
		
		//To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("(//div[@class='facet-linkhead']/label)[2]")).click();
		
		Thread.sleep(5000);
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		
		Thread.sleep(5000);
		//Print the count of the items found.
		String total = driver.findElement(By.xpath("//div[@class='length']/strong")).getText();
				System.out.println("Total count of counts : " +total);
				System.out.println();
		
		//Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brandnames = driver.findElements(By.className("brand"));
			int count = brandnames.size();
			System.out.println("Count of the brands in the page : "+ count);
			System.out.println();
 			for (int i = 0; i < count; i++) {
				System.out.println((i+1)+" "+ brandnames.get(i).getText());
			}
			
			System.out.println();
			
			//Get the list of names of the bags and print it
			List<WebElement> bagnames = driver.findElements(By.className("nameCls"));
			int countn = bagnames.size();
			System.out.println("Count of bag names in the page :"+ countn);
			System.out.println();
			for (int i = 0; i <countn ; i++) {
				System.out.println((i+1)+" "+bagnames.get(i).getText());
			}
			
			driver.close();
	}

}

	
	
