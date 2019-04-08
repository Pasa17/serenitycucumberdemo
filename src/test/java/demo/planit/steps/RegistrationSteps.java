package demo.planit.steps;

import com.github.javafaker.Faker;
import demo.planit.pages.RegistrationPage;
import demo.planit.utility.RandomGenerator;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import javax.validation.constraints.AssertTrue;
import java.nio.charset.Charset;
import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertEquals;

public class RegistrationSteps {

    RegistrationPage registrationPagepage;
    RandomGenerator ran = new RandomGenerator();
    String randomFirstname;

    @Step
    public void givenTheUserIsOnFacebookRegistrationPage() {
        registrationPagepage.open();
    }

    @Step
    public void inputRandomlyGeneratedData() {

        String email;
        Faker faker = new Faker();
        randomFirstname = faker.name().firstName();
        registrationPagepage.getFirstName().sendKeys(randomFirstname);
        registrationPagepage.getLastName().sendKeys(faker.name().lastName());
        email = ran.RandomGenerator(4)+"@testmail.com";
        registrationPagepage.getMobileOrEmailAddress().sendKeys(email);
        registrationPagepage.getReEnterEmail().sendKeys(email);
        registrationPagepage.getNewPassword().sendKeys(ran.RandomGeneratorPassword(6));
        registrationPagepage.getRandomGenderSelection();
        registrationPagepage.selectRandomDay();
        registrationPagepage.selectRandomMonth();
        registrationPagepage.selectRandomYear();

    }

    @Step
    public void clickOnSignUpButton() {
        registrationPagepage.getSignUpButton().click();
    }

    @Step
    public void thenTheyShouldSeeADefinitionContainingTheWords() {
        assertEquals(randomFirstname, registrationPagepage.getProfileName().getText());
    }



}