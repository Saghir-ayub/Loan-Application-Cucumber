package StepDefinitions;

import Manager.DriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks {
    @Before
    public void beforeScenario() {
        System.out.println("Starting Driver");
        DriverFactory.getDriver();
    }

    @After
    public void afterScenario(){
        System.out.println("Tearing down driver");
        DriverFactory.tearDownDriver();
    }
}
