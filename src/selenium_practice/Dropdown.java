package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d = new ChromeDriver();
		d.get("https://grotechminds.com/dropdown/");
		d.manage().window().maximize();
		WebElement category = d.findElement(By.xpath("//select[@name='Choice1']")); 
		Select s1= new Select(category);
		s1.selectByValue("Demo1");
		//s1.selectByValue("search-alias=nowstore");
		//s1.selectByVisibleText("Books");
		//s1.deselectByIndex(10);
		category.click();
		Thread.sleep(2000); 
		d.quit();


	}

}
