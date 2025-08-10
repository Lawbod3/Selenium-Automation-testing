package Part2.com.sourceDemo.tests.Login;

import Part2.com.sourceDemo.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    public void testLoginErrorMessage() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("xyz400");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        assertTrue(actualMessage.contains("Epic sadface: Username and password do not match any user in this service"));
    }
}
