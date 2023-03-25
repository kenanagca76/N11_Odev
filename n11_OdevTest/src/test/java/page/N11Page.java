package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

import static org.openqa.selenium.By.cssSelector;

public class N11Page {
    public N11Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//button[@class='dn-slide-deny-btn']")
    public WebElement pup01;


    //@FindBy (css = "//*[@class='banner__accept-button']")
    @FindBy (css = "div.mobile > div > div.banner__accept-button")
    public WebElement cerezKabulEt;


    @FindBy (xpath = "//a[@class='btnSignUp']")
    public WebElement login;

    @FindBy (xpath = "//span[@class='btn btnBlack close']")
    public WebElement okButon;

    @FindBy (id = "firstName")
    public WebElement nameInput;

    @FindBy (id = "lastName")
    public WebElement lastnameInput;

    @FindBy (id = "registrationEmail")
    public WebElement eMailInput;

    @FindBy (id = "registrationPassword")
    public WebElement passwordInput;

    @FindBy (id = "passwordAgain")
    public WebElement rePasswordInput;

    @FindBy (id = "phoneNumber")
    public WebElement phoneInput;

    @FindBy (xpath = "//label[@for='genderMale']")
    //@FindBy (xpath = "//div[@class=\"genderContainer\"] div.genderArea label.genderMale")
    //@FindBy (id = "genderMale")
    public WebElement gender;

    @FindBy (xpath="//label[@for='acceptContract']")
    public WebElement box;

    @FindBy (id = "submitButton")
    public WebElement signUp;

}
