
Feature: Application Login Page

Scenario: Admin Page default login

 Given User is on NetBanking login page
 When User login into the application
 Then Home page is displayed
 And Cards are displayed

Scenario: Admin Page default login

 Given User is on NetBanking login page
 When User login into the application with "admin" and password 1234
 Then Home page is displayed
 And Cards are displayed
 
@SmokeTest  
Scenario Outline: Admin Page default login here

  Given User is on NetBanking login page
  When User login into the application with "<Username>" and password <Password>
  Then Home page is displayed
  And Cards are displayed  
    
 Examples:
  |  Username    |  Password  |
  |  debituser   |   5465     |
  |  credituser  |   4567     |
  
@SmokeTest @RegressionTest
Scenario: User Page default Signup

 Given User is on Practice landing page
 When User Signup into the application
 |           Seema           |
 |           Rani            |
 |  raniseema2314@gmail.com  |
 |       +372-53964690       |
 Then Home page is displayed
 And Cards are displayed