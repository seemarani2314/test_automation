package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue="stepDefinition", 
monochrome = true, tags = "@SmokeTest")
public class testNGRunner extends AbstractTestNGCucumberTests{
	
}

//tags = "@SmokeTest and @RegressionTest"
//tags = "@SmokeTest or @RegressionTest"
//tags = "not @RegressionTest"