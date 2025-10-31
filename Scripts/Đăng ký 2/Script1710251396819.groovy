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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://127.0.0.1:8000/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page/a_ng k'))

WebUI.setText(findTestObject('Page_ng k/input__phone_number'), so_dien_thoai)

WebUI.click(findTestObject('Page_ng k/span_NG K'))

WebUI.setText(findTestObject('Page_Cp nht thng tin/input__name'), ten)

WebUI.setText(findTestObject('Page_Cp nht thng tin/input__birthday'), ngay_sinh)

if (gioi_tinh == 'Nam') {
    WebUI.selectOptionByValue(findTestObject('Page_Cp nht thng tin/select_N                                   _3ed022'), 
        '0', true)
} else {
    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cp nht thng tin/select_N                                   _3ed022'), 
        '1', true)
}
WebUI.setText(findTestObject('Page_Cp nht thng tin/input__address'), dia_chi)

WebUI.setText(findTestObject('Page_Cp nht thng tin/input__password'), mat_khau)

WebUI.setText(findTestObject('Page_Cp nht thng tin/input__re_password'), nhap_lai_mat_khau)

WebUI.click(findTestObject('Page_Cp nht thng tin/span_Cp nht thng tin'))

WebUI.takeFullPageScreenshot(('./TestResults/Đăng ký/' + id) + '.png')

WebUI.verifyTextPresent(thong_bao, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

