package stepDefinitions.uiStepdef;

import enums.USERCREDENTIAL;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;

public class LoginFunctionality extends CommonPage {
    @Given("User goes to Login Page")
    public void userGoesToLoginPage() {
        getLoginPage().goesToLoginPage();
    }

    @When("User write the valid credentials")
    public void userWriteTheValidCredentials() {
        getLoginPage().login(USERCREDENTIAL.USERGMAIL.getUsername(),USERCREDENTIAL.USERGMAIL.getPassword());
    }

    @Then("User should be able to logged in")
    public void userShouldBeAbleToLoggedIn() {
        getLoginPage().amILoggedIn();

    }
}
