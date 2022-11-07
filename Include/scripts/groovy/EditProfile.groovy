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



class EditProfile {
	@Given("We navigated to homepage after login")
	public void we_navigated_to_homepage_after_login() {
		WebUI.callTestCase(findTestCase('Page/Login/LTW001 - Login Positive Valid'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("We click on profile icon button")
	public void we_click_on_profile_icon_button() {
		WebUI.click(findTestObject('Edit Profile/newww/Page_Secondhand Store/path'))
	}

	@And("We click on profile button")
	public void we_click_on_profile_button(Integer int1) {
		WebUI.click(findTestObject('Edit Profile/new/a_Profile'))
	}

	@And("We input product name (.*)")
	public void we_input_product_name_vanillalate(String name) {
		WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Secondhand Store/input_Nama_nm_produk'), name)
	}

	@And("We select city option")
	public void we_select_city_option() {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Edit Profile/Page_Secondhand Store/select_Pilih kotaBandungBogorJemberKediriLu_56995e'),
				'Bandung', true)
	}

	@And("We input address (.*)")
	public void we_input_address_bandung_wetan(String address) {
		WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Secondhand Store/textarea_Bandung wetan_1'), address)
	}

	@And("We input number phone (.*)")
	public void we_input_number_phone(String numberphone) {
		WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Secondhand Store/input_No.Handphone_nm_produk'), numberphone)
	}

	@And("We click on submit button")
	public void we_click_on_submit_button() {
		WebUI.click(findTestObject('Edit Profile/Page_Secondhand Store/button_submit'))
	}

	@Then("Popup (.*) showup")
	public void popup_showup() {
		WebUI.rightClick(findTestObject('Edit Profile/new/Page_Secondhand Store/div_Berhasil update profile'))
		WebUI.closeBrowser()
	}
}