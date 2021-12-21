package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageSteps {
    LoginPage loginPage = new LoginPage();

    @Given("^user is on login page$")
    public void userIsOnLoginPage() {
    }

    @When("user input username {string}")
    public void userInputUsername(String username) {
        loginPage.inputUsername(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String arg0) {
        loginPage.inputPassword(arg0);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginBtn();
    }

}
