package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Mobile {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.amazon.in/");
		WebElement azmmobile = d1.findElement(By.linkText("Mobiles"));
		azmmobile.click();
		Thread.sleep(3000);
		d1.quit();
		
		
		

	}

}
