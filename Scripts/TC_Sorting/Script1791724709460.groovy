import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/input_Swag Labs_user-name'), 2)

// Mengisi kredensial & mengeksekusi klik
WebUI.setText(findTestObject('Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')

WebUI.setText(findTestObject('Page_Swag Labs/input_Swag Labs_password'), 'secret_sauce')

WebUI.click(findTestObject('Page_Swag Labs/input_Swag Labs_login-button'))

// ASSERTION: Memastikan kata "Products" muncul di Dashboard (Bukti login berhasil)
WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/span_Products'), 3)

WebUI.verifyElementText(findTestObject('Page_Swag Labs/span_Products'), 'Products')

WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/select_Name (A to Z)Name (Z to A)Price (low to high)Price (high to low)'), 
    3)

// Memilih pengurutan harga termurah ke termahal ('lohi')
WebUI.selectOptionByValue(findTestObject('Page_Swag Labs/select_Name (A to Z)Name (Z to A)Price (low to high)Price (high to low)'), 
    'lohi', true)

// ASSERTION: Memastikan harga produk pada urutan pertama berubah menjadi paling murah ($7.99)
WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/div_29.99'), 3)

WebUI.verifyElementText(findTestObject('Page_Swag Labs/div_7.99'), '$7.99')

WebUI.closeBrowser()

