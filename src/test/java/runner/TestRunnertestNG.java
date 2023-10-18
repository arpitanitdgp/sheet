package runner;


import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;   

/*import org.testng.annotations.DataProvider;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
*/

@RunWith(Cucumber.class)
@CucumberOptions( 
		monochrome = false,
	    plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
	    		    "html:target/cucumber-reports/dsalgo.html",
	               "json:target/cucumber-reports/Cucumber.json",
	    		   "junit:target/cucumber-reports/Cucumber.xml"},
	   
	    
		features = { "src/test/java/Myfeatures"}, // location of feature files
		glue = "stepdefinationsTest") // location of step definition files

	
      
public class TestRunnertestNG extends AbstractTestNGCucumberTests {
	
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}




}















