package steps;

import io.cucumber.java.en.When;
import pages.ListPage;

public class ListPageSteps {
    ListPage listPage = new ListPage();

    @When("user go swipe")
    public void userGoSwipe() {
        listPage.swipe();
    }
}
