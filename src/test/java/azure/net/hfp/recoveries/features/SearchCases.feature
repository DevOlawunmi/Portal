@ignore
Feature: Search Cases
  As a Recoveries Portal user
  I want to search for my existing cases
  So I can view their status
  Background:
    Given I navigate to Recoveries portal
    And I enter my username
    And I enter my password
    And I click on the sign on button
    And I click on the Search Cases button
    Then  Search Cases page "<searchCasesPage>" is displayed

  Scenario Outline: User Can Search Cases using our reference
    And I enter our reference "<ourReference>"
    And I click on search
    Then existing cases are displayed

    Examples:
      | ourReference |
    |189611/500    |




