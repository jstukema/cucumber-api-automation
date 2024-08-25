Feature: Validate API response

  Scenario: Validate API response with GET request
    Given user set GET request to the api endpoint
    When user sends GET request with HTTP method
    Then I receive valid response
