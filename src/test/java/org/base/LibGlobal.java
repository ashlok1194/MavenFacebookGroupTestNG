package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal {
	 public static WebDriver driver;
	 public static void getDriver() {
//   	  
 	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\DataDriven1\\Driver\\chromedriver.exe");
// 		   //webDriver instantiation
		  driver = new ChromeDriver();
	}
	 
//     
    public static void enterUrl(String url) {
     driver.get(url);
	}
    public static void enterText(WebElement element, String data) {
   	 element.sendKeys(data);
	}

 public static void close() {
		driver.close();
  }
 
 public static void click(WebElement element) {
	element.click();
 }
 public static void getUserEnterdText(WebElement element, String data) {
		element.getAttribute(data);
	}
	public static void getPredefinedText(WebElement element) {
		element.getText();
	}
	public static void implicitWait(long timeout) {
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}


}
