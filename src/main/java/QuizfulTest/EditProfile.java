package QuizfulTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditProfile extends Page {

	private static String USER_NAME = "Jack";
	private static String USER_SECOND_NAME = "Sparrow";

	public EditProfile(WebDriver driver) {
		super(driver);

	}

	public void editMainPrefs() {
		WebElement personalInfo = driver.findElement(By.xpath("//*[@id='profile-personal-form']/div[2]/b"));
		personalInfo.click();

		WebElement name = driver
				.findElement(By.xpath("//*[@id=\"profile-personal-form\"]/div[3]/form/table/tbody/tr[1]/td[2]/input"));
		name.click();
		name.clear();
		name.sendKeys(USER_NAME);

		WebElement secondName = driver
				.findElement(By.xpath("//*[@id=\"profile-personal-form\"]/div[3]/form/table/tbody/tr[2]/td[2]/input"));
		secondName.click();
		secondName.clear();
		secondName.sendKeys(USER_SECOND_NAME);

		WebElement birthDay = driver
				.findElement(By.xpath("//*[@id=\"profile-personal-form\"]/div[3]/form/table/tbody/tr[3]/td[2]/input"));
		birthDay.click();
		birthDay.clear();
		birthDay.sendKeys("1982");

		WebElement cite = driver
				.findElement(By.xpath("//*[@id=\"profile-personal-form\"]/div[3]/form/table/tbody/tr[4]/td[2]/input"));
		cite.click();
		cite.clear();
		cite.sendKeys("www.leningrad.spb.ru");

		WebElement company = driver
				.findElement(By.xpath("//*[@id=\"profile-personal-form\"]/div[3]/form/table/tbody/tr[5]/td[2]/input"));
		company.click();
		company.clear();
		company.sendKeys("TAT_HTP");

		WebElement region = driver
				.findElement(By.xpath("//*[@id=\"profile-personal-form\"]/div[3]/form/table/tbody/tr[1]/td[4]/select"));
		region.click();
		region.sendKeys("Ю");
		region.click();

		WebElement timeZone = driver
				.findElement(By.xpath("//*[@id=\"profile-personal-form\"]/div[3]/form/table/tbody/tr[3]/td[4]/select"));
		timeZone.click();
		timeZone.sendKeys("Бе");
		timeZone.click();

		WebElement about = driver
				.findElement(By.xpath("//*[@id=\"profile-personal-form\"]/div[3]/form/table/tbody/tr[6]/td/textarea"));
		about.click();
		about.clear();
		about.sendKeys("Test");

	}

	public void editNotifications() {
		WebElement notifications = driver.findElement(By.xpath("//*[@id=\"profile-notifications-form\"]/div[1]/b"));
		notifications.click();

		WebElement notificationsOff = driver
				.findElement(By.xpath("//*[@id=\"profile-notifications-form\"]/div[2]/form/label[1]"));
		notificationsOff.click();

		WebElement deliveriesOff = driver
				.findElement(By.xpath("//*[@id=\"profile-notifications-form\"]/div[2]/form/label[2]"));
		deliveriesOff.click();

	}

	public void editConfidential() {

		WebElement confidential = driver.findElement(By.xpath("//*[@id=\"profile-privacy-form\"]/div[1]/b"));
		confidential.click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		WebElement confidentialForMe = driver.findElement(
				By.xpath("//*[@id=\"profile-privacy-form\"]/div[2]/form/table/tbody/tr[4]/td[1]/label/input"));
		confidentialForMe.click();

	}

	public void saveInfo() {

		WebElement personalInfo = driver.findElement(By.xpath("//*[@id='profile-personal-form']/div[2]/b"));
		personalInfo.click();

		WebElement save = driver.findElement(By.name("personalForm.save"));
		save.click();

	}

	public void addAvatar() {
		WebElement personalInfo = driver.findElement(By.xpath("//*[@id='profile-personal-form']/div[2]/b"));
		personalInfo.click();

		WebElement addAvatar = driver
				.findElement(By.xpath("//*[@id=\"profile-personal-form\"]/div[3]/form/table/tbody/tr[4]/td[4]/input"));
		File file = new File("D://", "111.png");
		addAvatar.sendKeys(file.getAbsolutePath());

	}
}
