package stepdefinationsTest;


 import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectsTest.HomePageTest;
import utilities.Helper;


  public class HomepageStepsTest extends BaseClassTest{



@Given("user Launch the Browser")
public void user_launch_the_browser() {
   
 HomePage = new HomePageTest (Helper.getDriver());
 
}


@When("user open the Homepage of dsportal and click get started button")
public void user_open_the_homepage_of_dsportal_and_click_get_started_button() {
   

  Helper.openPage("https://dsportalapp.herokuapp.com/");
  HomePage.getstarted();
  
}


@When("user navigate to the Homepage")
public void user_navigate_to_the_homepage() {
   
}

@Then("user should Verify the titlepage of Dsportal {string}")
public void user_should_verify_the_titlepage_of_dsportal(String string) {
   
	
	
	HomePage.homepagetitle();
   String homepagetitle = Helper.getTitle();
   Assert.assertEquals(string, homepagetitle);
  
    
 
}

@When("user clicks the Get Started button below the Datastructures-Introduction")
public void user_clicks_the_get_started_button_below_the_datastructures_introduction() {
 
HomePage.Datastructure();
 
}

@Then("user should get an Alert Message you are not logged in")
public void user_should_get_an_alert_message_you_are_not_logged_in() {
 
HomePage.AlertMessage1();
}

@When("user click the DropDwon button")
public void user_click_the_drop_dwon_button() {
 
  HomePage.DropDown();
}

@When("user navigate to button from the DSportal homepage and select any options")
public void user_navigate_to_button_from_the_d_sportal_homepage_and_select_any_options() {
 
HomePage.LinkedList();
}

@When("user click to signin button from DSportal homepage")
public void user_click_to_signin_button_from_d_sportal_homepage() {
 
HomePage.signin();
}

@Then("user should be directed to login page")
public void user_should_be_directed_to_login_page() {
 
 
}

@When("user click to Register button from DSportal homepage")
public void user_click_to_register_button_from_d_sportal_homepage() {
 
HomePage.register();
}

@Then("user should be directed to Register form")
public void user_should_be_directed_to_register_form() {
 
 
}






}