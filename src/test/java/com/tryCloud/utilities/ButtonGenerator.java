package com.tryCloud.utilities;

import com.tryCloud.pages.LoginPage;

public class ButtonGenerator {
  public static  LoginPage loginPage;

    public static void setObject() {

        if (loginPage == null) {
           loginPage= new LoginPage();
        }

    }

    public static void resetTheObject() {
        loginPage = null;

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
            case" login button":
                loginPage.loginButton.click();
                break;


        }

    }
}
