#Author: your.email@your.domain.com

Feature: To test create outward mandate functionality

  @TC_09_01_CreateOutwardMandatePositiveScenario
  Scenario Outline: Create Outward Mandate
    #Given user is on MPS and creates new mandate from create mandate menu
    #When user enters "<Name>" "<Account_Number>" "<Amount>" "<Customer_Name>" "<Customer_Code>" "<IFSC_Code>" and upload "<Image1>" "<Image2>"
    #Then user clicks on ok and confirm button
    #And user approves the mandate "<Customer_Code>"
    And user creates file from Create MMS file screen menu
  #  Then user validates the mandate in list mandate screen

    Examples: 
      | Name        | Account_Number | Amount | Customer_Name | Customer_Code      | IFSC_Code   | Image1        | Image2        | Customer_Code      |
      | Priya K  | 9239893398761  |  14400 | Aditi         | AUBL00000000000000 | SBIN0004343 | CREATE_01.jpg | CREATE_01.tif | AUBL00000000000000 |
   #   | Darshan R   | 9239893398744  |  13500 | Aditi         | AUBL00000000000000 | SBIN0004343 | CREATE_01.jpg | CREATE_01.tif | AUBL00000000000000 |
      
     #@TC_09_02_CreateOutwardMandateNegativeScenario
     #Scenario: Validation of Create Outward Mandate Fields
     # Given user is on MPS and creates new mandate from create mandate menu
      #When user enters invalid name "<Name>" 
      #Then user enters invalid account_number "<Account_Number>" 
      #Then user enters invalid amount "<Amount>" 
      #Then user enters invalid customer_name "<Customer_Name>" 
      #Then user enters invalid customer_code "<Customer_Code>"
      #Then user enters invalid ifsc_code "<IFSC_Code>" 
      #
     # Examples:
      #| Name       | Account_Number | Amount | Customer_Name | Customer_Code       | IFSC_Code   | Image1        | Image2        | Customer_Code      |
      #| asdasfasf  | 9239dsdsad1    |  asdasd | 345666       | AUBL00000000000000r | 34323423533 | CREATE_01.jpg | CREATE_01.tif | AUBL0000000000005  |
      #|tkjnlglkfnn | 7762sfsdfds22  |  fgggg4 | 343433       | AUBL0000000000000e0 | SB555555555 | CREATE_01.jpg | CREATE_01.tif | AUBL000000000000050 |
      

