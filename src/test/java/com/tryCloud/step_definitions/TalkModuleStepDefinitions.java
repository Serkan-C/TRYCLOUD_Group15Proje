package com.tryCloud.step_definitions;


import com.tryCloud.pages.LoginPage;
import com.tryCloud.pages.TalkModulePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TalkModuleStepDefinitions {

    LoginPage loginPage=new LoginPage();
TalkModulePage talkModulePage=new TalkModulePage();
    @Given("the user is logged in")
    public void the_user_is_logged_in(){
        new LoginPage().login();
    }
    @Given("the user navigate the Talk Module and click")
    public void the_user_navigate_the_talk_module_and_click() {
        talkModulePage.TalkIcon.click();
    }
    @When("user click the Plus icon")
    public void user_click_the_plus_icon() {
    talkModulePage.plusIcon.click();
    }
    @When("user enter a conversation {string} and click  add participant")
    public void user_enter_a_conversation_and_click_add_participant(String name) {
    talkModulePage.conversationnameInputbox.sendKeys(name);
    talkModulePage.addParticipantsButton.click();
    }

    @Then("user add user from list and click Create conversation Button")
    public void user_add_user_from_list_and_click_create_conversation_button() {
        talkModulePage.addParticipants1.click();
        talkModulePage.addParticipants2.click();
        talkModulePage.createConversationButton.click();
        System.out.println(talkModulePage.conversationName.getText());


    }
    @Then("user created  {string} conversation and is on this conversation page")
    public void user_created_conversation_and_is_on_this_conversation_page(String name) {
        talkModulePage.conversationName.getText().equalsIgnoreCase(name);

    }
    @When("user select any conversation")
    public void user_select_any_conversation() {
   talkModulePage.cydeo2Conversation.click();
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



}


