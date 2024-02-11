@Sanity
Feature: Login Functionality

  Scenario Outline: Verify login functionality with accepted username and password for all user
    When User is already on login page
    When user enter username from accepted "<username>" and "<password>" from password for all users
    When Clicks on signin button
    Then Verify that the user is navigate to dashboard page
    Then Quite the driver

    Examples: 
      | username | password |
      | admin    | admin    |
      | admin    | admin123 |
      | admin123 | admin    |
      | admin123 | admin123 |
