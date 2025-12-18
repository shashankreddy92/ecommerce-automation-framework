package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import utilities.ConfigReader;

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
