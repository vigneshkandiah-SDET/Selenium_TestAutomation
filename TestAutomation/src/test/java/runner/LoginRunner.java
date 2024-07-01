package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features/LoginLeafTaps.feature",glue= {"stepdef"},monochrome=true)
public class LoginRunner extends  ProjectSpecificMethods {

}
