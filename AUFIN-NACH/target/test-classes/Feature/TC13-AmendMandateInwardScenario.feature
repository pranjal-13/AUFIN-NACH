


Feature: Amend Mandate Inward feature
	
	@TC13_01_AmendInwardPostive
  Scenario Outline: Amend Mandate Inward Test Scenario by approving the Mandate
    Given Login into the system
    Then User goes to Mandate Management and open Accept Mandate menu with proper "<UMRN>"
    Then user check all the fields for validation
    Then User accept the mandate
    Then User goes to approve the mandate with proper "<UMRN>"
    Then User goes to Mandate Management and open Create MMS File menu

    Examples: 
      | UMRN                 |
      | AUBL0000000000682579 |

	@TC13_02_AmendInwardReject
  Scenario Outline: Amend Mandate Inward Test Scenario by rejecting the Mandate
    Given Login into the system
    Then User goes to Mandate Management and open Accept Mandate menu with proper "<UMRN>"
    Then User accept the mandate
    Then User goes to reject the mandate with proper "<UMRN>"

    Examples: 
      | UMRN                 |
      | AUBL0000000000029803 |

	@TC13_03_AmendInwardModify
  Scenario Outline: Amend Mandate Inward Test Scenario by sending it in Modify queue
    Given Login into the system
    Then User goes to Mandate Management and open Accept Mandate menu with proper "<UMRN>"
    Then User accept the mandate
    Then User will send the mandate to modify queue from Approve screen using proper "<UMRN>"

    Examples: 
      | UMRN                 |
      | AUBL0000000000029803 |
