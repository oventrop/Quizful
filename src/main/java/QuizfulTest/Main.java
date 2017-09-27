package QuizfulTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// opening browser, loading mainpage
		MainPage main = new MainPage(driver);
		main.openBrowser();
		main.goToLoginPage();

		// login to account
		LoginPage login = new LoginPage(driver);
		login.loginToAccount();

		//move to user profile page 
		UserMainPage userMain = new UserMainPage(driver);
		userMain.goToUserAccount();

		//editing user profile
		UserProfile userProfile = new UserProfile(driver);
		userProfile.goToUserPreferences();
		EditProfile edit = new EditProfile(driver);
		edit.editMainPrefs();
		edit.editConfidential();
		edit.editNotifications();
		edit.addAvatar();
		edit.saveInfo();
	}

}
