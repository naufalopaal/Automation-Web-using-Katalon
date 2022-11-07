import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Transaction {
	@Given("I navigate to homepage Secondhand Store website")
	public void i_navigate_to_homepage_Secondhand_Store_website() {
		WebUI.callTestCase(findTestCase('Page/Login/LTW001 - Login Positive Valid'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("I select to search hobby field")
	public void i_select_to_search_hobby_field() {
		WebUI.click(findTestObject('Transaction/new/Page_Secondhand Store/button_search Hoby'))
	}

	@And("I select to basketball product in search hobby field")
	public void i_select_to_basketball_product_in_search_hobby_field() {
		WebUI.click(findTestObject('Transaction/new/Page_Secondhand Store/div_Bola BasketHobyRp300.000,00'))
	}

	@And("I click on interested and nego button")
	public void i_click_on_interested_and_nego_button() {
		WebUI.click(findTestObject('Object Repository/Transaction/Page_Secondhand Store/button_Saya tertarik dan ingin nego'))
	}

	@And("I input amount (.*)")
	public void i_input_amount(String amount) {
		WebUI.setText(findTestObject('Object Repository/Transaction/Page_Secondhand Store/input_Harga Tawar_form-control'), amount)
	}

	@And("I click on submit button")
	public void i_click_on_submit_button() {
		WebUI.click(findTestObject('Object Repository/Transaction/Page_Secondhand Store/button_Kirim'))
	}

	@Then("Popup successful transaction")
	public void popup_successful_transaction() {
		WebUI.closeBrowser()
	}
}