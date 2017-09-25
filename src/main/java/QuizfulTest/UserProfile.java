package QuizfulTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserProfile extends Page {

	public UserProfile(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void goToUserPreferences() {
		WebElement goToPref = driver.findElement(By.xpath("//*[@id=\"middle\"]/div[2]/div[1]/div[2]/div/a"));
		goToPref.click();
	}
}
