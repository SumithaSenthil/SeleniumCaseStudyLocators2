package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserUtil {
	public static WebDriver startBrowserDemo(String browser) {
		WebDriver driver=null;
		
		if(browser.equalsIgnoreCase("Chrome")|| browser.equalsIgnoreCase("GC")||
				browser.equalsIgnoreCase("Google Chrome"))
		{
	
			System.setProperty("webdriver.chrome.driver",
					"D:\\SeleniumJars\\chromedriver.exe");
			 driver = new ChromeDriver();
			}
	
	else if (browser.equalsIgnoreCase("Edge")|| browser.equalsIgnoreCase("ME")||
				browser.equalsIgnoreCase("Microsoft Edge")) {
				
				System.setProperty("webdriver.edge.driver",
						"D:\\SeleniumJars\\msedgedriver.exe");
				 driver = new EdgeDriver();
				
	}
	else {
		System.out.println("Not supported the browser");
	}
return driver;
}
	
public static void closebrowser(WebDriver driver) {
	driver.quit();
}

	
	

}
