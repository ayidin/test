import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class FacebookTest {
    LoginPage loginPage = new LoginPage();

    @BeforeTest
    public void openBrowser(){
        new BrowserManager().openBrowser();
    }

    @Test
    public void facebookTest(){

        Navigation.mainPage().loginPage();
        assertTrue(loginPage.iconUserIsPresent());

    }

    @AfterTest
    public void closeBrowser(){
        new BrowserManager().closeBrowser();
    }
}
