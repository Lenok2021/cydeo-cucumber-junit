package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.OrderPage;
import com.cydeo.pages.webPageTask.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;

public class OrderStep_definitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    BasePage basePage = new BasePage();
    OrderPage orderPage = new OrderPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {

        //getting the page URL  by using  test data from Configuration of Properties file
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));

        // calling logIn method
        webTableLoginPage.login();

        // clicking to "order" link to go to order page
        basePage.order.click();
    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
        Select dropDown = new Select(orderPage.productDropDown);
        dropDown.selectByVisibleText(string);


    }

    @When("user enters quantity {string}")
    public void user_enters_quantity(String quantity) {
        actions.moveToElement(orderPage.inpoutQuantity).click()
                .pause(2).sendKeys(Keys.BACK_SPACE)
                .sendKeys(quantity).perform();
        actions.moveToElement(orderPage.calculateButton).click().perform();

    }

    @When("user enters costumer name {string}")
    public void user_enters_costumer_name(String customerName) {
        actions.moveToElement(orderPage.inputName).click().sendKeys(customerName).perform();
    }

    @When("user enters street {string}")
    public void user_enters_street(String street) {
        actions.moveToElement(orderPage.inputStreet).click().sendKeys(street).perform();
    }

    @When("user enters city {string}")
    public void user_enters_city(String city) {
        actions.moveToElement(orderPage.inputCity).click().sendKeys(city).perform();
    }

    @When("user enters state {string}")
    public void user_enters_state(String state) {
        actions.moveToElement(orderPage.inputState).click().sendKeys(state).perform();
    }

    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String zip) {
        actions.moveToElement(orderPage.inputZip).click().sendKeys(zip).perform();
    }

    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {

        String actualNameOfCard = orderPage.masterCard.getAttribute("value");
        Assert.assertTrue(orderPage.masterCard.isDisplayed());
        Assert.assertTrue(actualNameOfCard.equals(string));
        orderPage.masterCard.click();
        Assert.assertTrue(orderPage.masterCard.isSelected());

    }

    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String cardNumber) {

        actions.moveToElement(orderPage.cardNumber).click().sendKeys(cardNumber).perform();
    }

    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String expirationDate) {
        actions.moveToElement(orderPage.expirationCard).click().sendKeys(expirationDate).perform();
    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {
    actions.moveToElement(orderPage.processButton).click().perform();
    }

    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {
        String actualCustomerName = orderPage.confirmationOrderName.getText();
        Assert.assertTrue(actualCustomerName.equals(string));


    }


}
