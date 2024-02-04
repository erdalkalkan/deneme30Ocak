package stepDefinitions.uiStepdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CommonPage;

import java.util.List;

public class SukruHocaSprt1_034_stepDef extends CommonPage {

    @And("Click the {string} button on the main Page")
    public void clickTheButtonOnTheMainPage(String text) {
        getRegisterPage().clickMainButton(text);
    }

    @Then("Verify that first name entries match the expected result")
    public void verifyThatFirstNameEntriesMatchTheExpectedResult(DataTable dataTable) {
        List<List<String>> listItems = dataTable.asLists(String.class);
        getRegisterPage().verifyFirstNames(listItems);
    }

    @Then("Verify that middle name entries match the expected result")
    public void verifyThatMiddleNameEntriesMatchTheExpectedResult(DataTable dataTable) {
        List<List<String>> listItems = dataTable.asLists(String.class);
        getRegisterPage().verifyMiddleNames(listItems);
    }

    @Then("verify that last name entries match the expected result")
    public void verifyThatLastNameEntriesMatchTheExpectedResult(DataTable dataTable) {
        List<List<String>> listItems = dataTable.asLists(String.class);
        getRegisterPage().verifyLastNames(listItems);
    }

    @Then("Verify that email entries match the expected result")
    public void verifyThatEmailEntriesMatchTheExpectedResult(DataTable dataTable) {
        List<List<String>> listItems = dataTable.asLists(String.class);
        getRegisterPage().verifyEmails(listItems);
    }

}
