
Feature: Maintenance feature

  #@TC_08_01_AddCalendar
  #Scenario Outline: To add calendar with valid data
    #Given User login in the application
    #Then User goes to Maintenance and open Calendar menu to add Calendar for "<Year>"
    #Then User Approves Calendar for "<Year>"
    #Then User View the Calendar for "<Year>"
#
    #Examples: 
      #| Year |
      #| 2049 |

  #@TC_08_02_RejectCalendar
  #Scenario Outline: To add calendar with valid data
    #Given User login in the application
    #Then User goes to Maintenance and open Calendar menu to add Calendar for "<Year>"
    #Then User Reject Calendar for "<Year>"
    #Then User Views the Calendar for "<Year>"
#
    #Examples: 
      #| Year |
      #| 2050 |

  #@TC_08_03_InvalidYearScenario
  #Scenario Outline: To add calendar with invalid data
    #Given User login in the application
    #Then User open Calendar menu to add Calendar for "<Year>"
#
    #Examples: 
      #| Year |
      #| sgs  |

  #@TC_08_04_ExistingYearScenario
  #Scenario Outline: To add calendar with Existing data
    #Given User login in the application
    #Then User add Calendar for "<Year>"
#
    #Examples: 
      #| Year |
      #| 2049 |

  @TC_08_05_AddIndustryType
  Scenario Outline: Add Industry Type Test Scenario with valid data
    Given User login in the application
    Then User goes to Corporate CMS and open Industry type menu to add Industry type with "<IndustryTypecode>" and "<IndustryTypedesc>"
    Then Checker will approve the same for "<IndustryTypecode>"
    Then Maker will view the list

    Examples: 
      | IndustryTypecode | IndustryTypedesc |
      | AUBL00015        | AUBL15           |

	@TC_08_06_AddIndustryTypeCode
  #Scenario Outline: Add Industry Type Test Scenario
    #Given User login in the application
    #Then User goes to Corporate CMS and open Industry type menu to add Industry type with "<IndustryTypecode>" and "<IndustryTypedesc>"

  @TC_08_07_AddBusinessGroup
  Scenario Outline: Add Business Group Test Scenario with valid data
    Given User login in the application
    Then User goes to Corporate CMS and open Business Group menu to add Business group with "<Groupname>" and "<GroupDesc>"
    Then checker will approve for "<Groupname>"
    Then User will view List

    Examples: 
      | Groupname | GroupDesc |
      | Test012   | Testing   |

  @TC_08_08_InvalidBusinessGroupScenario
  Scenario Outline: Add Business Group Test Scenario with Invalid data
    Given User login in the application
    Then User add Business group with "<Groupname>" and "<GroupDesc>"

    Examples: 
      | Groupname | GroupDesc |
      |           |           |

	@TC_08_09_AddAccounting
  Scenario Outline: Add Accounting Test Scenario with valid data
    Given User login in the application
    Then User goes to Corporate CMS and open Accounting menu to add Accounting using "<Accountingcode>","<AccountingDesc>","<CreditAccNo>","<DebitAccNo>","<ChargeAccNo>","<IsAutoDebitCharge>"
    Then Checker should approve the same with "<Accountingcode>"
    Then User should view the List

    Examples: 
      | Accountingcode | AccountingDesc | CreditAccNo | DebitAccNo  | ChargeAccNo | IsAutoDebitCharge |
      | TESTING7       | TESTINGPART    | 12345678904 | 12345678904 | 12345678904 | C                 |

	@TC_08_10_AddCustomer
  Scenario: Add Customer Test Scenario with valid data
    Given User login in the application
    Then User goes to Corporate CMS and open Customer menu to add Customer
      | AUBL00000000000008 | Suvarna | AUBL0000008 |       |             |               |     |         |
      | Suvarna            | Kotak   |      401305 | india | MAHARASHTRA | abc@gmail.com | any | savings |
      | 04/05/2020         | Test010 |             |       |             |               |     |         |
      | TESTING7           |         |             |       |             |               |     |         |
    Then Checker will approve the Customer
    Then User views the Customer

#	@TC_08_11_IFSCList
  #Scenario: IFSC List Test Scenario
    #Given User login in the application
    #Then User goes to Static Data and open DB Loads menu to add IFSC codes
    #Then User uploads IFSC list
      #| IFSC | Y | E:\\AUFIN\\Live_Bank_List_on-NACH-20112019.xls |
    #Then User views IFSC List
      #| admin1 | secure |
