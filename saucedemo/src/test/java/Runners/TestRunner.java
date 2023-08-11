package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/main/resources/Features",
       glue = {"StepDefinitions2"},
        tags = "@smoke",
//        monochrome = true,
        plugin = {"pretty",                    // report هيطلع بانهي صيغة
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},
        dryRun = false
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
