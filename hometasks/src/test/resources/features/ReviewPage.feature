Feature: The Review Page functionality verification

  Scenario: Verify the review page opens for the selected store
    Given User opens Home Page
    When User clicks the Review Page button
    And User enters "STYLUS" in the store search field on the Review Page
    And User selects the store at position 1 from the dropdown on the Review Page
    Then The review page for "STYLUS" is displayed