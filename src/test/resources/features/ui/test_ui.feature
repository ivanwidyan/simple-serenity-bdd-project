@BlibliSearch @Web @Regression

Feature: Search

  Scenario: Search at blibli home page success
    Given open the Blibli home page
    When  at blibli home page fill 'iphone' in search box
    Then  at blibli home page click search button