package selenium_practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("https://www.google.com/");
		//driver.get("https://www.google.com/");
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		WebElement googlelink = driver.findElement(By.xpath("//button[@name='google-register']"));
		googlelink.click();
		//System.out.println(driver.getWindowHandle());
		String parentID = driver.getWindowHandle();
		Set<String> parentchildid = driver.getWindowHandles();
		System.out.println(parentID);
		System.out.println(parentchildid);
		driver.close();//parent or which has control
		driver.quit(); //close all tab
		
	}

}
