package tests.day04;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllCurrencyPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;
import java.io.IOException;

public class AllCurrency {
    AndroidDriver<AndroidElement> driver= Driver.getAndroidDriver();
    AllCurrencyPage page=new AllCurrencyPage();

    @Test
    public void AllCurrencyConverterTest() throws InterruptedException, IOException {
     // AllCurrency Converter uygulamasinin yuklendigi dogulanir
        Assert.assertTrue(driver.isAppInstalled("com.smartwho.SmartAllCurrencyConverter"));

     // Uygulamanin acildigi dogrulanir
        Assert.assertTrue(page.uygulamaAdi.isDisplayed());
        //Assert.assertTrue(driver.findElementByXPath("//*[@text='CURRENCY CONVERTER']").isDisplayed());

     // Cevirmek istedigimiz para birimi Kanada dolari olarak secilir
        ReusableMethods.koordinatTiklamaMethodu(350,450,500);
        Thread.sleep(2000);
        ReusableMethods.scrollWithUiScrollableAndClick("Canadian Dollar");

     // Cevirilecek tutar tuslanir
        page.IkiTusu.click();
        Thread.sleep(2000);
        page.IkiSifirTusu.click();


     // Cevirilecek olan para birimi Türk lirasi olarak secilir
        ReusableMethods.koordinatTiklamaMethodu(350,650,500);
        Thread.sleep(2000);
        ReusableMethods.scrollWithUiScrollableAndClick("TRY");

     // Cevirilen tutar screenshot olarak kaydedilir
        ReusableMethods.getScreenshot("ParaCeviriSonucu");

        File screenshot=driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File("screenshot.jpg"));

     // Ardindan Kanada dolarinin Türk lirasi karsiligi olan degeri kaydedilir
        String sonucDegeri =page.sonuc.getText();

     // Sonuc kullaniciya sms olarak bildirilir
        driver.sendSMS("55","200 Kanada Dolarinin Türk lirasi karsiligi: "+sonucDegeri);

    }




}
