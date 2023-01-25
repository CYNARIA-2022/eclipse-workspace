package projettest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class projet6 {
public static void main(String[] args) throws IOException { 
		
		//System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
	// implicit wait permet un delais d'attente avant l'affichage du site web
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.linkedin.com/home");
		WebElement resultat = new WebDriverWait(driver,Duration.ofSeconds(20)).
				until(ExpectedConditions.elementToBeClickable(By.id("join-form-submit")));
		System.out.println(resultat.getText());
		 
				
}
}
