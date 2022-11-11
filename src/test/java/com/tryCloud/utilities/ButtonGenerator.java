package com.tryCloud.utilities;

import com.tryCloud.pages.DashboardPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.pages.TalkModulePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class ButtonGenerator {

    public static LoginPage loginPage;
    public static TalkModulePage talkModulePage;
    public static DashboardPage dashboardPage;

    public static void setObject() {

        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        if (talkModulePage == null) {
            talkModulePage = new TalkModulePage();
        }
        if (dashboardPage == null) {
            dashboardPage = new DashboardPage();
        }

    }

    public static void resetTheObject() {
        loginPage = null;
        talkModulePage = null;
        dashboardPage = null;

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
            case "Set Status":
                dashboardPage.setStatusButton.click();
                break;
            case "Start Call":
                talkModulePage.startCallButton.click();
                break;
            case "cydeo2":
                String xpathName="//span[contains(.,'"+buttonName+"')]";
                WebElement conversationName=Driver.getDriver().findElement(By.xpath(xpathName));
                conversationName.click();
                break;
            case "Employee103":
                talkModulePage.participantEmployee100.click();
                break;
            case "Leave Call":
                talkModulePage.leaveCallButton.click();
                break;

        }

    }
}
