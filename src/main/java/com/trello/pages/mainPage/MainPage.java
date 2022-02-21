package com.trello.pages.mainPage;

import com.codeborne.selenide.SelenideElement;
import com.trello.pages.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage extends BasePage {

    private SelenideElement loginButton = $x("//a[@class='btn btn-sm btn-link text-primary']");

    public SelenideElement getLoginButton() {
        return loginButton;
    }

    public void clickLoginButton() {
        click(loginButton);
    }
}
