package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class AmazonPage {
    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='nav-line-1-container']")
    public WebElement girisYap;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement iphoneAndEmail;

    @FindBy(xpath = "//input[@id='continue']")
    public WebElement devamEt;

    @FindBy(xpath = "//input[@id='ap_password']")
    public WebElement password;

    @FindBy(xpath = "//a[@id='sp-cc-rejectall-link']")
    public WebElement cerezKapama;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "(//*[@class='s-image'])[1]")
    public WebElement ilkUrun;

    @FindBy(xpath = "//span[@class='a-size-large product-title-word-break'] ")
    public WebElement ilkUrunDetay;

    @FindBy(xpath = "(//span[@class='a-price-whole'])[1]")
    public WebElement sepetekkiUrunFiyatIlkKisim;

    @FindBy(xpath = "(//*[@class='a-price-fraction'])[1]")
    public WebElement sepetekkiUrunFiyatIkinciKisim;

    @FindBy(xpath = "(//*[@class='a-price-symbol'])[1]")
    public WebElement sepetekkiUrunFiyatUcuncuKisim;

    @FindBy(xpath = "(//span[@class='a-price-whole'])[1]")
    public WebElement tiklananUrunFiyatilkkisim;

    @FindBy(xpath = "(//span[@class='a-price-fraction'])[1]")
    public WebElement getTiklananUrunFiyatikincikisim;

    @FindBy(xpath = "(//span[@class='a-price-symbol'])[1]")
    public WebElement getTiklananUrunFiyatucuncukisim;


    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement sepeteEkle;


    @FindBy(xpath = "//a[@class='a-button-text']")
    public WebElement sepeteGit;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")
    public WebElement sepettekiUrunFiyati;


}
