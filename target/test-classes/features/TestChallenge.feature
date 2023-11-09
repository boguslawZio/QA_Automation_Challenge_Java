@mainPage

Feature: QA Automation Challenge

  Background:
    Given I access the sapfioneer page

#  Scenario: Validate Main Page Buttons
#    Then All of the Main Page Menu Buttons are visible
#
#  Scenario: Validate Financial Control redirection
#    When The user click on Financial Control
#    Then The user will be redirect to the correct Financial Control page

  Scenario: Validate Empty Submit validation messages
    When The user click on Get in touch button
    And  The user is redirected to Get in touch page
    And The user click on Submit button
    Then The required messages will appear
