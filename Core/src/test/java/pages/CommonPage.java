package pages;

import org.openqa.selenium.support.PageFactory;

import static stepDefinitions.Hooks.driver;


public abstract class CommonPage {
    public CommonPage() {
        PageFactory.initElements(driver, this);
    }

    private HomePage homePage;
    private ContactUsPage contactUsPage;
    private RegisterPage registerPage;
    private LoginPage loginPage;
    private PrivacyPolicyPage privacyPolicyPage;
    private AccountAddressPage accountAddressPage;
    private AccountWeeklyOrderPage accountWeeklyOrderPage;

    public AccountWeeklyOrderPage getAccountWeeklyOrderPage() {
        if (accountWeeklyOrderPage == null) {
            accountWeeklyOrderPage = new AccountWeeklyOrderPage();
        }
        return accountWeeklyOrderPage;
    }
    public AccountAddressPage getAccountAddressPage() {
        if (accountAddressPage == null) {
            accountAddressPage = new AccountAddressPage();
        }
        return accountAddressPage;
    }
    public PrivacyPolicyPage getPrivacyPolicyPage() {
        if (privacyPolicyPage == null) {
            privacyPolicyPage = new PrivacyPolicyPage();
        }
        return privacyPolicyPage;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public RegisterPage getRegisterPage() {
        if (registerPage == null) {
            registerPage = new RegisterPage();
        }
        return registerPage;
    }

    public ContactUsPage getContactUsPage() {
        if (contactUsPage == null) {
            contactUsPage = new ContactUsPage();
        }
        return contactUsPage;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

}
