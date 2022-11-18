package com.tryCloud.step_definitions;

import com.tryCloud.pages.ContactsPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ButtonGenerator;
import com.tryCloud.utilities.InbutBoxGenerator;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.junit.Assert;
import org.openqa.selenium.By;

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

        Boolean x , y= false;
        String a = "";
        String b="";

        try{
            a = contactsPage.TotalNumberContact.getText();
            x = true;
            System.out.println("a = " + a);
        }catch (RuntimeException e){
            e.printStackTrace();
            System.out.println("TotalNumberContact is not visible");
            x = false;
        }
        try{
            b = String.valueOf(contactsPage.ContactsList_items.getAttribute("childElementCount"));
            System.out.println("b = " + b);
            y = true;
        }catch (RuntimeException p){
            p.printStackTrace();
            y = false;
            System.out.println("ContactList is not visible");
        }

        if(x==true && y==true){
            Assert.assertTrue("TotalNumberContact and ContactList  are visible but not equal",a.equals(b));
        } else if (x==false && y==false) {
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }

    }

    @Given("User deletes all the contacts")
    public void user_deletes_all_the_contacts() {
        try{
            int x =Integer.valueOf(contactsPage.ContactsList_items.getAttribute("childElementCount"));
            System.out.println(contactsPage.ContactsList_items.getAttribute("childElementCount"));
            while(x >0){

                contactsPage.ContactListFirst_item.click(); // can be activated
                //user_waits_seconds("2");
                ButtonGenerator.click_the_button("ThreeDot_button");
                ButtonGenerator.click_the_button("Delete_button");
                //user_waits_seconds("2");
                contactsPage.Contacts_button.click();
                x --;
            }
        }catch (RuntimeException e){
            //e.printStackTrace();
            Assert.assertTrue(true);

        }

    }


    String value1 = "";
    @Given("User saves web element {string} attribute {string} value.")
    public void user_saves_web_element_attribute_value(String string, String string1) {
        value1 = InbutBoxGenerator.get_attribute(string,string1);
        System.out.println("value1 = " + value1);
    }

    @Given("User finds {string} web element and click.")
    public void user_finds_web_element_and_click(String string) {
        //System.out.println("//*[contains(@*,'" + string +"')]");
        System.out.println("//*[contains(@*,'"+string+"')]");
        Driver.getDriver().findElement(By.xpath("//*[contains(@*,'"+string+"')]")).click();

    }

    @Then("User should see web element {string} attribute {string} value has changed")
    public void user_should_see_web_element_attribute_value_has_changed(String string, String string2) {
        String Value2 = InbutBoxGenerator.get_attribute(string,string2) ;
        Assert.assertFalse(value1.equalsIgnoreCase(Value2));
        System.out.println("Value2 = " + Value2);
    }




}
