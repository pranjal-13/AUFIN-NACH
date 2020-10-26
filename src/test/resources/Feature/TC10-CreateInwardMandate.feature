#Author: your.email@your.domain.com

Feature: To test Create Inward Mandate Functionality

  @TC_10_01_AcceptMandate
  Scenario: Create Inwarad Mandate
    Given user is on MPS page
    When user accept the mandate from accept mandate screen
 	     | AUFN0000000000682402 |
  	And user approve the mandate
     | AUFN0000000000682402 |
    Then user creates file from Create MMS outfile screen

  @TC_10_02_RejectMandate
  Scenario Outline: Reject Inward Mandate
  	Given user is on MPS page 
  	Then user selects "<UMRN>" "<Reject Reason>" and rejects the mandate from accept mandate screen
   	And user approves the reject mandate "<UMRN>"
  	Then user creates file from Create MMS outfile screen
  	
  	Examples:
  	
   	|     UMRN  			 	 |								Reject Reason										| UMRN 										 |
  	|AUFN0000000000682601|     M004	Drawers signature required            |	AUFN0000000000682601		 |