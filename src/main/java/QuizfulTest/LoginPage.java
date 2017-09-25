package QuizfulTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Page {

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	private final By loginLocator = By.xpath("//*[@id=\"login\"]");
	private final By passLocator = By.xpath("//*[@id=\"login-form\"]/div[3]/form/label[2]/input");
	private final By submitLocator = By.name("ok");
	private final String USER_NAME = "oventrop_1";
	private final String USER_PASS = "psise4ka";

	public void loginToAccount() {
		WebElement loginField = getDriver().findElement(loginLocator);
		loginField.click();
		loginField.sendKeys(USER_NAME);

		WebElement passField = getDriver().findElement(passLocator);
		passField.click();
		passField.sendKeys(USER_PASS);

		WebElement enter = getDriver().findElement(submitLocator);
		enter.click();
		
		}
	
}