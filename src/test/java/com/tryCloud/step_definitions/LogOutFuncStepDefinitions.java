package com.tryCloud.step_definitions;

import com.tryCloud.pages.LogOutPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LogOutFuncStepDefinitions {
LoginPage loginPage =new LoginPage();
LogOutPage logOutPage =new LogOutPage();

    @Given("User is already login and is on the dashboard")
    public void user_is_already_login_and_is_on_the_dashboard() {
        Driver.getDriver().get(ConfigurationReader.getProperty("tryCloudLoginPage"));
        loginPage.userInputBox.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();
    }
    @When("User click right corner brown Login Icon")
    public void user_click_right_corner_brown_login_icon() {
logOutPage.brownIcon.click();
    }
    @When("User see options and click logout button")
    public void user_see_options_and_click_logout_button() {
logOutPage.logoutButton.click();
    }
    @Then("User is  on the login page")
    public void user_is_on_the_login_page() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login") );
    }
    @Then("User click step back button")
    public void user_click_step_back_button() {
        loginPage.loginButton.sendKeys(Keys.BACK_SPACE);

    }
    @Then("User cannot go to the dashboard and cannot login")
    public void user_cannot_go_to_the_dashboard_and_cannot_login() {
        Assert.assertTrue(!(Driver.getDriver().getCurrentUrl().contains("dashboard")));
    }

}
