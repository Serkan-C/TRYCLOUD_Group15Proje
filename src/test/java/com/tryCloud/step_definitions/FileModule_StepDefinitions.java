package com.tryCloud.step_definitions;

import com.tryCloud.pages.FileModulePage;
import com.tryCloud.pages.LoginPage;
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
        new LoginPage().login();
        fileModulePage.selectFileModule(fileModule);
    }

    @When("User clicks on {string} icon")
    public void user_clicks_on_icon(String plusBtn) {
        fileModulePage.uploadMenuBtn.click();

    }

    @When("User select Upload file from DropDown box choose a {string} and upload it")
    public void user_select_upload_file_from_drop_down_box_choose_a_and_upload_it(String newFile) throws AWTException {
        fileModulePage.uploadFileBtn.click();
        BrowserUtils.sleep(3);
        fileModulePage.uploadFile(newFile);
        BrowserUtils.sleep(3);
        actualFileName = newFile;
    }

    @Then("User should see uploaded {string} in page")
    public void user_should_see_uploaded_in_page(String expectedFile) {

        Assert.assertTrue(expectedFile,fileModulePage.uploadedFileLocator(actualFileName).isDisplayed());

    }

    @When("User select {string} from DropDown box")
    public void user_select_from_drop_down_box(String optionSelection) {
        ButtonGenerator.click_the_button(optionSelection);
    }

    @And("User types a {string} for the New folder and hit enter key")
    public void userTypesAForTheNewFolderAndHitEnterKey(String folderName) {
        fileModulePage.newFolderNameInput.sendKeys(folderName);
        BrowserUtils.sleep(3);
        fileModulePage.newFolderNameInput.sendKeys(Keys.ENTER);
        actualFolderName = folderName;
        BrowserUtils.sleep(3);

    }

    @Then("User should see created {string} in the page")
    public void user_should_see_created_in_the_page(String expectedFolderName) {
       Assert.assertEquals(expectedFolderName,fileModulePage.uploadedFolderLocator(actualFolderName).getText());
    }


    @When("User select file {string} From the list")
    public void userSelectFileFromTheList(String item) {

        BrowserUtils.sleep(3);
        ButtonGenerator.click_the_button(item);
        actualFileName = item;

    }

    @And("User clicks {string} with three dots icon")
    public void userClicksWithThreeDotsIcon(String actionBtn) {
        ButtonGenerator.click_the_button(actionBtn);

    }

    @And("User choose {string} to copy or move the selected item")
    public void userChooseToCopyOrMoveTheSelectedItem(String targetFolder) {
        BrowserUtils.sleep(3);
        ButtonGenerator.click_the_button(targetFolder);
        BrowserUtils.sleep(3);

    }

    @And("User clicks on {string} selected target folder button.")
    public void userClicksOnSelectedTargetFolderButton(String copyToOrMoveTo) {
        BrowserUtils.sleep(3);
        ButtonGenerator.click_the_button(copyToOrMoveTo);
        BrowserUtils.sleep(10);
    }

    @Then("User should see the copied or moved file {string} in the {string}.")
    public void userShouldSeeTheCopiedOrMovedFileInThe(String expectedFileItem, String expectedFolder) {
        fileModulePage.uploadedFolderLocator(expectedFolder).click();
        BrowserUtils.sleep(3);
        Assert.assertTrue(expectedFileItem,fileModulePage.uploadedFileLocator(actualFileName).isDisplayed());
    }

    @When("User select folder {string} From the list")
    public void userSelectFolderFromTheList(String item) {
        ButtonGenerator.click_the_button_File(item);
        BrowserUtils.sleep(3);

        actualFolderName = item;
    }

    @Then("User should see the copied or moved folder {string} in the {string}.")
    public void userShouldSeeTheCopiedOrMovedFolderInThe(String expectedFolderItem, String expectedFolder) {
        fileModulePage.uploadedFolderLocator(expectedFolder).click();
        BrowserUtils.sleep(3);
        Assert.assertEquals(expectedFolderItem,fileModulePage.uploadedFolderLocator(actualFolderName).getText());
        BrowserUtils.sleep(3);
    }

    @Then("User should see deleted {string} in {string} folder")
    public void userShouldSeeDeletedInFolder(String expectedDeletedItem, String deletedFolder) {
        ButtonGenerator.click_the_button(deletedFolder);
        BrowserUtils.sleep(3);
        Assert.assertTrue(expectedDeletedItem,fileModulePage.deletedItemAssert.isDisplayed());

    }
}
