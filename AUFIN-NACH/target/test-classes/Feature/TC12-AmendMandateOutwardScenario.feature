Feature: Amend Mandate Outward feature

  @TC_12_01_AmendPositiveScenarios
  Scenario: Amend Mandate Outward Test Scenario by approving the Mandate
    Given User login into MPS system
    Then User goes to Mandate Management and open Amend Mandate menu
      | AUBL0000000000682579 |
    Then User perform amend action
      |  1234567890 | CURRENT                  |        20000 | Y           | OOFF                                                                                                                                          | WEEK                                                                                                                                                | 12/05/2018 |                               |
      |  9123456780 |               9123456780 | ab@gmail.com | mbCustIdent | mbRefNumber                                                                                                                                   | mbRelRefNumber                                                                                                                                      | schemeCode | B001-Bill Payment_Credit Card |
      | mandateNote | A001-On Customer request | mbSource     | mbCycleDate | E:\\workspace\\DEFAULT_WORKSPACE\\AUFIN-NACH\\src\\main\\java\\com\\aufin\\qa\\config\\MMS-CREATE-HDFC-HDFCH2HUSER1-11052020-000001_front.tif | E:\\workspace\\DEFAULT_WORKSPACE\\AUFIN-NACH\\src\\main\\java\\com\\aufin\\qa\\config\\MMS-CREATE-HDFC-HDFCH2HUSER1-11052020-000001_detailfront.jpg |            |                               |
    Then User approves the mandate
      | AUBL0000000000682579 |

 	@TC_12_02_RejectAmendMandate
  Scenario: Amend Mandate Outward Test Scenario by rejecting the Mandate
    Given User login into MPS system
    Then User goes to Mandate Management and open Amend Mandate menu
      | AUBL0000000000682579 |
    Then User perform amend action
      |  1234567890 | CURRENT                  |        20000 | Y           | OOFF                                                                                                                                          | WEEK                                                                                                                                                | 12/05/2018 |                               |
      |  9123456780 |               9123456780 | ab@gmail.com | mbCustIdent | mbRefNumber                                                                                                                                   | mbRelRefNumber                                                                                                                                      | schemeCode | B001-Bill Payment_Credit Card |
      | mandateNote | A001-On Customer request | mbSource     | mbCycleDate | E:\\workspace\\DEFAULT_WORKSPACE\\AUFIN-NACH\\src\\main\\java\\com\\aufin\\qa\\config\\MMS-CREATE-HDFC-HDFCH2HUSER1-11052020-000001_front.tif | E:\\workspace\\DEFAULT_WORKSPACE\\AUFIN-NACH\\src\\main\\java\\com\\aufin\\qa\\config\\MMS-CREATE-HDFC-HDFCH2HUSER1-11052020-000001_detailfront.jpg |            |                               |
    Then User rejects the amend mandate
      | AUBL0000000000682579 |

	@TC_12_03_ModifyAmendMandate
  Scenario: Amend Mandate Outward Test Scenario by sending it in Modify queue
    Given User login into MPS system
    Then User goes to Mandate Management and open Amend Mandate menu
      | AUBL0000000000682579 |
    Then User perform amend action
      |  1234567890 | CURRENT                  |        20000 | Y           | OOFF                                                                                                                                          | WEEK                                                                                                                                                | 12/05/2018 |                               |
      |  9123456780 |               9123456780 | ab@gmail.com | mbCustIdent | mbRefNumber                                                                                                                                   | mbRelRefNumber                                                                                                                                      | schemeCode | B001-Bill Payment_Credit Card |
      | mandateNote | A001-On Customer request | mbSource     | mbCycleDate | E:\\workspace\\DEFAULT_WORKSPACE\\AUFIN-NACH\\src\\main\\java\\com\\aufin\\qa\\config\\MMS-CREATE-HDFC-HDFCH2HUSER1-11052020-000001_front.tif | E:\\workspace\\DEFAULT_WORKSPACE\\AUFIN-NACH\\src\\main\\java\\com\\aufin\\qa\\config\\MMS-CREATE-HDFC-HDFCH2HUSER1-11052020-000001_detailfront.jpg |            |                               |
    Then User send the mandate to modify queue from Approve screen
      | AUBL0000000000682579 |
    Then User modify the details and send the mandate to NPCI
      | AUBL0000000000682579 | Suvarna    |        1234567890 | SAVINGS           |       20000 | Y           | OOFF        | WEEK           |            |                               |
      |           9123456780 | 9123456780 | ab@gmail.com      | mbSvcProviderName | mbCustIdent | mandateCode | mbRefNumber | mbRelRefNumber | schemeCode | B001-Bill Payment_Credit Card |
      | mandateNote          | 08/02/2019 | mbSvcProviderCode | mbSource          | AUBL0000001 | mbCycleDate |             |                |            |                               |
    Then User approves the mandate
      | AUBL0000000000682579 |

  @TC_12_04_NegativeScenario
  Scenario Outline: Amend Mandate Outward Negative Test Scenario
    Given User login into MPS system
    Then User goes to Mandate Management and open Amend Mandate option with proper "<UMRN>"
    Then check "<Amount>" field for amount field validation
    Then check "<StartDate>" field for Start date field validation with proper "<UMRN>"
    Then check "<EndDate>" field for End date field validation with proper "<UMRN>"
    Then check "<LandlineNo>" field for Landline No. validation with proper "<UMRN>"
    Then check "<MobileNo>" field for Mobile No. field validation with proper "<UMRN>"
    Then check "<EmailID>" field for Email Id field validation with proper "<UMRN>"

    Examples: 
      | UMRN                 | Amount   | StartDate | EndDate | LandlineNo | MobileNo | EmailID |
      | AUBL0000000000682579 | hhdgfhds | gsdgs     | dgdgr   | hdfjds     | HHFHDSJ  | JJFDJ   |
