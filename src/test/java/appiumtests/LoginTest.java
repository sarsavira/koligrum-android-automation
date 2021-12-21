package appiumtests;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LoginTest {

  @Test
  public void loginWithValidData(){
    //desired capabilities
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
    caps.setCapability(MobileCapabilityType.DEVICE_NAME, "device");
    caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
    caps.setCapability(MobileCapabilityType.APP, "/Users/SFIRDAUS/Downloads/Learn/appium/app-debug_v.1.0.apk");
    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
    //additional
    caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
    caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);

    //url appium
    String url = "http://localhost:4723/wd/hub";

    //appium
    AndroidDriver<AndroidElement> driver = null;
    try {
      driver = new AndroidDriver<>(new URL(url), caps);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }

    //implicit wait
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    //input username
    By locatorInputUsername = MobileBy.id("username");
    AndroidElement inputUsername = driver.findElement(locatorInputUsername);
    inputUsername.clear();
    inputUsername.sendKeys("admin");

    //input password
    By locatorInputPassword = MobileBy.id("password");
    AndroidElement inputPassword = driver.findElement(locatorInputPassword);
    inputPassword.clear();
    inputPassword.sendKeys("admin");

    //click Login
    By locatorBtnLogin = MobileBy.id("login");
    AndroidElement btnLogin = driver.findElement(locatorBtnLogin);
    btnLogin.click();

    //getMenuTitle
    By locatorMenuTitle = MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView");
    AndroidElement labelTitle = driver.findElement(locatorMenuTitle);
    String title = labelTitle.getText();
    System.out.println(title);
    Assertions.assertEquals("Calculator", title);

    //check hamburger btn
    By locatorHamburgerBtn = MobileBy.AccessibilityId("Open navigation drawer");
    AndroidElement btnHamburger = driver.findElement(locatorHamburgerBtn);
    boolean displayed = btnHamburger.isDisplayed();
    System.out.println(displayed);

    //delay
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    //quit
    driver.quit();

  }

}
