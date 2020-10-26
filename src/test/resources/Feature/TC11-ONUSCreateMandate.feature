#Author: your.email@your.domain.com


Feature: Create Onus Mandates

@TC_11_01_ONUSPositiveScenario
Scenario Outline: Create Onus Mandate
Given user logged in MPS and creates new mandate from create mandate menu
When user enters "<Name>" "<Account_Number>" "<Amount>" "<Customer_Name>" "<Customer_Code>" "<IFSC_Code>" and upload "<Image1>" "<Image2>" and clicks on ok button
Then User goes to Approve Mandate screen
And user approves the mandate using"<Customer_Code>"
And user goes to create file from Create MMS file screen menu
#Then user validates the mandate in list mandate screen

Examples:
| Name | Account_Number | Amount | Customer_Name | Customer_Code | IFSC_Code | Image1 | Image2 | Customer_Code |
| Johny Parson | 9239893398761 | 15000 | Aditi | AUFN01234567890129 | AUBL6547890 | CREATE_01.jpg | CREATE_01.tif | AUFN01234567890129 |


#@TC_11_02_NegativeScenario
#Scenario: Validation of Create Outward Mandate Fields
# Given user logged in MPS and creates new mandate from create mandate menu
#When user enters invalid name "<Name>"
#Then user enters invalid account_number "<Account_Number>"
#Then user enters invalid amount "<Amount>"
#Then user enters invalid customer_name "<Customer_Name>"
#Then user enters invalid customer_code "<Customer_Code>"
#Then user enters invalid ifsc_code "<IFSC_Code>"
#
# Examples:
#| Name | Account_Number | Amount | Customer_Name | Customer_Code | IFSC_Code | Image1 | Image2 | Customer_Code |
#| asdasfasf | 9239dsdsad1 | asdasd | 345666 | AUBL00000000000000r | 34323423533 | CREATE_01.jpg | CREATE_01.tif | AUBL0000000000005 |
#|tkjnlglkfnn | 7762sfsdfds22 | fgggg4 | 343433 | AUBL0000000000000e0 | SB555555555 | CREATE_01.jpg | CREATE_01.tif | AUBL000000000000050 |

