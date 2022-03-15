Feature: Library app login feature
  As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

  Accounts are: librarian, student, admin
  // I can write here to write whatever I want if I want to provide additional information

  Scenario:  Login as Librarian
    When user enters librarian name
    And user enters librarian password
    Then user should see the dashboard

  Scenario: Login as student
    When user enters student name
    And user enters student password












