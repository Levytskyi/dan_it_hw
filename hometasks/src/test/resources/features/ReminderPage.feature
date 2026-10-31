Feature: The reminder page functionality verification

  Scenario: Verify the email field error message is displayed
    Given User opens Home Page
    When User clicks the login button on the Home Page
    And User clicks the password reminder button on the Login Page
    And User enters "incorrectEmail" in the email field on the Reminder Page
    And User clicks the send button on the Reminder Page
    Then an error message is displayed on the Reminder Page