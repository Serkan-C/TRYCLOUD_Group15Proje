package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkModulePage {
    public TalkModulePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[5]")
    public WebElement TalkIcon;

    @FindBy(xpath = "//button[@class='toggle has-tooltip']")
    public WebElement plusIcon;

    @FindBy(xpath = "//input[@ class='conversation-name']")
    public WebElement conversationnameInputbox;
    @FindBy(xpath = "    //*[@id=\"body-user\"]/div[6]/div[2]/div/div/div[1]/div/div[2]/div[1]/ul/li[2]/div[2]/div\n")
    public WebElement addParticipants1;


    @FindBy(xpath = "//*[@id=\"body-user\"]/div[6]/div[2]/div/div/div[1]/div/div[3]/div[1]/ul/li[3]")
    public WebElement addParticipants2;


    @FindBy(xpath = "//button[@ class='navigation__button navigation__button-right primary']")
    public WebElement addParticipantsButton;


    @FindBy(xpath = "//button[@ class='navigation__button navigation__button-right primary']")
    public WebElement createConversationButton;


    @FindBy(xpath = "//*[@id=\"app-sidebar\"]/header/div/div/div[2]/h2")
    public WebElement conversationName;

}
