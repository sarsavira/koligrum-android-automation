package pages;

import base.BasePageObject;
import io.appium.java_client.MobileBy;

public class SidebarMenu extends BasePageObject {
    public void clickHamburgerBtn(){
        click(MobileBy.AccessibilityId("Open navigation drawer"));
    }
    public void clickListMenu(){
        click(MobileBy.id("nav_list"));
    }

}
