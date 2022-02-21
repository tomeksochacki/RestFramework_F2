package com.trello.tests.testRunners;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/trello/tests/stepDefs",
        tags = "@newBoard"
)

public class TestRunner extends AbstractTestNGCucumberTests {

    //final String URL = "https://trello.com/";

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.manage().window().maximize();
        setWebDriver(webDriver);
        Selenide.open("https://trello.com/");
    }

    @AfterMethod
    public void tearDown() {
        //WebDriverRunner.driver().getWebDriver().close();
        //WebDriverRunner.driver().getWebDriver().quit();
    }
}
