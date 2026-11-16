Feature: Product Details Page functionality verification

  Scenario: Verify user ca be navigated to the correct Product Details Page
    Given User opens Home Page
    When User enters "xBox" word into search field on Home Page
    And User clicks on search button on Home Page
    And User remember 2 product name on Search Result Page
    And User clicks on 2 product picture on Search Result Page
    Then User verify product title is correct on Product Details Page