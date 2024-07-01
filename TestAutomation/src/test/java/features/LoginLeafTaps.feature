Feature: Login Functionality of LeafTaps

#Background:
#Given The Leaftaps application is opened in browser


Scenario Outline: Login with valid user credentials

And The user enters the valid username as <Username>
And The user enters the valid password as <Password>
When The user clicks the login button
Then The user should be navigated to homepage

Examples:
|Username|Password|
|'Demosalesmanager'|'crmsfa'|
|'Democsr'|'crmsfa'|

Scenario Outline: Login with valid user credentials

#Given The Leaftaps application is opened in browser

And The user enters the valid username as <Username>
And The user enters the valid password as <Password>
When The user clicks the login button
Then The user should be navigated to homepage

Examples:
|Username|Password|
|'Demosalesmanager'|'crmsfa'|
|'Democsr'|'crmsfa'|



 