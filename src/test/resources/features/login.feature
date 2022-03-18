@Regression @smoke
Feature: Library app login feature
  As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

 # Accounts are: librarian, student, admin
 # I can write here to write whatever I want if I want to provide additional information
 # you can put tags as much as your want// that depends on scenario
 # if  I put librarian, only one scenario will be executed



  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the library login page

  @librarian @employee @wip
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

  @student
  Scenario: Login as student
    When user enters student username
    And user enters student password
    Then user should see the dashboard

  @admin @employee
  Scenario: Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard

#this is how we add comments in feature file








