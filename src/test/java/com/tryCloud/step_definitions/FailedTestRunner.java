package com.tryCloud.step_definitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "cydeo/step_definitions",
        features = "@target/rerun.txt"




)



public class FailedTestRunner {



}
