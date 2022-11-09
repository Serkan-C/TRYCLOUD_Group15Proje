package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeckPage {

    public DeckPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id ='appmenu']//li[@data-id='deck']")
    public WebElement decksIcon;

    @FindBy(xpath = "//*[@class='app-navigation-toggle']")
    public WebElement app_deck_navigation_button;

    @FindBy(xpath = "//*[@title='Add board']/../..")
    public WebElement addBoardButton;

    @FindBy(xpath = "//*[@class='icon-confirm']")
    public WebElement confirmButton;


    @FindBy(xpath = "(//*[@class='icon-confirm']/../input)[1]")
    public WebElement inputAddBoard;

    @FindBy(xpath = "//h2")
    public WebElement boardTitle;

    @FindBy(xpath = "//*[@id='stack-add']")
    public WebElement addListButton;

    @FindBy(xpath = "//*[@id='stack-add']//*[@type='text']")
    public WebElement inputAddList;

    @FindBy(xpath = "//*[@id='stack-add']//*[@type='submit']")
    public WebElement confirmAddListButton;
}
