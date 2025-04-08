package tests.day03;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ToDoList {
    AndroidDriver<AndroidElement> driver;
    @BeforeTest
    public void kurulum() throws MalformedURLException {
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 4");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        caps.setCapability("appPackage","todolist.scheduleplanner.dailyplanner.todo.reminders");
        caps.setCapability("appActivity","app.todolist.activity.SplashActivity");
        caps.setCapability(MobileCapabilityType.NO_RESET,false);

        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void test() throws InterruptedException {
        // uygulamanin basarili bir sekilde yuklendigi dogrulanir
        Assert.assertTrue(driver.isAppInstalled("todolist.scheduleplanner.dailyplanner.todo.reminders"));

       // uygulaminin basarili bir sekilde acildigi dogrulanir
       Assert.assertTrue(driver.findElementByXPath("//*[@text='Welcome to To-do List']").isDisplayed());

      // Ileri butonlarina tiklanir ve pop-up lar kapatilir
        Thread.sleep(1500);
        driver.findElementByXPath("//*[@text='CONTINUE']").click();
        Thread.sleep(1500);
        driver.findElementByXPath("//*[@text='CONTINUE']").click();
        Thread.sleep(1500);
        driver.findElementById("todolist.scheduleplanner.dailyplanner.todo.reminders:id/toolbar_back").click();
        driver.findElementById("todolist.scheduleplanner.dailyplanner.todo.reminders:id/dialog_pro_first_close").click();

     // görev ekleme adimina gecilir
        Thread.sleep(1500);
        driver.findElementById("todolist.scheduleplanner.dailyplanner.todo.reminders:id/iv_task_add").click();

      // görev adi girilir
        Thread.sleep(1500);
        driver.findElementById("todolist.scheduleplanner.dailyplanner.todo.reminders:id/task_create_input").sendKeys("Parka git");


        // görev kaydedilir
        Thread.sleep(1500);
        driver.findElementById("todolist.scheduleplanner.dailyplanner.todo.reminders:id/task_create_btn").click();
        Thread.sleep(1500);

        TouchAction action=new TouchAction<>(driver);
        for (int i = 0; i < 3; i++) {
            action.press(PointOption.point(800,1200)).release().perform();
        }


// görev silinir
// Görev olusturma sayfasina geri dönüldügü dogrulanir


    }

}
