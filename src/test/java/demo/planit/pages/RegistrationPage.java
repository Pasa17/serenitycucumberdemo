package demo.planit.pages;

import demo.planit.utility.RandomGenerator;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.Random;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

@DefaultUrl("https://www.facebook.com/")
public class RegistrationPage extends PageObject {

    RandomGenerator ran = new RandomGenerator();

    @FindBy(name="firstname")
    private WebElement firstName;

    @FindBy(name="lastname")
    private WebElement lastName;

    @FindBy(name="reg_email__")
    private WebElement mobileOrEmailAddress;

    @FindBy(name="reg_passwd__")
    private WebElement newPassword;

    @FindBy(xpath="//span[@data-name='gender_wrapper']")
    private WebElement genderSelection;

    @FindBy(name="reg_email_confirmation__")
    private WebElement reEnterEmail;

    @FindBy(name="websubmit")
    private WebElement signUpButton;

    @FindBy(id="day")
    private WebElement day;

    @FindBy(id="month")
    private WebElement month;

    @FindBy(id="year")
    private WebElement year;

    @FindBy(xpath="//a[@title='Profile']/span/span")
    private WebElement profileName;



    public WebElement getFirstName()
    {
        return firstName;
    }

    public WebElement getLastName()
    {
        return lastName;
    }
    public WebElement getMobileOrEmailAddress()
    {
        return mobileOrEmailAddress;
    }
    public WebElement getNewPassword()
    {
        return newPassword;
    }
    public WebElement getSignUpButton()
    {
        return signUpButton;
    }

    public WebElement getReEnterEmail()
    {
        return reEnterEmail;
    }

    public void getRandomGenderSelection()
    {
        List <WebElement> options = genderSelection.findElements(By.xpath(".//span"));
        options.get(ran.RandomNumberGeneratorBetweenLimits(0, 1)).click();

    }

    public void selectRandomDay()
    {
        Select d = new Select(day);
        d.selectByIndex(ran.RandomNumberGeneratorBetweenLimits(1, 30));
    }

    public void selectRandomMonth()
    {
        Select m = new Select(month);
        m.selectByIndex(ran.RandomNumberGeneratorBetweenLimits(1, 12));
    }

    public void selectRandomYear()
    {
        Select y = new Select(year);
        y.selectByIndex(ran.RandomNumberGeneratorBetweenLimits(15, 25));
    }

    public WebElement getProfileName()
    {
        return profileName;
    }



}