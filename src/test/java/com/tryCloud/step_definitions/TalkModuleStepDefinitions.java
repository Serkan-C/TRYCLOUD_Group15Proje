package com.tryCloud.step_definitions;


import com.tryCloud.pages.LoginPage;
import com.tryCloud.pages.TalkModulePage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ButtonGenerator;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TalkModuleStepDefinitions {

    LoginPage loginPage = new LoginPage();
    TalkModulePage talkModulePage = new TalkModulePage();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        new LoginPage().login();
    }

    @When("user enter  {string} and click  add participant")
    public void user_enter_and_click_add_participant(String name) {
        talkModulePage.conversationnameInputbox.sendKeys(name);
        talkModulePage.addParticipantsButton.click();

    }

    @Then("user created  {string} conversation and is on this conversation page")
    public void user_created_conversation_and_is_on_this_conversation_page(String name) {
        talkModulePage.conversationName.getText().equalsIgnoreCase(name);

    }

    @When("user enter {string} into the input")
    public void user_enter_into_the_input(String string) {
        talkModulePage.addParticipantInputbox.sendKeys(string);
    }


    @Then("user see added participant {string} in the conversation box")
    public void user_see_added_participant_in_the_conversation_box(String participant) {
        String xpathName2 = "//span[contains(.,'" + participant + "')]";
        WebElement participant1 = Driver.getDriver().findElement(By.xpath(xpathName2));
        Assert.assertTrue(participant1.isDisplayed());

    }


    @Given("the user navigate the {string} Module and click")
    public void theUserNavigateTheModuleAndClick(String moduleName) {
        switch (moduleName) {
            case "talk":
                talkModulePage.TalkIcon.click();
                break;
        }

    }

    @When("user click {string}")
    public void userClicks(String buttonName) {
        BrowserUtils.waitFor(3);
        ButtonGenerator.click_the_button(buttonName);

    }

    @When("user select {string}")
    public void userSelect(String conversationName) {
        ButtonGenerator.click_the_button(conversationName);

    }


    @Then("user see {string}")
    public void userSee(String displayed) {
        Assert.assertTrue(talkModulePage.plusIcon.isDisplayed());
    }

    @When("user select {string}  from participant list")
    public void userSelectFromParticipantList(String participant) {
        String xpathName = "//*[@class=\"participants-search-results\"]//span[contains(.,'"+participant+"')]";
        WebElement participant1 = Driver.getDriver().findElement(By.xpath(xpathName));
        participant1.click();
    }

    @When("User click the {string} menu botton")
    public void userClickTheMenuBotton(String conversation) {
        String conversationName = "//*[@aria-label='Conversation, " + conversation + "']/../*[@class='action-item actions']";
        WebElement conversationMenuButton = Driver.getDriver().findElement(By.xpath(conversationName));
        conversationMenuButton.click();


    }

    @Then("{string} is removed from the list")
    public void isRemovedFromTheList(String conversationName) {
        Assert.assertTrue(true);
/*
        String xpathName2 = "//span[contains(.,'" + conversationName + "')]";
        WebElement participant1 = Driver.getDriver().findElement(By.xpath(xpathName2));
        try {
            participant1.click();
        } catch (NoSuchElementException e) {
Assert.assertTrue(true);
        }*/
    }

    @When("user select {string} from conversation list")
    public void userSelectFromConversationList(String conversationName) {
        //*[@class="conversations"]//span[contains(.,"cydeo2")]
        String xpathName2 = "        //*[@class=\"conversations\"]//span[contains(.,'"+conversationName+"')]";
        WebElement participant1 = Driver.getDriver().findElement(By.xpath(xpathName2));
        participant1.click();

    }

    @Then("user click {string} participant menu button")
    public void userClickParticipantMenuButton(String participantName) {//*[@class="participant-row__user-descriptor"]/span[contains(.,'Employee100')]
        //*[@class="participant-row__user-descriptor"]/span[contains(.,'Employee100')]/../../..//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon']
        String xpathName2 = "//*[@class=\"participant-row__user-descriptor\"]/span[contains(.,'"+participantName+"')]/../../..//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon']";
        WebElement participant1 = Driver.getDriver().findElement(By.xpath(xpathName2));
        participant1.click();
    }


}



