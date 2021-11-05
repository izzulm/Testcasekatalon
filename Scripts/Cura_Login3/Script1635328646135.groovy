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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Cura_Test01/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'), 
    0)

WebUI.click(findTestObject('Object Repository/Cura_Test01/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Cura_Test01/Page_CURA Healthcare Service/a_Login'))

//looping
for (def rowNum = 1; rowNum <= findTestData('Data1').getRowNumbers(); rowNum++) {
    WebUI.setText(findTestObject('Object Repository/Cura_Test01/Page_CURA Healthcare Service/input_Username_username'), 
        findTestData('Data1').getValue(1, 1))

    WebUI.setText(findTestObject('Object Repository/Cura_Test01/Page_CURA Healthcare Service/input_Password_password'), 
        findTestData('Data1').getValue(2, 1))

    delay(3)
}

WebUI.click(findTestObject('Object Repository/Cura_Test01/Page_CURA Healthcare Service/button_Login'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Cura_Test01/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.click(findTestObject('Object Repository/Cura_Test01/Page_CURA Healthcare Service/span_Visit Date (Required)_glyphicon glyphi_cada34'))

WebUI.click(findTestObject('Object Repository/Cura_Test01/Page_CURA Healthcare Service/td_11'))

WebUI.click(findTestObject('Object Repository/Cura_Test01/Page_CURA Healthcare Service/td_11'))

WebUI.setText(findTestObject('Object Repository/Cura_Test01/Page_CURA Healthcare Service/textarea_Comment_comment'), 'Good Mood Good News')

WebUI.click(findTestObject('Object Repository/Cura_Test01/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/Cura_Test01/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.waitForPageLoad(5)

WebUI.closeBrowser()

