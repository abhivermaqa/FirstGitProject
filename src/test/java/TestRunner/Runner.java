package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				features="Features/TagTest.feature",
				glue="stepDefination",
				format = {"pretty","html:target/html/","json:target/cucumber-json.json",
							"usage:target/cucumber-usage.json","junit:target/cucumber-result.xml"},
				monochrome = true,
				tags={"~@RegressionTest" ,"@End2End"})
public class Runner {

	
}
