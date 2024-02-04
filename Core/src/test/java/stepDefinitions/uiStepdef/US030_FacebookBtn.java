package stepDefinitions.uiStepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;

public class US030_FacebookBtn extends CommonPage {



    @When("User click the FacebookBtn")
    public void userClickTheFacebookBtn() {
        getHomePage().clickFaceebookIcon();
    }

    @Then("User should be able to click FacebookIcon")
    public void userShouldBeAbleToClickFacebookIcon() {
        Assert.assertTrue(getHomePage().amIinRightPageWhenOpenNewWindow("UrbanicFarm | San Francisco CA"));
    }


}
