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



class Register {
	@Given("Users navigated to homepage Secondhand Store website")
	public void users_navigated_to_homepage_Secondhand_Store_website() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://secondhand-store.herokuapp.com/')
	}

	@When("Users click on login button")
	public void users_click_on_login_button() {
		WebUI.click(findTestObject('Object Repository/Register/Page_Secondhand Store/a_Masuk'))
	}

	@And("Users click on register button")
	public void users_click_on_register_button() {
		WebUI.click(findTestObject('Object Repository/Register/Page_Secondhand Store/a_Daftar di sini'))
	}

	@And("Users input name (.*)")
	public void users_input_name_annisa(String name) {
		WebUI.setText(findTestObject('Register/Page_Secondhand Store/Input Nama'), name)
	}

	@And("Users input email (.*)")
	public void users_input_email_annisadwi_gmail_com(String email) {
		WebUI.setText(findTestObject('Register/Page_Secondhand Store/Input Email'), email)
	}

	@And("Users input password (.*)")
	public void users_input_password_a_b_c_d(String password) {
		WebUI.setEncryptedText(findTestObject('Register/Page_Secondhand Store/Input Password'), password)
	}

	@And("Users click on register buttons")
	public void users_click_on_register_buttons() {
		WebUI.click(findTestObject('Object Repository/Register/Page_Secondhand Store/button_Daftar'))
	}

	@Then("Popup {string} show up")
	public void popup_show_up(String string) {
		WebUI.rightClick(findTestObject('Object Repository/Register/Page_Secondhand Store/strong_Silahkan verifikasi email agar dapat_32ea4a'))
		WebUI.closeBrowser()
	}
}