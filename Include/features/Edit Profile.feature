@EditProfile 
Feature: Edit Profile Test

  @EPW001
  Scenario Outline: We want to edit profile with all filled field
    Given We navigated to homepage after login
    When We click on profile icon button
    And We click on profile button
    And We input product name <name>
    And We select city option
    And We input address <address>
    And We input number phone <number phone>
    And We click on submit button
    Then Popup "Profile Update was Successfull" showup
    
    Examples: 
     |	name				|	address				|	numberphone	|
     |	vanillalate	|	bandung wetan	|	+5273914368		|
     
     
  @EPW001
  Scenario Outline: We want to edit profile without filling name field
    Given We navigated to homepage after login
    When We click on profile icon button
    And We click on profile button
    And We input product name <name>
    And We select city option
    And We input address <address>
    And We input number phone <number phone>
    And We click on submit button
    Then Popup "Profile Update was Successfull" showup
    
    Examples: 
     	|	address				|	numberphone		|
    	|	bandung wetan	|	+5273914368		|
