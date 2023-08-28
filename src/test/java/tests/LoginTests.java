package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sayfalar.AnaSayfa;
import sayfalar.GirisYapSayfasi;

import java.time.Duration;

public class LoginTests {

    private WebDriver driver;
    private AnaSayfa anaSayfa;
    private GirisYapSayfasi girisYapSayfasi;



    @BeforeEach
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        anaSayfa = new AnaSayfa(driver);
        girisYapSayfasi = new GirisYapSayfasi(driver);

        driver.get("https://www.hepsiburada.com");
    }

    @Test
    public void hepsiburadaLoginTest() throws InterruptedException {



        anaSayfa.tusaBas(anaSayfa.cerez);
        anaSayfa.elementGozukeneKadarBekle(anaSayfa.hesabim);
        anaSayfa.tusaBas(anaSayfa.hesabim);
        anaSayfa.elementGozukeneKadarBekle(anaSayfa.girisYap);
        Thread.sleep(10000);
        anaSayfa.tusaBas(anaSayfa.girisYap);
        girisYapSayfasi.elementGozukeneKadarBekle(girisYapSayfasi.emailAdresi);
        Thread.sleep(10000);
        girisYapSayfasi.alanaYaziYaz(girisYapSayfasi.emailAdresi,  "seleniumOtomasyonu@gmail.com");
        girisYapSayfasi.elementGozukeneKadarBekle(girisYapSayfasi.girisYapTusu);
        girisYapSayfasi.tusaBas(girisYapSayfasi.girisYapTusu);


    }

    @AfterEach
    public void tearDown(){
        driver.close();
    }
}
