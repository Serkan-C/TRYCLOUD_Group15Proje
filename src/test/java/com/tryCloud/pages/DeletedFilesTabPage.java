package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class DeletedFilesTabPage {

    public DeletedFilesTabPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]")
    public WebElement FilesButton;


    @FindBy(xpath = "//*[@id=\"app-navigation\"]/ul/li[7]/a")
    public WebElement DeletedFilesModule;

    @FindBy(xpath = "//span[@class='sort-indicator icon-triangle-s']")
    public WebElement DeletedButtonNewestToOldest;

    @FindBy(xpath = "//span[@class='sort-indicator icon-triangle-n']")
    public WebElement DeletedButtonOldestToNewest;

    @FindBy(xpath = "//span[normalize-space()='Deleted']")
    public WebElement DeletedButton;

    @FindBy(xpath = "//div[@id='app-content-trashbin']//span[contains(text(),'Name')]")
    public WebElement Alph;

    @FindBy(xpath ="//span[@class='sort-indicator hidden icon-triangle-s']")
    public WebElement AlphUp;

    @FindBy(css = "body > div:nth-child(23) > div:nth-child(2) > div:nth-child(15) > table:nth-child(6) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1) > span:nth-child(4) > a:nth-child(2) > span:nth-child(1)")
    public WebElement threeDots;

    //li[@class=' action-delete-container']
    //*[@id="fileList"]/tr[1]/td[2]/div/ul/li[1]/a/span[2]



    @FindBy(css = "body > div:nth-child(23) > div:nth-child(2) > div:nth-child(15) > table:nth-child(6) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1) > span:nth-child(4) > a:nth-child(2) > span:nth-child(1)")
    public WebElement deletePermanently;

    @FindBy(css = "#fileList > tr:nth-child(1) > td.filename > a > span.fileactions > a.action.action-restore.permanent > span:nth-child(2)")
    public WebElement restoreButton;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[1]/span")
    public WebElement restoredFile;

    @FindBy(xpath = "//a[@class='nav-icon-files svg']")
    public WebElement allFiles;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[3]/a[2]")
    public WebElement threeDots2;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[8]/a")
    public WebElement deleteFolder;




































    @FindBy(xpath = "//tr[@class='ui-droppable highlighted']//span[@class='modified live-relative-timestamp'][normalize-space()='an hour ago']")
    public WebElement UploadFile;

    @FindBy(xpath = "//span[contains(text(),'Restore')])[2]/../../preceding-sibling::span[2]")
    public WebElement restoredElementText;

    @FindBy(xpath = "//span[@class=\"nametext\"]")
    public List<WebElement> allFilesUpdatedTexts;



    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[8]/td[2]/div/ul/li[4]/a/span[2]")
    public WebElement actions;

    @FindBy(xpath = "//*[@id=\"app-navigation\"]/ul/li[2]/a")
    public WebElement Recent;




















}
