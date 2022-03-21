package com.cydeo.pages.webPageTask;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebLoginPage {


    public WebLoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);


    }


    @FindBy(xpath = "//input[@name = 'username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name = 'password']")
    public WebElement userPassword;


    @FindBy(xpath = "//button[. = 'Login']")
    public WebElement loginButton ;
}
