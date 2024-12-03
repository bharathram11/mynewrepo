Feature: String manipulation

  Scenario Outline: Get count chars in string
    Given a value like "<data>"
    Then the chars count should be <charcount>

    Examples: 
      | data  | charcount |
      | hello |         5 |
      | how   |         3 |
      | are   |         3 |
      | you   |         3 |

  Scenario Outline: get of words in string
    Given a value like "<data>"
    Then the words count should be <wordscount>

    Examples: 
      | data        | wordscount |
      | hello       |          1 |
      | how are you |          3 |

  Scenario Outline: get of lines in string
    Given a value like "<data>"
    Then the lines count should be <linescount>

    Examples: 
      | data                     | linescount |
      | hello\nhow are you?\nbye |          3 |
      | hello all\nhow are you?  |          2 |

  Scenario Outline: reverse the string
    Given a value like "<data>"
    Then the string should be reversed and display

    Examples: 
      | data  |
      | hello |
      | how   |
      | are   |
      | you   |

  Scenario Outline: check given string is palindrome or not
    Given a value like "<data>"
    Then the string should be palindrome or not

    Examples: 
      Examples:

      | data  |
      | hello |
      | hoh   |
      | are   |
      | yoy   |
