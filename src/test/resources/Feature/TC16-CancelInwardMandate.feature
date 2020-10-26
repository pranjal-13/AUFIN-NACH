#Author: your.email@your.domain.com

Feature: Cancel Inward Mandateb

	@TC16_01_CancelInward
  Scenario Outline: Cancelling Inward Mandates
 
  #	Given User is going to login in the GPS
    #And User goes to GPS application and select Mandate Management and clicks on Accept Mandate menu
    #Then User searchs on the basis of "<UMRN>" and accepts the mandate and logs out
    #Then User goes to Application and select Mandate Management and clicks to Approve Mandate screen
    #Then User searchs on the basis of "<UMRN>" and approve the cancelled mandate
    Then user will validate the cancel inward mandate in list mandate menu
    
Examples: 
| UMRN   |
|	AUFN0000000000682402|

