Feature: Contact us

Scenario Outline: User needs to put Full name, Valid email address and enquiry

Given user goes to homepage
And user clicks contact us button
When user types their "<Full name>" 
And user types valid "<Email Address>"
And User types an "<Enquiry>"
Then user click the continue button and send the information


Examples:

| Full name    | Email Address          | Enquiry    |
| Shantana Vina| shantana.vina@gmail.com| Bla Bla Bla|


