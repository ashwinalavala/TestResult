Feature: Login in functionality

  As a user i should be able to login

  @login
  Scenario Outline: login to the account
    Given i navigate to "ResearchBods" home page
    When i click on login button
    And  enter "<username>" , "<password>"
    And click submit
    Then i should be logged in


    Examples:
      | username              | password  |
      | demo@researchbods.com | !Gate123! |