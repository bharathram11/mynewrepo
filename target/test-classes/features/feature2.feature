Feature: arithmatic operation

  Scenario Outline: check given number is even or odd
    Given I have a value like <number>
    Then the number should be either even or odd

    Examples: 
      | number |
      |    123 |
      |    456 |
      |    789 |

  Scenario Outline: check given number is prime or not
    Given I have a value like <number>
    Then the number should be prime or not

    Examples: 
      | number |
      |    123 |
      |     11 |
      |      7 |
      |     19 |

  Scenario Outline: check given number is palindrome or not
    Given I have a value like <number>
    Then the number should be palindrome or not

    Examples: 
      | number |
      |    123 |
      |    456 |
      |    787 |

  Scenario Outline: check given number is armstrong or not
    Given I have a value like <number>
    Then the number should be armstrong or not

    Examples: 
      | number |
      |    153 |
      |    456 |
      |   1634 |
