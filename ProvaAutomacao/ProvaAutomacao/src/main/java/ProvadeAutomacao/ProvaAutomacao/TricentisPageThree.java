package ProvadeAutomacao.ProvaAutomacao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TricentisPageThree {
	protected static WebDriver driver;
	protected WebDriverWait wait;

	public TricentisPageThree(WebDriver driver) {
		TricentisPageThree.driver = driver;
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "startdate")
	WebElement startdate;

	@FindBy(how = How.ID, using = "insurancesum")
	WebElement insurancesum;

	@FindBy(how = How.ID, using = "meritrating")
	WebElement meritrating;

	@FindBy(how = How.ID, using = "damageinsurance")
	WebElement damageinsurance;

	@FindBy(how = How.XPATH, using = "//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")
	WebElement OptionalProducts;

	@FindBy(how = How.ID, using = "courtesycar")
	WebElement courtesycar;

	@FindBy(how = How.ID, using = "nextselectpriceoption")
	WebElement btnnext3;

	// Metodos

	public void SetStartDate() {
//		Actions action = new Actions(driver);
//		action.moveToElement(DataOfBirth).click().build().perform();
		driver.findElement(By.id("startdate")).sendKeys("12/31/2019");
	}

	public void setinsurancesum(String valor) {
		Select sel = new Select(insurancesum);
		sel.selectByVisibleText(valor);
	}

	public void setMeritrating(String valor) {
		Select sel = new Select(meritrating);
		sel.selectByVisibleText(valor);
	}

	public void setDamageInsurance(String valor) {
		Select sel = new Select(damageinsurance);
		sel.selectByVisibleText(valor);
	}

	public void checkOptionalProducts() {
		wait.until(ExpectedConditions.elementToBeClickable(OptionalProducts)).click();
	}

	public void setCourtesyCar(String valor) {
		Select sel = new Select(courtesycar);
		sel.selectByVisibleText(valor);
	}

	public void clickNext3Btn() {
		wait.until(ExpectedConditions.elementToBeClickable(btnnext3)).click();
	}

}
