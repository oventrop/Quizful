package QuizfulTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserMainPage extends Page {

	public UserMainPage(WebDriver driver) {
		super(driver);

	}

	public void goToUserAccount() {
		WebElement user = getDriver().findElement(By.xpath("//*[@id=\"user-panel\"]/li[1]/b/a"));
		user.click();
	}

}
