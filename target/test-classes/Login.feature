Feature: Register Page

  Scenario Outline: Verify that User can Login successfully
    Given My Account - Login page is open
    When Username field is populated with <Username>
    And Password field is populated with <Password>
    And LoginButton button is clicked
    Then LogOut button is present on the page
    And User can click on LogOut button
    And User is redirected to the Login page

    Examples:
      | Username  | Password        |
      | asdfghjkl | abcedEFGH123!   |
      | GHHKJHI   | QAWEderty1123@# |
