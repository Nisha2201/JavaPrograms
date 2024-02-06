package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NW_Xpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.google.com/");
		WebElement nwxpath = d1.findElement(By.xpath("//textarea [@name ='q']"));
		d1.manage().window().maximize();
		nwxpath.sendKeys("India");
		nwxpath.sendKeys(Keys.ENTER);
		//Thread.sleep(2000);
		d1.quit();

	}

}
