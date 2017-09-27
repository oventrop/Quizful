package QuizfulTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditProfile extends Page {

	private static String USER_NAME = "Jack";
	private static String USER_SECOND_NAME = "Sparrow";

	private static By personalInfoLocator = By.xpath("//*[@id='profile-personal-form']/div[2]/b");
	private static By nameLocator = By
			.xpath("//*[@id=\"profile-personal-form\"]/div[3]/form/table/tbody/tr[1]/td[2]/input");
	private static By secondNameLocator = By
			.xpath("//*[@id=\"profile-personal-form\"]/div[3]/form/table/tbody/tr[2]/td[2]/input");
	private static By birthDateLocator = By
			.xpath("//*[@id=\"profile-personal-form\"]/div[3]/form/table/tbody/tr[3]/td[2]/input");
	private static By citeLocator = By
			.xpath("//*[@id=\"profile-personal-form\"]/div[3]/form/table/tbody/tr[4]/td[2]/input");
	private static By companyLocator = By
			.xpath("//*[@id=\"profile-personal-form\"]/div[3]/form/table/tbody/tr[5]/td[2]/input");
	private static By regionLocator = By
			.xpath("//*[@id=\"profile-personal-form\"]/div[3]/form/table/tbody/tr[1]/td[4]/select");
	private static By timeZoneLocator = By
			.xpath("//*[@id=\"profile-personal-form\"]/div[3]/form/table/tbody/tr[3]/td[4]/select");
	private static By aboutLocator = By
			.xpath("//*[@id=\"profile-personal-form\"]/div[3]/form/table/tbody/tr[6]/td/textarea");
	private static By addAvatarLocator = By
			.xpath("//*[@id=\"profile-personal-form\"]/div[3]/form/table/tbody/tr[4]/td[4]/input");
	private static By saveFormButtonLocator = By.name("personalForm.save");
	private static By confidentialForMeButtonLocator = By
			.name("privacyForm.profileVisibility");

	public EditProfile(WebDriver driver) {
		super(driver);

	}

	public void editMainPrefs() {

		// WebElement personalInfo =
		// driver.findElement(By.xpath("//*[@id='profile-personal-form']/div[2]/b"));
		WebElement personalInfo = driver.findElement(personalInfoLocator);
		personalInfo.click();

		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(nameLocator));

		WebElement name = driver.findElement(nameLocator);
		clickAndSendText(name, USER_NAME);

		WebElement secondName = driver.findElement(secondNameLocator);
		clickAndSendText(secondName, USER_SECOND_NAME);

		WebElement birthDate = driver.findElement(birthDateLocator);
		clickAndSendText(birthDate, "1982");

		WebElement cite = driver.findElement(citeLocator);
		clickAndSendText(cite, "www.leningrad.spb.ru");

		WebElement company = driver.findElement(companyLocator);
		clickAndSendText(company, "TAT_HTP");

		WebElement region = driver.findElement(regionLocator);
		region.click();
		region.sendKeys("Ю");
		region.click();

		WebElement timeZone = driver.findElement(timeZoneLocator);
		timeZone.click();
		timeZone.sendKeys("Бе");
		timeZone.click();

		WebElement about = driver.findElement(aboutLocator);
		clickAndSendText(about, "Test");
		personalInfo.click();
	}

	public void editNotifications() {
		WebElement notifications = driver.findElement(By.xpath("//*[@id=\"profile-notifications-form\"]/div[1]/b"));
		notifications.click();
		
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"profile-notifications-form\"]/div[2]/form/label[1]")));
		WebElement notificationsOff = driver
				.findElement(By.xpath("//*[@id=\"profile-notifications-form\"]/div[2]/form/label[1]"));
		notificationsOff.click();

		WebElement deliveriesOff = driver
				.findElement(By.xpath("//*[@id=\"profile-notifications-form\"]/div[2]/form/label[2]"));
		deliveriesOff.click();
		notifications.click();
	}

	public void editConfidential() {

		WebElement confidential = driver.findElement(By.xpath("//*[@id=\"profile-privacy-form\"]/div[1]/b"));
		confidential.click();
		
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(confidentialForMeButtonLocator));
		WebElement confidentialForMe = driver.findElement(confidentialForMeButtonLocator);
		confidentialForMe.click();
		confidential.click();
	}

	public void saveInfo() {

		WebElement personalInfo = driver.findElement(By.xpath("//*[@id='profile-personal-form']/div[2]/b"));
		personalInfo.click();
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(saveFormButtonLocator));
		WebElement save = driver.findElement(saveFormButtonLocator);
		save.click();
		
	}

	public void addAvatar() {
		WebElement personalInfo = driver.findElement(By.xpath("//*[@id='profile-personal-form']/div[2]/b"));
		personalInfo.click();
		
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(addAvatarLocator));
		WebElement addAvatar = driver.findElement(addAvatarLocator);
		File file = new File("D://", "111.png");
		addAvatar.sendKeys(file.getAbsolutePath());

	}

	public void clickAndSendText(WebElement element, String text) {

		element.click();
		element.clear();
		element.sendKeys(text);
	}
}
