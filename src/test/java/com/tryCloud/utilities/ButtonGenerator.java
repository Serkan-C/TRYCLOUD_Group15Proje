package com.tryCloud.utilities;

import com.tryCloud.pages.LoginPage;
import com.tryCloud.pages.*;


public class ButtonGenerator {


    public static TalkModulePage talkModulePage;
    public static ContactsPage contactsPage;
    public static FileModulePage fileModulePage;
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;

    public static void setObject() {

        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        if (dashboardPage == null) {
            dashboardPage = new DashboardPage();
        }
        if (talkModulePage == null) {
            talkModulePage = new TalkModulePage();
        }

        if (contactsPage == null) {
            contactsPage = new ContactsPage();
        }

        if (fileModulePage == null) {
            fileModulePage = new FileModulePage();
        }


    }

    public static void resetTheObject() {
        loginPage = null;
        talkModulePage = null;
        dashboardPage = null;
        contactsPage = null;
        fileModulePage = null;


    }

    public static void setCompenent() {
        resetTheObject();
        setObject();

    }

    public static void click_the_button(String buttonName) {
        setCompenent();
        switch (buttonName) {

            case "eye button":
                loginPage.eyeIMG.click();
                break;
            case " login button":
                loginPage.loginButton.click();
                break;
            case "Customize button":
                dashboardPage.customizeButton.click();
                break;
            case "Set Status button":
                dashboardPage.setStatusButton.click();
                break;
            case "Online Status":
                dashboardPage.onlineStatus.click();
                break;
            case "Set Status Message":
                dashboardPage.setStatusMessage.click();
                break;
            case "Clear status message":
                dashboardPage.clearStatusMessage.click();
                break;
            case "Plus Icon":
                talkModulePage.plusIcon.click();
                break;
            case "participant Icon":
                talkModulePage.paricipantIcon.click();
                break;
            case "Create Conversation":
                talkModulePage.createConversationButton.click();
                break;
            case "Menu Button":
                if (!talkModulePage.plusIcon.isDisplayed()) {
                    talkModulePage.menuButton.click();
                }
                break;
            case "Start Call":
                BrowserUtils.waitFor(2);

                //  BrowserUtils.waitForClickablility(talkModulePage.startCallButton,10);
                talkModulePage.startCallButton.click();
                BrowserUtils.waitFor(3);

                break;
            case "Leave Call":
                BrowserUtils.waitFor(15);

               // BrowserUtils.waitForClickablility(talkModulePage.leaveCallButton, 10);
                talkModulePage.leaveCallButton.click();

                break;
            case "Delete Button":
                talkModulePage.deleteButton.click();
                break;
            case "Yes Button":
                talkModulePage.yesButton.click();
                break;
            case "Promote to Moderator Button":
                talkModulePage.promoteModerator.click();
                break;


            //----------------Followings are furkan' locators
            case "NewContacts_button":
                contactsPage.NewContacts_button.click();
                break;

            //----------------furkan's codes are above

            case "Plus":
                fileModulePage.uploadMenuBtn.click();
                break;
            case "Upload file":
                fileModulePage.uploadFileBtn.click();
                break;
            case "New folder":
                fileModulePage.creatNewFolderBtn.click();
                break;



            //-------Mohammad--------//
            case "testFile1.jpg":
                fileModulePage.selectedItemFile1.click();
                break;

            case "testFile4.jpg":
                fileModulePage.selectedItemFile4.click();
                break;

            case "Actions":
                fileModulePage.actionsBtn.click();
                break;

            case "Move or copy":
                fileModulePage.moveOrCopyBtn.click();
                break;

            case "TestFolder2":
                fileModulePage.choseTargetFolder2.click();
                break;

            case "TestFolder1":
                fileModulePage.choseTargetFolder1.click();
                break;

            case "copy to TestFolder2":
                fileModulePage.choseTargetFolderCopyBtn.click();
                break;

            case "move to TestFolder1":
                fileModulePage.choseTargetFolderMoveBtn.click();
                break;

            case "TestDeleteFolder":
                fileModulePage.selectedItemForDelete.click();
                break;

            case "Delete":
                fileModulePage.deleteBtn.click();
                break;

            case "Deleted Files":
                fileModulePage.deletedItemFolder.click();
                break;
        }

    }
    public static void click_the_button_File(String buttonName) {
        setCompenent();
        switch (buttonName) {

            case "eye button":
                loginPage.eyeIMG.click();
                break;

            case "TestFolder2":
                fileModulePage.selectedItemFolder.click();
                break;

        }
    }





}

