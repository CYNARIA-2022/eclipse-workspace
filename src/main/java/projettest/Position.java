package projettest;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Position {
	
	
	
	
public static void main(String[] args) throws IOException {
		
		//System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	/*
		
		driver.get("https://dev.maquittancegratuite.com/properties");
		
		driver.getTitle();
		
		Point Position = driver.manage().window().getPosition();
		System.out.println(Position.getX());
		System.out.println(Position.getY());
		
		// on a demandé à notre programme qu'il nous affiche la position de notre page web
		
		driver.manage().window().setPosition(new Point(300,350));
		
		// comment faire une capture d'écran
		
		File scrfFile = (File)(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE));
		FileUtils.copyFile(scrfFile, new File("./image2.png"));
		
		// pour voir la capture d'écran il faut cliquer droit sur le projet et tu cliques sur refresh
		// web element c'est tout les elements que nous trouvons sur notre page web
	
	*/
		/*driver.get("https://www.youtube.com/");
		//driver.findElement(By.name("q")).sendKeys("voiture 2022");
		//driver.findElement(By.name("q")).submit();
		 
		 */
		
		// WebElemnt
	/*	driver.get("https://www.google.com/");
		WebElement recherche = driver.findElement(By.name("q"));
		recherche.sendKeys("voiture 2022");
		recherche.submit();
	*/	
		
		// locator
		//On ne sait pas le nom d'un champ et veut effectuer qu'on a.
		// pour rempli le bouton au dessus du bouton voici les codes à faire pour avoir le bouton qui suit. ligne avant on utilise "above"
		
	/*
		driver.get("https://www.linkedin.com/signup/cold-join?trk=guest_homepage-basic_nav-header-join");
		WebElement recherche = driver.findElement(By.id("join-form-submit"));
	    driver.findElement(RelativeLocator.with(By.tagName("input")).above(recherche)).sendKeys("toto");
	*/
		
	    // du champ du haut on veut avoir le champ du bas: ligne après on utilise "below"
	/*    
	    driver.get("https://opensource-demo.orangehrmlive.com");
		WebElement recherche = driver.findElement(By.name("username"));
	    driver.findElement(RelativeLocator.with(By.tagName("input")).below(recherche)).sendKeys("toto");
	    
	*/
		
		// utiliser WAIT
		
		
		
		
}


}
