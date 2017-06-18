Feature: Performing interactions on Roomcategorypage

  As a user i should be able to perform actions on room page

  Scenario Outline: i am on room page (Holiday Commercial - Posting/Editing/Reply/Like/Delete)
    Given i logged in with "<username>" ,"<password>"
    And click on "<link>"
    When i enter text on search field
    And i click on post button
    Then i should see the comment i posted
    And i click on edit link and amend the text
    And i click on update button
    And i click on like text link
    And i click on reply button
    And i enter text on the reply search field
    And i click on post button on reply comment
    And i click on delete link on reply comment



    Examples:
      | username              | password  | link                             |
      | demo@researchbods.com | !Gate123! | Holiday commercials              |
      | demo@researchbods.com | !Gate123! | What would your dream holiday be |










