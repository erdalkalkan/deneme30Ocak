package stepDefinitions.uiStepdef;

import io.cucumber.java.en.Then;
import pages.CommonPage;

public class ChangeZIPCodeBtn extends CommonPage {
    @Then("User should see change ZIP Code btn")
    public void userShouldSeeChangeZIPCodeBtn() {
        getLoginPage().clickChanceZIPCodeBtn();
    }
}
