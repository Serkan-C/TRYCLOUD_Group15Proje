package com.tryCloud.step_definitions;

import com.tryCloud.pages.ContactsPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ButtonGenerator;
import com.tryCloud.utilities.InbutBoxGenerator;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.tryCloud.utilities.BrowserUtils.sleep;

public class ContactsFunctionality_StepDefinitions {

    ContactsPage contactsPage = new ContactsPage();

    @When("User clicks Contacts icon on Dashboard page")
    public void user_clicks_contacts_icon_on_dashboard_page() {
        contactsPage.Contacts_button.click();
    }

    @When("User is on contacts page")
    public void user_is_on_contacts_page() {
        Assert.assertEquals("Contacts - Trycloud QA",Driver.getDriver().getTitle());
        //Contacts - Trycloud QA
    }

    @Given("User clicks {string} button.")
    public void user_clicks_button(String string) {

        ButtonGenerator.click_the_button(string);
    }

    @When("User enters  {string} in {string}.")
    public void user_enters_in(String string, String string2) {
        //contactsPage.NewContact_CompanyBox.click();
        InbutBoxGenerator.pass_the_value(string, string2);
    }
    @Then("User should see {string} and {string} in the All contacts list.")
    public void user_should_see_and_in_the_all_contacts_list(String name, String surname) {

        System.out.println(contactsPage.ContactsList.getAttribute("innerText"));
        Assert.assertTrue(contactsPage.ContactsList.getAttribute("innerText").contains(name.toLowerCase()));
        //System.out.println(contactsPage.ContactsList.getAttribute("childElementCount"));


    }

    @When("User returns dashboard page.")
    public void user_returns_dashboard_page() {
        contactsPage.TryCloud_Icon.click();
    }
    @When("User logs out")
    public void user_logs_out() {
        contactsPage.AccountMenuToggle.click();
        contactsPage.LogOut.click();
    }

    @When("User waits {string} seconds.")
    public void user_waits_seconds(String string) {
        sleep(Integer.valueOf(string));
    }

    @Given("User should see that number of cantacts are equal to given total number.")
    public void user_should_see_that_number_of_cantacts_are_equal_to_given_total_number() {

        String a = contactsPage.TotalNumberContact.getText();
        System.out.println("a = " + a);
        String b = String.valueOf(contactsPage.ContactsList_items.getAttribute("childElementCount"));
        System.out.println("b = " + b);
        Assert.assertTrue(a.equals(b));

    }




}
