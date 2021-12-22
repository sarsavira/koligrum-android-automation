package pages;

import base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Point;

import java.time.Duration;

public class ListPage extends BasePageObject {
    public void swipe(){
        AndroidElement container = find(MobileBy.id("recycler_view"));
        Point coordinate = container.getCenter();
        TouchAction action = new TouchAction(getDriver());
        action
                .press(PointOption.point(coordinate))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(coordinate.getX(), coordinate.getY() -1000))
                .release()
                .perform();
    }
}
