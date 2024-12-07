package Assignment4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.className("crmsfa")).click();
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.linkText("Merge Contacts")).click();
        
        driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::img")).click();
        
        Set<String> parentwindow = driver.getWindowHandles();
        List<String> childwindow = new ArrayList <String>(parentwindow);
        driver.switchTo().window(childwindow.get(1));
        
        driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).click();
        driver.switchTo().window(childwindow.get(0));
        
        driver.findElement(By.xpath("//input[@name='partyIdFrom']/following::img[2]")).click();
   
        Set<String>parentwindow1 = driver.getWindowHandles();
        List<String>childwindow1 = new ArrayList<String>(parentwindow1);
        driver.switchTo().window(childwindow1.get(1));
        
        driver.findElement(By.xpath("(//div[contains(@class, 'x-grid3-col-partyId')]/a)")).click();
        driver.switchTo().window(childwindow1.get(0));
        
        driver.findElement(By.xpath("//a[text()='Merge']")).click();
        
        Alert alert = driver.switchTo().alert();
        System.out.println("The alert msg is:"+alert.getText());
        alert.accept();
        
        String title = driver.getTitle();
        System.out.println(title);
        
        if (title.contains("contact")) {
        	System.out.println("Title is not verified");
			
		} else {
			System.out.println("Title is verified");
			
			driver.close();

		}
        
	}

}
