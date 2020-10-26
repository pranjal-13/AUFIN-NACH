#Author: your.email@your.domain.com


Feature: Create Users for GPS

@TC_03_01_CreateUser
  Scenario Outline: Creating Users
    Given User is login on GPS
    And User goes to administration and users and clicks on Add menu
    Then User enter "<UserName>" and "<FullName>" and selects "<Profile>" and "<Password>" and "<VerifyPassword>" clicks on Ok button
    Then User goes to Administration and clicks to Approve screen
    Then User clicks approves the record and gets log out
  #  Then User updates the password
  #  Then User tries to login with new user

    Examples: 
      | UserName | FullName     | Profile | Password   | VerifyPassword |
      | Maker44  | Admin User44 | Admin   | Secure     | Secure         |
#		  |Checker43 | Admin User43 | Admin   | Secure@123 | Secure@123 		|          
