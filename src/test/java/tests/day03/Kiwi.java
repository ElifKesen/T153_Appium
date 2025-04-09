package tests.day03;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KiwiPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class Kiwi {
    AndroidDriver<AndroidElement>driver= Driver.getAndroidDriver();

    KiwiPage page=new KiwiPage();

    @Test
    public void Kiwi() throws InterruptedException {
        // uygulamanin yuklendigi dogrulanir
        Assert.assertTrue(driver.isAppInstalled("com.skypicker.main"));

        //uygulamanin basariyla acildigi dogrulanir
        Thread.sleep(2000);
        Assert.assertTrue(page.ContinueAsButton.isDisplayed());

        // misafir olarak devam et e tiklanir
        Thread.sleep(2000);
        page.ContinueAsButton.click();

        // ardindan gelecek olan 3 adimda da yesil butona basilarak devam edilir
        Thread.sleep(2000);
        for (int i = 0; i < 3; i++) {
            ReusableMethods.koordinatTiklamaMethodu(550,2050,300);
        }

        // Trip type,one way olarak secilir
        Thread.sleep(2000);
        page.returnButton.click();
        Thread.sleep(2000);
        page.OneWayButton.click();

       // kalkis ulkesi secenegine tiklanir ve default olan ulke kaldirilir
        Thread.sleep(2000);
        page.FromButton.click();
        page.ClearButton.click();

      // kalkis yapilacak sehir Ankara girilir ve sec e tiklanir
        Thread.sleep(2000);
        page.KalkisVarisYeriYazmaKutusu.click();

        if (driver.isKeyboardShown()){
            driver.getKeyboard().pressKey("Ankara");
        }else {
            page.KalkisVarisYeriYazmaKutusu.sendKeys("Ankara");
        }
        Thread.sleep(2000);
        page.sehirSecmeButonu.click();
        page.ChooseButonu.click();

      // varis  secenegi Frankfurt secilir
        page.ToButonu.click();
        page.KalkisVarisYeriYazmaKutusu.click();
        Thread.sleep(2000);
        if (driver.isKeyboardShown()){
            driver.getKeyboard().pressKey("Frankfurt");
        }else {
            page.KalkisVarisYeriYazmaKutusu.sendKeys("Frankfurt");
        }
        Thread.sleep(2000);
        page.sehirSecmeButonu.click();
        page.ChooseButonu.click();

      // gidis tarihi 23 Nisan olarak secilir ve set date e tiklanir
        page.DepartureButonu.click();
        Thread.sleep(2000);
        ReusableMethods.koordinatTiklamaMethodu(530,1250,300);
        /*
        ReusableMethods.koordinatKaydirmaMethodu(560,1490,250,1250,80);
        ReusableMethods.koordinatTiklamaMethodu(250,1250,500);

         */

        Thread.sleep(2000);
        page.setDatebutonu.click();

        // search butonuna tiklanir
        Thread.sleep(2000);
        page.searchbutonu.click();

      // en  ucuz ve aktarmasiz filtrelemeleri yapilir
        page.bestbutonu.click();
        page.enUcuzbutonu.click();
        page.Stopbutonu.click();
        page.nonStopbutonu.click();

      // gelen bilet fiyati kaydedilir ve kullanicin telefonuna sms olarak gonderilir
      String fiyatBilgisi= page.fiyatBilgisi.getText();
      driver.sendSMS("112233","Sectiginiz ucusun fiyat bilgisi; "+fiyatBilgisi);


    }
}
