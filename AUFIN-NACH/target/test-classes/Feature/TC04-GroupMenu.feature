#Author: your.email@your.domain.com


Feature: Create Group

@TC_04_01_CreateGroup  
Scenario Outline: Create Group
Given User is logged in GPS
When User goes to Administration and clicks on Group and then clicks on Add menu
Then User enters "<Name>" and "<SortPriority>" and selects "<Priority>" enters the "<Details>"
Then User goes to Administration and goes to Approve screen to approve the record
    
Examples: 
| Name   | SortPriority | Priority  | Details  |
| Admin30 |    0         | Admin     |	Java GPS |  