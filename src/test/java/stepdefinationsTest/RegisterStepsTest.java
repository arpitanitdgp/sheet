package stepdefinationsTest;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectsTest.HomePageTest;
import pageObjectsTest.RegisterpageTest;
import utilities.Helper;





 public class RegisterStepsTest extends BaseClassTest{

	

	 public HomePageTest HomePage;

     public 	RegisterpageTest Registerpage;

	

	

	@Given("user Navigate to the Register Page of DSPortal")

	public void user_Navigate_to_the_Register_Page_of_DSportal() {

	 

	WebDriver driver = Helper.getDriver();

	

	driver.get("https://dsportalapp.herokuapp.com/register");

	

			Registerpage = new RegisterpageTest(driver);

			

	}





	@When("user clicks registration button")

	public void user_clicks_registration_button() {

	

		

//   Helper.openPage("https://dsportalapp.herokuapp.com/register");

		

  Registerpage.register();

  

	}

	@Then("user should get an error message below username textbox")

	public void user_should_get_an_error_message_below_username_textbox() {

	 

	   

	}



	@Given("user enters valid username {string}")

	public void user_enters_valid_username(String username) {

	 

		Registerpage.Username(username);

	   

	}

	@Then("user should get an error message below password textbox")

	public void user_should_get_an_error_message_below_password_textbox() {

	 

	   

	}



	@Given("the user enters valid password  {string}")

	public void _user_enters_valid_password(String password) {

	 

		Registerpage.Password1(password);

	   

	}

	@Then("user should get an error message below password confirmation box")

	public void user_should_get_an_error_message_below_password_confirmation_box() {

	 

	   

	}



	@Given("user enters symbols as username {string}")

	public void user_enters_symbols_as_username(String username) {

	 

		Registerpage.Username(username);

	   

	}

	@Given("the user enters valid password {string}")

	public void the_user_enters_valid_password(String password) {

	 

		Registerpage.Password1(password);

	   

	}

	@Given("also matching confirmatory password {string}")

	public void also_matching_confirmatory_password(String password) {

	 

		Registerpage.Password2(password);

	   

	}

	@Then("user should get an error message")

	public void user_should_get_an_error_message() {

	 

	 

	}



	@Given("also non-matching confirmatory password {string}")

	public void also_non_matching_confirmatory_password(String string) {

		

		

	  

	}

	@Then("user should get error message")

	public void user_should_get_error_message() {

	   

		

	}

	

	

	@Given("matching confirmatory password {string}")

	public void matching_confirmatory_password(String password) {

	   

		Registerpage.Password2(password);

		

	}

	@Then("user should be redirected to homepage")

	public void user_should_be_redirected_to_homepage() {

	  

		

		

	}

	@When("user click to login button")
	public void user_click_to_login_button() {
	    
	    Registerpage.loginbutton();
		
	}
	@Then("user should be redirected to Login Page")
	public void user_should_be_redirected_to_login_page() {
	    
	   
	}


@Given("user click to Dropdown of DataStructure")
public void user_click_to_dropdown_of_data_structure() {
    
	 Registerpage.dropdownbutton();
    
}
@When("user navigate to Array button")
public void user_navigate_to_array_button() {
    
	
	 Registerpage.arraybutton();
    
}
@Then("user get Alert Message {string}")
public void user_get_alert_message(String string) {
    
    
	Registerpage.alertmessage();
	
}






	



}
				