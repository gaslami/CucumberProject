package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {
    @Given("I am on the website {string}")
    public void visitWebsite(String url) {
        // Diese Methode wird ausgeführt, wenn der Schritt "Given I am on the website 'URL'" in der Feature-Datei aufgerufen wird.
        // {string} bedeutet, dass ein String-Parameter erwartet wird. Hier ist es die URL der Website.
        System.out.println("Website wird aufgerufen: " + url);
    }

    @When("I click on tab {string}} and fill with valid credentials")
    public  void ClickOnTabAndFillWithCredentials(String tab) {
        // Diese Methode wird ausgeführt, wenn der Schritt "When I click on tab 'Log in' and fill with valid credentials" in der Feature-Datei aufgerufen wird.
        // Der Parameter {string} bezieht sich hier auf den Namen des Tabs, z.B. "Log in".
        System.out.println("Tab wird angeklickt und Felder werden befüllt " + tab);
    }

    @Then("I will be successfully logged in and redirected to the homepage")
    public void RedirectingToHomepage() {
        System.out.println("Login ist erfolgreich");
    }

}
