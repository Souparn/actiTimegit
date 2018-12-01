package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.LoginPage;

public class VerifyLoginPage extends BaseTest {

	@Test
	public void testVerifyLoginPage() {
		LoginPage l = new LoginPage(driver);
		l.verifyTitle("actiTIME - Login");
	}

}
