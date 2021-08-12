Feature: Create an gmail account
Scenario: User comes to the register page and enter his details and saved

Given User launch the browser and open the register page
And user enters the First name and last name
And user enters password in password and confirm password fields
And user enters the email into email field
When the user clicks on create button
Then mail account is created