package ProvadeAutomacao.ProvaAutomacao;

import java.io.File;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteTricentis {

	static WebDriver driver;
	static WebElement element;
	static TricentisPage TricentisPage;
	static TricentisPageTwo TricentisPageTwo;
	static TricentisPageThree TricentisPageThree;
	static TricentisPageFour TricentisPageFour;
	static TricentisPageFive TricentisPageFive;

	@Before
	public void setUp() throws Exception {
		File browser = new File("src\\main\\Resource\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", browser.getAbsolutePath());
		
		driver = new ChromeDriver();
		TricentisPage = new TricentisPage(driver);
		TricentisPageTwo = new TricentisPageTwo(driver);
		TricentisPageThree = new TricentisPageThree(driver);
		TricentisPageFour = new TricentisPageFour(driver);
		TricentisPageFive = new TricentisPageFive(driver);

	}

	@After
	public void tearDownAfterClass() throws Exception {
		// driver.close();
	}

	@Test
	public void test() throws Exception {
		driver.get("http://sampleapp.tricentis.com/101/");

		// maximizar a tela

		driver.manage().window().maximize();

		// Pagina um - Enter Vehicle Data

		TricentisPage.clickLinkMobile();
		TricentisPage.selecionarMake("Toyota");
		TricentisPage.setEnginePerformance("300");
		TricentisPage.ClicarOfManufature();
		TricentisPage.SetDateOfManufature();
		TricentisPage.setNumeroAssentos("4");
		TricentisPage.setFuel("Petrol");
		TricentisPage.setListPrice("15000");
		TricentisPage.setlicenseplatenumber("122");
		TricentisPage.setannualmileage("12345");
		TricentisPage.clickNext1Btn();

		// Segunda pagina - Enter Insurant Data

		TricentisPageTwo.setFirstName("Suellen");
		TricentisPageTwo.setLastName("Carvalho");
		// TricentisPageTwo.ClicarDateOfBirth();
		TricentisPageTwo.SetDataOfBirth();
		TricentisPageTwo.setGender();
		TricentisPageTwo.setAdress("Rua blablabla, 200");
		TricentisPageTwo.setCountry("Brazil");
		TricentisPageTwo.setZipcode("1234");
		TricentisPageTwo.setCity("Hellcife");
		TricentisPageTwo.setOccupation("Selfemployed");
		TricentisPageTwo.setSpeeding();
		TricentisPageTwo.setBungeeJumping();
		TricentisPageTwo.setCliffDiving();
		TricentisPageTwo.setskydiving();
		TricentisPageTwo.setwebsite("www.suellencarvalho.com");
		TricentisPageTwo.SetImagem();
		TricentisPageTwo.clickNext2Btn();

		// Terceira pagina - Enter Product Data

		TricentisPageThree.SetStartDate();
		TricentisPageThree.setinsurancesum("3.000.000,00");
		TricentisPageThree.setMeritrating("Bonus 2");
		TricentisPageThree.setDamageInsurance("Partial Coverage");
		TricentisPageThree.checkOptionalProducts();
		TricentisPageThree.setCourtesyCar(" Yes");
		TricentisPageThree.clickNext3Btn();

		// Quarta pagina - Select Price Option
		TricentisPageFour.checkPlanoPlatinum();
		TricentisPageFour.clickNext4Btn();

		// quinta pagina - Send Quote

		TricentisPageFive.setEmail("SuellenAutomation@gmail.com");
		TricentisPageFive.setPhone("999999999");
		TricentisPageFive.setUserName("susutomation");
		TricentisPageFive.setpassword("Suellen15");
		TricentisPageFive.setConfirmPassword("Suellen15");
		TricentisPageFive.setComments("O plano é maravilhoso! <3");
		TricentisPageFive.clickNext5Btn();
		TricentisPageFive.Validarmensagem();
	
		
		TricentisPageFive.clickBtnEnviar();
		
	}
}