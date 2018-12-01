package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterTimeTrackPage extends BasePage {

	@FindBy(id = "logoutLink")
	private WebElement logoutLink;

	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
	}

	public void clickLogout() {
		logoutLink.click();
	}
}
