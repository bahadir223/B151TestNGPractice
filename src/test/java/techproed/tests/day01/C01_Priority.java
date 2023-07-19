package techproed.tests.day01;

import org.testng.annotations.Test;
import techproed.utilities.TestBase;

public class C01_Priority extends TestBase {

    // amazon isimli bir test methodu olusturunuz. Ve amazona gidiniz
    // bestbuy isimli bir test methodu olusturunuz. Ve bestbuy'a gidiniz
    // techproeducation isimli bir test methodu olusturunuz. Ve techproeducation'a gidiniz

    // once techproeducation, sonra amazon, sonra bestbuy test methodu calısacak sekilde sıralama yapınız


    @Test(priority = 1)
    public void amazon() {
        driver.get("https://amazon.com");
    }
    @Test(priority = 2)
    public void bestbuy() {
        driver.get("https://bestbuy.com");
    }
    @Test
    public void techproeducation() {
        driver.get("https://techproeducation.com");
    }
}
