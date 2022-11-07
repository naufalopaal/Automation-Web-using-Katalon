import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Page/Login/LTW001 - Login Positive Valid'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Add Product/jual/Page_Secondhand Store/a_Jual'))

WebUI.setText(findTestObject('Object Repository/Add Product/Page_Secondhand Store/input_Nama Produk_nm_produk'), 'Ring Basket')

WebUI.setText(findTestObject('Object Repository/Add Product/Page_Secondhand Store/input_Harga Produk_harga_produk'), '3750000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Add Product/Page_Secondhand Store/select_Pilih KategoriHobyKendaraanBajuElekt_b1877d'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Add Product/Page_Secondhand Store/textarea_Perlengkapan Olahraga Basket'), 
    'Perlengkapan Olahraga Basket')

WebUI.click(findTestObject('Add Product/new/button_Preview'))

WebUI.closeBrowser()

