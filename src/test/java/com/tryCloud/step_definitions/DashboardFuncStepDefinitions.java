package com.tryCloud.step_definitions;

import com.tryCloud.pages.DashboardPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DashboardFuncStepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();



    @When("User access the dashboard successfully")
    public void user_access_the_dashboard_successfully() { //1
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard") );

    }
    @Then("User can see all modules and Username after login")
    public void user_can_see_all_modules_and_username_after_login() { //1
    //Assert.assertTrue(dashboardPage.usernameStatus.isDisplayed());
    System.out.println("User can see all modules and Username after login"); //check it out later


    }

    @When("User clicks on Customize button")
    public void user_clicks_on_customize_button() { //2.1
    dashboardPage.customizeButton.click();


    }
    @When("User can see the status widgets")
    public void user_can_see_the_status_widgets() { //2.1
    Assert.assertTrue(dashboardPage.statusWidges.isDisplayed());


    }
    @Then("User can select any of them")
    public void userCanSelectAnyOfThem() { //2.1
    Assert.assertTrue(dashboardPage.weather.isDisplayed());

    }
    @When("User can see the background images")
    public void user_can_see_the_background_images() { //2.2
    Assert.assertTrue(dashboardPage.backgroundImage.isDisplayed());

    }
    @Then("User can select any of background images")
    public void user_can_select_any_of_background_images() { //2.2
    Assert.assertTrue(dashboardPage.backgroundImage.isDisplayed());

    }
    @When("User can click on Set Status button")
    public void user_can_click_on_set_status_button() { //3
    dashboardPage.setStatusButton.click();

    }
    @When("User can see the Online status options")
    public void user_can_see_the_online_status_options() { //3
    Assert.assertTrue(dashboardPage.onlineStatus.isDisplayed());


    }
    @Then("User can select any of status options")
    public void user_can_select_any_of_status_options() { //3
    Assert.assertTrue(dashboardPage.doNotDisturb.isDisplayed());


    }
    @When("User can see the Status messages")
    public void user_can_see_the_status_messages() { //3.1
    dashboardPage.statusMessageHeader.isDisplayed();

    }
    @Then("User can select any of status messages")
    public void user_can_select_any_of_status_messages() { //3.1
    dashboardPage.statusMessage.isDisplayed();


    }
    @When("User can select any of Status messages and clicks on the Set status message button")
    public void user_can_select_any_of_status_messages_and_clicks_on_the_set_status_message_button() { //3.2
    dashboardPage.statusMessage.isSelected();
    dashboardPage.setStatusMessage.click();

    }
    @Then("User clicks the Clear status message button")
    public void user_clicks_the_clear_status_message_button() { //3.2
    dashboardPage.clearStatusMessage.click();

    }
    @When("User is done with selections")
    public void user_is_done_with_selections() { //3.3
        System.out.println("User is done with selections");

    }
    @Then("User can see selections on dashboard")
    public void user_can_see_selections_on_dashboard() { //3.3 //check it out !!


    }

    @When("User can see the What's your status ? input box")
    public void userCanSeeTheWhatSYourStatusInputBox() { //4

    }




    @And("User can write any {string} in input box manually")
    public void userCanWriteAnyInInputBoxManually(String string) { //4



    }

    @Then("User can click the Set status message button and see the status on dashboard")
    public void user_can_click_the_set_status_message_button_and_see_the_status_on_dashboard() { //4
   //check again !!!

    }



}




