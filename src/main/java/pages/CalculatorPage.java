package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static drivers.AndroidDriverInit.driver;

public class CalculatorPage {
    public String getMenuTitle(){
        By locatorMenuTitle = MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView");
        AndroidElement labelTitle = driver.findElement(locatorMenuTitle);
        return labelTitle.getText();
    }
    public boolean checkHamburgerBtnAppear() {
        //By locatorHamburgerBtn = MobileBy.AccessibilityId("Open navigation drawer");
        //AndroidElement btnHamburger = driver.findElement(locatorHamburgerBtn);
        //return btnHamburger.isDisplayed();

        //explicit wait
        By locatorHamburgerBtn = MobileBy.AccessibilityId("Open navigation drawer");
        WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
        //interface reference
        AndroidElement btnHamburger = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locatorHamburgerBtn));
        return btnHamburger.isDisplayed();
    }
}
