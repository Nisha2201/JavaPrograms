package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSelect {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.amazon.in/");
		WebElement as = d1.findElement(By.id("twotabsearchtextbox"));
		as.sendKeys("Shirt");
		Thread.sleep(2000);
		List<WebElement> as1= (List<WebElement>) d1.findElements(By.xpath("//div[@class='left-pane-results-container']/div/div"));
		int count =	as1.size();
	
		System.out.println(count);
		as1.get(0).click();
		as.sendKeys(Keys.ENTER);
	}

}
