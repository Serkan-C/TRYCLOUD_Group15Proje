package com.tryCloud.step_definitions;

import com.tryCloud.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TalkModuleStepDefinitions {

    LoginPage loginPage=new LoginPage();

    @Given("the user is logged in")
    public void the_user_is_logged_in(){
        new LoginPage().login();
    }

    @When("User enters a valid username")
    public void user_enters_a_valid_username() { //1

    }
    @When("User enters valid password and clicks the Login button")
    public void user_enters_valid_password_and_clicks_the_login_button() { //1

    }
    @Then("User successfully login on the dashboard page and see all modules")
    public void user_successfully_login_on_the_dashboard_page_and_see_all_modules() { //1

    }

    @When("User clicks on Customize button")
    public void user_clicks_on_customize_button() { //2.1

    }
    @When("User can see the status widgets")
    public void user_can_see_the_status_widgets() { //2.1

    }
    @Then("User can select any of status widges")
    public void user_can_select_any_of_status_widges() { //2.1

    }
    @When("User can see the background images")
    public void user_can_see_the_background_images() { //2.2

    }
    @Then("User can select any of background images")
    public void user_can_select_any_of_background_images() { //2.2

    }
    @When("User can click on Set Status button")
    public void user_can_click_on_set_status_button() { //3

    }
    @When("User can see the Online status options")
    public void user_can_see_the_online_status_options() { //3

    }
    @Then("User can select any of status options")
    public void user_can_select_any_of_status_options() { //3

    }
    @When("User can see the Status messages")
    public void user_can_see_the_status_messages() { //3.1

    }
    @Then("User can select any of status messages")
    public void user_can_select_any_of_status_messages() { //3.1

    }
    @When("User can select any of Status messages and clicks on the Set status message button")
    public void user_can_select_any_of_status_messages_and_clicks_on_the_set_status_message_button() { //3.2

    }
    @Then("User clicks the Clear status message button")
    public void user_clicks_the_clear_status_message_button() { //3.2

    }
    @When("User is done with selections")
    public void user_is_done_with_selections() { //3.3

    }
    @Then("User can see selections on dashboard")
    public void user_can_see_selections_on_dashboard() { //3.3

    }

    @When("User can see the What's your status ? input box and click on it")
    public void user_can_see_the_what_s_your_status_input_box_and_click_on_it() { //4

    }
    @When("User can write any status in input box manually")
    public void user_can_write_any_status_in_input_box_manually() { //4

    }
    @Then("User can click the Set status message button and see the status on dashboard")
    public void user_can_click_the_set_status_message_button_and_see_the_status_on_dashboard() { //4

    }








}




