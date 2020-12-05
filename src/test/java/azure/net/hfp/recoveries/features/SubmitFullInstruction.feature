@full_instruction
Feature: Submit a Full instruction
  As a portal user
  I want to provide all required information
  So I can submit a Full Instruction
  Background:
    Given I navigate to Recoveries portal
    And I enter my username
    And I enter my password
    And I click on the sign on button
    And I click on Full Instruction
    Then Full Instruction "<Full Instruction page>" is displayed


  Scenario Outline: User Can Submit Full Instruction
    And I enter a "<reference>" FI
    And I select the correct Zurich system from the dropdown list FI
    And I click on next step one
    And I enter the "<accidentDate>"
    And I select policyholder title for full ins
    And I enter the full ins policyholder firstName "<firstName>"
    And I enter the full ins policyholder lastName "<lastName>"
    And I enter the full ins outlay "<outlay>"
    And I click on the next step two
    And I select full ins third Party Title
    And I enter the full ins thirdPartyFirstName "<thirdPartyFirstName>"
    And I enter the full ins thirdPartyLastName "<thirdPartyLastName>"
    And I select Yes to question Is third party Insured full inst
    And I select No to do you know TP address full ins
    And I select No to knowing TP vehicle reg
    And I click on the next step three
    And I select TPI "<thirdPartyInsurer>"
    And I enter the TPI street "<number>"
    And I enter the TPI "<postcode>"
    And I click on the address lookup
    And I enter the insurer "<reference number>"
    And I enter the insurer email "<email>"
    And I select no to ripe insurer
    And I click on next step four
    And select No to knowing insured vehicle details
    And I click on next step five
    And I enter policyholder street number"<policyholderStreetNumber>"
    And I enter policyholder postcode "<policyholderPostcode>"
    And I click on address lookup
    And I enter policyholder phone number "<phone number>"
    And I enter policyholder's email address "<policyholderEmail>"
    And I click on next step six
    And I answer yes to was policyholder driving?
    And I click on next step seven
    And I answer yes to was third party driving?
    And I click on next step eight
    And I enter the accident location
    And I enter the accident circumstances
    And I click on next step nine
    Then the summary page is displayed
    And I click on the submit full instruction button




    Examples:
      | reference | accidentDate | firstName | lastName | outlay | thirdPartyFirstName | thirdPartyLastName |thirdPartyInsurer|
    |Genz5678   |2/6/2020      |James Hadley|Chase    |1800    |Sidney               |Sheldon             |ACE Insurance    |