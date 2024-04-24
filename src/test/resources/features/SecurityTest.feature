Feature: Retail security test feature.
   #Scenario 3
  Scenario Outline:Validate user credentials
    Given user click on sign in button
    When  user enter "<username>" and "<password>" and  click on login
    Then user will see account button on homepage
    Examples:
      |username                     |password  |
      |mansoor@gmail.com            | Ruya@2014 |
      |mohammad_ospery@tekschool.us |12345678Ab@|


    Scenario: validate invalid username and valid password
      Given user click on sign in button
      When user enter "wrong@gmail.com" and "Ruya@2014" and  click on login
      Then Validdate error message "wrong username or wrong password"



