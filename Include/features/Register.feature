@Register
Feature: User want to register in Secondhand Store website

  @RTW001
  Scenario Outline: User want to register with credential valid
    Given Users navigated to homepage Secondhand Store website
    When Users click on login button
    And Users click on register button
    And Users input name <name>
    And Users input email <email>
    And Users input password <password>
    And Users click on register buttons
    Then Popup "Verify Your Email" show up

    Examples: 
      | name   | email                   | password                 |
      | annisa | annisadwi1999@gmail.com | OZJwUcl/ZGSbAGjfTIQ6vw== |

  @RTW002
  Scenario Outline: User want to register with credential valid
    Given Users navigated to homepage Secondhand Store website
    When Users click on login button
    And Users click on register button
    And Users input name <name>
    And Users input email <email>
    And Users input password <password>
    And Users click on register buttons
    Then Popup "Account already exist" show up

    Examples: 
      | name   | email                   | password                 |
      | annisa | annisadwi1999@gmail.com | OZJwUcl/ZGSbAGjfTIQ6vw== |
