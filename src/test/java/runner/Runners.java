package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\pdc3b-training.pdc3b\\eclipse-saavi\\CucumberProject\\MyFeatures\\Registration.feature" , glue="stepdDefinations",
tags= {"@Sanity"})
public class Runners {

}
