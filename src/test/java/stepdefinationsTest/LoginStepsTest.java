package stepdefinationsTest;




import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectsTest.HomePageTest;
import pageObjectsTest.LoginPageTest;
import pageObjectsTest.RegisterpageTest;
import utilities.Helper;





 public class LoginStepsTest extends BaseClassTest {

	

	public HomePageTest HomePage;

    public 	RegisterpageTest Registerpage;

    public LoginPageTest LoginPage;



	@When("user Navigate to Sign in button")

	public void user_navigate_to_sign_in_button() {

		

		WebDriver driver = Helper.getDriver();

		

		driver.get("https://dsportalapp.herokuapp.com/login");

		

	   LoginPage = new LoginPageTest(driver);

	 

	}

	@When("user enters the user id as  {string}")

	public void user_enters_the_user_id_as(String user) {

	   

	 LoginPage.Username(user);

	}

	@When("user enter  password as  {string}")

	public void user_enter_password_as(String password) {

	   

		LoginPage.Password(password);

	 

	}

	@When("user click the login button")

	public void user_click_the_login_button() {

	   

	 LoginPage.loginbutton();

		

	}

	@Then("user should get an alert message of Invalid Username and Password")

	public void user_should_get_an_alert_message_of_invalid_username_and_password() {

	   

	 

	}

	@When("user enters the Valid Username")

	public void user_enters_the_valid_username() {

	 

		LoginPage.validUsername();

	}

	@When("enter Valid Password")

	public void enter_valid_password() {

		

		LoginPage.ValidPassword();

	   

	}

	@Then("user should successfully login into Homepage")

	public void user_should_successfully_login_into_homepage() {

	   

		

	}







	

}