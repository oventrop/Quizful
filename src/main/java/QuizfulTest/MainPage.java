package QuizfulTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends Page {
	

	public MainPage(WebDriver driver) {
		super(driver);

	}

	public void openBrowser() {
		getDriver().get("http://www.quizful.net");
	}

	public void goToLoginPage() {
		WebElement loginField = getDriver().findElement(By.xpath("//*[@id=\"user-panel\"]/li[1]/a"));
		loginField.click();
	
	}
}
