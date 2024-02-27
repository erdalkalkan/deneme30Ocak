package stepDefinitions.uiStepdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import pages.RegisterPage;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.ReusableMethods.sendText;

public class US_034_RegisterFunctionality_8_Erdal extends RegisterPage {

    @Given("User goes to direct Register Page")
    public void userGoesToDirectRegisterPage() {
        goToRegisterPage();
    }

    @When("User enters the following information")
    public void userEntersTheFollowingInformation(DataTable dataTable) {



        for (int j = 0; j < dataTable.height(); j++) {

            for (int i = 0; i < dataTable.width(); i++) {

                if (i % 2 == 0) {

                    for (int k = 0; k < 4; k++) {

                        if (2 * k == i) {



                            if (null != dataTable.column(i).get(j) ) {


                                sendText(getRegisterPage().formElements.get(k),dataTable.column(i).get(j));

                            } else if( (null == dataTable.column(i).get(j) ) ) {


                                sendText(getRegisterPage().formElements.get(k),"");

                            }
                        }
                    }
                }


                if (i%2 !=0 ) {
                    String expectedColor = "rgba(245, 110, 105, 1)";

                    if (dataTable.column(i).get(j).equals("false")){
                        String actualColor = getRegisterPage().formElements.get(i/2).getCssValue("color");
                        Assert.assertEquals(expectedColor,actualColor);
                    }else {
                        String actualColor = getRegisterPage().formElements.get(i/2).getCssValue("color");
                        Assert.assertNotEquals(expectedColor,actualColor);
                    }
                    getRegisterPage().formElements.get(i/2).clear();
                }
            }
        }


    }


    @Then("User should be able to write or not the following information")
    public void userShouldBeAbleToWriteOrNotTheFollowingInformation(DataTable dataTable) {

        List<List<String>> list = ReusableMethods.turnDataTableToListOfList(dataTable);
        registerFormsCheck(list);

    }
}