import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/input_Swag Labs_user-name'), 2)

// Mengisi kredensial & mengeksekusi klik
WebUI.setText(findTestObject('Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')

WebUI.setText(findTestObject('Page_Swag Labs/input_Swag Labs_password'), 'secret_sauce')

WebUI.click(findTestObject('Page_Swag Labs/input_Swag Labs_login-button'))

// ASSERTION: Memastikan kata "Products" muncul di Dashboard (Bukti login berhasil)
WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/span_Products'), 3)

WebUI.verifyElementText(findTestObject('Page_Swag Labs/span_Products'), 'Products')

WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/button_Add to cart'), 2)

WebUI.click(findTestObject('Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Page_Swag Labs/a_Swag Labs_shopping_cart_link'))

WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/button_Checkout'), 2)

WebUI.click(findTestObject('Page_Swag Labs/button_Checkout'))

// Mengisi Form Data Diri
WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/input_Checkout Your Information_first-name'), 2)

WebUI.setText(findTestObject('Page_Swag Labs/input_Checkout Your Information_first-name'), 'North')

WebUI.setText(findTestObject('Page_Swag Labs/input_Checkout Your Information_last-name'), 'London')

WebUI.setText(findTestObject('Page_Swag Labs/input_Checkout Your Information_postal-code'), '123124123')

WebUI.click(findTestObject('Page_Swag Labs/input_Cancel_continue'))

WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/button_Finish'), 2)

WebUI.click(findTestObject('Page_Swag Labs/button_Finish'))

// ASSERTION: Memvalidasi proses checkout selesai hingga muncul teks Checkout Complete
WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/h2_Thank you for your order'), 2)

WebUI.verifyElementText(findTestObject('Page_Swag Labs/h2_Thank you for your order'), 'Thank you for your order!')

WebUI.closeBrowser()

