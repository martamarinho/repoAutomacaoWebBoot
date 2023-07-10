package AutomacaoWeb;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tes {

	
	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		
			//codigo para mostrar o caminho do chrome
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		//codigo para abri o navegador
		driver = new ChromeDriver();
		// comando para passar o caminho so site
		driver.get("https://advantageonlineshopping.com/#/");
		// comando para maximizar o site
		driver.manage().window().maximize();
		//comando para pausar
		Thread.sleep(4000);
		// comando para clicar
		driver.findElement(By.id("menuUser")).click();
		//comando para preencher texto
		driver.findElement(By.name("username")).sendKeys("texto");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("123456789");
		Thread.sleep(2000);
		//comando para fechar o navegador
		driver.quit();
		}
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
