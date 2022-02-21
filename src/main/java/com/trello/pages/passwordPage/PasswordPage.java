package com.trello.pages.passwordPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.trello.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class PasswordPage extends BasePage {

    //private SelenideElement passwordField = $x("//input[@placeholder='Enter password']");
    //private SelenideElement passwordField = $x("//div[@class='field-group password-field expanded  sc-Rmtcm iGAIPI']");
    //private SelenideElement passwordField = $(".css-s0bv5z");
    private SelenideElement passwordField = $("#password");

    private SelenideElement confirmButton = $("div.sc-brqgnP.joMbJc div.css-q0b2qn div.css-xxwux div.css-auqgo3 div.sc-kpOJdX.iBzMtx section.sc-kgoBCf.fYjOoV form.sc-btzYZH.lhJlEg:nth-child(3) div.sc-ckVGcZ.bsUzcy button.css-siava9 span.css-19r5em7 > span:nth-child(1)");
    //private SelenideElement confirmButton = $x("body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/section[1]/div[2]/form[1]/div[3]/button[1]/span[1]/span[1]");
   /* @FindBy(id = "login-submit")
    public SelenideElement confirmButton;*/

    /*public SelenideElement getConfirmButton() {
        return confirmButton;
    }*/

    private SelenideElement circle = $(By.className("css-119qjy3"));

    public SelenideElement getCircle() {
        return circle;
    }

    public SelenideElement getPasswordField() {
        return passwordField;
    }
    /*public void confirm() {
        click(confirmButton);
    }*/

    public void confirm() {
        //Configuration.timeout = 3000;
        confirmButton.click();
    }
}
