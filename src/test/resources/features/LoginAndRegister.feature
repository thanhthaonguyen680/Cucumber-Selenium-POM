Feature: Register and Login BankGuru

  As a user of the Bankguru website
  I want to be able to register and log in with my account
  So that I can access my account-related features and manage my website
  @register_and_login
  Scenario: Register to login system
    # open URL -> hooks
    Given Open Register page
    When Input to Email
    And Click to Submit button
    Then Get User and Password Information
    When Back to Login page
    When Submit valid infor to Login form
    Then Verify Homepage display
