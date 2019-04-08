Feature: Register to facebook
  In order to post my life on facebook
  As a social butterfly like I am
  I want to register myself to facebook

  Scenario: Registration to facebook
    Given the user is on the facebook registration page and excited to share his/her life away
    When the user provides randomly generated data in the required fields
    And clicks on the Sign up button
    Then the user should be registered

