package techproed.tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;
import org.testng.Assert;

public class Proje {
    //•	User visits amazon.com.tr
    //•	Login with a registered user.
    //•	User searches. (Example: “iphone”)
    //•	Select any product and go to the detail page of the product.
    //•	It is checked that the selected product is the same as the detailed product (it is enough to press Log)
    //•	It is added to the add to cart button in the product detail.
    //•	The basket is checked, it is checked that the price of the added product is the same as the
    //  added product. (It should be successful in the scenario of being the same, and fail in the scenario
    //  of not being the same.)

    AmazonPage amazonPage = new AmazonPage();

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        try {

            amazonPage.cerezKapama.click();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        ReusableMethods.bekle(2);

        // User searches. (Example: “iphone”)
        amazonPage.searchBox.sendKeys("iphone", Keys.ENTER);

        ReusableMethods.bekle(2);

        //Select any product and go to the detail page of the product.
        ReusableMethods.click(amazonPage.ilkUrun);

        ReusableMethods.bekle(2);

        String tiklananUrunFiyat = amazonPage.tiklananUrunFiyatilkkisim.getText() + "," +
                amazonPage.getTiklananUrunFiyatikincikisim.getText() + " " +
                amazonPage.getTiklananUrunFiyatucuncukisim.getText();

        String sepettekiUrunFiyat = amazonPage.sepetekkiUrunFiyatIlkKisim.getText() + "," +
                amazonPage.sepetekkiUrunFiyatIkinciKisim.getText() + " " +
                amazonPage.sepetekkiUrunFiyatUcuncuKisim.getText();

        System.out.println("tiklananUrunFiyat = " + tiklananUrunFiyat);
        System.out.println("sepettekiUrunFiyat = " + sepettekiUrunFiyat);

        //It is checked that the selected product is the same as the detailed product (it is
        // enough to press Log)
        Assert.assertEquals(tiklananUrunFiyat, sepettekiUrunFiyat);

        //It is added to the add to cart button in the product detail.
        amazonPage.sepeteEkle.click();

        //The basket is checked, it is checked that the price of the added product is the same
        //as the added product. (It should be successful in the scenario of being the same, and
        //fail in the scenario of not being the same.)
        amazonPage.sepeteGit.click();

        ReusableMethods.bekle(2);
        Assert.assertEquals(tiklananUrunFiyat, amazonPage.sepettekiUrunFiyati.getText());

    }
}
