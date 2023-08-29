package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {
    public final String emailAddress = "txtUserName";
    public final String loginButton = "btnLogin";

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
