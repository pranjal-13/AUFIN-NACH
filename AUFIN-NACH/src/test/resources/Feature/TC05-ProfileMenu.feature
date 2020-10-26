#Author: your.email@your.domain.com


Feature: Create Profile

@TC_05_01_MakerProfile
Scenario Outline: Create Profile
Given when user is logged in GPS
And User goes to Administration and clicks to Profile and then clicks on Add menu
Then User enters profile name for maker "<ProfileName>" and clicks on Checkbox and clicks Ok button
Then User goes to Administration and Clicks on Profile and goes to Approve menu and approve the record

Examples:
|ProfileName|
|Maker09   |




#@TC_05_02_CheckerProfile
#Scenario Outline: Create Profile
#Given when user is logged in GPS
#And User goes to Administration and clicks to Profile and then clicks on Add menu 
#Then User enters profile name for checker "<ProfileName>" and clicks on CheckAll checkbox and clicks on Ok button
#Then User goes to Administration and Clicks on Profile and goes to Approve menu and approve the record 
    
#Examples:
#|ProfileName   |
#|Checker30       |