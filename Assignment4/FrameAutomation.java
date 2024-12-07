package Assignment4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
        
		//click the 'Try it' button
		driver.findElement(By.linkText("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("PREETHA");
		alert.accept();
		
		WebElement text = driver.findElement(By.xpath("p[contains(text(),'PREETHA')]"));
		boolean displayed = text.isDisplayed();
		System.out.println(displayed);
		
		WebElement optext = driver.findElement(By.xpath("demo"));
		String output = optext.getText();
		System.out.println(output);
		
		driver.close();
				
				
	}

}
