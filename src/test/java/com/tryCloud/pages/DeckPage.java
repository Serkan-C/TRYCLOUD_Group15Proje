package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeckPage extends BasePage{



    @FindBy(xpath = "//ul[@id ='appmenu']//li[@data-id='deck']")
    public WebElement decksIcon;

    @FindBy(xpath = "//*[@class='app-navigation-toggle']")
    public WebElement app_deck_navigation_button;

    @FindBy(xpath = "//*[@title='Add board']/../..")
    public WebElement addBoardButton;

    @FindBy(xpath = "//*[@class='icon-confirm']")
    public WebElement confirmNewBoard;


    @FindBy(xpath = "//*[@*='text']")
    public WebElement inputAddBoard;

    @FindBy(xpath = "//*[@*='board-title']//h2")
    public WebElement boardTitle;

    @FindBy(xpath = "//*[@id='stack-add']")
    public WebElement addListButton;

    @FindBy(xpath = "//*[@id='stack-add']//*[@type='text']")
    public WebElement inputAddList;

    @FindBy(xpath = "//*[@id='stack-add']//*[@type='submit']")
    public WebElement confirmAddListButton;

    @FindBy(xpath = "//*[text()='Assign to me']")
    public WebElement assignToMeButton;

    @FindBy(xpath = "//*[text()='Move card']")
    public WebElement moveCardButton;

    @FindBy(xpath = "//*[contains(text(),'Select a board')]/..")
    public WebElement selectAboard;

    @FindBy(xpath = "//*[contains(text(),'Select a list')]/..")
    public WebElement selectAlist;

    @FindBy(xpath = "//button[contains(.,'Move card')]")
    public WebElement confirmMoveCardButton;

    @FindBy(xpath = "//*[contains(text(),'Assign a tag to this card…')]/..")
    public WebElement inputBoxTag;
}
