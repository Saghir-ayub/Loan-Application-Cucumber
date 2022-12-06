package SuiteRunners;

import courgette.api.CourgetteOptions;
import courgette.api.CourgetteRunLevel;
import courgette.api.CourgetteTestOutput;
import courgette.api.CucumberOptions;
import courgette.api.junit.Courgette;
import org.junit.runner.RunWith;

@RunWith(Courgette.class)
@CourgetteOptions(
        threads = 1,
        runLevel = CourgetteRunLevel.FEATURE,
        rerunFailedScenarios = true,
        testOutput = CourgetteTestOutput.CONSOLE,
        reportTargetDir = "target",
        cucumberOptions = @CucumberOptions(
                features = "src/test/java/Resources/Features",
                glue = "StepDefinitions",
                publish = true,
                tags = {"@AccessDeniedFeature"},
                plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
        ))
public class TagRunner {
}
