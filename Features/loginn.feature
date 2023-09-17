Feature: Login Action
Scenario: Sucessfull login with valid credentials
Given User is on Home Login Page
When User enters Email as "admin@yourstore.com" and Password as "admin"
And Click on Login
Then Page Title should be "Dashboard / nopCommerce administration"


Scenario Outline: Sucessfull login with valid credentials with DDT
Given User is on Home Login Page
When User enters Email as "<email>" and Password as "<password>"
And Click on Login
Then Page Title should be "Dashboard / nopCommerce administration"
Examples:
|email|password|
|admin@yourstore.com|admin|
|test@yourstore.com|admin|



