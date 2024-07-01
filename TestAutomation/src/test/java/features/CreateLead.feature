Feature: Create Lead Functionality of LeafTaps

Scenario Outline: Create Lead with MultipleData

Given The user enters the valid username as <Username>
And The user enters the valid password as <Password>
And The user clicks the login button
And the user clicks the crmsfa ,Leads and Create Lead link
And the user enter the Cname as <Cname>
And the user enter the FName as <Fname>
And the user enter the Lname as <Lname>
And the user enter the PhoneNumber as <PhoneNumber>
When the user clicks the CreateLead button
Then verify the lead is created

Examples:
|Username|Password|Cname|Fname|Lname|PhoneNumber|
|'Demosalesmanager'|'crmsfa'|'TestLeaf'|'Vignesh'|'Kandiah'|'9988776655'|
|'Democsr'|'crmsfa'|'Cognizant'|'Suresh'|'Kandiah'|'9988776656'|
