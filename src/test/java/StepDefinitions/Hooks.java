package StepDefinitions;

import Manager.DriverFactory;
import Manager.ScreenShotTaker;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void beforeScenario() {
        System.out.println("Starting Driver");
        DriverFactory.getDriver();
    }

    @After
    public void afterScenario(Scenario scenario) {
        System.out.println("Tearing down driver");
        if (scenario.isFailed()) {
            scenario.log("Scenario failed so capturing a screenshot");
            ScreenShotTaker.addScreenShotsOnFailure(scenario);
        }
        DriverFactory.tearDownDriver();
    }
}
