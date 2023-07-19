package techproed.tests.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.FacebookPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import java.time.Duration;

public class C04_PageClassKullanimi {
    // facebook anasayfaya gidin
    // kullanıcı email kutusuna rastgele bir isim yazın
    // kullanıcı sifre kutusuna rastgele bir password yazın
    // giris yap butonuna tıklayın
    // girdigin sifre yanlıs yazı elementinin, gorunur oldugunu test edin
    // sayfayı kaptın


    @Test
    public void test01() {
        // facebook anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        // kullanıcı email kutusuna rastgele bir isim yazın
        // kullanıcı sifre kutusuna rastgele bir password yazın
        // giris yap butonuna tıklayın
        FacebookPage facebookPage = new FacebookPage();
        facebookPage.email.sendKeys(ConfigReader.getProperty("eposta"), Keys.TAB,
                ConfigReader.getProperty("sifre"), Keys.ENTER);

        // girdigin sifre yanlıs yazı elementinin, gorunur oldugunu test edin
        Assert.assertTrue(facebookPage.sifreYanlis.isDisplayed());

        // sayfayı kapatın
        Driver.closeDriver();

    }
}
