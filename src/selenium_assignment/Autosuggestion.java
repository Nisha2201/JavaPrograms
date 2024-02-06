package selenium_assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement s1 = driver.findElement(By.xpath("//textarea [@name ='q']"));
		s1 .sendKeys("India");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		List<WebElement> auto= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int countofautosuggestion = auto.size();
		System.out.println(countofautosuggestion);
	}
	

}

