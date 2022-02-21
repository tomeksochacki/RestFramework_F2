package com.trello.pages.googleAccountPage;

import com.codeborne.selenide.SelenideElement;
import com.trello.pages.BasePage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class GoogleAccountPage extends BasePage {

    private SelenideElement googleAccount = $x("//div[@data-email='ttrellolastname@gmail.com']");

    private SelenideElement passwordField = $("#password");

    private SelenideElement nextButtonEng = $x("//span[contains(text(),'Next')]");

    private SelenideElement googleEmail = $x("//input[@type='email']");

    private SelenideElement nextButtonPl = $x("//span[contains(text(),'Dalej')]");

    private SelenideElement tryAgainButton = $x("//span[contains(text(),'Spróbuj ponownie')]");

    public void fillGoogleEmail(String email){
        googleEmail.sendKeys(email);
    }

    public void clickNextButton(){
        nextButtonPl.click();
    }

    public void clickTryAgainButton(){
        tryAgainButton.click();
    }

    public void choseUserAccount(){
        googleAccount.click();
    }

    public void fillPasswordField(String password){
        passwordField.sendKeys(password);
    }

}
