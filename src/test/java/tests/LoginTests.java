package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests {

    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;



    @BeforeEach
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);

        driver.get("https://www.hepsiburada.com");
    }

    @Test
    public void hepsiburadaLoginTest() throws InterruptedException {



        homePage.pressKey(homePage.cookie);
        homePage.waitUntilTheElementAppears(homePage.myAccount);
        homePage.pressKey(homePage.myAccount);
        homePage.waitUntilTheElementAppears(homePage.login);
        Thread.sleep(10000);
        homePage.pressKey(homePage.login);
        loginPage.waitUntilTheElementAppears(loginPage.emailAddress);
        Thread.sleep(10000);
        loginPage.writeInTheField(loginPage.emailAddress,  "selenium@gmail.com");
        loginPage.waitUntilTheElementAppears(loginPage.loginButton);
        loginPage.pressKey(loginPage.loginButton);


    }

    @AfterEach
    public void tearDown(){
        driver.close();
    }
}
