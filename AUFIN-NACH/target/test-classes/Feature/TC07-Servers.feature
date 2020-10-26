Feature: Servers feature

	@TC_07_01_Servers
  Scenario: Servers feature Test Scenario
    Given User login
    Then User goes to Environment and Open Run menu
    Then Check NPCI_Upload_Server
    Then Check NPCI_Download_Server
    Then Check File_Router_Server
    Then Check MMS_InFile_Server
    Then Check MMS_InProcess_Server
    Then Check MMS_OutFileCreate_Server
    Then Check EsignMandateVerificationServer
    Then Check API_Mandate_TAT_Check_Server
    Then Check API_Mandate_File_Create_Server
    Then Check API_Mandate_File_Process_Server
    Then Check DBTL_InFile_Server
    Then Check DBTL_InProcess_Server
    Then Check DBTL_AccountVerification_Server
    Then Check DBTL_OutFileCreate_Server
    Then Check CBDT_InFile_Server
    Then Check CBDT_InProcess_Server
    Then Check CBDT_OutFile_Server
    Then Check CBDT_Posting_Server
    Then Check NACH_InFile_Server
    Then Check NACH_InProcess_Server
    Then Check NACH_OutProcess_Server
    Then Check ReversalAccounting_Server
    Then Check NACH_OutFileCreate_Server
    Then Check Corporate_InFile_Server
    Then Check Corporate_InProcess_Server
    Then Check CBS_Posting_Server_NACH
    Then Check CBS_Posting_Server_Inward
    Then Check CBS_Posting_Server_CORP
    Then Check Corporate_Funding_Posting_Server_CORP
    Then Check AadharMapper_InFile_Server
    Then Check AadharMapper_InProcess_Server
    Then Check AadharMapper_OutFileProcess_Server
    Then Check Mandate_Alert_Server
    Then Check Transaction_Alert_Server
    Then Check Sms_Alert_Server
    Then Check AadharMapper_Alert_Server
    Then Check ESIGNMMSInFileServer
