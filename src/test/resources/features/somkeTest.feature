Feature: Major functionalities for somke Test
  Scenario: validate Home page title
    Then validate top left corner is "TEKSCHOOL"

    ## scenario 2
    Scenario: Validate Home page title
      ##Given Browser is already open
      ##Then Navagaite to retaill app website
      Then validate top left corner is "TEKSCHOOL"
      Then validate sign in button is enabled

      #Scenario 3
  Scenario:Validate sign in with correct username and password
    #Given Open broswer
  #Then Navagiate to retaill website
    Then Click the sign in button
    Then Enter corrcet username
    Then Enter correct password
    Then Click sign in