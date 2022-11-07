@Transaction
Feature: User want to transaction in Secondhand Store website

  @TTW001
  Scenario Outline: I want to transaction to purchase product
    Given I navigate to homepage Secondhand Store website
    When I select to search hobby field
    And I select to basketball product in search hobby field
    And I click on interested and nego button
    And I input amount <amount>
    And I click on submit button
    Then Popup successful transaction

    Examples: 
      | amount     |
      | Rp. 525000 |
