Feature: Login
//Background:
//Given Launch the Chrome Browser
//And Enter the URL and Maximize
//@Smoke
#Scenario Outline: Positive Login
Scenario: Positive Login

And Enter the username as DemoSalesManage
And Enter the password as crmsfa
When Click on the login button
Then Verify the homepage is displayed.





