Feature: Validate API response

  Scenario: Validate API response with GET request
    Given I set GET api endpoint
    When I send GET HTTP request
    Then I receive valid response