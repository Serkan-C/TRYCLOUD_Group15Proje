package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends BasePage {

    //----------------Button Elements Below

    @FindBy(xpath ="//li[@data-id=\"contacts\"][1]")
    public WebElement Contacts_button;

    @FindBy(xpath = "//button[@id='new-contact-button']")
    public WebElement NewContacts_button;

    @FindBy(xpath = "//span[@title='All contacts']")
    public WebElement AllContacts_button;

    @FindBy(xpath = "//button[@class='icon action-item__menutoggle icon-picture-force-white']")
    public WebElement ContactsIconPic_button;


    @FindBy(xpath = "(//button[@class='action-button focusable'])[6]")
    public WebElement ChooseFromFile_button;

    @FindBy(xpath = "(//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon'])[5]")
    public WebElement ThreeDot_button;

    @FindBy(xpath = "(//button[@class=\"action-button focusable\"])[6]")
    public  WebElement Delete_button;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement Choose_button;

    @FindBy(xpath = "//a[@class='oc-dialog-close']")
    public WebElement DialogClose_button; // closes the pop up windows coming from change avatar button
    //a[@class='oc-dialog-close']
    //div[@class="oc-dialog"]/a

    @FindBy(xpath = "//a[@class=\"app-navigation-toggle\"]")
    public WebElement AppNavigation_button;//this is three line button to hide  app-navigation column.



    //--------------Text Box Locators Below

    @FindBy(xpath = "//input[@id='contact-org']")
    public WebElement NewContact_CompanyBox;

    @FindBy(xpath = "//input[@id='contact-title']")
    public WebElement NewContact_TitleBox;

    @FindBy(xpath = "//input[@id=\"contact-fullname\"]")
    public WebElement NewContact_Box;



    //---------------Ordinary Web elements Below

    @FindBy(xpath ="(//div[@class=\"app-navigation-entry__counter\"])[1]")
    public WebElement TotalNumberContact;

    @FindBy(xpath = "//div[@class=\"logo logo-icon\"]")
    public WebElement TryCloud_Icon;

    @FindBy(xpath = "//div[@class='menutoggle']")
    public WebElement AccountMenuToggle;

    @FindBy(xpath ="//li[@data-id=\"logout\"]")
    public WebElement LogOut;

    @FindBy(xpath="//div[@id='contacts-list']")
    public WebElement ContactsList;

    @FindBy(xpath = "//div[@class='vue-recycle-scroller__item-wrapper']")
    public WebElement ContactsList_items;// you can get number of contact by using "childElementCount" attribute.
    //   //div[@class='vue-recycle-scroller__item-wrapper']/div[1]  //--> you can get always first contact from list.

    @FindBy(xpath = "//div[@class='app-content-list-item active']")
    public WebElement ContactListFirst_item;
    //    (//div[@class='app-content-list-item'])[3]  this statement for other web elements of list

    @FindBy(xpath = "//table[@id=\"picker-filestable\"]/tbody")
    public WebElement ChooseFromFile_table;
    ////table[@id="picker-filestable"]/tbody/tr[4]

    @FindBy(xpath = "//div[@class=\"contact-header-avatar__wrapper\"]/div[1]")
    public WebElement ContactAvatarPic;

    @FindBy(xpath = "//div[@id=\"app-navigation-vue\"]")
    public WebElement AppNavigationColumn;


   











}
