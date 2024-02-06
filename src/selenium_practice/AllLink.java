package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLink {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		List<WebElement> linklist= driver.findElements(By.tagName("input"));
		int count = linklist.size();
		System.out.println(count);//find no. of link
		
	// how to print the linktext
		/*for(int i=0;i<count;i++) {
			
		WebElement link =	linklist.get(i);
			String URL =link.getText();
			System.out.println(URL);*/
			
			// how to print the URL
			/*for(int i=0;i<count;i++) {
				
				WebElement link =	linklist.get(i);
					String URL =link.getAttribute("href");
					System.out.println(URL);*/
					
					//Print all ids
					for(int i=0;i<count;i++) {
						
						WebElement link =	linklist.get(i);
							String ID =link.getAttribute("id");
							System.out.println(ID);
					
					
		}
	}
}
