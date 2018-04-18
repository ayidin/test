import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebElement iconUser;

    public boolean iconUserIsPresent(){
        return iconUser.findElement(By.className("_1vp5")).isDisplayed();

    }

}
