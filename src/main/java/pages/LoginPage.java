package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static drivers.AndroidDriverInit.driver;

public class LoginPage {
    public void inputUsername(String username){
        //input username
        By locatorInputUsername = MobileBy.id("username");
        AndroidElement inputUsername = driver.findElement(locatorInputUsername);
        inputUsername.clear();
        inputUsername.sendKeys(username);
    }

    public void inputPassword(String password){
        By locatorInputPassword = MobileBy.id("password");
        AndroidElement inputPassword = driver.findElement(locatorInputPassword);
        inputPassword.clear();
        inputPassword.sendKeys(password);
    }

    public void clickLoginBtn(){
        //click Login
        By locatorBtnLogin = MobileBy.id("login");
        AndroidElement btnLogin = driver.findElement(locatorBtnLogin);
        btnLogin.click();
    }
}
