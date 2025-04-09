package utilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;

public class ReusableMethods {
    public static void koordinatTiklamaMethodu(int xkoordinati, int ykoordinati, int beklemesuresi){
        TouchAction action=new TouchAction<>(Driver.getAndroidDriver());
        action.press(PointOption.point(xkoordinati,ykoordinati))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(beklemesuresi)))
                .release()
                .perform();
    }

    public static void koordinatKaydirmaMethodu(int startX, int startY, int endX, int endY, int beklemeSuresiMillis) {
        TouchAction<?> action = new TouchAction<>(Driver.getAndroidDriver());
        action.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(beklemeSuresiMillis)))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();
    }
}
