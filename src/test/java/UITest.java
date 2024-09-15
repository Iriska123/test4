
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UITest extends BaseTest {
    @Test
    void testGBNotEmailLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        loginPage.enterEmail("login");
        loginPage.enterPassword("password");
        loginPage.clickLogin();

        Assertions.assertTrue(loginPage.isEmailErrorDisplayed());
    }

    @Test
    void testGBWithoutPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        loginPage.enterEmail("login@login.ru");
        loginPage.clickLogin();

        Assertions.assertTrue(loginPage.isPasswordErrorDisplayed());
    }
   }
