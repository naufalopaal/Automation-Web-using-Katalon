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

WebUI.click(findTestObject('Edit Profile/new/icon profile'))

WebUI.click(findTestObject('Edit Profile/new/a_Profile'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Edit Profile/Page_Secondhand Store/select_Pilih kotaBandungBogorJemberKediriLu_56995e'), 
    'Bandung', true)

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Secondhand Store/textarea_Bandung wetan_1'), 'Bandung wetan ')

WebUI.setText(findTestObject('Object Repository/Edit Profile/Page_Secondhand Store/input_No.Handphone_nm_produk'), '+5273914368')

WebUI.click(findTestObject('Edit Profile/Page_Secondhand Store/button_submit'))

WebUI.rightClick(findTestObject('Edit Profile/new/Page_Secondhand Store/div_Berhasil update profile'))

WebUI.closeBrowser()

