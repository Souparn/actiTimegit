package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class VerifyLoginLogout extends BaseTest {

	@Test
	public void testVerifyLoginLogout() {
		LoginPage l = new LoginPage(driver);
		l.setUserName("admin");
		l.setPassword("manager");
		l.clickLogin();

		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.verifyTitle("actiTIME - Enter Time-Track");
		e.clickLogout();
		l.verifyTitle("actiTIME - Login");
	}

}
