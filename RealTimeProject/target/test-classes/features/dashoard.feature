@Smoke
Feature: Dashboard Functionality

  Background: 
    When User is already on login page
    When user enter username as "admin" and password as "admin"
    When Clicks on signin button

  Scenario: Create lead functionality
    When User clicks on menu-container
    And Clicks on Marketing tab
    And Clicks on Leads tab
    When User clicks on add lead button
    And User enters all the required fields
    And Clicks on save button
    And Clicks on leads button
    Then Verify lead is created
