package stepDefinitions.uiStepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.JSUtils;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US024_ContactUsBtnClick extends CommonPage {
    @Given("User goes to homepage")
    public void userGoesToHomepage() {
        getHomePage().goesToTestUrbanicFarmHomePage();
    }

    @When("User click to Contact US btn at the botton")
    public void userClickToContactUSBtnAtTheBotton() throws InterruptedException {
        getHomePage().clickContactUsBtn();
    }

    @Then("User should be able to see relevant page")
    public void userShouldBeAbleToSeeRelevantPage() {
        getContactUsPage().amIinContactUsPage();

    }
}
