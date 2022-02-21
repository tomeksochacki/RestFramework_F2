package com.trello.pages.mainBoardsPage;


import com.codeborne.selenide.SelenideElement;
import com.trello.pages.BasePage;
import com.trello.pages.mainBoardsPage.fragments.AccountDropDownBar;
import com.trello.pages.mainBoardsPage.fragments.MainBarFragment;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainBoardsPage extends BasePage {

    private AccountDropDownBar accountDropDownBar = new AccountDropDownBar();
    private MainBarFragment mainBarFragment = new MainBarFragment();

    private SelenideElement boardsButton = $(By.className("\"[aria-label=\\\\\\\"Open member menu\\\\\\\"]\""));

    public void openPageWithAllBoards() {
        boardsButton.click();
    }
}
