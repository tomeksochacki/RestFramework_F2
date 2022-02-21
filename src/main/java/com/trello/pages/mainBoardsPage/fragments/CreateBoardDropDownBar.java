package com.trello.pages.mainBoardsPage.fragments;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.trello.pages.BasePage;

import static com.codeborne.selenide.Selenide.*;

public class CreateBoardDropDownBar extends BasePage {

    private ElementsCollection itemsThatCanBeCreated = $$("nav span[class*='_3jTRr1WChvvqHf']");

    private SelenideElement buttonCreatesBoard;

    private SelenideElement boardTitleField = $x("//input[@data-test-id='create-board-title-input']");

    private SelenideElement confirmBoardButton = $x("//button[@data-test-id='create-board-submit-button']");

    public SelenideElement findCorrectButton() {

        String expectedName = "Create board";
        for (SelenideElement itemWithButtonName : itemsThatCanBeCreated) {
            if (itemWithButtonName.getText().equals(expectedName)) {
                buttonCreatesBoard = itemWithButtonName;
                break;
            }
        }
        return buttonCreatesBoard;
    }

    public void createOneBoard() throws InterruptedException {
        click(buttonCreatesBoard);
    }

    public void createTitleBoard(String nameBoard) {
        boardTitleField.sendKeys(nameBoard);
    }

    public void confirmTheNewBoard() {
        confirmBoardButton.click();
    }


}
