package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='user-status-menu-item__header']")
    public WebElement usernameStatus;

    @FindBy(xpath = "//a[@class='edit-panels icon-rename']")
    public WebElement customizeButton;

    @FindBy(xpath = "//label[@class='icon-user-status-online']")
    public WebElement statusWidges;

    @FindBy(xpath = "//label[@class='icon-weather-status']")
    public WebElement weather;

    @FindBy(xpath = "//div[@class='background-selector']")
    public WebElement backgroundImage;

    @FindBy(xpath = "//button[@href ='#']")
    public WebElement setStatusButton;

    @FindBy(xpath = "//div[@class ='set-status-modal__header']")
    public WebElement onlineStatus;

    @FindBy(xpath = "//label[@class ='user-status-online-select__label icon-user-status-dnd']")
    public WebElement doNotDisturb;

    @FindBy(xpath = "//div[@class ='set-status-modal__header']")
    public WebElement statusMessageHeader;

    @FindBy(xpath = "//span[@class='predefined-status__message']")
    public WebElement statusMessage;

    @FindBy(xpath = "//button[@class='status-buttons__primary primary']")
    public WebElement setStatusMessage;

    @FindBy(xpath = "//button[@class='status-buttons__select']")
    public WebElement clearStatusMessage;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement ownStatus;







}