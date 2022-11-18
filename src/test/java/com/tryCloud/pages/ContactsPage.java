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
    public WebElement ContactsList_items;


   











}
