package com.trello.pages.loginPage;

import com.codeborne.selenide.SelenideElement;
import com.trello.pages.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage extends BasePage {

    private SelenideElement loginField = $("[autocomplete=\"username\"]");

    private SelenideElement clickLogin = $x("//input[@id='login']");
    //private SelenideElement clickLogin = $x("body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/section[1]/div[2]/form[1]/div[3]/button[1]/span[1]/span[1]");

    private SelenideElement continueWithGmailButton = $x("//span[contains(text(),'Continue with Google')]");

    public SelenideElement getContinueWithGmailButton() {
        return continueWithGmailButton;
    }

    public void clickGooleButton(){
        getContinueWithGmailButton().click();
    }

    public void fillEmailField(String email) {
        loginField.sendKeys(email);
    }

    public void clickLoginButton(){
        click(clickLogin);
    }
}
