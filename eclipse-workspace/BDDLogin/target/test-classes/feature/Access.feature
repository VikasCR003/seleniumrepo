Feature: Accessing Webpage

  Scenario: Loggin in to web base
    Given user is at web page 
    When user enters the user name and password
    Then user should be forwarded to dashboard
