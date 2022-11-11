package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
