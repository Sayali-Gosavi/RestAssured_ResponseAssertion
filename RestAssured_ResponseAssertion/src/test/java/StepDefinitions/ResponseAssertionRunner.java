package StepDefinitions;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\features",glue="StepDefinitions")
public class ResponseAssertionRunner extends ResponseAssertion{

}
