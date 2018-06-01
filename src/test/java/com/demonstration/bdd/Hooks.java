package com.demonstration.bdd;

import com.demonstration.bdd.drivers.DriversFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    DriversFactory driversFactory = new DriversFactory();

    @Before
    public void setUp(){
        driversFactory.openBrowser();
        driversFactory.maximizeWindow();
        driversFactory.navigate("http://www.argos.co.uk/");
        driversFactory.implWait();
    }

  @After
  public void tearDown(Scenario scenario) {
      if (!scenario.isFailed()) {
          driversFactory.embedScreenshot(scenario);
      }
      //driversFactory.closeBroswer();
  }
}
