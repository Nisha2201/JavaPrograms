package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classlocator {

	public static void main(String[] args) {
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.google.com/");
		WebElement byclasslocator = d1.findElement(By.xpath("//textarea [@class = 'gLFyf']"));
		byclasslocator.sendKeys("India");
		//Enter as well
		byclasslocator.sendKeys(Keys.ENTER);

	}

}
