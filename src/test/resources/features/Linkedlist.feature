@LinkedList
Feature: Linked List

  Background: 
    Given user Launch the Browser
    When user open the Homepage of dsportal and click get started button
    When user Navigate to Sign in button
    When user enters the Valid Username
    And enter Valid Password
    And user click the login button
    Then user should successfully login into Homepage

 @testcase_26
  Scenario: Open the Introduction page
    When user click to Get Started button below Linked List
    And The user clicks Introduction button of LinkedList
    Then The user should be directed to Introduction of Linked List Page

  @testcase_27
  Scenario: Open the Try Editor page in Introduction page
    When user click to Get Started button below Linked List
    When The user clicks Introduction button of LinkedList
    And The user clicks try Here button
    Then The user should be redirected to try Editor page

@testcase_28
  Scenario: Get Syntax Error Message in tryEditor page
    When user click to Get Started button below Linked List
    When The user clicks Introduction button of LinkedList
    And The user clicks try Here button
    And user enters message "Apple 2023" in the try editor box
    When user clicks run Button
    Then user should get an Alert message of Syntx Error
    And user click  ok Button

  @testcase_29
  Scenario: Open the page of Creating Linked List
    When user click to Get Started button below Linked List
    And user navigates to Created Linked List Button
    Then user should land to Created Linked List Page

  @testcase_30
  Scenario: Print the message in TryEditor box
    When user click to Get Started button below Linked List
    And user navigates to Created Linked List Button
    And The user clicks try Here button
    Then The user should be redirected to try Editor page
    And user enters message "print('Numpy,Ninja')"in the try editor box
    When user clicks run Button
    Then user should see the print message

  @testcase_31
  Scenario: Open the page of Types of Linked List
    When user click to Get Started button below Linked List
    And user navigates to Types of Linked List Button
    Then user redirected to Types of Linked List Page

 @testcase_32
  Scenario: Open the try editor page
    When user click to Get Started button below Linked List
    When user navigates to Types of Linked List Button
    And The user clicks try Here button
    Then The user should be redirected to try Editor page

  @testcase_33
  Scenario: Get the alert message
    When user click to Get Started button below Linked List
    When user navigates to Types of Linked List Button
    When user click to Traversal Button
    And The user clicks try Here button
    And user enter the message "SheetalKarotiya" in the editor box
    When user clicks run Button
    Then user should get an Alert message of Syntx Error
    And user click  ok Button

 @testcase_34
  Scenario: Open the page of Implement Linked List in Python
    When user click to Get Started button below Linked List
    When user click to Implement Linked List in Python Button
    Then user navigates to Implement Linked List in Python page

  @testcase_35
  Scenario: Print the message in TryEditor box
    When user click to Get Started button below Linked List
    When user click to Implement Linked List in Python Button
    And The user clicks try Here button
    Then The user should be redirected to try Editor page
    And user enters message "print('python')in the try editor box
    When user clicks run Button
    Then user should see the print message

 @testcase_36
  Scenario: Open the Traversal Page
    When user click to Get Started button below Linked List
    When user click to Traversal Button
    Then user redirected to Traversal Page

  @testcase_37
  Scenario: Get the Attribute Error message
    When user click to Get Started button below Linked List
    When user click to Traversal Button
    And The user clicks try Here button
    And user enters message "cucucumberBDD1234""in the try editor box
    When user clicks run Button
    Then user should get an Alert message of Syntx Error
    And user click  ok Button

 @testcase_38
  Scenario: Open the Insertion Page
    When user click to Get Started button below Linked List
    When user click to Insertion Button
    Then user navigates to Insertion page

  @testcase_39
  Scenario: Print the message in TryEditor box
    When user click to Get Started button below Linked List
    When user click to Insertion Button
    And The user clicks try Here button
    Then The user should be redirected to try Editor page
    And user enters message  "print('Mon,Tue,Wed,Thurs')" in the try editor box
    When user clicks run Button
    Then user should see the print message

  @testcase_40
  Scenario: Open the Deletion Page
    When user click to Get Started button below Linked List
    When user clicks to Deletion Button
    Then user redirected to Deletion page

  @testcase_41
  Scenario: Get the TypeError message
    When user click to Get Started button below Linked List
    When user clicks to Deletion Button
    And The user clicks try Here button
    And user enters message "Automationtester" in the try editor box
    When user clicks run Button
    Then user should get an Alert message of Syntx Error
    And user click  ok Button

  @testcase_42
  Scenario: Open the Practice Questions Page
    When user click to Get Started button below Linked List
    And The user clicks Introduction button of LinkedList
    And user clicks the Practice Question button
    Then user redirected to the blank page of Practice Questions
 