package com.tryCloud.utilities;

import com.tryCloud.pages.ContactsPage;
import org.openqa.selenium.Keys;


public class InbutBoxGenerator{

    public static ContactsPage contactsPage;


    public static void setObject(){
        if(contactsPage == null){
            contactsPage = new ContactsPage();
        }
    }

    public static void resetTheObject(){
        contactsPage = null;
    }

    public static  void setComponent(){
        resetTheObject();
        setObject();
    }

    public static void pass_the_value(String Value, String  textBoxName){
        setComponent();

        switch (textBoxName) {

            // Contacts Page's Input Boxes below (furkan)
            case "NewContact_CompanyBox":
                contactsPage.NewContact_CompanyBox.click();
                contactsPage.NewContact_CompanyBox.sendKeys(Value.toLowerCase() + Keys.ENTER);
                break;

            case "NewContact_TitleBox":
                contactsPage.NewContact_TitleBox.click();
                contactsPage.NewContact_TitleBox.sendKeys(Value.toLowerCase() + Keys.ENTER);;
                break;

            case "NewContact_Box":
                contactsPage.NewContact_Box.click();
                contactsPage.NewContact_Box.sendKeys(Value.toLowerCase() + Keys.ENTER);

            // Contacts Page's Input Boxes above (furkan)



        }


    }



}
