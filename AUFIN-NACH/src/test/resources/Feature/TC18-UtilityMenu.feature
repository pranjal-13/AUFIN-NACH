#Author: your.email@your.domain.com

Feature: Utility feature

@TC18_01_Utility
Scenario: Utility feature Test Scenario

Given Login to the GPS application
Then Check Utility>>Dashboard>>Outward Transactions
Then Check Utility>>Dashboard>>Inward Transactions
Then Check Utility>>Dashboard>>Outward Mandates
Then Check Utility>>Dashboard>>Outward API Mandates
Then Check Utility>>Dashboard>>Inward Mandates
Then Check Utility>>Dashboard>>Inward API Mandates
Then Check Report>>Report>>EOD Reconciliation
Then Check Report>>Report>>User Activity
Then Check Report>>Report>>Mandate>>Inward Mandate
Then Check Report>>Report>>Mandate>>Outward Mandate
Then Check Report>>Report>>Payments>>Inward
Then Check Report>>Report>>Payments>>Outward
Then Check Report>>Report>>Charging Report>>Booking Report
Then Check Report>>Report>>Charging Report>>Billing Invoice
Then Check Report>>Report>>Productivity>>Mandate>>Inward Mandate
Then Check Report>>Report>>Productivity>>Mandate>>Outward Mandate
Then Check Report>>Report>>Summary
Then Check Report>>Report>>Aadhar Mapper
Then Check Report>>Report>>CBDT Report-CBDT Report
Then Check Report>>Report>>Return Memo
Then Check Report>>Report>>Corporate Funding Report
