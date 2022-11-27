package com.tryCloud.step_definitions;

import com.tryCloud.pages.DeletedFilesTabPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeletedFilesTabStepDefinitions {

    DeletedFilesTabPage deletedFilesTabPage=new DeletedFilesTabPage();
    LoginPage loginPage=new LoginPage();



    @When("User should click Files module")
    public void userShouldClickFilesModule() {
        BrowserUtils.waitForPageToLoad(60);
        deletedFilesTabPage.FilesButton.click();
    }


    @And("User should click Deleted files module")
    public void userShouldClickDeletedFilesModule() {
        BrowserUtils.waitForPageToLoad(60);
        deletedFilesTabPage.DeletedFilesModule.click();
    }



    @Then("User should click the deleted button two times for order by newest to oldest")
    public void userShouldClickTheDeletedButtonTwoTimesForOrderByNewestToOldest() {
        BrowserUtils.waitForPageToLoad(60);
        deletedFilesTabPage.DeletedButton.click();
        BrowserUtils.sleep(1);
        deletedFilesTabPage.DeletedButton.click();
        BrowserUtils.sleep(1);

        if(true){
            Assert.assertTrue(deletedFilesTabPage.DeletedButtonNewestToOldest.isEnabled());
        }else{
            System.err.println("Your files are not listed by deleted files");;
        }

    }


    @And("User should click the deleted button with the arrow pointing down for order by newest to oldest")
    public void userShouldClickTheDeletedButtonWithTheArrowPointingDownForOrderByNewestToOldest() {
        BrowserUtils.waitForPageToLoad(60);
        deletedFilesTabPage.DeletedButton.click();
        BrowserUtils.sleep(1);
        deletedFilesTabPage.DeletedButton.click();
        BrowserUtils.sleep(1);
        if(true){
            Assert.assertTrue(deletedFilesTabPage.DeletedButtonNewestToOldest.isEnabled());
        }else{
            System.err.println("Your files are not listed by deleted files");;
        }
    }

    @Then("User should click the deleted button with the arrow pointing up for order by oldest to newest")
    public void userShouldClickTheDeletedButtonWithTheArrowPointingUpForOrderByOldestToNewest() {
        BrowserUtils.waitForPageToLoad(60);
        deletedFilesTabPage.DeletedButton.click();
        BrowserUtils.sleep(1);
        if(true){
            Assert.assertTrue(deletedFilesTabPage.DeletedButtonOldestToNewest.isEnabled());
        }else{
            System.err.println("Your files are not listed by deleted files");
        }


    }


    @Then("User should click the name button with the arrow pointing up for order alphabetically")
    public void userShouldClickTheNameButtonWithTheArrowPointingUpForOrderAlphabetically() {
        BrowserUtils.waitForPageToLoad(60);
        deletedFilesTabPage.Alph.click();
        BrowserUtils.sleep(2);

        if(true){
            Assert.assertTrue(deletedFilesTabPage.AlphUp.isEnabled());
        }else{
            System.err.println("Your files are not listed by deleted files");;
        }
    }


    @And("User should click three dots icon")
    public void userShouldClickThreeDotsIcon() {
        BrowserUtils.waitForPageToLoad(60);
        BrowserUtils.sleep(5);
        deletedFilesTabPage.threeDots.click();
        BrowserUtils.sleep(2);


    }


    @Then("User should click delete permenantly button")
    public void userShouldClickDeletePermenantlyButton() {
        BrowserUtils.waitForPageToLoad(60);
        BrowserUtils.sleep(5);
        deletedFilesTabPage.deletePermanently.click();
        BrowserUtils.sleep(2);

    }


    @And("User should click restore button")
    public void userShouldClickRestoreButton() {
        BrowserUtils.waitForPageToLoad(60);
        deletedFilesTabPage.restoreButton.click();
        BrowserUtils.sleep(2);



    }


    @Then("User can see deleted file again under the All Files tab")
    public void userCanSeeDeletedFileAgainUnderTheAllFilesTab() {
        BrowserUtils.waitForPageToLoad(60);
        deletedFilesTabPage.allFiles.click();
        if(true){
            Assert.assertTrue(deletedFilesTabPage.restoredFile.isEnabled());
            System.out.println("User can see deleted file again under the All Files tab");
        }else{
            System.err.println("Your files are not listed by all files");;
        }



    }

    @And("And User should click three dots icon in all files")
    public void andUserShouldClickThreeDotsIconInAllFiles() {
        BrowserUtils.waitForPageToLoad(60);
        deletedFilesTabPage.threeDots2.click();
        BrowserUtils.sleep(2);
    }


    @And("User should click Delete folder")
    public void userShouldClickDeleteFolder() {
        BrowserUtils.waitForPageToLoad(60);
        deletedFilesTabPage.deleteFolder.click();
        BrowserUtils.sleep(2);
        deletedFilesTabPage.DeletedFilesModule.click();
        BrowserUtils.sleep(2);

        deletedFilesTabPage.DeletedButton.click();
        BrowserUtils.sleep(1);
        deletedFilesTabPage.DeletedButton.click();
        BrowserUtils.sleep(1);

        if(true){
            Assert.assertTrue(deletedFilesTabPage.DeletedButtonNewestToOldest.isEnabled());
            System.out.println("User can see deleted file  under the Deleted Files tab");
        }else{
            System.err.println("Your files are not listed by deleted files");;
        }






    }








}
