public class Navigation {

    public static MainPage mainPage(){
        BrowserManager.browser.get("https://www.facebook.com/");
        return new MainPage();
    }
}
