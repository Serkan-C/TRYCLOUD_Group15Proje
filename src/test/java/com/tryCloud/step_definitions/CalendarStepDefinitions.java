package com.tryCloud.step_definitions;

import com.tryCloud.pages.CalendarPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalendarStepDefinitions {

    CalendarPage calendarPage = new CalendarPage(); // object

    @When("user clicks on Calendar icon")
    public void user_clicks_on_calendar_icon() {
    calendarPage.calendarIcon.click();
    }
    @When("user clicks on change calendar view button")
    public void user_clicks_on_change_calendar_view_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks on day view button")
    public void user_clicks_on_day_view_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user can see dayly calendar view")
    public void user_can_see_dayly_calendar_view() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks on week view button")
    public void user_clicks_on_week_view_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user can see weekly calendar view")
    public void user_can_see_weekly_calendar_view() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks on month view button")
    public void user_clicks_on_month_view_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user can see monthly calendar view")
    public void user_can_see_monthly_calendar_view() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
