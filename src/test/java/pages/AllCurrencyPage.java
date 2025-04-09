package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AllCurrencyPage {
    public AllCurrencyPage(){
        PageFactory.initElements((WebDriver) Driver.getAndroidDriver(),this);
    }

   @FindBy(xpath = "//*[@text='CURRENCY CONVERTER']" )
        public WebElement uygulamaAdi;

    @FindBy(xpath = "//*[@text='2']" )
    public WebElement IkiTusu;

    @FindBy(xpath = "//*[@text='00']" )
    public WebElement IkiSifirTusu;

    @FindBy(id = "com.smartwho.SmartAllCurrencyConverter:id/EditTextCurrencyB")
    public WebElement sonuc;
}
