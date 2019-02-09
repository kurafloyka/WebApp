package com.qa.pages;

import com.qa.util.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "loginButton")
    WebElement loginButton;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public HomePage login(String em, String pwd) throws InterruptedException {
        email.sendKeys(em);
        password.sendKeys(pwd);
        loginButton.click();
        return new HomePage();
    }


    public String getURL(){

        return driver.getCurrentUrl();
    }

    @FindBy(xpath = "//*[@id=\"loginContainer\"]/div/div[1]/div/h2")
    WebElement loginWarning;

    public String getloginWarning(){

        return loginWarning.getText();

    }
}
