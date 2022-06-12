package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Automation_com {
	
	
	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "C:.\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		
		
	}
	
	

}
