Feature: String manipulation

  Background: 
    Given a value like
      """
          hello all
          how are you?
      """

  Scenario: Get count chars in string
    Then the chars count should be 21

  Scenario: get of words in string
    Then the words count should be 5

  Scenario: get of lines in string
    Then the lines count should be 2

  Scenario: reverse the string
    Then the string should be reversed and display

  Scenario: check given string is palindrome or not
    Then the string should be palindrome or not
