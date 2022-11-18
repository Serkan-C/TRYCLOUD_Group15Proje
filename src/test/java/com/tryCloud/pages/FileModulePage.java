package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class FileModulePage extends BasePage {


    LoginPage loginPage = new LoginPage();

    public void selectFileModule(String moduleName) {
        loginPage.login();
        switch (moduleName) {
            case "Files":
                fileModule.click();
                break;
        }
    }

    public void uploadFile(String fileName) throws AWTException {

        uploadFileBtn.click();

        Robot rb = new Robot();

        //copy path file to clipboard
        StringSelection ss = new StringSelection("C:\\Users\\moham\\Pictures\\" + fileName);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        //CTRL+V
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        //Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);


    }

    public WebElement fileUploadAssertion(String uploadetFileName){

        String filteredFileName = "";

        for (int index = 0; index < uploadetFileName.length(); index++) {

            char ch = uploadetFileName.charAt(index);

            if (index < 5) {

                filteredFileName += ch;
            }
        }

        String xpathName="//span[contains(text(),  '" + filteredFileName + "')]";
        return Driver.getDriver().findElement(By.xpath(xpathName));

    }

    public WebElement folderUploadAssertion(String uploadetFolderName){

        String filteredFileName = "";

        for (int index = 0; index < uploadetFolderName.length(); index++) {

            char ch = uploadetFolderName.charAt(index);

                filteredFileName += ch;
        }

        String xpathName="//span[contains(text(),  '" + filteredFileName + "')]";
        return Driver.getDriver().findElement(By.xpath(xpathName));
    }

    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id='files']")
    public WebElement fileModule;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement uploadMenuBtn;

    @FindBy(xpath = "//label[@data-action='upload']")
    public WebElement uploadFileBtn;


 /*   @FindBy(xpath = "//span[contains(text(),  '" + fileName + "')]")
    public WebElement fileAssert;
*/


    @FindBy(xpath = "//a[@data-templatename='New folder']")
    public WebElement creatNewFolderBtn;

    @FindBy(xpath = "//input[@id='view13-input-folder']")
    public WebElement newFolderNameInput;

    @FindBy(xpath = "//form[@class='filenameform']/input[@type='submit']")
    public WebElement newFolderNameInputSubmitBtn;

    @FindBy(xpath = "//table/tbody[@id='fileList']/tr")
    public WebElement tableSelection;

    @FindBy(xpath = "//table/tbody[@id='fileList']/tr/td[@class='selection']/label[@for='select-files-8721']")
    public WebElement tableColumnSelection;

    @FindBy(xpath = "//table[@class='list-container  has-controls multiselect']//span[@id='selectedActionsList']")
    public WebElement actionsBtn;

    @FindBy(xpath = "//span[@id='selectedActionsList']//li[@class='item-copyMove']")
    public WebElement moveOrCopyBtn;

    @FindBy(xpath = "//div[@class='oc-dialog']//div[@class='filelist-container']/table/tbody/tr")
    public WebElement choseTargetFolder;

    @FindBy(xpath = "//div[@class='oc-dialog']//div[@class='oc-dialog-buttonrow twobuttons aside']/button[.='Copy']")
    public WebElement choseTargetFolderCopyBtn;

    @FindBy(xpath = "//div[@class='oc-dialog']//div[@class='oc-dialog-buttonrow twobuttons aside']/button[.='Move']")
    public WebElement choseTargetFolderMoveBtn;

    @FindBy(xpath = "//span[@id='selectedActionsList']//li[@class='item-delete']")
    public WebElement deleteBtn;

    @FindBy(xpath = "//span[@class='info']")
    public WebElement filesAndFoldersNumber;





}
