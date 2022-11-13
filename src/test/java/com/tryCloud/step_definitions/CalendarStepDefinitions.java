package com.tryCloud.step_definitions;

import com.tryCloud.pages.CalendarPage;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalendarStepDefinitions {

    CalendarPage calendarPage = new CalendarPage(); // object

    @When("user clicks on Calendar icon")
    public void user_clicks_on_calendar_icon() {
    calendarPage.calendarIcon.click();
    }

    @When("user clicks on change calendar view button")
    public void user_clicks_on_change_calendar_view_button() {
    calendarPage.calendarViewButton.click();

    }
    @When("user clicks on day view button")
    public void user_clicks_on_day_view_button() {
        calendarPage.dayViewButton.click();
    }
    @Then("user can see dayly calendar view")
    public void user_can_see_dayly_calendar_view() {
        String currentUrl =  Driver.getDriver().getCurrentUrl();
        String timeGridDay = "timeGridDay";
        Assert.assertTrue(currentUrl.contains(timeGridDay));
    }
    @When("user clicks on week view button")
    public void user_clicks_on_week_view_button() {
      calendarPage.weekViewButton.click();
    }
    @Then("user can see weekly calendar view")
    public void user_can_see_weekly_calendar_view() {
    String currentUrl = Driver.getDriver().getCurrentUrl();
    Assert.assertTrue(currentUrl.contains("timeGridWeek"));
    }
    @When("user clicks on month view button")
    public void user_clicks_on_month_view_button() {
      calendarPage.monthViewButton.click();
    }
    @Then("user can see monthly calendar view")
    public void user_can_see_monthly_calendar_view() {
       String currentUrl = Driver.getDriver().getCurrentUrl();
       Assert.assertTrue(currentUrl.contains("dayGridMonth"));
    }


}
