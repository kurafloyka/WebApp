package com.qa.pages;

import com.qa.util.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage extends TestBase {

    public WishListPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"myAccount\"]/div[3]/ul/li[1]/div/a/h4")
    WebElement myFavourite;

    public String getFavouriteName(){

        return myFavourite.getText();
    }

    public void goToMyFavourite(){

        myFavourite.click();
    }

    @FindBy(xpath = "//*[@id=\"p-287414215\"]/div[3]/span")
    WebElement removeButton;

    public void removeProduct(){
        removeButton.click();
    }

    @FindBy(xpath = "/html/body/div[5]/div/span[2]")
    WebElement popUpInfo;

    public String getPopUpInfo(){

        return popUpInfo.getText();
    }

    @FindBy(xpath = "/html/body/div[5]/div/div/span")
    WebElement submitButton;

    public void setSubmitButton() throws InterruptedException {
        submitButton.click();

        Thread.sleep(3000);
    }

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div[1]/a[2]")
    WebElement myAccount;
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/a[8]")
    WebElement logOutButton;


    public void logOut() throws InterruptedException {

        Thread.sleep(6000);
        Actions action = new Actions(driver);
        action.moveToElement(myAccount).build().perform();

        Thread.sleep(3000);
        logOutButton.click();

    }
}
