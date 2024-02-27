package pages;

import enums.URL_LINKS;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.sendText;

public class RegisterPage extends CommonPage{

    @FindBy (id ="registration_form_firstname")
    private WebElement firstNameInput;

    @FindBy (id ="registration_form_middlename")
    private WebElement middleNameInput;

    @FindBy(id="registration_form_lastname")
    private WebElement lastNameInput;

    @FindBy (id ="registration_form_email")
    private WebElement eMailInput;

    @FindBy (xpath = "//button[contains(text(), 'Register')]")
    private WebElement registerBtn;


    @FindBy(css = ".form-control")
    public List<WebElement> formElements;  //8elements, ilk 4ü bize lazım










    //Register Page gider ve sayfayı yükleyene kadar bekler
    public void goToRegisterPage(){
        driver.get(URL_LINKS.REGISTERPAGE.getLink());
        ReusableMethods.waitForPageToLoad(10);
    }


    //DataTable dan aldığı verilerle FirstName MiddleName LastName ve E-maili arka fonlarındaki renge göre geçerliliğini kontrol eder.
    public void registerFormsCheck(List<List<String>> list){

        for (int j = 0; j < list.size(); j++) {

            for (int i = 0; i < list.get(j).size(); i++) {

                if (i % 2 == 0) {

                    for (int k = 0; k < 4; k++) {

                        if (2 * k == i) {

                            if (null != list.get(j).get(i) ) {

                                sendText(formElements.get(k),list.get(j).get(i));

                            } else if( (null == list.get(j).get(i) ) ) {

                                sendText(formElements.get(k),"");

                            }
                        }
                    }
                }

                if (i%2 !=0 ) {
                    String expectedColor = "rgba(245, 110, 105, 1)";

                    for (int k = 0; k <4 ; k++) {

                        if (i/2 == k){
                            if (list.get(j).get(i).equals("false")){
                                String actualColor = formElements.get(k).getCssValue("color");
                                Assert.assertEquals(expectedColor,actualColor);
                            }else {
                                String actualColor = formElements.get(k).getCssValue("color");
                                Assert.assertNotEquals(expectedColor,actualColor);
                            }
                            formElements.get(k).clear();
                        }

                    }

                }
            }
        }
    }











    //-----------------Şükrü hocanın  methodları---------------------
    public void clickMainButton(String btnName){
        WebElement element = Driver.getDriver().findElement(By.xpath("//div/a[contains(text(), '" +
                btnName + "')]"));
        element.click();
    }

    public void verifyFirstNames(List<List<String>> listItems){
        String text="";
        String isTrue;
        Boolean isValid;

        for(int i=0; i<listItems.size(); i++){
//          gelen bilgi "empty" String değeri ise text="" olarak değişsin
//          text = ((listItems.get(i).get(0)).equals("empty")) ? text : listItems.get(i).get(0);
            text = ((listItems.get(i).get(0)) == null) ? text : listItems.get(i).get(0); // gelen bilgi null ise text="" olarak değişsin
            isTrue = listItems.get(i).get(1);

            firstNameInput.clear();
            ReusableMethods.sendText(firstNameInput,text);   //elemente scroll yapılma ihtiyacı için ara metod eklendi
            ReusableMethods.waitAndClickElement(registerBtn, 2);   //her saniye click denemesi yapılması için eklendi

            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            isValid = (Boolean) js.executeScript("return arguments[0].validity.valid", firstNameInput);
            Assert.assertEquals(Boolean.parseBoolean(isTrue), isValid);
        }
    }

    public void verifyMiddleNames(List<List<String>> listItems){
        String text="";
        String isTrue;
        Boolean isValid;
        for(int i=0; i<listItems.size(); i++){
//          gelen bilgi "empty" String değeri ise text="" olarak değişsin
//          text = ((listItems.get(i).get(0)).equals("empty")) ? text : listItems.get(i).get(0);
            text = ((listItems.get(i).get(0)) == null) ? text : listItems.get(i).get(0); // gelen bilgi null ise text="" olarak değişsin
            isTrue = listItems.get(i).get(1);

            middleNameInput.clear();
            ReusableMethods.sendText(middleNameInput,text);   // elemente scroll yapılma ihtiyacı için eklendi
            ReusableMethods.waitAndClickElement(registerBtn, 2);   // her saniye click denemesi yapılması için eklendi

            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            isValid = (Boolean) js.executeScript("return arguments[0].validity.valid", middleNameInput);
            Assert.assertEquals(Boolean.parseBoolean(isTrue), isValid);
        }
    }

    public void verifyLastNames(List<List<String>> listItems){
        String text="";
        String isTrue;
        Boolean isValid;
        for (int i=0; i<listItems.size(); i++) {
//          gelen bilgi "empty" String değeri ise text="" olarak değişsin
//          text = ((listItems.get(i).get(0)).equals("empty")) ? text : listItems.get(i).get(0);
            text = ((listItems.get(i).get(0)) == null) ? text : listItems.get(i).get(0); // gelen bilgi null ise text="" olarak değişsin
            isTrue = listItems.get(i).get(1);

            lastNameInput.clear();
            ReusableMethods.sendText(lastNameInput,text);   // elemente scroll yapılma ihtiyacı için eklendi
            ReusableMethods.waitAndClickElement(registerBtn, 2);   // her saniye click denemesi yapılması için eklendi

            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            isValid = (Boolean) js.executeScript("return arguments[0].validity.valid", lastNameInput);
            Assert.assertEquals(Boolean.parseBoolean(isTrue), isValid);
        }
    }

    public void verifyEmails(List<List<String>> listItems){
        String text="";
        String isTrue;
        Boolean isValid;
        String message;
        for(int i=0; i<listItems.size(); i++){
//          gelen bilgi "empty" String değeri ise text="" olarak değişsin
//          text = ((listItems.get(i).get(0)).equals("empty")) ? text : listItems.get(i).get(0);
            text = ((listItems.get(i).get(0)) == null) ? text : listItems.get(i).get(0); // gelen bilgi null ise text="" olarak değişsin
            isTrue = listItems.get(i).get(1);

            eMailInput.clear();
            ReusableMethods.sendText(eMailInput,text);   // elemente scroll yapılma ihtiyacı için ara metod eklendi
            ReusableMethods.waitAndClickElement(registerBtn, 2);   // her saniye click denemesi yapılması için eklendi

            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            isValid = (Boolean) js.executeScript("return arguments[0].validity.valid", eMailInput);
            Assert.assertEquals(Boolean.parseBoolean(isTrue), isValid);

            message = (String) js.executeScript("return arguments[0].validationMessage", eMailInput);
            verifyMessage(text, message);
        }
    }

    public void verifyMessage(String email, String message){
        if ((!email.contains("@")) && (!email.isEmpty())){
            Assert.assertTrue(message.contains("@"));
        }
    }
}
