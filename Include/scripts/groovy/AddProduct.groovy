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



class AddProduct {
	@Given("Us navigate to homepage Secondhand Store website")
	public void us_navigate_to_homepage_Secondhand_Store_website() {
		WebUI.callTestCase(findTestCase('Page/Login/LTW001 - Login Positive Valid'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Us click on sale button")
	public void us_click_on_sale_button() {
		WebUI.click(findTestObject('Add Product/jual/Page_Secondhand Store/a_Jual'))
	}

	@And("Us input name product (.*)")
	public void us_input_name_product_bola_basket(String name) {
		WebUI.setText(findTestObject('Object Repository/Add Product/Page_Secondhand Store/input_Nama Produk_nm_produk'), name)
	}

	@And("Us input price (.*)")
	public void us_input_price(String price) {
		WebUI.setText(findTestObject('Object Repository/Add Product/Page_Secondhand Store/input_Harga Produk_harga_produk'), price)
	}

	@And("Us select to category")
	public void us_select_to_category() {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Add Product/Page_Secondhand Store/select_Pilih KategoriHobyKendaraanBajuElekt_b1877d'),
			'1', true)
	}

	@And("Us input description (.*)")
	public void us_input_description_perlengkapan_olah_raga(String description) {
		WebUI.setText(findTestObject('Object Repository/Add Product/Page_Secondhand Store/textarea_Perlengkapan Olahraga'), description)
	}

	@And("Us click on publish button")
	public void us_click_on_publish_button() {
		WebUI.click(findTestObject('Add Product/new/button_Terbitkan'))
	}

	@Then("Published product")
	public void published_product() {
		WebUI.closeBrowser()
	}
}