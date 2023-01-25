package projettest;

import java.time.Duration;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v106.systeminfo.model.Size;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {

	
	
private static final Size size = null;

public static void main(String[] args) {
		
		//System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		driver.get("https://dev.maquittancegratuite.com/properties");
		
		 
		driver.navigate().to("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		
		// lorsqu'on met driver.getTitle() dans le system.out.prinIn() c'est pour voir le site web dans la console.
		
		
		
		/* maximiser l'affichage
		driver.manage().window().maximize();
		*/
		/* miniser l'affichage
		
		driver.manage().window().minimize();
		*/
		/* affichage sur full ecran
		
		driver.manage().window().fullscreen();
		*/
		
		
		driver.manage().window().getSize().getWidth();
		driver.manage().window().getSize().getHeight();
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
	
		System.out.println(size.getWidth());
		System.out.println(size.getHeight());
		
	     
		//driver.manage().window().setSize(Dimension(400,900));
		
		// cloture de navigateur, une seule fenêtre
		
		
		//driver.close();
		
		// cloture de navigateur- toutes les fenêtres
		
		 //driver.quit();

	}

}
