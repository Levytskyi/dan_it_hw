Feature: The Login Page functionality verification

  Scenario: Verify the password field can accept the value
    Given User opens Home Page
    When User clicks the login button on the Home Page
    And User enters "Password" in the password field on the Login Page
    Then the password field on the Login Page contains "Password"