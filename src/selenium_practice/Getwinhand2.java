package selenium_practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwinhand2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("t-shirt");
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']")).click();
		String id = driver.getWindowHandle();
		Set<String> pid = driver.getWindowHandles();
		//System.out.println(id);
		System.out.println(pid);
		//driver.quit();*/
		Iterator<String> id1 = pid.iterator();
		String parentid1 = id1.next();//1st id-parent id
		String childid1 = id1.next();//1st child id
		System.out.println(parentid1);
		System.out.println(childid1);
		//moving control from one id to another id
		driver.switchTo().window(childid1);
		Thread.sleep(3000);
		driver.close();
		
	}

}
