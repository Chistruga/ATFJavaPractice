Feature: Register Page

  Scenario Outline: Verify that User can register successfully in the system
    Given My Account - Register page is open
    When User fills Username field with <Username>
    And User fills Email field with <Email>
    And User fills Password field with <Password>
    And Register button is clicked
    Then LogOut button is present on the page
    And User can click on LogOut button
    And User is redirected to the Login page

    Examples:
      | Username | Email          | Password        |
      | GHTKJHI  | atrs@mhail.com | QAWEderty1123@# |
      | GHRKKHI  | aakm@mhail.com | QAWEderty1123@# |