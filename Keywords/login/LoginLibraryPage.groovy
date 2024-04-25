package login

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.By

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import common.CommonLibrary

import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions

import internal.GlobalVariable

public class LoginLibraryPage extends CommonLibrary {
	def locator_user_name =  findTestObject('Object Repository/LoginPage/Page_Guru99 Bank Home Page/input_UserID_uid')
	def locator_password =  findTestObject('Object Repository/LoginPage/Page_Guru99 Bank Home Page/input_Password_password')
	def locator_btn_login =  findTestObject('Object Repository/LoginPage/Page_Guru99 Bank Home Page/input_Password_btnLogin')

	@Keyword
	def input_user_name(username) {

		WebUI.waitForElementVisible(locator_user_name, 30)



		WebElement tab = driver.findElement(By.xpath("//input[@name='uid']"))

		tab.sendKeys(username)

		//		WebUI.sendKeys(locator_user_name, username)
	}
	@Keyword
	def input_password(password) {
		WebUI.waitForElementVisible(locator_password, 30)
		WebUI.sendKeys(locator_password, password)
	}
	@Keyword
	def click_button_login() {
		WebUI.waitForElementVisible(locator_btn_login, 30)
		WebUI.click(findTlocator_btn_loginestObject)
	}
}
