package selenium_assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentchild2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.amazon.in/");
		d1.manage().window().maximize();
		
		WebElement amz = d1.findElement(By.xpath("//input[@name ='field-keywords']"));
		amz.sendKeys("books");
		amz.sendKeys(Keys.ENTER);
		String id = d1.getWindowHandle();
		Set<String> cid = d1.getWindowHandles();
	
		System.out.println(cid);
		Iterator<String> id1 = cid.iterator();
		String parentid = id1.next(); //parent id
		String childid = id1.next();// child id
		d1.switchTo().window(childid);
		WebElement getchild = d1.findElement(By.xpath("//input[@class='s-image']"));
		getchild.sendKeys(Keys.ENTER);
		WebElement cart = d1.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		cart.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		d1.close();
		
		
	}

}
