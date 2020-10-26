
Feature: Amend Mandate ONUS feature
	@TC14_01_AmendONUSPostive
  Scenario Outline: Amend Mandate Outward Test Scenario by approving the Mandate
    Given User logged into MPS system
    Then User goes to Mandate Management and open Amend Mandate menu
    Then User perform amend action on "<Account_Number>" "<Amount>" "<Customer_Name>" "<Customer_Code>" and upload "<Image1>" "<Image2>"
    Then User approves the mandate with "<Customer_Code>"
    And user creates the file from Create MMS file screen menu
    Then user validates the mandate in mandate screen

    Examples: 
      | Account_Number | Amount | Image1        | Image2        | Customer_Code      |
      |	9239893398781  |  18000 | CREATE_01.jpg | CREATE_01.tif | AUBL00000000000000 |
