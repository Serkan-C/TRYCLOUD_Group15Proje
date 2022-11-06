package com.tryCloud.step_definitions;

import com.tryCloud.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
  //  @Before(order = 1)
    public void setupScenario() {

        System.out.println("===Setting up Browser useing cucumber @Before");

    }

  //  @Before(value = "@login", order = 2)
    public void setupScenarioforLogins() {

        System.out.println("====this will only apply to scenarios with @login tag");

    }


   // @Before(value = "@db", order = 0)
    public void setupForDatabaseScenarios() {
        System.out.println("====this will only apply to scenarios with @db tag");
    }

    @After
    public void teardownScenario(Scenario scenario) {


        //scenario.isFailed() --> if scenario fails this method will return TRUE boolean value
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }


       Driver.closeDriver();
        //  System.out.println("===Closing browser using cucumber @After");
        //  System.out.println("== Scenario end/take the screen shot if failed!!");
    }

  //  @BeforeStep
    public void setupStep() {
        System.out.println("----------aplying step using @BeforeStep");


    }

  //  @AfterStep
    public void afterStep() {
        System.out.println("----------aplying step using @AfterStep");

    }
}
