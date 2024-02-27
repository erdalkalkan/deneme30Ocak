package stepDefinitions.uiStepdef.AccountAddressPage;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static stepDefinitions.Hooks.driver;

public class tryDenemeStepdef {

    @Then("denemetry nasil oldcak bakalim")
    public void denemetryNasilOldcakBakalim() {
        driver.get("https://test.urbanicfarm.com/auth/login");
        System.out.println(driver.findElement(By.xpath("//input[@placeholder='Email']")).getAttribute("validationMessage"));


    }

}
