package com.tryCloud.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",

        },
        features = "src/test/resources/features",
        glue = "com/tryCloud/step_definitions",
        dryRun = false,


        tags = "@TCLOUD-898 and @TCLOUD-876 and  @TCLOUD-916 and @TCLOUD-890 and @TCLOUD-909 and @Calendar and @TCLOUD-925 "


)

public class CukesRunner {

}
