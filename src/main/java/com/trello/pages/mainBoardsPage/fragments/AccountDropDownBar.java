package com.trello.pages.mainBoardsPage.fragments;

import com.codeborne.selenide.SelenideElement;
import com.trello.pages.BasePage;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$x;

public class AccountDropDownBar extends BasePage {

    private SelenideElement emailAddress = $x("//span[@class='w6CkIi_9-1xviK']");

    public void compareEmailAddress(String email) {
        Assert.assertEquals(email, emailAddress.getText());
    }
}
