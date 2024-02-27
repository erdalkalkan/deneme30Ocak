package stepDefinitions.uiStepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;

public class US024_ContactUsBtnClick extends CommonPage {
    @Given("User goes to homepage")
    public void userGoesToHomepage() {
        getHomePage().goesToTestUrbanicFarmHomePage();
    }

    @When("User click to Contact US btn at the botton")
    public void userClickToContactUSBtnAtTheBotton() {
        getHomePage().clickContactUsBtn();
    }

    @Then("User should be able to see relevant page")
    public void userShouldBeAbleToSeeRelevantPage() {
        getContactUsPage().amIinContactUsPage();

    }
}
