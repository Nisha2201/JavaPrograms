package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_shoes {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.amazon.in/");
		d1.manage().window().maximize();
		WebElement shoes = d1.findElement(By.id("twotabsearchtextbox"));
		shoes.sendKeys("Shoes");
		shoes.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		d1.quit();
	}

}
