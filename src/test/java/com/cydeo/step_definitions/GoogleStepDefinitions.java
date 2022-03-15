package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleStepDefinitions {

    @When("user is on the search page")
    public void user_is_on_the_search_page() {

        Driver.getDriver().get("https://www.google.com");


    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {


        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

        Driver.closeDriver();


    }





}
