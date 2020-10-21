@lba_test
Feature: Submit an LBA instruction
  As a portal user
  I want to provide all required information
  So I can submit an LBA Instruction
  Background:
    Given I navigate to Recoveries portal
    And I enter my username
    And I enter my password
    And I click on the sign on button
   And I click on LBA Instruction
    Then LBA "<LBAPage>" is displayed


  Scenario Outline: User Can Submit LBA Instruction
    And I select the correct Zurich system from the dropdown list
    And I enter a "<reference>"
    And I click on next step
    And I enter the "<accidentDate>"
    And I select policyholder title
    And I enter the policyholder firstName "<firstName>"
    And I enter the policyholder lastName "<lastName>"
    And I enter the outlay "<Outlay>"
    And I click on the next step
    And I select third Party Title
    And I enter the thirdPartyFirstName "<thirdPartyFirstName>"
    And I enter the thirdPartyLastName "<thirdPartyLastName>"
    And I select Yes to question 'Is third party Insured?'
    And I select No to do you know TP address
    And I select Yes to knowing TP vehicle reg
    And  I enter the third party VRN "<thirdPartyVRN>"
    And I click on VRN Search
    And I click on the next step again
    And I enter "<thirdPartyInsurer>"
    And I enter the insurer reference "<insurerReference>"
    And I select Yes to Ripe insurer
    And I click on the next step button again
    And I click on the submit button
    And my submission reference is displayed

    Examples:
      |password     | reference | Zurich system | accidentDate |title| firstName | lastName | Outlay|thirdPartyTitle | thirdPartyFirstName | thirdPartyLastName |thirdPartyVRN|thirdPartyInsurer|insurerReference|
      |Fisherman01    |ZACRE7787856  |ZAC            |22/05/2018   |Mr    |Jamie     |Donald      |5400  |Ms   |Sandy                |Jones               |VN62PKF                 |AXA|AXA567       |


















