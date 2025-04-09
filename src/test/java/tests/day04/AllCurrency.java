package tests.day04;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllCurrencyPage;
import utilities.Driver;

public class AllCurrency {
    AndroidDriver<AndroidElement> driver= Driver.getAndroidDriver();
    AllCurrencyPage page=new AllCurrencyPage();

    @Test
    public void AllCurrencyConverterTest(){
     // AllCurrency Converter uygulamasinin yuklendigi dogulanir
        Assert.assertTrue(driver.isAppInstalled("com.smartwho.SmartAllCurrencyConverter"));

     // Uygulamanin acildigi dogrulanir
        //Assert.assertTrue(page.uygulamaAdi.isDisplayed());
        Assert.assertTrue(driver.findElementByXPath("//*[@text='CURRENCY CONVERTER']").isDisplayed());

// Cevirmek istedigimiz para birimi Kanada dolari olarak secilir

// Cevirilecek tutar tuslanir

// Cevirilecek olan para birimi Türk lirasi olarak secilir

// Cevirilen tutar screenshot olarak kaydedilir

// Ardindan Kanada dolarinin Türk lirasi karsiligi olan degeri kaydedilir

// Sonuc kullaniciya sms olarak bildirilir

    }




}
