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

WebUI.click(findTestObject('Object Repository/Page/a_Xem sn phm'))

WebUI.setText(findTestObject('Object Repository/Page_Vin vitamin v khong cht Provibiol Vita_c9d479/input_Cn hng_qty'), so_luong)

WebUI.click(findTestObject('Object Repository/Page_Vin vitamin v khong cht Provibiol Vita_c9d479/span_Thm vo gi hng'))

WebUI.takeFullPageScreenshot(('./TestResults/Thêm vào giỏ hàng/' + id) + '.png')

WebUI.verifyTextPresent(thong_bao, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

