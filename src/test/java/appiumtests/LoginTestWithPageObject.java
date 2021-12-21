package appiumtests;

import drivers.AndroidDriverInit;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.CalculatorPage;
import pages.LoginPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginTestWithPageObject {

  CalculatorPage calculatorPage = new CalculatorPage();
  LoginPage loginPage = new LoginPage();


  @Test
  public void loginWithValidData(){
    AndroidDriverInit.initialize();
    loginPage.inputUsername("admin");
    loginPage.inputPassword("admin");
    loginPage.clickLoginBtn();

    Assertions.assertEquals("Calculator", calculatorPage.getMenuTitle());
    Assertions.assertTrue(calculatorPage.checkHamburgerBtnAppear());

    AndroidDriverInit.quit();

  }

}
