package com.trello.tests.stepDefs.loginStepDefs;

import com.trello.tests.stepDefs.BaseStepDefs;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginStepDefs extends BaseStepDefs {

    //for all
    @Given("^User navigates to trello page$")
    public void user_navigates_to_trello_page() {
        mainPage.clickLoginButton();
    }

    //for trello
    @When("^User enters email and password into Trello$")
    public void user_enters_and_into_Trello() throws InterruptedException {
        loginPage.fillEmailField(System.getProperty("email"));
        loginPage.clickLoginButton();
        Thread.sleep(3000);
        passwordPage.fillField(passwordPage.getPasswordField(), System.getProperty("password"));
        Thread.sleep(3000);
        passwordPage.confirm();
    }

    //for google
    @When("^User clicks Continue with Google button$")
    public void user_clicks_Continue_with_Google_button() throws InterruptedException {
        Thread.sleep(3000);
        loginPage.clickGooleButton();
        Thread.sleep(3000);
    }

    //for google
    @And("^User enters email and password into Google Account$")
    public void user_enters_email_and_password_into_Google_Account() throws InterruptedException {
        googleAccountPage.fillGoogleEmail(System.getProperty("email2"));
        Thread.sleep(3000);
        googleAccountPage.clickNextButton();
        Thread.sleep(3000);
        googleAccountPage.clickTryAgainButton();
        Thread.sleep(3000);
        googleAccountPage.fillGoogleEmail(System.getProperty("email2"));
        Thread.sleep(3000);
        googleAccountPage.clickNextButton();
        Thread.sleep(3000);
        //googleAccountPage.fillPasswordField(System.getProperty("password2"));
    }
}
