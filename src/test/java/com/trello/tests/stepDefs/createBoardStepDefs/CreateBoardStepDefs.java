package com.trello.tests.stepDefs.createBoardStepDefs;

import com.trello.tests.stepDefs.BaseStepDefs;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateBoardStepDefs extends BaseStepDefs {

    @Given("^User clicks 'create button' in the main bar$")
    public void user_clicks_create_button_in_the_main_bar() {
        mainBarFragment.createBoard();
    }

    @When("^User selects the 'create board' button from the drop-down menu$")
    public void user_selects_the_create_board_button_from_the_dropdown_menu() throws InterruptedException {
        Thread.sleep(3000);
        createBoardDropDownBar.findCorrectButton();
        Thread.sleep(3000);
        createBoardDropDownBar.createOneBoard();
    }

    @And("^User fills the 'board title' field with the (.+)$")
    public void user_fills_teh_board_title_field_with_the(String boardname) {
        createBoardDropDownBar.createTitleBoard(boardname);
    }

    @Then("^User clicks 'create' button$")
    public void user_clicks_create_button() {
        createBoardDropDownBar.confirmTheNewBoard();
    }
}
