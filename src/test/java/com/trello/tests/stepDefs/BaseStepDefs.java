package com.trello.tests.stepDefs;

import com.trello.pages.boardsPage.BoardsPage;
import com.trello.pages.googleAccountPage.GoogleAccountPage;
import com.trello.pages.loginPage.LoginPage;
import com.trello.pages.mainBoardsPage.MainBoardsPage;
import com.trello.pages.mainBoardsPage.fragments.AccountDropDownBar;
import com.trello.pages.mainBoardsPage.fragments.CreateBoardDropDownBar;
import com.trello.pages.mainBoardsPage.fragments.MainBarFragment;
import com.trello.pages.mainPage.MainPage;
import com.trello.pages.passwordPage.PasswordPage;

public abstract class BaseStepDefs {
    protected BoardsPage boardsPage = new BoardsPage();

    protected LoginPage loginPage = new LoginPage();

    protected MainBoardsPage mainBoardsPage = new MainBoardsPage();

    protected AccountDropDownBar accountDropDownBar = new AccountDropDownBar();

    protected CreateBoardDropDownBar createBoardDropDownBar = new CreateBoardDropDownBar();

    protected MainBarFragment mainBarFragment = new MainBarFragment();

    protected MainPage mainPage = new MainPage();

    protected PasswordPage passwordPage = new PasswordPage();

    protected GoogleAccountPage googleAccountPage = new GoogleAccountPage();
}
