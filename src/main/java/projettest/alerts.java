package projettest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {

	 public static void main(String[] args) {
		
		 // web driver firefox
		 WebDriverManager.firefoxdriver().setup();
		 WebDriver driver = new FirefoxDriver();
		 
		 // récupération de url
		 // gestion des alerts on va travailler avec xpath
		 // on va faire une condition pour cliquer sur l'endroit d'alert.
		 
		 driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		 driver.findElement(By.xpath("//bouton[@onclick='jsAlert()')")).click();
		 Alert alert1 = driver.switchTo().alert();
		 System.out.println(alert1.getText());
		 alert1.accept();
		 if (driver.getPageSource().contains("You clicked: Ok"));
		 
		 System.out.println("You clicked: Ok");
	}
}
