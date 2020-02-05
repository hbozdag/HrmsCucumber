@sprint1 @login
Feature: Login

  @smoke
  Scenario: Valid login
    When I enter valid username and valid password
    And I click on login button
    Then I successfully logged in

  @regression
  Scenario: Invalid Login
    Given I open browser and navigated to the HRMS
    When I enter valid username and invalid password
    And I click on login button
    Then I see error message
    And I close browser

  @regression
  Scenario Outline: Invalid Login and message validation
    When I enter "<Username>" and "<Password>"
    And I click on login button
    Then I see "<ErrorMessage>"

    Examples: 
      | Username | Password   | ErrorMessage             |
      | Admin    | Admin123   | Invalid credentials      |
      | Admin    |            | Password cannot be empty |
      |          | Syntax@123 | Username cannot be empty |
      |          |            | Username cannot be empty |
      
      @regression
Scenario: Add Employee
Given I open browser and navigated to the HRMS
When I enter valid username and valid password
And I click on login button
When I click on PIM
And I click on Add Employee
And I enter first name and last name
Then I click on save
And I confirm employee is added
And I close the browser


