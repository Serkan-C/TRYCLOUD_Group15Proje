package com.tryCloud.step_definitions;


import com.tryCloud.pages.LoginPage;
import com.tryCloud.pages.TalkModulePage;
import com.tryCloud.utilities.ButtonGenerator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class TalkModuleStepDefinitions {

    LoginPage loginPage = new LoginPage();
    TalkModulePage talkModulePage = new TalkModulePage();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        new LoginPage().login();
    }

    @When("user enter a conversation {string} and click  add participant")
    public void user_enter_a_conversation_and_click_add_participant(String name) {
        talkModulePage.conversationnameInputbox.sendKeys(name);
        talkModulePage.addParticipantsButton.click();
    }


    @Then("user created  {string} conversation and is on this conversation page")
    public void user_created_conversation_and_is_on_this_conversation_page(String name) {
        talkModulePage.conversationName.getText().equalsIgnoreCase(name);

    }

    @When("user click participant Icon")
    public void user_click_participant_icon() {
        talkModulePage.paricipantIcon.click();
    }

    @When("user enter {string} into the input")
    public void user_enter_into_the_input(String string) {
        talkModulePage.addParticipantInputbox.sendKeys(string);
    }

    @When("user click the {string} under the  Add User Text")
    public void user_click_the_under_the_add_user_text(String string) {
        talkModulePage.participantEmployee100.click();
    }

    @Then("user see added participant {string} in the conversation box")
    public void user_see_added_participant_in_the_conversation_box(String string) {
        Assert.assertTrue(talkModulePage.addedParticipantEmployee100.isDisplayed());
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
        ButtonGenerator.click_the_button(buttonName);

    }

    @When("user select {string}")
    public void userSelect(String conversationName) {
        ButtonGenerator.click_the_button(conversationName);

    }

    @Then("user add {string} from list")
    public void userAddFromList(String user) {
        talkModulePage.addParticipants1.click();
        talkModulePage.addParticipants2.click();

    }

    @Then("user see {string}")
    public void userSee(String displayed) {
        Assert.assertTrue(talkModulePage.plusIcon.isDisplayed());
    }
}


