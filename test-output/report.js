$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/FARUK/IdeaProjects/WebApp/src/main/java/com/qa/features/search.feature");
formatter.feature({
  "line": 1,
  "name": "www.n11.com Web Applications Test",
  "description": "",
  "id": "www.n11.com-web-applications-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6103171247,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login to App and See Favourite Product",
  "description": "",
  "id": "www.n11.com-web-applications-test;login-to-app-and-see-favourite-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Home Page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Go to the Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User enters username and password and click button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User is on logged in Home Page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enter the search box Iphone",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User click the search button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User see the results are related to Iphone",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User open the second page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User add the third product on my favourite",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User go to favourite page",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User remove the product which is added before",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User is logged out",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.user_is_home_page()"
});
formatter.result({
  "duration": 133401971,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.go_to_the_login_page()"
});
formatter.result({
  "duration": 820715594,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.user_enters_username_and_password_and_click_button()"
});
formatter.result({
  "duration": 1926486725,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.user_is_on_logged_in_home_page()"
});
formatter.result({
  "duration": 23299247,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.user_enter_the_Search_box_Iphone()"
});
formatter.result({
  "duration": 38366144,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.user_click_the_Search_button()"
});
formatter.result({
  "duration": 3179693913,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.user_See_the_results_are_related_to_iphone()"
});
formatter.result({
  "duration": 67576579,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.user_open_the_second_page()"
});
formatter.result({
  "duration": 10313548522,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.user_add_the_third_product_on_my_favourite()"
});
formatter.result({
  "duration": 309283246,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.user_go_to_favourite_page()"
});
formatter.result({
  "duration": 6440604290,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: Element \u003ca href\u003d\"https://www.n11.com/hesabim/istek-listelerim\"\u003e could not be scrolled into view\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027LAPTOP-4IMRSHDL\u0027, ip: \u0027192.168.65.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{moz:profile\u003dC:\\Users\\FARUK\\AppData\\Local\\Temp\\rust_mozprofile.yPykAR6oA4Pp, rotatable\u003dfalse, moz:geckodriverVersion\u003d0.23.0, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003ddismiss and notify, strictFileInteractability\u003dfalse, moz:headless\u003dfalse, platform\u003dXP, moz:accessibilityChecks\u003dfalse, moz:useNonSpecCompliantPointerOrigin\u003dfalse, acceptInsecureCerts\u003dfalse, browserVersion\u003d65.0, moz:shutdownTimeout\u003d60000, platformVersion\u003d10.0, moz:processID\u003d6336, browserName\u003dfirefox, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, moz:webdriverClick\u003dtrue}]\nSession ID: 8e8b27eb-4d70-4c46-9f0f-df1ee1661d5c\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:185)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:275)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:82)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat com.qa.pages.HomePage.setPageUp(HomePage.java:108)\r\n\tat com.qa.stepDefinitions.SearchSteps.user_go_to_favourite_page(SearchSteps.java:141)\r\n\tat ✽.When User go to favourite page(/Users/FARUK/IdeaProjects/WebApp/src/main/java/com/qa/features/search.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SearchSteps.user_remove_the_product_which_is_adding_before()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SearchSteps.user_is_logged_out()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 889984000,
  "status": "passed"
});
});