Feature: Accessing Room category page

  As a user i should be able to navigate to home page

  @homepage
  Scenario Outline: Navigate to Rooms Page

    Given i logged in with "<username>" , "<password>"
    When i click on room category link
    Then i should land on the rooms category page


    Examples:
      | username              | password  |
      | demo@researchbods.com | !Gate123! |