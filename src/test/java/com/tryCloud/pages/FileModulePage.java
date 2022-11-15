package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileModulePage extends BasePage {


    @FindBy (xpath = "//a[@class='button new']")
    public WebElement uploadMenuBtn;

    @FindBy (xpath = "//label[@class='menuitem']")
    public WebElement uploadFileBtn;

    @FindBy (xpath = "//a[@data-templatename='New folder']")
    public WebElement creatNewFolderBtn;

    @FindBy (xpath = "//input[@id='view13-input-folder']")
    public WebElement newFolderNameInput;

    @FindBy (xpath = "//form[@class='filenameform']/input[@type='submit']")
    public WebElement newFolderNameInputSubmitBtn;

    @FindBy (xpath = "//table/tbody[@id='fileList']/tr")
    public WebElement tableSelection;

    @FindBy (xpath = "//table/tbody[@id='fileList']/tr/td[@class='selection']/label[@for='select-files-8721']")
    public WebElement tableColumnSelection;

    @FindBy (xpath = "//table[@class='list-container  has-controls multiselect']//span[@id='selectedActionsList']")
    public WebElement actionsBtn;

    @FindBy (xpath = "//span[@id='selectedActionsList']//li[@class='item-copyMove']")
    public WebElement moveOrCopyBtn;

    @FindBy (xpath = "//div[@class='oc-dialog']//div[@class='filelist-container']/table/tbody/tr")
    public WebElement choseTargetFolder;

    @FindBy (xpath = "//div[@class='oc-dialog']//div[@class='oc-dialog-buttonrow twobuttons aside']/button[.='Copy']")
    public WebElement choseTargetFolderCopyBtn;

    @FindBy (xpath = "//div[@class='oc-dialog']//div[@class='oc-dialog-buttonrow twobuttons aside']/button[.='Move']")
    public WebElement choseTargetFolderMoveBtn;

    @FindBy (xpath = "//span[@id='selectedActionsList']//li[@class='item-delete']")
    public WebElement deleteBtn;

    @FindBy (xpath = "//span[@class='info']")
    public WebElement filesAndFoldersNumber;












}
