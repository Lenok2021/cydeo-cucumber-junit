Feature: Examples of Cucumber table implementations
@smoke
  Scenario: List of fruits I like
    Then user should see fruits I like
      | Kiwi        |
      | banana      |
      | cucumber    |
      | orange      |
      | grape       |
      | pomegranate |
     #to be able tdo lines
    #windows: control + alt + L
