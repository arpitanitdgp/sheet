package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import stepdefinations.BaseClass;

public class LinkedlistPage extends BaseClass{


WebDriver driver;

public LinkedlistPage( WebDriver driver) {

this.driver = driver;
}


//Tc001
By linkedgetstarted = By.xpath("//*[@class='card-title'][contains(text(),'Linked List')]/../../..//a");

By introduction = By.xpath("//*[contains(text(),'Introduction')]");
//Tc002
By Tryherebutton = By.xpath("//*[contains(text(),'Try here>>>')]");

 By Run   = By.xpath("//button[@type='button']");
   //Tc003
By creatinglinkedlist = By.xpath("//a[contains(text(),'Creating Linked LIst')]");
//TC004
By typesoflinkedlist = By.xpath("//a[contains(text(),'Types of Linked List')]");
//Tc005
By implementlinkedlistinpython = By.xpath("//a[contains(text(),'Implement Linked List in Python')]");
//TC006
By traversal = By.xpath("//a[contains(text(),'Traversal')]");
//Tc007
By Insertion = By.xpath("//a[contains(text(),'Insertion')]");
    //@Tc008
   By Deletion = By.xpath("//a[contains(text(),'Deletion')]");
    //@Tc009
   By PracticeQuestions = By.xpath("//a[contains(text(),'Practice Questions')]");
   
   //By signout = By.xpath("//a[contains(text(),'Sign out')]");
   
public void linkedlistGetStarted() {

driver.findElement(linkedgetstarted).click();
}
   
   
public void intro() {

driver.findElement(introduction).click();
}

public void Try_Here() {

driver.findElement(Tryherebutton).click();
}
   
public void run () {

driver.findElement(Run).click();
}

public void creatng_linkedlist() {

driver.findElement(creatinglinkedlist).click();
}

public void typesoflinkedlist () {

driver.findElement(typesoflinkedlist).click();
}

public void implementlinkedlistpython() {

driver.findElement(implementlinkedlistinpython).click();
}

public void Traversal() {

driver.findElement(traversal).click();
}

public void insertion() {

driver.findElement(Insertion).click();
}

public void deletion() {

driver.findElement(Deletion).click();
}

public void practicequestion() {

driver.findElement(PracticeQuestions).click();
}

public void Error_Message1(String apple2023) {

 WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
 input.click();
 Actions action = new Actions(driver);
 action.keyDown(Keys.COMMAND).sendKeys(apple2023).perform();
}

public void Alert_Message() throws InterruptedException {

 
 Alert alert = driver.switchTo().alert();
System.out.println(alert.getText());
Thread.sleep(1000);
alert.accept(); //click ok button

}

public void Print_Message1(String string) {

WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
 input.click();
 Actions action = new Actions(driver);
 action.keyDown(Keys.COMMAND).sendKeys("print('Numpy,Ninja')").perform();

}


public void Error_Message2(String SheetalKarotiya) {

WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
 input.click();
 Actions action = new Actions(driver);
 action.keyDown(Keys.COMMAND).sendKeys(SheetalKarotiya).perform();


}


public void Print_Message2(String string) {

WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
 input.click();
 Actions action = new Actions(driver);
 action.keyDown(Keys.COMMAND).sendKeys("print('python')").perform();

}

public void Error_Message3(String cucucumberBDD1234) {

WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
 input.click();
 Actions action = new Actions(driver);
 action.keyDown(Keys.COMMAND).sendKeys(cucucumberBDD1234).perform();

}

public void Print_Message3(String string) {

WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
 input.click();
 Actions action = new Actions(driver);
 action.keyDown(Keys.COMMAND).sendKeys("print('Mon,Tue,Wed,Thurs')").perform();


}

public void Error_Message4(String Automationtester) {

WebElement input = driver.findElement(By.xpath("//div[@class='input']"));
 input.click();
 Actions action = new Actions(driver);
 action.keyDown(Keys.COMMAND).sendKeys(Automationtester).perform();
}

//public void Sign_Out () {

//driver.findElement(signout).click();
//}

}
