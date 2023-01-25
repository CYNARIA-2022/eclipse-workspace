package projettest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		
		driver.get("https://dev.maquittancegratuite.com/properties");
		driver.navigate().to("https://www.youtube.com/");
		
		System.out.println(driver.getTitle())   ;
		
	
		//driver.close();
		
	// close de navigateur toutes les fenêtres
		
		//driver.quit();
	
		
       
	}

}
