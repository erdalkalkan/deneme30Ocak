package stepDefinitions.uıStepdef;

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
        driver.get("https://test.urbanicfarm.com/");
        ReusableMethods.waitForPageToLoad(5);
        System.out.println("sayfa yüklendi");
    }

    @When("User click to Contact US btn at the botton")
    public void userClickToContactUSBtnAtTheBotton() throws InterruptedException {
        JSUtils.scrollDownByJS();
        System.out.println("aşağı indi");
        ReusableMethods.waitForVisibility(getHomePage().ContactUsBtnAtBotton,5000);
        System.out.println("butonu gördü");
        Thread.sleep(3000);
        getHomePage().ContactUsBtnAtBotton.click();
    }

    @Then("User should be able to see relevant page")
    public void userShouldBeAbleToSeeRelevantPage() {
        ReusableMethods.waitForPageToLoad(5);
        Assert.assertEquals("https://test.urbanicfarm.com/contact-us",driver.getCurrentUrl());
        Assert.assertTrue(getContactUsPage().getInTouchText.isDisplayed());

    }
}
