@GetSingleUser @Api @Regression

Feature: Test API

  Scenario: Get single user success
    Given test api set id to '1'
    When  send get single user request
    Then  get single user response status code should be '200'
    And   get single user response id should be equals with request