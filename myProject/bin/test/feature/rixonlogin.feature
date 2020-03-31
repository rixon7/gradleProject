Feature: Verify facebook login functionality

@logintofb
Scenario: login to facebook with valid credential
Given open facebook application
When enter facebook username and password  
And click login button on facebook
Then user should be logged in successfully to facebook
Then user should Logout successfully