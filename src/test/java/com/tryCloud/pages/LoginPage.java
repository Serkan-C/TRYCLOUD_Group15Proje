package com.tryCloud.pages;

import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
public void login(){
        userInputBox.sendKeys(ConfigurationReader.getProperty("username"));
        userInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();

}
    @FindBy(id = "user")
    public WebElement userInputBox;

    @FindBy(id = "password")
    public WebElement passwordInputBox;


    @FindBy(id = "submit-form")
    public WebElement loginButton;


    @FindBy(id = "lost-password")
    public WebElement forgotPasswordLink;
    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")

    public WebElement warningMessage;

    @FindBy(xpath = "//img[@src='/core/img/actions/toggle.svg']")

    public WebElement eyeIMG;
    @FindBy(id = "reset-password-submit")
    public WebElement resetPasswordButton;
}
