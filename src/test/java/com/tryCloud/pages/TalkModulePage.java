package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkModulePage extends BasePage {


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



    @FindBy(xpath = "//*[@id=\"conversation_2zfcwghf\"]/div[2]/div[1]/span[1]")
    public WebElement cydeo2Conversation;

    @FindBy(xpath = "//*[@id=\"participants\"]")
    public WebElement paricipantIcon;
@FindBy (xpath = "//*[@class='set-contacts__input']")
public WebElement searchParticipant;

    @FindBy(xpath = "//*[@id=\"tab-participants\"]/div/form/input")
    public WebElement addParticipantInputbox;

    @FindBy(xpath = "//*[@id=\"tab-participants\"]/div/div[2]/div/ul/li/div[2]/div/span")
    public WebElement participantEmployee100;
    @FindBy(xpath = "//*[@id=\"tab-participants\"]/div/div/ul/li[7]/div[2]/div/span")
    public WebElement addedParticipantEmployee100;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/a")
    public WebElement menuButton;
//*[@id="app-content-vue"]/div/div[1]/button

    @FindBy(xpath = "//*[@class=\"icon icon-start-call\"]")
    public WebElement startCallButton;

    @FindBy(xpath = "//*[@class='icon icon-leave-call']")
    public WebElement leaveCallButton;

    @FindBy(xpath = "//span[contains(.,'Delete conversation')]")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[@class='oc-dialog-buttonrow twobuttons']/button[2]")
    public WebElement yesButton;

    @FindBy(xpath = "//span[contains(.,'Promote to moderator')]")
    public WebElement promoteModerator;

}
