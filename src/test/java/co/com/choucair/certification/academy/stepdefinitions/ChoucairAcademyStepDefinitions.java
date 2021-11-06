package co.com.choucair.certification.academy.stepdefinitions;

import co.com.choucair.certification.academy.tasks.Login;
import co.com.choucair.certification.academy.tasks.OpenUtes;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage (){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^Enter the Utest page$")
    public void enterTheUtestPage() {
        OnStage.theActorCalled("Mauricio").wasAbleTo(OpenUtes.thePage(), Login.onThePage());
    }


/*    @When("^Click on register option$")
    public void clickOnRegisterOption() {
    }

    @Then("^Register in the form to create a new user$")
    public void registerInTheFormToCreateANewUser() {
    }*/
}
