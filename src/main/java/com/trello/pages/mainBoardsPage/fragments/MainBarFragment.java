package com.trello.pages.mainBoardsPage.fragments;

import com.codeborne.selenide.SelenideElement;
import com.trello.pages.BasePage;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainBarFragment extends BasePage {

    //private SelenideElement accountButton = $("[Open member menu]");
    //private SelenideElement accountButton = $x("//button[@type='button']");
    private SelenideElement accountButton = $x("//button[@aria-label='Open member menu']");
    //class="_2LKdO6O3n25FhC"
   /* @FindBy(className = "_2LKdO6O3n25FhC")
    private SelenideElement accountButton;*/

    private SelenideElement createButton = $x("//button[@data-test-id='header-create-menu-button']");

    public void clickToAccount() {
        //click(accountButton);
        accountButton.click();
    }

    public void createBoard(){
        createButton.click();
    }
}
