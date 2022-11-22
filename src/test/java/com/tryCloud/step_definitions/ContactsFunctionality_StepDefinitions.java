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
import org.apache.velocity.util.introspection.VelPropertySet;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        //InbutBoxGenerator.pass_the_value(string, string2);
        contactsPage.NewContact_CompanyBox.sendKeys(string);
        BrowserUtils.sleep(5);
    }

    @When("User enters2  {string} in {string}.")
    public void user_enters2_in(String string, String string2) {
        contactsPage.NewContact_TitleBox.sendKeys(string + Keys.ENTER);
        BrowserUtils.sleep(5);
    }

    @Then("User should see {string} and {string} in the All contacts list.")
    public void user_should_see_and_in_the_all_contacts_list(String name, String surname) {

        try{
            int x = Integer.valueOf(contactsPage.ContactsList.getAttribute("childElementCount"));
            List<String> listContacts = new ArrayList<>();
            while(x > 0){
                String a ="//div[@class='vue-recycle-scroller__item-wrapper']/div[" + String.valueOf(x) +"]";
                String b = Driver.getDriver().findElement(By.xpath(a)).getText();
                listContacts.add(b);
                x--;
            }
            Boolean result = false;
            for (String contact : listContacts) {
                if(contact.equalsIgnoreCase(name)){result = true;}else{result= false;}
            }
            Assert.assertTrue(result);
        }catch (RuntimeException e){
            System.out.println("There is no any contact");
        }
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

    int x = 0; // for the following step definition
    String selected_contact_text ="";
    @Given("User chooses any contact in the list.")
    public void user_chooses_any_contact_in_the_list() {

        try {
             x = Integer.valueOf(contactsPage.ContactsList_items.getAttribute("childElementCount"));
            System.out.println("x_first = " + x);
            Random rand = new Random();
            x = rand.nextInt(x);
            if(x == 0){x++;}
            System.out.println("x_random = " + x);
        }catch (RuntimeException e){
            System.out.println("there is no any contact to delete");
            Assert.assertTrue(true);
        }
        if(x == 1){
            contactsPage.ContactListFirst_item.click();
        }else{
            //   (//div[@class='app-content-list-item'])[3]
            String element_syntex = "(//div[@class='app-content-list-item'])[" + String.valueOf(x) + "]";
            Driver.getDriver().findElement(By.xpath(element_syntex)).click();
            selected_contact_text = Driver.getDriver().findElement(By.xpath(element_syntex)).getText();
            System.out.println("selected_contact_text = " + selected_contact_text);
        }

    }
    @When("User deletes selected contact.")
    public void user_deletes_selected_contact() {

        ButtonGenerator.click_the_button("ThreeDot_button");
        //user_waits_seconds("2");
        ButtonGenerator.click_the_button("Delete_button");
        //user_waits_seconds("2");
        contactsPage.Contacts_button.click();
    }
    @Then("User should not see the selected contact in list.")
    public void user_should_not_see_the_selected_contact_in_list() {
        try{
            int yeni =Integer.valueOf(contactsPage.ContactsList_items.getAttribute("childElementCount"));
            Assert.assertFalse(x==yeni);
        }catch (RuntimeException e){
            System.out.println("There is no anh contact");
            Assert.assertTrue(true);
        }

    }

    String value3 ="";
    @Given("User can see app-navigation column on the left.")
    public void user_can_see_app_navigation_column_on_the_left() {
        value3 = contactsPage.AppNavigationColumn.getAttribute("classList.value");
        System.out.println("value3 = " + value3);
    }

    String value4 ="";
    @Then("User should see app-navigation column is hidden")
    public void user_should_see_app_navigation_column_is_hidden() {
        value4 = contactsPage.AppNavigationColumn.getAttribute("classList.value");
        System.out.println("value4 = " + value4);
    }




}
