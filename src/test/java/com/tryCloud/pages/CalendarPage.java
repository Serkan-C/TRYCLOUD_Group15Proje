package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {

    public CalendarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[9]/a")
    public WebElement calendarIcon;

    @FindBy(xpath ="(//*[contains(@class, 'icon action-item__menutoggle')])[1]")
    public WebElement calendarViewButton;

    @FindBy(xpath = "(//*[@class = 'action-button__text'])[5]")
    public WebElement dayViewButton;


    @FindBy(xpath = "//*[@class = 'action-button__icon icon-view-week']")
    public  WebElement weekViewButton;

    @FindBy(xpath = "(//*[@class = 'action-button__text'])[7]")
    public WebElement monthViewButton;

    @FindBy(xpath = "//*[@class = 'button primary new-event']")
    public WebElement newEventButton;

    @FindBy(xpath = "//*[@placeholder = 'Event title']")
    public WebElement inputBoxNewEvent;

    @FindBy(xpath = "//*[contains(text(),'Save')]")
            public WebElement saveButton;

    @FindBy(xpath = "//*[contains(text(),'dr Date')]")
    public WebElement event;

    @FindBy(xpath = "//div[@class = 'event-popover__buttons']//*[contains(text(),'More')]")
    public WebElement moreOptionButton;

    @FindBy(xpath = "//*[@class = 'action-item app-sidebar-header__menu']//button")
    public WebElement threeDotsButton;

    @FindBy(xpath = "//*[@class = 'action active']")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[@placeholder = 'Search or add categories']")
    public WebElement searchOrAddCategoriesButton;

    @FindBy(xpath = "//*[@class = 'property-select-multiple-colored-tag']")
    public WebElement Category;

   @FindBy(xpath = "//section[@id = 'tab-app-sidebar-tab-details']//*[contains(text(),'Update')]")
    public WebElement updateButton;

}