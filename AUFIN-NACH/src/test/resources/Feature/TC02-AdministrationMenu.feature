#Author: your.email@your.domain.com

Feature: Administration Link Check

@TC_02_01_Adminstration
Scenario: Administration Link Check

Given User is in GPS
And User clicks on System menu and its submenu
And User clicks on user menu and its submenu
And User clicks on Group menu and its submenu
Then User clicks on Profile menu and its submenu
Then Logout User
