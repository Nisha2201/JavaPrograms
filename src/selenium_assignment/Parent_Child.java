package selenium_assignment;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Child {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMI3u6zg_SNgwMVNKNmAh2bcAFBEAAYASAAEgJmOfD_BwE&gclsrc=aw.ds");
		d1.manage().window().maximize();
		
		WebElement n = d1.findElement(By.xpath("//span[@class='google-text']"));
		n.click();
		String id = d1.getWindowHandle();
		Set<String> cid = d1.getWindowHandles();
		System.out.println(cid);
		Iterator<String> id1 = cid.iterator();
		String parentid = id1.next(); //parent id
		String childid = id1.next();// child id
		d1.switchTo().window(childid);
		WebElement email = d1.findElement(By.xpath("//input [@name ='identifier']"));
		email.sendKeys("email@test.com");
		Thread.sleep(2000);
		d1.close();
	}

}
