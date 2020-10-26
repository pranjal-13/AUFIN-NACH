Feature: Amend Mandate Outward feature

  #@TC12_01_AmendOutwardPositiveScenario
  #Scenario: Amend Mandate Outward Test Scenario by approving the Mandate
    #Given User login into system
    #Then User goes to Mandate Management and open Amend Mandate menu
      #| AUBL0000002130202004 |
    #Then User perform amend action
      #|  1234567890 | CURRENT                  |        20000 | Y           | OOFF                                                                                                                                          | WEEK                                                                                                                                                | 12/05/2018 |                               |
      #|  9123456780 |               9123456780 | ab@gmail.com | mbCustIdent | mbRefNumber                                                                                                                                   | mbRelRefNumber                                                                                                                                      | schemeCode | B001-Bill Payment_Credit Card |
      #| mandateNote | A001-On Customer request | mbSource     | mbCycleDate | D:\WorkSpace\CACIB_Branch_Lot-2\AUFIN-NACH\src\main\java\com\aufin\qa\config\MMS-CREATE-HDFC-HDFCH2HUSER1-11052020-000001_front.tif | D:\WorkSpace\CACIB_Branch_Lot-2\AUFIN-NACH\src\main\java\com\aufin\qa\config\MMS-CREATE-HDFC-HDFCH2HUSER1-11052020-000001_detailfront.jpg |            |                               |
    #Then User approves the mandate
      #| AUBL0000002130202004 |
    #
    #Then User goes to Create MMS file 

	@TC12_02_AmendOutwardRejectScenario
  Scenario: Amend Mandate Outward Test Scenario by rejecting the Mandate
    Given User login into system
    Then User goes to Mandate Management and open Amend Mandate menu
      | AUBL0000002130202004 |
    Then User perform amend action
      |  1234567890 | CURRENT                  |        20000 | Y           | OOFF                                                                                                                                          | WEEK                                                                                                                                                | 12/05/2018 |                               |
      |  9123456780 |               9123456780 | ab@gmail.com | mbCustIdent | mbRefNumber                                                                                                                                   | mbRelRefNumber                                                                                                                                      | schemeCode | B001-Bill Payment_Credit Card |
      | mandateNote | A001-On Customer request | mbSource     | mbCycleDate | D:\WorkSpace\CACIB_Branch_Lot-2\AUFIN-NACH\src\main\java\com\aufin\qa\config\MMS-CREATE-HDFC-HDFCH2HUSER1-11052020-000001_front.tif | D:\WorkSpace\CACIB_Branch_Lot-2\AUFIN-NACH\src\main\java\com\aufin\qa\config\MMS-CREATE-HDFC-HDFCH2HUSER1-11052020-000001_detailfront.jpg |            |                               |
    Then User rejects the amend mandate
      | AUBL0000002130202004 |
    

#	@TC12_03_AmendOutwardModifyScenario
  #Scenario: Amend Mandate Outward Test Scenario by sending it in Modify queue
    #Given User login into system
    #Then User goes to Mandate Management and open Amend Mandate menu
      #| AUBL0000002132202004 |
    #Then User perform amend action
      #|  1234567890 | CURRENT                  |        20000 | Y           | OOFF                                                                                                                                          | WEEK                                                                                                                                                | 12/05/2018 |                               |
      #|  9123456780 |               9123456780 | ab@gmail.com | mbCustIdent | mbRefNumber                                                                                                                                   | mbRelRefNumber                                                                                                                                      | schemeCode | B001-Bill Payment_Credit Card |
      #| mandateNote | A001-On Customer request | mbSource     | mbCycleDate | D:\WorkSpace\CACIB_Branch_Lot-2\AUFIN-NACH\src\main\java\com\aufin\qa\config\MMS-CREATE-HDFC-HDFCH2HUSER1-11052020-000001_front.tif | D:\WorkSpace\CACIB_Branch_Lot-2\AUFIN-NACH\src\main\java\com\aufin\qa\config\MMS-CREATE-HDFC-HDFCH2HUSER1-11052020-000001_detailfront.jpg |            |                               |
    #Then User send the mandate to modify queue from Approve screen
      #| AUBL0000002132202004 |
    #Then User modify the details and send the mandate to NPCI
      #| AUBL0000002132202004 | Suvarna    |        1234567890 | SAVINGS           |       20000 | Y           | OOFF        | WEEK           |            |                               |
      #|           9123456780 | 9123456780 | ab@gmail.com      | mbSvcProviderName | mbCustIdent | mandateCode | mbRefNumber | mbRelRefNumber | schemeCode | B001-Bill Payment_Credit Card |
      #| mandateNote          | 08/02/2019 | AUBL00000000000000 | mbSource          | AUBL0000001 | mbCycleDate |             |                |            |                               |
    #Then User approves the mandate
      #| AUBL0000002132202004 |
#	
#		Then User goes to Create MMS file 
#	 
#	 
  #@TC12_04_AmendOutwardNegativeScenario
  #Scenario Outline: Amend Mandate Outward Negative Test Scenario
    #Given User login into system
    #Then User goes to Mandate Management and open Amend Mandate option with proper "<UMRN>"
    #Then check "<Amount>" field for amount field validation
    #Then check "<StartDate>" field for Start date field validation with proper "<UMRN>"
    #Then check "<EndDate>" field for End date field validation with proper "<UMRN>"
    #Then check "<LandlineNo>" field for Landline No. validation with proper "<UMRN>"
    #Then check "<MobileNo>" field for Mobile No. field validation with proper "<UMRN>"
    #Then check "<EmailID>" field for Email Id field validation with proper "<UMRN>"
#
    #Examples: 
      #| UMRN                 | Amount   | StartDate | EndDate | LandlineNo | MobileNo | EmailID |
      #| AUBL0000000000682579 | hhdgfhds | gsdgs     | dgdgr   | hdfjds     | HHFHDSJ  | JJFDJ   |
