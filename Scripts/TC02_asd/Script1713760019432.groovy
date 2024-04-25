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

WebUI.navigateToUrl('https://demo.guru99.com/Agile_Project/Agi_V1/index.php')

WebUI.setText(findTestObject('Object Repository/LoginPage/Page_Guru99 Bank Home Page/input_UserID_uid'), '1303')

WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/Page_Guru99 Bank Home Page/input_Password_password'), 
    'q1A45N6MPWc=')

WebUI.click(findTestObject('Object Repository/LoginPage/Page_Guru99 Bank Home Page/input_Password_btnLogin'))

WebUI.click(findTestObject('Object Repository/LoginPage/Page_Guru99 Bank Customer HomePage/a_Mini Statement'))

WebUI.click(findTestObject('Object Repository/LoginPage/Page_Guru99 Bank Customer HomePage/div_Advar doc  document.getElementById(ad_iframe).contentWindow.documentdoc.open(texthtml, replace)doc.write(x3cDOCTYPE htmlx3ex3chtml langx3dvix3ex3cheadx3ex3cmeta charsetx3dx22UTF-8x22x3ex3cscriptx3evar jscVersion x3d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/LoginPage/Page_Guru99 Bank Mini Statement Page/select_Select Account                      _780d18'), 
    '3308', true)

WebUI.closeBrowser()

