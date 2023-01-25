package projettest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		final int First_checkbox = 0;
		final int Second_checkbox = 1;
		
		final By checkboxesCssSelector = By.cssSelector("(type= 'checkbox')");
		
		// verification
		
		List<WebElement> checkboxesGroup = driver.findElements(checkboxesCssSelector);
		
		WebElement toto1 = checkboxesGroup.get(First_checkbox);
		WebElement toto2 = checkboxesGroup.get(Second_checkbox);
		System.out.println("checkbox numero 1" + toto1.isSelected());
		System.out.println("checkbox numero 2" + toto2.isSelected());
		
		// pour cliquer sur un checkbox
		
		
		toto1.click();
		System.out.println("après la selection du checkboxes1");
		System.out.println("checkbox numero 1" + toto1.isSelected());
		
		toto2.click();
		System.out.println("après la selection du checkboxes2");
		System.out.println("checkbox numero 2" + toto1.isSelected());
		
		
	}

}
