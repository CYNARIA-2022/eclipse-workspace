package projettest;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class codejava {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.driver.chrome","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://www.paruvendu.fr/");
		js.executeScript("cmp_pv.cookie.saveConsent(true);");
		driver.navigate().refresh();
		driver.findElement(By.partialLinkText("Déposer une annonce gratuite")).click();
		Thread.sleep(2000);
		
		Select categ = new Select(driver.findElement(By.id("choixFamille")));
		categ.selectByVisibleText("Voiture d'occasion");
		Select categ1 = new Select(driver.findElement(By.id("choixFamille")));
		categ1.selectByVisibleText("Location");
		Select categ2 = new Select(driver.findElement(By.id("categorie")));
		categ2.selectByVisibleText("Voiture");
		driver.findElement(By.id("descBien")).sendKeys("Voiture à louer");
		Select difusion = new Select(driver.findElement(By.id("nbrSemainesPublication")));
		difusion.selectByVisibleText("Pendant 6 mois");
		driver.findElement(By.id("prix")).sendKeys("25");
		Select categ3 = new Select(driver.findElement(By.id("codePays")));
		categ3.selectByVisibleText("france");
		driver.findElement(By.id("codePostal")).sendKeys("93160");
		driver.findElement(By.partialLinkText("suivant")).click();
		
		
	}

}
