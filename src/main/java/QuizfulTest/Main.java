package QuizfulTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		MainPage main = new MainPage(driver);
		main.openBrowser();
		main.goToLoginPage();
		
		LoginPage login = new LoginPage(driver);
		login.loginToAccount();
		
		UserMainPage userMain = new UserMainPage(driver);
		userMain.goToUserAccount();
		
		UserProfile userProfile = new UserProfile(driver);
		userProfile.goToUserPreferences();
		
		EditProfile edit = new EditProfile(driver);
		edit.editMainPrefs();
		edit.addAvatar();
		edit.editConfidential();
		edit.editNotifications();
		edit.saveInfo();
	}

}
