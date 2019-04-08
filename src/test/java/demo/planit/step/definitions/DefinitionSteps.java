package demo.planit.step.definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.planit.steps.RegistrationSteps;
import net.thucydides.core.annotations.Steps;

public class DefinitionSteps {

    @Steps
    RegistrationSteps steps;

    @Given("the user is on the facebook registration page and excited to share his/her life away")
    public void givenTheUserIsOnFacebookRegistrationPage() {
        steps.givenTheUserIsOnFacebookRegistrationPage();
    }

    @When("the user provides randomly generated data in the required fields")
    public void inputRandomlyGeneratedData() {
        steps.inputRandomlyGeneratedData();
    }

    @And("clicks on the Sign up button")
    public void clickOnSignUpButton() {
        steps.clickOnSignUpButton();
    }

    @Then("the user should be registered")
    public void thenTheyShouldSeeADefinitionContainingTheWords() {
        steps.thenTheyShouldSeeADefinitionContainingTheWords();

    }


}
