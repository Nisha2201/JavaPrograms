//Exception check

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FK_firstmobile {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.flipkart.com/");
		WebElement cross = d1.findElement(By.xpath("//span [@role ='button']"));
		cross.click();
		WebElement searchmobile = d1.findElement(By.xpath("//input [@name ='q']"));
		d1.manage().window().maximize();
		searchmobile.sendKeys("mobile");
		searchmobile.sendKeys(Keys.ENTER);
		//WebElement firstmobile = d1.findElement(By.linkText("APPLE iPhone 14 (Blue, 128 GB)"));
		WebElement firstmobile = d1.findElement(By.xpath("//div [@class = '_4rR01T']"));
		firstmobile.click();
		//as1.get(0).click();
		Thread.sleep(2000);
		d1.quit();

	}

}
