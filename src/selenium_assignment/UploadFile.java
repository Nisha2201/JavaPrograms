package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://grotechminds.com/registration/");
		WebElement nwxpath = d.findElement(By.xpath("//input[@name='Resume']"));
		nwxpath.sendKeys("/Users/adwitasingh/Downloads/txt-loading-nzpx2chq4oiww54q.jpg");

	}

}
