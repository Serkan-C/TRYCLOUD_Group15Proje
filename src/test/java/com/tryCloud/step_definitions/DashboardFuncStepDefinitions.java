package com.tryCloud.step_definitions;

import com.tryCloud.pages.DashboardPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ButtonGenerator;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.velocity.util.introspection.VelPropertySet;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashboardFuncStepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();


    @When("User access the dashboard successfully")
    public void user_access_the_dashboard_successfully() { //1
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));

    }

    @Then("User can see all modules on dashboard page")
    public void user_can_see_all_modules_on_dashboard_page() { //1
        Assert.assertTrue(dashboardPage.modules.isDisplayed());

    }

    @Then("User can see Username on dashboard page")
    public void userCanSeeUsernameOnDashboardPage() { //1
        Assert.assertTrue(dashboardPage.usernamePlace.getAttribute("title").equals("Employee85"));

    }


    @When("User clicks on Customize button")
    public void user_clicks_on_customize_button() { //2.1
        dashboardPage.customizeButton.click();

    }

    @And("User can see the status widgets and click on it")
    public void userCanSeeTheStatusWidgetsAndClickOnIt() { // 2.1
        //Assert.assertTrue(dashboardPage.statusWidges.isDisplayed());
        dashboardPage.statusWidges.click();


    }


    @Then("User can select any of {string}")
    public void userCanSelectAnyOf(String widget) { //2.1
        String widgetXpath = "//div[@class='modal__content']//label[contains(.,'" + widget + "')]";
        WebElement widgetElement = Driver.getDriver().findElement(By.xpath(widgetXpath));
        widgetElement.click();


    }


    @When("User can see the background images")
    public void user_can_see_the_background_images() { //2.2
        BrowserUtils.waitFor(5);
        Assert.assertTrue(dashboardPage.backgroundImage.isDisplayed());

    }


    @Then("User can select any of {string} from Images")
    public void userCanSelectAnyOfFromImages(String imageName) { //2.2
        String imageXpath = "//div[@class='background-selector']//button[contains(.,'" + imageName + "')]";
        WebElement imageElement = Driver.getDriver().findElement(By.xpath(imageXpath));
        imageElement.click();

    }


    @When("User can click on Set Status button")
    public void user_can_click_on_set_status_button() { //3
       dashboardPage.setStatusButton.click();


       /* String expectedStatus = "status";
        String status =  Driver.getDriver().findElement(By.xpath("//div[@id='status-status']")).getText();

        if (expectedStatus.equalsIgnoreCase(status)) {
            dashboardPage.setStatusButton.click();
        }else{
            System.out.println("The expected result doesn't match the actual result");

        }

        */



    }

    @When("User can see the Online status options")
    public void user_can_see_the_online_status_options() { //3
        Assert.assertTrue(dashboardPage.onlineStatus.isDisplayed());


    }

    @Then("user can select any of {string} from status")
    public void userCanSelectAnyOfFromStatus(String status) { //3
        String statusXpath = "//div[@class='set-status-modal']//label[contains(.,'" + status + "')]";
        WebElement statusElement = Driver.getDriver().findElement(By.xpath(statusXpath));
        statusElement.click();


    }


    @When("User can see the Status messages")
    public void user_can_see_the_status_messages() { //3.1
        BrowserUtils.waitFor(2);
        Assert.assertTrue(dashboardPage.statusMessages.isDisplayed());

    }



    @Then("User can select any of {string} from messages")
    public void userCanSelectAnyOfFromMessages(String statusMessage) { //3.1
        String statusMesXpath = "//div[@class='set-status-modal']//span[contains(.,'" +statusMessage+ "')]";
        WebElement statusMesElement = Driver.getDriver().findElement(By.xpath(statusMesXpath));
        statusMesElement.click();
    }


    @Then("User clicks the Clear status message button")
    public void user_clicks_the_clear_status_message_button() { //3.2
        dashboardPage.clearStatusMessage.click();


       /* String expectedClearStatus = "Clear status message";
        String clearStatus = Driver.getDriver().findElement(By.xpath("//button[@class='status-buttons__select']")).getText();

        if (expectedClearStatus.equalsIgnoreCase(clearStatus)) {
          dashboardPage.clearStatusMessage.isSelected();
        }else{
            System.out.println("The expected result doesn't match the actual result");

        */



            }


    @Then("User can see his selections on dashboard after these steps")
    public void userCanSeeHisSelectionsOnDashboardAfterTheseSteps() { //3.2
        Assert.assertTrue(dashboardPage.dashBoard.isDisplayed());

    }


    @And("User can write any {string} in input box manually")
    public void userCanWriteAnyInInputBoxManually(String string) { //4
        dashboardPage.inputBox.sendKeys(string);


    }

    @Then("User can click the Set status message button and see the status on dashboard")
    public void user_can_click_the_set_status_message_button_and_see_the_status_on_dashboard() { //4
        dashboardPage.setStatusMessage.click();

    }

    @When("user clicks Set Status button")
    public void userClicksSetStatusButton() {
        dashboardPage.setStatusButton.click();




    }
}





