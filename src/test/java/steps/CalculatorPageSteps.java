package steps;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.CalculatorPage;

public class CalculatorPageSteps {

    CalculatorPage calculatorPage = new CalculatorPage();

    @Then("user successfully login")
    public void userSuccessfullyLogin() {
        Assertions.assertEquals("Calculator", calculatorPage.getMenuTitle());
        Assertions.assertTrue(calculatorPage.checkHamburgerBtnAppear());
    }
}
