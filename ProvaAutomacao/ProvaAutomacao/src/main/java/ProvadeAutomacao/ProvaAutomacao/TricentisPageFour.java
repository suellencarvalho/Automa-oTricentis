package ProvadeAutomacao.ProvaAutomacao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TricentisPageFour {

	protected static WebDriver driver;
	protected WebDriverWait wait;

	public TricentisPageFour(WebDriver driver) {
		TricentisPageFour.driver = driver;
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span")
	WebElement SetPlanoPlatinum;
	
	@FindBy(how = How.ID, using = "nextsendquote")
	WebElement btnnext4;
	
	
	public void checkPlanoPlatinum() {
		wait.until(ExpectedConditions.elementToBeClickable(SetPlanoPlatinum)).click();
	}
	
	public void clickNext4Btn() {
		wait.until(ExpectedConditions.elementToBeClickable(btnnext4)).click();
	}
}


