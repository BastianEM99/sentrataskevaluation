@Navigation
    Feature: Perform functionalities within the Sentra application

##ASSERTS##

### Login with credentials of the new user with Asserts ###
 @ScenarioUserLogin  
    Scenario: User navigates and logs in to the Sentra Login page, goes to Profile, Home and then clicks the logout button.
        Given As a user I navigate to the Sentra application
        When I fill in the fields with user "belola@gmail.cl", password "Sentra2025"
        Then I click on the login button
        Then I log out from sentratask
        

    ### Create a New User ###

@NewUser
Scenario: User clicks on "Create new user" LOGIN NEW USER
    Given I am on the login page to create a new user
    When I press the Create new user button, then cancel and then create new user
    Then I complete the form with the new user data
    When I press the Register user button
    When I enter the registered email and password
    And I go through the buttons and leave the page


 ## Login with credentials of the new user ##

@UserLogin 
    Scenario: User logs in to the Sentra Login page.
        Given As a user I navigate to the Sentra application
        Then I will write an email in the email field
        Then I will write a password in the password field
        And I click on the login button
        And I log out from sentratask


## Edit information of the new user ##

@Editprofile
Scenario: The user updates their information in the profile
    Given I access the login page
    When I enter the email and password
    Then I click the Login button
    Then I press the Home button
    Then I press the Profile button
    Then I press the Edit User button
    Then I press the Cancel Form User button
    Then I press the Edit User button again
    When I make changes to the form fields
    Then I press the Modify User button
    When I am redirected to the next screen, I press the Change Password button
    Then I press the Cancel Form button
    Then I press the Change Password Main button
    When I change the password
    Then I press the Save Password Change button
    Then I click the Logout button and it takes me to the login screen

## Create a new task ##

@NewTask
Scenario: User clicks on tasks LOGIN NEW TASK
    Given I enter the main page
    When I fill in the fields with the email and password
    Then I click the login button
    Then I click the Home button
    Then I click the New Task button
    Then I click the cancel button
    Then I click the new task button
    When I complete the form fields
    Then I click the Create Task button
    Then I click the Profile button
    And I click the Logout button and leave the page


## Edit a created task ##

@TaskEdit
    Scenario: I will enter a created task and edit it
        Given As a user I navigate to the Sentra application
        Then I will write an email in the email field
        Then I will write a password in the password field
        And I click on the login button
        When I enter a created task
        When I click on the edit task button
        Then I click on the cancel button located in edit task
        When I click on the edit task button
        Then I will edit the title field
        Then I will edit the description field
        Then I will edit the due date field
        Then I will edit the priority field
        And I click on the modify task button
        And I log out from sentratask


## Order Tasks on the list ##  

@TaskOrder
        Scenario: User logs in to Sentra Login and from the tasks previously created in "HOME", sorts tasks by title, priority, due date and logs out
            Given As a user I navigate to the Sentra application
            Then I will write an email in the email field
            Then I will write a password in the password field
            And I click on the login button
            When I click on the Title column to sort in ascending order
            Then I click on the Title column to sort in descending order
            When I click on the Priority column to sort in ascending order
            Then I click on the Priority column to sort in descending order    
            When I click on the Due Date column to sort in ascending order
            Then I click on the Due Date column to sort in descending order
            Then I log out from sentratask



## Functionality of main page ##   
@TestFunctionality
    Scenario: User logs in to Sentra Login, tests buttons to collapse views and logs out
        Given As a user I navigate to the Sentra application
        Then I will write an email in the email field
        Then I will write a password in the password field
        And I click on the login button
        Then I click on the more button in sentraTask
        Then I click on the treeline button to show sentraTask view
        Then I click on the compact table button
        Then I click on the compact table button again
        Then I click on the tasks per page button
        Then I click on the tasks per page button selecting the option 5
        Then I click on the tasks per page button
        Then I click on the tasks per page button selecting the option 10
        Then I click on the tasks per page button
        Then I click on the tasks per page button selecting the option 20
        And I log out from sentratask


## Check Table ##

@Table
    Scenario: User logs in to the login and verifies if there is a task table
        Given user correctly enters their data
        When selects the login button
        Then selects the home button within the application
        And views the task table
        And selects logout

#  Error Pass  #

@ErrorRepeatPass
 
Scenario: A new user is created without repeating the password EMPTY
    Given I enter the main page of Sentra Task
    When I go to create a new user
    Then I complete the form, except for repeating the password
    And I select the register user button and an error is displayed
    Then the message "Contraseñas no coinciden" should appear
    And I select the cancel button and return to the login


## Close Browser ##

@Close
    Scenario: User logs out from Sentra Login.
        Given As a user I navigate to the Sentra application
        Then I will write an email in the email field
        Then I will write a password in the password field
        Then I click on the login button
        And I log out from sentratask








