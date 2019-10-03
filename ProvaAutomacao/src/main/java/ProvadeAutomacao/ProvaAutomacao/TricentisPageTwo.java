package ProvadeAutomacao.ProvaAutomacao;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

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

public class TricentisPageTwo {
	protected static WebDriver driver;
	protected WebDriverWait wait;
	// Actions action = new Actions(driver);

	public TricentisPageTwo(WebDriver driver) {
		TricentisPageTwo.driver = driver;
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "firstname")
	WebElement firstName;

	@FindBy(how = How.ID, using = "lastname")
	WebElement lastName;

	//@FindBy(how = How.XPATH, using = "//*[@id=\"opendateofbirthcalender\"]")
	//WebElement ClicarDateOfBirth;

	@FindBy(how = How.ID, using = "birthdate")
	WebElement DataOfBirth;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span")
	WebElement radioGender;
	
	@FindBy(how = How.ID, using = "streetaddress")
	WebElement streetaddress;
	
	@FindBy(how = How.ID, using = "country")
	WebElement country;
	
	@FindBy(how = How.ID, using = "zipcode")
	WebElement zipcode;
	
	@FindBy(how = How.ID, using = "city")
	WebElement city;
	
	@FindBy(how = How.ID, using = "occupation")
	WebElement occupation;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]")
	WebElement speeding;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]")
	WebElement  BungeeJumping;
	
	@FindBy(how = How.XPATH, using = " //*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]")
	WebElement  CliffDiving;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]")
	WebElement skydiving;
	
	@FindBy(how = How.ID, using = "website")
	WebElement website;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"picture\"]")
	WebElement SetImagem;
	
	@FindBy(how = How.ID, using = "nextenterproductdata")
	WebElement BtnNext2;
	

		
	
	
//Metodos

	public void setFirstName(String valor) {
		wait.until(ExpectedConditions.visibilityOf(firstName)).sendKeys(valor);
	}

	public void setLastName(String valor) {
		wait.until(ExpectedConditions.visibilityOf(lastName)).sendKeys(valor);
	}

	//public void ClicarDateOfBirth() {
//		Actions action = new Actions(driver);
//		action.moveToElement(ClicarDateOfBirth).click().build().perform();
//
//	}

// Nao ta setando a data - perguntar a rapha

	public void SetDataOfBirth() {
//		Actions action = new Actions(driver);
//		action.moveToElement(DataOfBirth).click().build().perform();
		
	driver.findElement(By.id("birthdate")).sendKeys("03/14/1991");
}
	
	public void setGender() {
		wait.until(ExpectedConditions.elementToBeClickable(radioGender)).click();
	}
	
	public void setAdress(String valor) {
		wait.until(ExpectedConditions.visibilityOf(streetaddress)).sendKeys(valor);
	}

	public void setCountry(String valor) {
		Select sel = new Select(country);
		sel.selectByVisibleText(valor);
	}
	
	public void setZipcode(String valor) {
		wait.until(ExpectedConditions.visibilityOf(zipcode)).sendKeys(valor);
	}
	
	public void setCity(String valor) {
		wait.until(ExpectedConditions.visibilityOf(city)).sendKeys(valor);
	}
	
	public void setOccupation(String valor) {
		Select sel = new Select(occupation);
		sel.selectByVisibleText(valor);
	}
	
	public void setSpeeding() {
		wait.until(ExpectedConditions.elementToBeClickable(speeding)).click();

	}
	
	public void setBungeeJumping() {
		wait.until(ExpectedConditions.elementToBeClickable(BungeeJumping)).click();

	}
	
	public void setCliffDiving() {
		wait.until(ExpectedConditions.elementToBeClickable(CliffDiving)).click();
	}
	
	public void setskydiving() {
		wait.until(ExpectedConditions.elementToBeClickable(skydiving)).click();
	}
	
	public void setwebsite(String valor) {
		wait.until(ExpectedConditions.visibilityOf(website)).sendKeys(valor);
	}	
	

	public void SetImagem() throws AWTException {
		
		driver.findElement(By.id("open")).click();		
			
		File imagem = new File("src\\main\\Resource\\download.png");
		System.setProperty("PATH_IMAGEM", imagem.getAbsolutePath());
		
        StringSelection ss = new StringSelection(imagem.getAbsolutePath());
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot robot = new Robot();
		robot.delay(1000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(1000); 	 
		
	}
	
	public void clickNext2Btn() {
		wait.until(ExpectedConditions.elementToBeClickable(BtnNext2)).click();
	}
	
}
