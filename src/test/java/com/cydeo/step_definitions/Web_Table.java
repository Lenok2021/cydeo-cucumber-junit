package com.cydeo.step_definitions;

import com.cydeo.pages.webPageTask.WebLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Web_Table {

    WebLoginPage webLoginPage = new WebLoginPage();


    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("webTableUrl"));

    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        webLoginPage.userName.sendKeys(string);
    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        webLoginPage.userPassword.sendKeys(string);
    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webLoginPage.loginButton.click();
    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {


    }


}
