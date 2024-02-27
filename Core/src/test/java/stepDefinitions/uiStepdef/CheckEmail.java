package stepDefinitions.uiStepdef;

import io.cucumber.java.en.Then;
import pages.CommonPage;

public class CheckEmail extends CommonPage {
    @Then("User should see email address")
    public void userShouldSeeEmailAddress() throws InterruptedException {
        getLoginPage().controlTheEmailAdress();
    }
}
