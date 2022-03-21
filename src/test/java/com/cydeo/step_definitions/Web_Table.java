package com.cydeo.step_definitions;

import com.cydeo.pages.webPageTask.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class Web_Table {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        String url = ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        webTableLoginPage.inputUsername.sendKeys(string);
    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        webTableLoginPage.inputPassword.sendKeys(string);
    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTableLoginPage.loginButton.click();
    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        BrowserUtils.verifyURLContains("orders");
    }

    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String pw) {

        webTableLoginPage.login(username, pw);

    }

    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String, String> credentials) {
     /*
     | username | Test   |
      | password | Tester |
     since we have in this format  we used Map
           */

      //  System.out.println("credentials.get(\"username\") = " + credentials.get("username"));
      //  System.out.println("credentials.get(\"password\") = " + credentials.get("password"));

        /**
         * we  used  method  get  from Map
         * get  method accepts key (username, password) and return the value(credentials)
         */
        webTableLoginPage.inputUsername.sendKeys(credentials.get("username"));
        webTableLoginPage.inputPassword.sendKeys(credentials.get("password"));
        webTableLoginPage.loginButton.click();

    }


}


