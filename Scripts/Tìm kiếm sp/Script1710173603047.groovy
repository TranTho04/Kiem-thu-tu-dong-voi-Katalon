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

WebUI.click(findTestObject('Object Repository/Page_Home Lab/span_Search'))

WebUI.setText(findTestObject('Object Repository/Page_Home Lab/input_Tm kim_parameter'), tu_khoa)

WebUI.click(findTestObject('Object Repository/Page_Home Lab/span_Tm kim'))

WebUI.takeFullPageScreenshot(('./TestResults/Tìm kiếm sp/' + id) + '.png')

if (ket_qua == '1') {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Kt qu tm kim/div_Xem sn phm                             _a4bb0a'), 
        60)
} else {
    WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_Kt qu tm kim/div_Xem sn phm                             _a4bb0a'), 
        60)
}

WebUI.closeBrowser()

