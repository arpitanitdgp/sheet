package runner;



import org.testng.annotations.DataProvider;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions( 
		monochrome = false,
	    plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","json:target/cucumber.json"},
	    
		features = { "src/test/java/Myfeatures"}, // location of feature files
		glue = "stepdefinationsTest") // location of step definition files

	
      
public class TestRunnertestNG extends AbstractTestNGCucumberTests {
	
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}




}















