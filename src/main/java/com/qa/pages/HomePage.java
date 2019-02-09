package com.qa.pages;

import com.qa.util.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath = "//*[@id=\"header\"]/div/h1/span")
    WebElement motto;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div/div/a[1]")
    WebElement myAccount;

    public void goToLoginPage() {
        myAccount.click();
    }

    public String getMotto() {

        return motto.getText();

    }

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div[1]/a[2]")
    WebElement userName;

    public String getUserName() {

        return userName.getText();
    }

    @FindBy(id = "searchData")
    WebElement searchBox;

    public void setData() {

        searchBox.sendKeys("Iphone");
    }

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div[2]/div[1]/a")
    WebElement searchButton;

    public void searchData() {

        searchButton.click();
    }

    @FindBy(xpath = "//*[@id=\"breadCrumb\"]/ul/li[2]/a/span")
    WebElement infoProduct;

    public String getInfoProduct() {

        return infoProduct.getText();
    }

    @FindBy(xpath = "//*[@id=\"contentListing\"]/div/div/div[2]/div[3]/div/input")
    WebElement pageNumber;

    public void setPageNumber() {

        pageNumber.clear();
        pageNumber.sendKeys("2");
    }

    @FindBy(xpath = "//*[@id=\"contentListing\"]/div/div/div[2]/div[3]/a[3]")
    WebElement pageNumberInfo;

    public String getPageNumberInfo() {

        return pageNumberInfo.getText();
    }

    @FindBy(xpath = "//*[@id=\"view\"]/ul/li[3]/div/div[2]/span[2]")
    WebElement thirdProduct;

    public void selectThirdProduct() {

        thirdProduct.click();

    }

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div[1]/a[1]")
    WebElement myAccount2;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/a[2]")
    WebElement wishList;

    @FindBy(xpath = "//*[@id=\"btnScrollTop\"]")
    WebElement pageUp;

    public WishListPage setPageUp() throws InterruptedException {

        pageUp.click();
        Thread.sleep(3000);

        Actions action = new Actions(driver);
        action.moveToElement(myAccount2).build().perform();

        Thread.sleep(3000);
        wishList.click();
        return new WishListPage();

    }

}
