package com.tryCloud.step_definitions;

import com.tryCloud.pages.CalendarPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

    @When("user clicks on new Event Button")
    public void user_clicks_on_new_event_button() {
        calendarPage.newEventButton.click();
    }
    @When("user writes new Event")
    public void user_writes_new_event() {
        calendarPage.inputBoxNewEvent.sendKeys("dr Date");
    }
    @When("user clicks save Button")
    public void user_clicks_save_button() {
        calendarPage.saveButton.click();
    }
    @Then("user can see new Event in the Monthly Calendar view")
    public void user_can_see_new_event_in_the_monthly_calendar_view() {
        Assert.assertTrue(calendarPage.event.isDisplayed());

    }
    @When("user clicks on an event")
    public void user_clicks_on_an_event() {
        calendarPage.event.click();
    }
    @When("user clicks more option Button")
    public void user_clicks_more_option_button() {
        BrowserUtils.sleep(1);
        calendarPage.moreOptionButton.click();
    }
    @When("user clicks on three dots Button")
    public void user_clicks_on_three_dots_button() {
       calendarPage.threeDotsButton.click();

    }
    @When("user clicks delete Button")
    public void user_clicks_delete_button() {
        calendarPage.deleteButton.click();
    }

    @And("user writes {string}")
    public void userWrites(String eventName) {
        calendarPage.inputBoxNewEvent.sendKeys(eventName);

    }

    @Then("user can see {string} in the Monthly Calendar view")
    public void userCanSeeInTheMonthlyCalendarView(String eventName) {
        String xpath = "//*[contains(text(),'"+eventName+"')]";
        WebElement event1 = Driver.getDriver().findElement(By.xpath(xpath));
        Assert.assertTrue(event1.isDisplayed());

    }

    @When("user clicks on {string}")
    public void userClicksOn(String event) {
        BrowserUtils.sleep(1);
        String xpath = "//*[contains(text(),'"+event+"')]";
        WebElement event1 = Driver.getDriver().findElement(By.xpath(xpath));
        event1.click();
    }

    @Then("user can delete any {string}")
    public void userCanDeleteAny(String event) {
    String xpath = "//*[contains(text(), '"+event+"']";
    Assert.assertTrue(calendarPage.event.isDisplayed());

    }

    @And("user clicks on Search or add Categories Button")
    public void userClicksOnSearchOrAddCategoriesButton() {
        BrowserUtils.sleep(1);
        calendarPage.searchOrAddCategoriesButton.click();

    }

    @And("user clicks one {string} from Category")
    public void userClicksOne(String categoryName) {
        BrowserUtils.sleep(1);
        String xpath = "(//div[@class = 'multiselect__content-wrapper']//span[contains(.,'"+categoryName+"')])[3]";
        WebElement category= Driver.getDriver().findElement(By.xpath(xpath));
        category.click();
    }

    @And("user clicks Update Button")
    public void userClicksUpdateButton() {
        BrowserUtils.sleep(1);
        calendarPage.updateButton.click();

    }

    @Then("user see updated {string}")
    public void userSeeUpdated(String Holiday) {
        BrowserUtils.sleep(1);
        String xpath = "//span[@class = 'multiselect__tag']//span[text()='Holiday']";
        WebElement updatedCategory = Driver.getDriver().findElement(By.xpath(xpath));
        Assert.assertTrue(updatedCategory.isDisplayed());

    }
}