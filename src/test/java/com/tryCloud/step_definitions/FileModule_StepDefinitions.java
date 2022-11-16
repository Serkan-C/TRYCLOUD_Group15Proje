package com.tryCloud.step_definitions;

import com.tryCloud.pages.FileModulePage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ButtonGenerator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.awt.*;

public class FileModule_StepDefinitions {

    FileModulePage fileModulePage = new FileModulePage();

    public static String actualFileName = null;
    public static String actualFolderName = null;

    @Given("User is in the Dashboard And lands in {string} Module")
    public void user_is_in_the_dashboard_and_lands_in_module(String fileModule) {
        fileModulePage.selectFileModule(fileModule);

    }
    @When("User clicks on {string} icon")
    public void user_clicks_on_icon(String plusBtn) {
        ButtonGenerator.click_the_button(plusBtn);

    }

    @When("User select Upload file from DropDown box choose a {string} and upload it")
    public void user_select_upload_file_from_drop_down_box_choose_a_and_upload_it(String file) throws AWTException {
        fileModulePage.uploadFile(file);
        BrowserUtils.sleep(3);
        actualFileName = file;
    }

    @Then("User should see uploaded {string} in page")
    public void user_should_see_uploaded_in_page(String expectedFile) {

        Assert.assertTrue(expectedFile,fileModulePage.fileUploadAssertion(actualFileName).isDisplayed());

    }

    @When("User select {string} from DropDown box")
    public void user_select_from_drop_down_box(String newFolder) {
        BrowserUtils.sleep(2);
        ButtonGenerator.click_the_button(newFolder);
    }

    @And("User types a {string} for the New folder and hit enter key")
    public void userTypesAForTheNewFolderAndHitEnterKey(String folderName) {
        fileModulePage.newFolderNameInput.sendKeys(folderName);
        fileModulePage.newFolderNameInput.sendKeys(Keys.ENTER);
        actualFolderName = folderName;
        BrowserUtils.sleep(3);

    }

    @Then("User should see created {string} in the page")
    public void user_should_see_created_in_the_page(String expectedFolderName) {
        Assert.assertEquals(expectedFolderName,fileModulePage.folderUploadAssertion(actualFolderName).getText());
    }



}
