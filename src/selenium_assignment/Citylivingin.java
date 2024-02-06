package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Citylivingin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.google.com/");
		WebElement searchtextfield = d1.findElement(By.name("q"));
		searchtextfield.sendKeys("Faridabad");
		//Enter as well
		searchtextfield.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		d1.quit();

	}

}
