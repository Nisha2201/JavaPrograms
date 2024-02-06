package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstShirt {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.amazon.in/");
		WebElement nwxpath = d1.findElement(By.xpath("//input [@id ='twotabsearchtextbox']"));
		d1.manage().window().maximize();
		nwxpath.sendKeys("shirt");
		nwxpath.sendKeys(Keys.ENTER);
		WebElement firstshirt1 = d1.findElement(By.linkText("Slim Fit Cotton Casual Shirt"));
		//WebElement firstshirt1 = d1.findElement(By.xpath("//span [@linktext = 'Slim Fit Cotton Casual Shirt')");
		firstshirt1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		d1.quit();


	}

}
