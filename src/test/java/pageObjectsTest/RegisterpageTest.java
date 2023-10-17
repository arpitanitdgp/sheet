package pageObjectsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import stepdefinationsTest.BaseClassTest;


 public class RegisterpageTest extends BaseClassTest{
    
 public WebDriver driver;



 public RegisterpageTest(WebDriver driver) {
    
    this.driver = driver;

   }

 By register = By.xpath("//a[text()=' Register ']");
 By registerBtn = By.xpath("//input[@value='Register']");
 By loginbutton = By.xpath("//a[contains(text(),'Login')]");
 By dropdown = By.xpath("//div[@class='nav-item dropdown']");
By arraybutton = By.xpath("//a[contains(text(),'Arrays')]");
By Alertmessage = By.xpath("//div[@class='alert alert-primary']");
 // By errorMessage = By.xpath("//div[@class='alert alert-primary']");



 public void register() {

 driver.findElement(register).click();

 }

 public void registerbutton() {

 driver.findElement(registerBtn).click();

 }

 public void Username(String username) {


 WebElement usernameinput= driver.findElement(By.name("username"));
 usernameinput.sendKeys(username);


 }

 public void Password1(String password) {


 WebElement passwordinput= driver.findElement(By.name("password1"));
 passwordinput.sendKeys(password);


 }

 public void Password2(String password) {


 WebElement passwordinput2= driver.findElement(By.name("password2"));
 passwordinput2.sendKeys(password);

 }


public void loginbutton () {
	
	driver.findElement(loginbutton).click();
}

public void dropdownbutton() {
	
	driver.findElement(dropdown).click();
}

public void arraybutton() {
	
	driver.findElement(arraybutton).click();
}


public void alertmessage() {
	
	driver.findElement(Alertmessage).isDisplayed();
}





 }