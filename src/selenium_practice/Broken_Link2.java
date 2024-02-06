package selenium_practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Link2 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		List<WebElement> linklist= driver.findElements(By.tagName("a"));
		int count = linklist.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			
			WebElement link =	linklist.get(i);
				String url =link.getAttribute("href");
				System.out.println(url);
				verfiy_the_link(url);
								}
	
	}
	static void verfiy_the_link(String eachurl) throws IOException 
	{
		try {
		URL ul = new URL(eachurl);
		HttpURLConnection wl = (HttpURLConnection)ul.openConnection();
	wl.connect();
	
	if(wl.getResponseCode()==200)
	{
		System.out.println("URL is Valid"+wl.getResponseCode()+wl.getResponseMessage());
	}
	else
	{
		
	}
		}
		catch(MalformedURLException a1) {
			
		}
	}
}
