package AutomacaoWeb;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automacaoCadastroBootStrap {
     WebDriver  driver;

	@Before
	public void setUp() throws Exception {
			//codigo para mostrar o caminho do chrome
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			// codigo para abrir o navegador
		 driver = new ChromeDriver();
		   //comando para passar o caimnho do site
		 driver.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
		   // caminho para maximinizar o site
		 driver.manage().window().maximize();
		  //comando para pausa
		 //Thread.sleep();
		 
	//comando para clicar
	driver.findElement(By.xpath("//*[@id=\"switch-version-select\"]/option[4]")).click();
	driver.findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a")).click();
	driver.findElement(By.id("field-customerName")).sendKeys("marta");
	driver.findElement(By.id("field-contactLastName")).sendKeys("marinho");
	driver.findElement(By.id("field-contactFirstName")).sendKeys("marta");
	driver.findElement(By.id("field-phone")).sendKeys("999999999");
	driver.findElement(By.id("field-addressLine1")).sendKeys("rua das flores");
	driver.findElement(By.id("field-addressLine2")).sendKeys("bairro passagem");
	driver.findElement(By.id("field-city")).sendKeys("serra dourada");
	driver.findElement(By.id("field-state")).sendKeys("bahia");
	driver.findElement(By.id("field-postalCode")).sendKeys("47.740-000");
	driver.findElement(By.id("field-country")).sendKeys("brasil");
	driver.findElement(By.id("field-salesRepEmployeeNumber")).sendKeys("marta marinho");
	driver.findElement(By.id("field-creditLimit")).sendKeys("10000");
	driver.findElement(By.id("form-button-save")).click();}
	

	
	


	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
