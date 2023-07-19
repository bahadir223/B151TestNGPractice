package techproed.tests.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import techproed.utilities.TestBase;

public class C03_SoftAssert extends TestBase {
    // "https://amazon.com" sayfasına gidiniz
    /// Title'in "Amazon" icerdigini test edin
    /// Arama kutusunun erisilebilir oldugunu test edin
    // Arama kutusuna nutella yazıp aratın
    /// Sonuc yazısının gorunur oldugunu test edin
    /// Sonuc yazısının "Nutella" icerdigini test edin

    // test islemlerini softAssert ile yapınız ve hatalar icin mesaj versin


    @Test
    public void test01() {
        // "https://amazon.com" sayfasına gidiniz
        driver.get("https://amazon.com");

        // Title'in "Amazon" icerdigini test edin
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(driver.getTitle().contains("Amazon"));

        // Arama kutusunun erisilebilir oldugunu test edin
        softAssert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isEnabled(),
                "eğer bir problem çıkarsa bu mesajı verecek... ");

        // Arama kutusuna nutella yazıp aratın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nutella", Keys.ENTER);

        //Sonuc yazısının gorunur oldugunu test edin
        WebElement sonucYazisi = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
        softAssert.assertTrue(sonucYazisi.isDisplayed(),"eğer bir problem çıkarsa bu mesajı verecek...");

        //Sonuc yazısının "Nutella" icerdigini test edin
        softAssert.assertTrue(sonucYazisi.getText().contains("Nutella"),"Sonuc yazısı Nutella icermiyor");

        softAssert.assertAll();
        // assertAll() yazıp tum hataları listelemesini istemeliyiz. Aksi halde hata vermez.

        /*

        Junitte assert kullandıgımızda Assert Failed oldugu anda test calısmayı durduruyordu.
        Ve geri kalanı calıstırmıyordu.

        TestNG'de hem Assert, hem softAssert yapıları var.
        test sonuna kadar calıssın, testin sonunda tum hataları listelesin istiyorsak softAssert kullanırız.

        softAssert'un hata bulsa bile calısmaya devam etme ozelligi softAssert.assertAll()'a kadardır.
        eger softAssert.assertAll()'da hata bulunursa calısma durur.
        ve class'ın kalan kısmı calısmaz.

         */
    }
}
