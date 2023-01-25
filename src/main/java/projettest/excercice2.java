package projettest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class excercice2 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	// on utilise above pour ecrire dans champ en haut en utlisant le 'id' ou le 'name' du champ en bas
		
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 WebElement recherche = driver.findElement(By.name("password"));
		 driver.findElement(RelativeLocator.with(By.tagName("input")).above(recherche)).sendKeys("Admin");
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 driver.findElement(RelativeLocator.with(By.tagName("input")).below(recherche)).click();
		 
	}

}
