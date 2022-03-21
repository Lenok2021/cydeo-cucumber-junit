Feature: User should be able to login using correct credentials

  @wip
  Scenario: Positive login scenario
    Given user is on the login page of web table app
    When user enters "Tester"
    And user enters "Test"
    And user clicks to login button
    Then user should see url contains orders