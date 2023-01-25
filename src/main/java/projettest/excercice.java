package projettest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class excercice {
	
    public static void main(String[] args) {
		
    	WebDriverManager.firefoxdriver().setup();
    	WebDriver driver = new FirefoxDriver();
    	
    	
    	driver.get("https://www.youtube.com/");
    	System.out.println(driver.getTitle());
    	
    	driver.navigate().to("https://www.nike.com/fr/?cp=19040524063_search_1670445975400800000&mfadid=adm");
    	
	}

}
