package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends Page {

    public final String cookie = "onetrust-accept-btn-handler";
    public final String myAccount = "myAccount";
    public final String login = "login";

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
