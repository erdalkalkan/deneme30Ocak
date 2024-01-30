package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends CommonPage {


    @FindBy(xpath = "//a[@button='asdd']")
    public WebElement deneme2Btn;

    @FindBy(xpath = "//button[@class='lkasd']")
    public WebElement denemeBtn;



}
