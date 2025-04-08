import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ApkYukleme {
    AndroidDriver<AndroidElement> driver;
    @Test
    public void apkYukleme() throws MalformedURLException {
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 4");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        //caps.setCapability(MobileCapabilityType.APP,"C:\\Users\\elifk\\IdeaProjects\\T153_Appium\\Apps\\Calculator_8.4 (503542421)_Apkpure (3).apk");
        //caps.setCapability(MobileCapabilityType.APP,"C:\\Users\\elifk\\IdeaProjects\\T153_Appium\\Apps\\Apk Bilgisi_2.3.4_apkcombo.com.apk");
        //caps.setCapability(MobileCapabilityType.APP,"C:\\Users\\elifk\\IdeaProjects\\T153_Appium\\Apps\\arabam-com-5-4-1.apk");
        //caps.setCapability(MobileCapabilityType.APP,"C:\\Users\\elifk\\IdeaProjects\\T153_Appium\\Apps\\To-Do List - Schedule Planner_1.02.61.0928_APKPure.apk");
        caps.setCapability(MobileCapabilityType.APP,"C:\\Users\\elifk\\IdeaProjects\\T153_Appium\\Apps\\Kiwi.com - Book Cheap Flights_2023.14.0_Apkpure.apk");

        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
