Feature: User portal

       Scenario Outline: : Logout

         Given i sign in with "<username>" ,"<password>"
         When i click on settings icon
         And i click on logout link
         Then i should logout and redirected to login page


         Examples:
           | username              | password  |
           | demo@researchbods.com | !Gate123! |
