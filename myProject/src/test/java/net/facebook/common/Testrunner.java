package net.facebook.common;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources",
glue = {"net.facebook.stepdefinitions"},
tags = {"@logintofb"})

public class Testrunner {
	
}
