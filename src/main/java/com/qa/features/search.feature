Feature: www.n11.com Web Applications Test

  Scenario: Login to App and See Favourite Product

    When User is on Home Page
    Then Go to the Login Page
    Then User enters username and password and click button
    And User is on logged in Home Page
    When User enter the search box Iphone
    Then User click the search button
    And User see the results are related to Iphone
    Then User open the second page
    And User add the third product on my favourite
    When User go to favourite page
    Then User remove the product which is added before
    And  User is logged out