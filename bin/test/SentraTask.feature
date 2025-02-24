@Navigation
    Feature: Perform functionalities within the Sentra application

##ASSERTS##

### Create a New User with Asserts ### 
 @ScenarioCreateNewUser
    Scenario: A new user navigates to the Sentra application and registers a new profile.
        Given As a user I navigate to the Sentra application
        When I click on the create new user button
        Then I click on the cancel button within register user
        When I click on the create new user button
        Then I fill in the new user fields with name "bastian99", last name "elola99", email "belola@gmail.cl", password "Sentra2025", repeat password "Sentra2025"
        Then I click on the register user button

### Login with credentials of the new user with Asserts ###
 @ScenarioUserLogin  
    Scenario: User navigates and logs in to the Sentra Login page, goes to Profile, Home and then clicks the logout button.
        Given As a user I navigate to the Sentra application
        When I fill in the fields with user "belola@gmail.cl", password "Sentra2025"
        Then I click on the login button
        When As a user I go to Profile
        When As a user I go to Home
        Then I log out from sentratask

  ## COMENTAR EL ESCENARIO QUE SE DESEA PROBAR ##

    ### Create a New User ###

@CreateNewUser
    Scenario: A new user navigates to the Sentra application and registers a new profile.
        Given As a user I navigate to the Sentra application
        When I click on the create new user button
        Then I click on the cancel button within register user
        When I click on the create new user button
        Then I will register the name
        Then I will register the last name
        Then I will register the email
        Then I will register a password
        Then I will repeat the password
        And I click on the register user button


 ## Login with credentials of the new user ##

@UserLogin 
    Scenario: User logs in to the Sentra Login page.
        Given As a user I navigate to the Sentra application
        Then I will write an email in the email field
        Then I will write a password in the password field
        And I click on the login button
        And I log out from sentratask


## Edit information of the new user ##

@ModifyProfile   
    Scenario: As a user I will enter the profile and edit the user data.
        Given As a user I navigate to the Sentra application
        Then I will write an email in the email field
        Then I will write a password in the password field
        And I click on the login button
        When As a user I go to Profile
        Then From Profile I click on Edit user data
        Then I click on the cancel button within user data modification
        Then From Profile I click on Edit user data
        Then I will edit the name field in profile
        Then I will edit the last name field in profile
        Then I will edit the email field in profile
        And I click on the modify user button
        And I log out from sentratask

## Create a new task ##

@NewTask
    Scenario: User logs in to the Sentra Login page and creates a new task.
        Given As a user I navigate to the Sentra application
        Then I will write an email in the email field
        Then I will write a password in the password field
        And I click on the login button
        When I click on create new task
        Then I click on the cancel button of a new task
        When I click on create new task
        Then I will write in the title field
        Then I will write a description
        Then I will register a due date
        Then I will set a priority
        And I click on the create task button
        And I log out from sentratask


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


## Change the password created previously ##

@PassChange
  Scenario: As a user I will navigate to login, enter the profile and change the password.
        Given As a user I navigate to the Sentra application
        Then I will write an email in the email field
        Then I will write a password in the password field
        And I click on the login button
        When As a user I go to Profile
        Then From Profile I click on change password
        Then I click on the cancel button within change password
        Then From Profile I click on change password
        Then I will write in the field Write your password
        Then I will write in the field Repeat your password
        And I click on the change password button
        And I log out from sentratask

## Funcionality of main page ##      

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

## Close Browser ##

@Close
    Scenario: User logs out from Sentra Login.
        Given As a user I navigate to the Sentra application
        Then I will write an email in the email field
        Then I will write a password in the password field
        Then I click on the login button
        And I log out from sentratask








