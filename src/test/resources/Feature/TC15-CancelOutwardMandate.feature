#Author: your.email@your.domain.com

Feature: Cancel Outward Mandate

@TC15_01_CancelOutwardPostive
Scenario Outline: Cancelling Outward Mandates
 
  Given User is going to login in GPS
  And User goes to application and Mandate Management and clicks on Cancel Mandate menu
  Then User searchs on the basis of "<UMRN>" and cancels that mandate and logs out
  Then User goes to Application and Mandate Management and clicks to Approve Mandate screen
  Then User searchs on the basis of "<UMRN>" and approve the mandate 
  Then user generates the file from Create MMS file screen menu
  Then user will validate the mandate in list mandate screen
 	
Examples: 
| UMRN   |
|	AUBL0000002131202004|
