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

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.setText(findTestObject('Object Repository/Amazon_addToCart1_OR/Page_Amazon.com. Spend less. Smile more/input_field-keywords'), 
    'The Secret')

WebUI.click(findTestObject('Object Repository/Amazon_addToCart1_OR/Page_Amazon.com. Spend less. Smile more/inputnav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Amazon_addToCart1_OR/Page_Amazon.com  The Secret/img_Results_s-image'))

WebUI.click(findTestObject('Object Repository/Amazon_addToCart1_OR/Page_Amazon.com The Secret (Audible Audio E_1ac69e/span_Hardcover'))

WebUI.click(findTestObject('Object Repository/Amazon_addToCart1_OR/Page_The Secret Rhonda Byrne 9781582701707 _60b79d/input_Shipping cost, delivery date, and ord_223673'))

WebUI.verifyElementText(findTestObject('Object Repository/Amazon_addToCart1_OR/Page_Amazon.com Shopping Cart/span_Added to Cart'), 
    'Added to Cart')

WebUI.closeBrowser()

