package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions; 


 @RunWith(Cucumber.class)

  @CucumberOptions(
		  plugin={"pretty", "html:target/MyReports/report.html",
				  "junit:target/MyReports/report.junit",
                    "json:target/cucumber.json",
 "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

   monochrome=false, 
//  tags = "@StackPage, @DataStructure",
  features= {"src/test/resources/features"}, 
  glue= "stepdefinations",
   dryRun= false)

 public class TestRunner {

}