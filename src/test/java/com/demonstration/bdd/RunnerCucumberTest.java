package com.demonstration.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources",plugin = "json:target/kumar.json")
public class RunnerCucumberTest {

}
