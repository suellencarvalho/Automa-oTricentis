package ProvadeAutomacao.ProvaAutomacao;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TricentisPageFive {

	protected static WebDriver driver;
	protected WebDriverWait wait;

	public TricentisPageFive(WebDriver driver) {
		TricentisPageThree.driver = driver;
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "email")
	WebElement setEmail;

	@FindBy(how = How.ID, using = "phone")
	WebElement setphone;

	@FindBy(how = How.ID, using = "username")
	WebElement username;

	@FindBy(how = How.ID, using = "password")
	WebElement password;

	@FindBy(how = How.ID, using = "confirmpassword")
	WebElement confirmpassword;

	@FindBy(how = How.ID, using = "Comments")
	WebElement Comments;

	@FindBy(how = How.ID, using = "sendemail")
	WebElement btnnext5;
	
	@FindBy(how = How.ID, using = "/html/body/div[4]/h2")
	WebElement mensagemsucess;

	@FindBy(how = How.XPATH, using = "/html/body/div[4]/div[7]/div/button")
	WebElement btnEnviar;

	public void setEmail(String valor) {
		wait.until(ExpectedConditions.visibilityOf(setEmail)).sendKeys(valor);
	}

	public void setPhone(String valor) {
		wait.until(ExpectedConditions.visibilityOf(setphone)).sendKeys(valor);
	}

	public void setUserName(String valor) {
		wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(valor);
	}

	public void setpassword(String valor) {
		wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(valor);
	}

	public void setConfirmPassword(String valor) {
		wait.until(ExpectedConditions.visibilityOf(confirmpassword)).sendKeys(valor);
	}

	public void setComments(String valor) {
		wait.until(ExpectedConditions.visibilityOf(Comments)).sendKeys(valor);
	}

	public void clickNext5Btn() {
		wait.until(ExpectedConditions.elementToBeClickable(btnnext5)).click();
	}

	public void Validarmensagem() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/h2")));
		
		//Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[4]/h2")).getText().contains("Sending e-mail success!"));
		
		/*String texto;
		texto = wait.until(ExpectedConditions.visibilityOf(mensagemsucess)).getText();
		return texto;*/
		
	}

	public void clickBtnEnviar() {
		wait.until(ExpectedConditions.elementToBeClickable(btnEnviar)).click();
	}

}
