package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.util.List;

import static stepDefinitions.Hooks.driver;

public class AccountWeeklyOrderPage extends CommonPage{
    @FindBy (css="[href='/account/home'].align-items-center[title=\"My Account\"]")
    public WebElement profil_img_Account;
    @FindBy(xpath = "(//a[@class='Sidebar_smFont__16-hW Sidebar_section_btn__1sp6i h6 '])[3]")
    public WebElement YourProducts_Services;
    @FindBy(css = "div[class*='px-0 m-0 mt-2'] a")
    public List<WebElement> accountPageLeftsidesTabs;
    @FindBy(css = "[href='/account/address']")
    public WebElement accountAddressBtnAtTheLeftBar;
    @FindBy(css = "div[class='CheckDistrictModal_x-btn__sVOij']")
    public WebElement zipCodeBoxCloseButton;

    public void clickAddressBtnAtTheLeftBar(){
        ReusableMethods.waitForPageToLoad(10);
        ReusableMethods.waitForClickablility(accountAddressBtnAtTheLeftBar,10);
        JSUtils.clickElementByJS(accountAddressBtnAtTheLeftBar);
    }





}
