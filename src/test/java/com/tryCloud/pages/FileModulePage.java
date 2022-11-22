package com.tryCloud.pages;

import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class FileModulePage extends BasePage  {

    public void selectFileModule(String moduleName) {
        if ("Files".equals(moduleName)) {
            fileModule.click();
        }
    }


    public void uploadFile1(String fileName){
        uploadFileBtn.sendKeys((System.getProperty("user.dir") + "/src/test/java/com/tryCloud/files/"+fileName));;
        BrowserUtils.waitFor(3);
    }
    public void uploadFile(String fileName) throws AWTException {

        Robot rb = new Robot();
        //setComponent();
        //copy path file to clipboard
        String filePath = "C:\\Users\\moham\\Pictures\\" + fileName;
        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

            rb.keyPress(KeyEvent.VK_CONTROL);
            rb.keyPress(KeyEvent.VK_V);
            rb.keyRelease(KeyEvent.VK_CONTROL);
            rb.keyRelease(KeyEvent.VK_V);
            //Enter
            rb.keyPress(KeyEvent.VK_ENTER);
            rb.keyRelease(KeyEvent.VK_ENTER);
    }

    public WebElement uploadedFileLocator(String uploadetFileName){

        String filteredFileName = "";

        for (int index = 0; index < uploadetFileName.length(); index++) {

            char ch = uploadetFileName.charAt(index);

            if (index < uploadetFileName.length() - 4) {

                filteredFileName += ch;
            }
        }

        String xpathName="//span[contains(text(),  '" + filteredFileName + "')]";

        return Driver.getDriver().findElement(By.xpath(xpathName));

    }



    public WebElement uploadedFolderLocator(String uploadetFolderName){

        String filteredFileName = "";

        for (int index = 0; index < uploadetFolderName.length(); index++) {

            char ch = uploadetFolderName.charAt(index);

                filteredFileName += ch;
        }

        String xpathName="//tbody//span[contains(text(),  '" + filteredFileName + "')]";
        return Driver.getDriver().findElement(By.xpath(xpathName));
    }

    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id='files']")
    public WebElement fileModule;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement uploadMenuBtn;

    @FindBy(xpath = "//label[@data-action='upload']")
    public WebElement uploadFileBtn;

    @FindBy(xpath = "//a[@data-templatename='New folder']")
    public WebElement creatNewFolderBtn;

    @FindBy(xpath = "//input[@id='view13-input-folder']")
    public WebElement newFolderNameInput;

    @FindBy(xpath = "//tbody/tr//span[.='testFile1.jpg']/ancestor:: tr//label")
    public WebElement selectedItemFile1;

    @FindBy(xpath = "//tbody/tr//span[.='testFile4.jpg']/ancestor:: tr//label")
    public WebElement selectedItemFile4;

    @FindBy(xpath = "//tbody/tr//span[.='TestFolder2']/ancestor:: tr//label")
    public WebElement selectedItemFolder2;

    @FindBy(xpath = "//tbody/tr//span[.='TestFolder1']/ancestor:: tr//label")
    public WebElement selectedItemFolder1;

    @FindBy(xpath = "//table[@class='list-container  has-controls multiselect']//span[@id='selectedActionsList']")
    public WebElement actionsBtn;

    @FindBy(xpath = "//span[@id='selectedActionsList']//li[@class='item-copyMove']")
    public WebElement moveOrCopyBtn;

    @FindBy(xpath = "//div/table/tbody/tr/td/span/span[contains(text(),'lder1')]/ancestor:: td")
    public WebElement choseTargetFolder1;

    @FindBy(xpath = "//div/table/tbody/tr/td/span/span[contains(text(),'lder2')]/ancestor:: td")
    public WebElement choseTargetFolder2;

    @FindBy(xpath = "//div[@class='oc-dialog']//div[@class='oc-dialog-buttonrow twobuttons aside']/button[contains(text(),'Copy')]")
    public WebElement choseTargetFolderCopyBtn;

    @FindBy(xpath = "//div[@class='oc-dialog']//div[@class='oc-dialog-buttonrow twobuttons aside']/button[contains(text(),'Move')]")
    public WebElement choseTargetFolderMoveBtn;

    @FindBy(xpath = "//tbody/tr//span[.='TestDeleteFolder']/ancestor:: tr//label")
    public WebElement selectedItemForDelete;

    @FindBy(xpath = "//span[@id='selectedActionsList']//li[@class='item-delete']")
    public WebElement deleteBtn;

    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement deletedItemFolder;

    @FindBy(xpath = "//span//span[.='TestDeleteFolder']")
    public WebElement deletedItemAssert;

    @FindBy(xpath = "//span[@class='info']")
    public WebElement filesAndFoldersNumber;



}
