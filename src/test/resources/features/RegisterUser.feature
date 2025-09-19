@regression
Feature: Register

  @testCase2
  Scenario Outline: Register on the web page
    Given The user navigate into form pop up
    When The user enter "<FirstName>" "<LastName>" "<UserName>" "<Password>" "<CustomerType>" "<Role>" "<Email>" "<CellPhone>"
    Then The user clicks save button
    And Validate if the record is added
    Then The User clicks the edit button
    And The User click close button
    Then The User is searching for the user

    Examples:
    | FirstName | LastName | UserName | Password | CustomerType | Role | Email | CellPhone |
    | Nkosinathi | Jiyane | NathiJ | Nathi27@ | CompanyAAA | Admin | nathi@myProject.com | 0738882228 |