package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class ContactUsPage extends CommonPage{

    @FindBy(xpath = "//h2[@class='ContactUs_title__elsQ3']")
    public WebElement getInTouchText;




    //Contact Us Page de olduğunuzu kanıtlar
    public void amIinContactUsPage(){
        ReusableMethods.waitForPageToLoad(5);
        Assert.assertEquals("https://test.urbanicfarm.com/contact-us",driver.getCurrentUrl());
        Assert.assertTrue(getInTouchText.isDisplayed());

    }
}
