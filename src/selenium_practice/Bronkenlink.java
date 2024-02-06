package selenium_practice;

import java.net.MalformedURLException;
import java.net.URL;

public class Bronkenlink {

	public static void main(String[] args) throws MalformedURLException {
		
		URL ul = new URL("https://www.google.com/");
		System.out.println(ul.getHost());
		System.out.println(ul.getPath());
		System.out.println(ul.getPort());
		System.out.println(ul.getProtocol());
	}

}
