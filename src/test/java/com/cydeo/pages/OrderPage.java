package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage  extends BasePage{

    public OrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(name = "product")
    public WebElement productDropDown;

    @FindBy(name = "quantity")
    public WebElement inpoutQuantity ;

    @FindBy(name = "name")
    public WebElement inputName ;


    @FindBy(name = "street")
    public WebElement inputStreet ;

    @FindBy(name = "city")
    public WebElement inputCity ;

    @FindBy(name = "state")
    public WebElement inputState ;

    @FindBy(name = "zip")
    public WebElement inputZip ;

    @FindBy(xpath = "//button[. = 'Calculate']")
    public WebElement calculateButton;

    @FindBy(xpath = "//input[@value = 'MasterCard']")
    public WebElement masterCard ;

    @FindBy(name = "cardNo")
    public WebElement cardNumber ;

    @FindBy(name = "cardExp")
    public WebElement expirationCard ;

    @FindBy(xpath = "//button[. = 'Process Order']")
    public WebElement processButton ;

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public WebElement confirmationOrderName;

    @FindBy(name = "card")
    public List< WebElement> cardTypes;





}
