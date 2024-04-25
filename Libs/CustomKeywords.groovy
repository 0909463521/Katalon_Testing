
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String



def static "login.LoginLibraryPage.input_user_name"(
    	Object username	) {
    (new login.LoginLibraryPage()).input_user_name(
        	username)
}


def static "login.LoginLibraryPage.input_password"(
    	Object password	) {
    (new login.LoginLibraryPage()).input_password(
        	password)
}


def static "login.LoginLibraryPage.click_button_login"() {
    (new login.LoginLibraryPage()).click_button_login()
}


def static "common.CommonLibrary.get_driver"() {
    (new common.CommonLibrary()).get_driver()
}

 /**
	 * Refresh browser
	 */ 
def static "testweb.refreshBrowser"() {
    (new testweb()).refreshBrowser()
}

 /**
	 * Click element
	 * @param to Katalon test object
	 */ 
def static "testweb.clickElement"(
    	TestObject to	) {
    (new testweb()).clickElement(
        	to)
}

 /**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */ 
def static "testweb.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new testweb()).getHtmlTableRows(
        	table
         , 	outerTagName)
}
