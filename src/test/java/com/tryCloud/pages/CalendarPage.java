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



}
