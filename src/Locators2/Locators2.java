package Locators2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utility.BrowserUtil;


public class Locators2 {
	
	static WebDriver driver;
	static By HolidaysLink = By.xpath("(//a[@href = 'https://www.easemytrip.com/holidays/'])[1]");
	static By HolidayMsg = By.xpath("//h1[text() = 'Turn Your Dream Holiday Into A Reality']");

	static By HotelsLink = By.xpath("(//a[@href = 'https://www.easemytrip.com/hotels/'])[1]");

	static By HotelMsg = By.xpath("//h1[@class = 'hp_title']");

	By HomePage = By.xpath("//a[@title = 'easemytrip.com']");
	
	@Test
	public static void OpenCar() throws InterruptedException {
		
		driver=BrowserUtil.startBrowserDemo("ME");
		
		driver.manage().window().maximize();
		//1.Using TestNG Framework and Open UR:"https://www.easemytrip.com/flights.html"
		driver.navigate().to("https://www.easemytrip.com/flights.html");
		String Str=driver.getTitle();
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
	    //2.Click on Holiday Link
	    driver.findElement(HolidaysLink).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(HolidaysLink));
		wait.until(ExpectedConditions.visibilityOfElementLocated(HolidayMsg));
        String str1 = driver.findElement(HolidayMsg).getText().trim();
        //3.Verify HolidayMessage
        if(str1.equalsIgnoreCase("Turn your Dream Holiday Into A Reality")) {
			System.out.println("Verification passed for Holiday");
		}
        else {
        	System.out.println("Verification failed for Holiday");
        }
        //2.Click on Hotel link
		driver.findElement(HotelsLink).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(HotelMsg));

		String Str2 = driver.findElement(HotelMsg).getText().trim();
		//Verify Hotel Message
		if(str1.equalsIgnoreCase("Same hotel, Cheapest price. Guaranteed!")) {
			System.out.println("Verification passed for Hotel");
		}
		else {
			System.out.println("Verification failed for Hotel");
		}
		//4.Verify Page Title
if (Str.equalsIgnoreCase("Flight Booking, Cheap Flights, Air tickets at Lowest Airfare Online")) {
	System.out.println("Verification passed for Title");
}
else {
	System.out.println("Verification failed for Title");
}
	
		
		
		
		
		driver.close();


}
}