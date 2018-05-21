Feature: Check smoke

  Scenario: Check website page is opened
    Given user opens website
    Then verifies that page is opened

  Scenario: Check log in with valid credentials
    Given User opens website
    And clicks on Login button
    And Fill login form
    And Clicks login button
    Then verifies user is logged In

