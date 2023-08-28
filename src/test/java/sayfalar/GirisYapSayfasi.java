package sayfalar;

import org.openqa.selenium.WebDriver;
import sayfalar.Sayfa;

public class GirisYapSayfasi extends Sayfa {
    public final String emailAdresi = "txtUserName";
    public final String girisYapTusu = "btnLogin";

    public GirisYapSayfasi(WebDriver driver) {
        super(driver);
    }
}
