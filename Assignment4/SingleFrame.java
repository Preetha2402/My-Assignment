package Assignment4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Thread.sleep(30);
		
		Alert msg = driver.switchTo().alert();
		System.out.println(msg.getText());
		msg.sendKeys("Preetha");
		msg.accept();
		
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		
		if (text.contains("Hello Preetha! How are  you today?")) {
			System.out.println("Matched");
			
		} else {
			
			System.out.println("Not Matched");

		}
		

	}

}
