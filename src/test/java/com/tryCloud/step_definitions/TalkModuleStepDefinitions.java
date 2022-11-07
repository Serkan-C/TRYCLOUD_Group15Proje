package com.tryCloud.step_definitions;

import com.tryCloud.pages.LoginPage;
import io.cucumber.java.en.Given;

public class TalkModuleStepDefinitions {

    LoginPage loginPage=new LoginPage();

    @Given("the user is logged in")
    public void the_user_is_logged_in(){
        new LoginPage().login();
    }


}
