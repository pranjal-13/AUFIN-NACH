#Author: your.email@your.domain.com

Feature: Cancel ONUS Mandate

@TC17_01_OnusCancelPostive
Scenario Outline: Cancelling ONUS Mandates
 
  Given User is going to get login in GPS
  And User goes to the application menu and Mandate Management and clicks on Cancel Mandate menu
  Then User searchs on the basis of "<UMRN>" and cancels that ONUS mandate and logs out
  Then User goes to Application menu and Mandate Management and clicks to Approve Mandate screen
  Then User searchs on the basis of "<UMRN>" and approve that ONUS mandate 
 
Examples: 
| UMRN   |
|	AUBL0000000624201705|
