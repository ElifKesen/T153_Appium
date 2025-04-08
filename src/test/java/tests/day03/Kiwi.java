package tests.day03;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;
import utilities.Driver;

public class Kiwi {
    AndroidDriver<AndroidElement>driver= Driver.getAndroidDriver();

    @Test
    public void Kiwi(){
        // uygulamanin yuklendigi dogrulanir
        //uygulamanin basariyla acildigi dogrulanir
        // misafir olarak devam et e tiklanir
        // ardindan gelecek olan 3 adimda da yesil butona basilarak devam edilir
        // Trip type,one way olarak secilir
       // kalkis ulkesi secenegine tiklanir ve default olan ulke kaldirilir
      // kalkis yapilacak sehir Ankara girilir ve sec e tiklanir
      // varis  secenegi Frankfurt secilir
      // gidis tarihi 23 Nisan olarak secilir ve set date e tiklanir
        // search butonuna tiklanir
      // en  ucuz ve aktarmasiz filtrelemeleri yapilir
      // gelen bilet fiyati kaydedilir ve kullanicin telefonuna sms olarak gonderilir


    }
}
