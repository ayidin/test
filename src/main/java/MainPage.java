import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class MainPage {

    private static final String FACEBOOK_LOGIN = "......";
    private static final String FACEBOOK_PASS = ".......";

    public LoginPage loginPage(){
        BrowserManager.browser.findElement(By.cssSelector("#email")).sendKeys(FACEBOOK_LOGIN);
        BrowserManager.browser.findElement(By.cssSelector("#pass")).sendKeys(FACEBOOK_PASS, Keys.ENTER);
        return new LoginPage();
    }

}
