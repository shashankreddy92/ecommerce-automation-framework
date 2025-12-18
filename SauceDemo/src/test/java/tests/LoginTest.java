	package tests;

	import base.BaseTest;
	import pages.LoginPage;
	import utilities.ConfigReader;
    import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        LoginPage login = new LoginPage(driver);
        login.login(
            ConfigReader.get("username"),
            ConfigReader.get("password")
        );
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
    }
}
