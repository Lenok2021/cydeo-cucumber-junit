@Regression @smoke
Feature: Library app login feature
  As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

 # Accounts are: librarian, student, admin
 # I can write here to write whatever I want if I want to provide additional information
 # you can put tags as much as your want// that depends on scenario
 # if  I put librarian, only one scenario will be executed

  @librarian @employee
  Scenario:  Login as Librarian
    When user enters librarian name
    And user enters librarian password
    Then user should see the dashboard

  @student
  Scenario: Login as student
    When user enters student name
    And user enters student password
    Then user should see the dashboard

    @admin @employee
  Scenario: Login as admin
    When user enters admin name
    And user enters admin password
    Then user should see the dashboard

#this how to add comments in feature file









