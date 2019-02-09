package com.qa.stepDefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.WishListPage;
import com.qa.util.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import java.awt.*;
import java.awt.event.KeyEvent;

public class SearchSteps extends TestBase {

    private static final Logger log = Logger.getLogger(SearchSteps.class);
    HomePage homePage;
    HomePage homePageLoggedIn;
    LoginPage loginPage;
    WishListPage wishListPage;

    @Before
    public void setUP() {

        TestBase.initialization();


    }

    @After
    public void tearDown() {
        driver.close();

    }

    @When("^User is on Home Page$")
    public void user_is_home_page() {

        //This is optional
      /*  String URL = driver.getCurrentUrl();

        String expectedURL = "https://www.n11.com/";

        Assert.assertEquals(expectedURL, URL);*/

        homePage = new HomePage();

        Assert.assertEquals("alışverişin uğurlu adresi", homePage.getMotto());
        log.info("*************************** ---HOMEPAGE--- **************************************");

    }

    @Then("^Go to the Login Page$")
    public void go_to_the_login_page() {

        homePage.goToLoginPage();

        loginPage = new LoginPage();

        //Assert.assertEquals("https://www.n11.com/giris-yap", loginPage.getURL());
        log.info("*************************** ---LOGINPAGE--- **************************************");

        Assert.assertEquals("Giriş Yap", loginPage.getloginWarning());


    }


    @Then("^User enters username and password and click button$")
    public void user_enters_username_and_password_and_click_button() throws InterruptedException {

        homePageLoggedIn = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));

    }

    @And("^User is on logged in Home Page$")
    public void user_is_on_logged_in_home_page() {


        Assert.assertEquals("faruk akyol", homePageLoggedIn.getUserName());
        log.info("*************************** ---HOMEPAGEASLOGGED--- **************************************");
    }


    @When("^User enter the search box Iphone$")
    public void user_enter_the_Search_box_Iphone() {

        homePageLoggedIn.setData();
    }

    @Then("^User click the search button$")
    public void user_click_the_Search_button() {

        homePageLoggedIn.searchData();

    }

    @And("^User see the results are related to Iphone$")
    public void user_See_the_results_are_related_to_iphone() throws InterruptedException {

        Assert.assertEquals("Iphone", homePageLoggedIn.getInfoProduct());
        log.info("*************************** ---IPHONEPRODUCTRESULTS--- **************************************");


    }

    @Then("^User open the second page$")
    public void user_open_the_second_page() throws InterruptedException, AWTException {


        homePageLoggedIn.setPageNumber();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        log.info("*************************** ---SECONDRESULTPAGE--- **************************************");

        //This is related to array Index.Expectesion is 2.
        Assert.assertEquals("3", homePageLoggedIn.getPageNumberInfo());

        Thread.sleep(10000);
    }

    @And("^User add the third product on my favourite$")
    public void user_add_the_third_product_on_my_favourite() {

        homePageLoggedIn.selectThirdProduct();
        log.info("*************************** ---ADDTHIRDPRODUCTONFAVOURITE--- **************************************");

    }


    @When("^User go to favourite page$")
    public void user_go_to_favourite_page() throws InterruptedException {

        wishListPage = homePageLoggedIn.setPageUp();

        Assert.assertEquals("Favorilerim (1)", wishListPage.getFavouriteName());

        log.info("*************************** ---WISHLISTPAGE--- **************************************");

    }

    @Then("^User remove the product which is added before$")
    public void user_remove_the_product_which_is_adding_before() throws InterruptedException {


        wishListPage.goToMyFavourite();
        wishListPage.removeProduct();

        Thread.sleep(3000);

        Assert.assertEquals("Ürününüz listeden silindi.", wishListPage.getPopUpInfo());
        log.info("*************************** ---REMOVEDPRODUCT--- **************************************");

        wishListPage.setSubmitButton();


    }

    @And("^User is logged out$")
    public void user_is_logged_out() throws InterruptedException {

        wishListPage.logOut();
        Thread.sleep(3000);

        log.info("*************************** ---LOGOUT--- **************************************");
    }

}
