package pages;

import enums.URL_LINKS;
import enums.USERCREDENTIAL;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.waitForPageToLoad;

public class LoginPage extends CommonPage{

    @FindBy(xpath = "//input[@name='email']")
    public WebElement input_email;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement input_password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit_button;
    @FindBy(xpath = "//span[.='Change ZIP code']")
    public WebElement changeZIPCodebtn;
    @FindBy(xpath = "//input[@name='zipcode']")
    public WebElement enterYourZIPCodeInput;
    @FindBy(css = "div>.CheckDistrictModal_x-btn__sVOij")
    public WebElement closeZIPCodeEnterWindow;
    @FindBy(css = ".Profile_td__w9cTI.pb-2")
    public WebElement gmailText;


    //LoginPage sayfasına gider ve sayfa hazır olana kadar bekler
    public void goesToLoginPage(){
        driver.get(URL_LINKS.LOGIN_URL.getLink());
        waitForPageToLoad(5);
    }

    //String username ve password parametrelerini girerek login olabilirsin
    public void login(String UserName, String Password){
        driver.get(URL_LINKS.LOGIN_URL.getLink());
        waitForPageToLoad(10);
        input_email.sendKeys(UserName);
        input_password.sendKeys(Password);
        submit_button.click();
        getAccountWeeklyOrderPage().zipCodeBoxCloseButton.click();
    }

    //Enum classını yazarak credentiallerinle login olabilirsin
    public void login(USERCREDENTIAL usercredential){
        driver.get(URL_LINKS.LOGIN_URL.getLink());
        waitForPageToLoad(10);
        input_email.sendKeys(usercredential.getUsername());
        input_password.sendKeys(usercredential.getPassword());
        submit_button.click();
        getAccountWeeklyOrderPage().zipCodeBoxCloseButton.click();
    }

    //Login olduğumuzu kontrol eder
    public void amILoggedIn(){
        waitForPageToLoad(5);
        Assert.assertTrue(driver.getCurrentUrl().contains("https://test.urbanicfarm.com/auth/login"));
    }

    //Change ZIP Code Butonuna tıklar ve değiştirme ekranını kontrol eder
    public void clickChanceZIPCodeBtn(){
        changeZIPCodebtn.click();
        Assert.assertTrue(enterYourZIPCodeInput.isDisplayed());
    }

    public void controlTheEmailAdress() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        System.out.println(gmailText.getText());
        Assert.assertTrue( gmailText.getText().equals("urbanicfarm2@gmail.com"));
        Thread.sleep(3000);
    }


}
