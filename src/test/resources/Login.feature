Feature: Login Page

Scenario - Verify that User can Login successfully
  Given My Account - page is open
  When <Username> is populated with "User"
  And <Password> is populated with "Password"
  And <LoginButton> button is clicked
  Then User is successfully logged