package com.trello.tests.stepDefs.compareStepDefs;

import com.trello.tests.stepDefs.BaseStepDefs;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java8.En;

public class CompareStepDefs extends BaseStepDefs implements En {


    @And("^User opens member menu$")
    public void user_opens_member_menu() throws InterruptedException {
        //Thread.sleep(3000);
        mainBarFragment.clickToAccount();
        //Thread.sleep(3000);
    }

    @And("^User compares the value of the email field with his email address$")
    public void user_compares_the_value_of_the_email_field_with_his_address() {
        accountDropDownBar.compareEmailAddress(System.getProperty("email"));
    }

    @Then("^the email values are equal$")
    public void the_email_values_are_equal() {
    }
}
