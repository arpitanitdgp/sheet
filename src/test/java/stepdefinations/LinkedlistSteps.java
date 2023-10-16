package stepdefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPageTest;
import pageObjects.DataStructurePage;
import pageObjects.HomePage;
import pageObjects.LinkedlistPage;
import pageObjects.LoginPage;
import pageObjects.Registerpage;
import utilities.Helper;

public class LinkedlistSteps extends BaseClass{


public HomePage HomePage;
    public Registerpage RegisterPage;
    public LoginPage LoginPage;
    public DataStructurePage DataStructurePage;
    public ArrayPageTest Arraypage;
    public LinkedlistPage LinkedlisPage;
   
   
    WebDriver driver = Helper.getDriver();

 @When("user click to Get Started button below Linked List")
public void user_click_to_get_started_button_below_linked_list() {

	Linkedlistpage = new LinkedlistPage (driver);

   Linkedlistpage.linkedlistGetStarted();
 
}
@When("The user clicks Introduction button of LinkedList")
public void the_user_clicks_introduction_button_of_linked_list() {
 
Linkedlistpage.intro();
 
}
@Then("The user should be directed to Introduction of Linked List Page")
public void the_user_should_be_directed_to_introduction_of_linked_list_page() {
 
 
}

@When("The user clicks try Here button")
public void the_user_clicks_try_here_button() {
 
Linkedlistpage.Try_Here();
 
}
@Then("The user should be redirected to try Editor page")
public void the_user_should_be_redirected_to_try_editor_page() {
 
 
}

@When("user enters message {string} in the try editor box")
public void user_enters_message_in_the_try_editor_box(String apple2023) {
 
Linkedlistpage.Error_Message1(apple2023);
}

@When("user clicks run Button")
public void user_clicks_run_button() {
 
Linkedlistpage.run();
 
}
@Then("user should get an Alert message of Syntx Error")
public void user_should_get_an_alert_message_of_syntx_error() {
 
 
}
@Then("user click  ok Button")
public void user_click_ok_button() throws InterruptedException {
 
Linkedlistpage.Alert_Message();
}

@When("user navigates to Created Linked List Button")
public void user_navigates_to_created_linked_list_button() {
 
Linkedlistpage.creatng_linkedlist();
 
}
@Then("user should land to Created Linked List Page")
public void user_should_land_to_created_linked_list_page() {
 
 
}



@Then("user enters message \"print\\({string})\"in the try editor box")
public void user_enters_message_print_in_the_try_editor_box(String string) {
   
Linkedlistpage.Print_Message1(string);

}


@Then("user should see the print message")
public void user_should_see_the_print_message() {
   

}


@When("user navigates to Types of Linked List Button")
public void user_navigates_to_types_of_linked_list_button() {

Linkedlistpage.typesoflinkedlist();
   
}
@Then("user redirected to Types of Linked List Page")
public void user_redirected_to_types_of_linked_list_page() {
   
   
}





@When("user click to Traversal Button")
public void user_click_to_traversal_button() {

Linkedlistpage.Traversal();
   
   
}


@When("user enter the message {string} in the editor box")
public void user_enter_the_message_in_the_editor_box(String SheetalKarotiya) {
   
Linkedlistpage.Error_Message2(SheetalKarotiya);
}




@When("user click to Implement Linked List in Python Button")
public void user_click_to_implement_linked_list_in_python_button() {

Linkedlistpage.implementlinkedlistpython();
   
   
}
@Then("user navigates to Implement Linked List in Python page")
public void user_navigates_to_implement_linked_list_in_python_page() {
   
   
}



@Then("user enters message \"print\\({string})in the try editor box")
public void user_enters_message_print_in_the_try_editor_box1(String string) {
   
Linkedlistpage.Print_Message2(string);

}




@Then("user redirected to Traversal Page")
public void user_redirected_to_traversal_page() {
   
   
}


@When("user enters message {string}\"in the try editor box")
public void user_enters_message_in_the_try_editor_box1(String cucucumberBDD1234) {
 
Linkedlistpage.Error_Message3(cucucumberBDD1234);


}


@When("user click to Insertion Button")
public void user_click_to_insertion_button() {
   
Linkedlistpage.insertion();
   
}
@Then("user navigates to Insertion page")
public void user_navigates_to_insertion_page() {
   
   
}


@Then("user enters message  {string} in the try editor box")
public void user_enters_message_in_the_try_editor_box111(String string) {
   
Linkedlistpage.Print_Message3(string);

}



@When("user clicks to Deletion Button")
public void user_clicks_to_deletion_button() {

Linkedlistpage.deletion();
   
   
}
@Then("user redirected to Deletion page")
public void user_redirected_to_deletion_page() {
   
   
}




@When("user clicks the Practice Question button")
public void user_clicks_the_practice_question_button() {
   
Linkedlistpage.practicequestion();
   
}
@Then("user redirected to the blank page of Practice Questions")
public void user_redirected_to_the_blank_page_of_practice_questions() {
   
   
}



}

