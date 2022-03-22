package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {

   /*
This method will accept int (int seconds) and execute Thread.sleep
for given duration
 */

    public static void sleepMethod(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }

    public static void switchWindowAndVerify(String expectedInUrl, String expectedTitle) {
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowHandles) {

            Driver.getDriver().switchTo().window(each);

            System.out.println("Current URL " + Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));


    }

    /*
    This method accepts String "expectedTitle' and accepts if it is true
     */
    public static void verifyTitle(String expectedTitle) {

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), expectedTitle);

    }


    /**
     * This method will accept a String as expected value and verify actual URL CONTAINS the value.
     *
     * @param expectedInURL
     */
    public static void verifyURLContains(String expectedInURL) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInURL));
    }


    /**
     * When you located all options of DropDown (by using getAllOption method)
     * and you need to get text from each option and return it as a List<String>
     *
     * @param dropDownElement
     * @return
     */

    public static List<String> convertDropDownOptionsAsString(WebElement dropDownElement) {
        Select dropdown = new Select(dropDownElement);

        List<WebElement> actualOptionAsWebElement = dropdown.getOptions();

        // we created an empty List<String>
        //in order to store text from options
        List<String> actualOptionsAsString = new ArrayList<>();

        for (WebElement each : actualOptionAsWebElement) {

            String text = each.getText(); // get  text  of each option
            actualOptionsAsString.add(text);
        }
        return actualOptionsAsString;
    }


    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue) {

        for (WebElement each : radioButtons) {
            if (each.getAttribute("value").equals(attributeValue)) {
                each.click();
            }
        }


    }

}
