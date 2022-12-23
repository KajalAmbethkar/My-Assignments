Feature: Login
//Background:
//Given Launch the Chrome Browser
//And Enter the URL and Maximize
//@Smoke
Scenario Outline: Positive Login

And Enter the username as <UserName>
And Enter the password as <Password>
When Click on the login button
Then Verify the homepage is displayed.

Examples:
|UserName|Password|
|DemoCsr|crmsfa|


