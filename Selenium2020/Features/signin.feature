Feature: User wants to sign in to Macys

Scenario Outline: Valid email address and password

Given user visits to homepage
When user clicks sign in button
And user provides valid "<E-Mail Address>" and "<password>"
Then user successfully signs in  to the system

Examples:

|Email Address          |  |password|
|shantana.vina@gmail.com|  |abc321  |


