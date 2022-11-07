@AddProduct
Feature: Us want to add product in Secondhand Store website

  @ADT001
  Scenario Outline: Us want to publish add product 
    Given Us navigate to homepage Secondhand Store website
    When Us click on sale button
    And Us input name product <nameproduct>
    And Us input price <price>
    And Us select to category
    And Us input description <description>
    And Us click on publish button
    Then Published product

    Examples: 
      |	nameproduct	|	price				|	description							|
      |	bola basket	|	Rp. 300000	|	perlengkapan olah raga	|
      
  @ADT002
  Scenario Outline: Us want to preview add product 
    Given Us navigate to homepage Secondhand Store website
    When Us click on sale button
    And Us input name product <nameproduct>
    And Us input price <price>
    And Us select to category
    And Us input description <description>
    And Us click on preview button
    Then Previewed product

    Examples: 
      |	nameproduct	|	price				|	description							|
      |	bola basket	|	Rp. 300000	|	perlengkapan olah raga	|