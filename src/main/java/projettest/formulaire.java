package projettest;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class formulaire {
	
	public static void main(String[] args) {
		
   // web firefox
		WebDriverManager.chromedriver().setup();	
	    WebDriver driver = new ChromeDriver();
  // recuperation de l'url
	    
	    driver.get("https://http://www.qualitelogiciel.com/contactez-nous");
	
	// pour avoir le xpath il faut faire clique droite sur le codage.
	    
	
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div/form/div[1]/input")).sendKeys("bernard");
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div/form/div[2]/input")).sendKeys("bernard.tape@operantic.com");
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div/form/div[3]/input")).sendKeys("question");
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div/form/div[4]/textarea")).sendKeys("message test");
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div/form/button")).submit();
	    
	    driver.manage().window().fullscreen();
	    
	    
	    
	    
	}

}
