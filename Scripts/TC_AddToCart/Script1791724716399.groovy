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

WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/button_Add to cart'), 5)

// Menambah produk dan masuk ke Cart
WebUI.click(findTestObject('Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Page_Swag Labs/a_Swag Labs_shopping_cart_link'))

// ASSERTION: Memastikan elemen produk spesifik (Sauce Labs Backpack) benar-benar tampil di dalam halaman Cart
WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/div_Sauce Labs checkout'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/div_Sauce Labs checkout'), 5)

WebUI.closeBrowser()

