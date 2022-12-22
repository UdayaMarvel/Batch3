package com.amazon.stepdefenition;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\Mobile.feature",
					glue = "com.amazon.stepdefenition",
					plugin="html:target",
					monochrome = true,
					dryRun = false)
public class TestRunner {

}
