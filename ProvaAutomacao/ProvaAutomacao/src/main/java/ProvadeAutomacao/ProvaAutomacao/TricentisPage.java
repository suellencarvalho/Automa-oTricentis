package ProvadeAutomacao.ProvaAutomacao;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//http://sampleapp.tricentis.com/101/

public class TricentisPage {

	protected static WebDriver driver;
	protected WebDriverWait wait;


	public TricentisPage(WebDriver driver) {
		TricentisPage.driver = driver;
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}

	// Mapeando a pagina

	@FindBy(how = How.ID, using = "nav_automobile")
	WebElement linkMobile;

	@FindBy(how = How.ID, using = "make")
	WebElement nomeMake;

	@FindBy(how = How.ID, using = "engineperformance")
	WebElement enginePerformance;

	@FindBy(how = How.XPATH, using = "//*[@id=\"opendateofmanufacturecalender\"]")
	WebElement ClicarOfManufature;

	@FindBy(how = How.ID, using = "dateofmanufacture")
	WebElement DataOfManufature;

	@FindBy(how = How.ID, using = "numberofseats")
	WebElement numeroAssentos;

	@FindBy(how = How.ID, using = "fuel")
	WebElement fuelTipe;

	@FindBy(how = How.ID, using = "listprice")
	WebElement listPrice;

	@FindBy(how = How.ID, using = "licenseplatenumber")
	WebElement licenseplatenumber;

	@FindBy(how = How.ID, using = "annualmileage")
	WebElement annualmileage;
	
	@FindBy(how = How.ID, using = "nextenterinsurantdata")
	WebElement btnNext1;
	
	

	// Metodos com as ações

	public void clickLinkMobile() {
		wait.until(ExpectedConditions.elementToBeClickable(linkMobile)).click();
	}

	public void selecionarMake(String valor) {
		Select sel = new Select(nomeMake);
		sel.selectByVisibleText(valor);
	}

	public void setEnginePerformance(String valor) {

		wait.until(ExpectedConditions.visibilityOf(enginePerformance)).sendKeys(valor);
	}

	public void ClicarOfManufature() {
		Actions action = new Actions(driver);
		action.moveToElement(ClicarOfManufature).click().build().perform();

	}

	// Nao ta setando a data - perguntar a rapha

	public void SetDateOfManufature() {
		//Actions action = new Actions(driver);
		//action.moveToElement(DataOfManufature).click().build().perform();
		driver.findElement(By.id("dateofmanufacture")).sendKeys("11/01/2018");
	}
	
	//*******

	public void setNumeroAssentos(String valor) {
		Select sel = new Select(numeroAssentos);
		sel.selectByVisibleText(valor);
	}

	public void setFuel(String valor) {
		Select sel = new Select(fuelTipe);
		sel.selectByVisibleText(valor);
	}

	public void setListPrice(String valor) {

		wait.until(ExpectedConditions.visibilityOf(listPrice)).sendKeys(valor);
	}

	public void setlicenseplatenumber(String valor) {

		wait.until(ExpectedConditions.visibilityOf(licenseplatenumber)).sendKeys(valor);
	}
	
	public void setannualmileage(String valor) {

		wait.until(ExpectedConditions.visibilityOf(annualmileage)).sendKeys(valor);
	}
	
	public void clickNext1Btn() {
		wait.until(ExpectedConditions.elementToBeClickable(btnNext1)).click();
	}

}
