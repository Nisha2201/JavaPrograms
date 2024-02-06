package selenium_assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart_Pc {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.amazon.in/");
		d1.manage().window().maximize();
		WebElement amz = d1.findElement(By.xpath("//input[@name ='field-keywords']"));
		amz.sendKeys("books");
		amz.sendKeys(Keys.ENTER);
		
		WebElement n = d1.findElement(By.xpath("//img[@class='s-image']"));
		n.click();
		String id = d1.getWindowHandle();
		Set<String> cid = d1.getWindowHandles();
		System.out.println(cid);
		Iterator<String> id1 = cid.iterator();
		String parentid = id1.next(); //parent id
		String childid = id1.next();// child id
		d1.switchTo().window(childid);
		WebElement cart = d1.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		cart.click();
		Thread.sleep(2000);
		d1.close();

	}

}
