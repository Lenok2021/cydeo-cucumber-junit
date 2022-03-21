package com.cydeo.step_definitions;

import com.cydeo.pages.DropDownsPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropdownStep_Definitions {

    DropDownsPage dropDownsPage = new DropDownsPage();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("http://practice.cydeo.com/dropdown");

    }

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonth) {


        Select dropdown = new Select(dropDownsPage.dropdown);

        /**
         * we have a conflict here because we have
         * a List<WebElement> and List<String> expectedMonth
         *   we need  to create an empty List<String>
         *     get text from WebElements and assign it back
         *     empty List<String>
         *
         */
        List<WebElement> listActualMonth = dropdown.getOptions();

        // we created an empty List<String>
        //in order to store text from options
        List<String> listNew = new ArrayList<>();

        for (WebElement each : listActualMonth) {

            String text = each.getText(); // get  text  of each option
            listNew.add(text);
        }
        Assert.assertEquals(expectedMonth, listNew);
        // Assert, will  check the size first
        // If it is matching it will check content 1 by 1

    }


}
