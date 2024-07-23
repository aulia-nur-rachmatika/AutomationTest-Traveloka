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

// Open browser and navigate to Traveloka website
WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.traveloka.com/en-id')

// Select Car Rental tab
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Car Rental'))

// Select rental location
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Your Rental Location_css-1dbjc4n r-1awo_e2d405'))
WebUI.setText(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/input_Your Rental Location_css-11aywtz r-cw_d2b2f7'), 'Jakarta')
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_JakartaJakarta Special Capital Region, _11928a'))

// Select rental start date
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Rental Start Date_css-1dbjc4n r-14lw9ot_cd8948'))
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_21'))

// Select start time
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/input_Start Time_css-11aywtz r-cwxd7f r-13a_51dcda'))
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_7'))

// Select rental end date
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_22'))
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_8'))

// Confirm date selection
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Done'))

// Click search car button
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_End Time_css-18t94o4 css-1dbjc4n r-kdyh_855d06'))

// Select a car
WebUI.click(findTestObject('Object Repository/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/h3_Toyota Calya'))

// Select a car provider
WebUI.click(findTestObject('Object Repository/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/div_4 providers available'))
WebUI.click(findTestObject('Object Repository/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/div_ContinueContinue'))

// Select rental office for pick-up
WebUI.click(findTestObject('Object Repository/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/div_Please Select Below Options_css-1dbjc4n_0314af'))
WebUI.click(findTestObject('Object Repository/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/div_Rental Office'))

// Select drop-off location
WebUI.click(findTestObject('Object Repository/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/img'))
WebUI.click(findTestObject('Object Repository/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/div_Drop-off Location'))
WebUI.click(findTestObject('Object Repository/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/h3_Drop-off Location'))
WebUI.click(findTestObject('Object Repository/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/div_Rental Office'))
WebUI.click(findTestObject('Object Repository/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/div_Rental Office_css-1dbjc4n r-1naam9t r-1_7031c4'))

// Input optional pick-up/drop-off notes
WebUI.setText(findTestObject('Object Repository/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/textarea_Tolong tepat waktu'), 'Tolong tepat waktu')

// Click Continue button
WebUI.click(findTestObject('Object Repository/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/div_ContinueContinue'))

// Handle captcha if present
try {
    WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/awswaf-captcha'))
    WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Solving the puzzle helps us secure your_970f1b'))
} catch (Exception e) {
    println("Captcha not found, continuing with the test")
}

// Fill contact details
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Contact DetailsContact Details (for E-t_4877f9'))
WebUI.setText(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/input_Start Time_css-11aywtz r-cwxd7f r-13a_51dcda'), '89789090998')
WebUI.setText(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/input_Start Time_css-11aywtz r-cwxd7f r-13a_51dcda'), 'aulianurtika12@gmail.com')

// Fill driver details
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Driver DetailsAdult 1SaveTitleMr.Mrs.Ms_d4cb72'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/select_Mr.Mrs.Ms'), 'MRS', true)
WebUI.setText(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/input_Start Time_css-11aywtz r-cwxd7f r-13a_51dcda'), 'Aulia Nur')
WebUI.setText(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/input__css-11aywtz r-13awgt0 r-t1w4ow r-ube_1d9001'), '89789090998')

// Continue to special request
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_ContinueContinue'))
WebUI.setText(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/textarea_Tidak ada'), 'Tidak ada')
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Continue to PaymentContinue to Payment'))

// Confirm all rental requirements
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Tap to check the requirements'))
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Check All'))
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_SaveSave'))
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/div_Continue to PaymentContinue to Payment'))

// Choose payment method
WebUI.click(findTestObject('Object Repository/Page_Cheap Flights Tickets Traveloka - Onli_2df141/h1_How would you like to pay'))
WebUI.click(findTestObject('Object Repository/Page_Cheap Flights Tickets Traveloka - Onli_2df141/div_Virtual Account'))
WebUI.click(findTestObject('Object Repository/Page_Cheap Flights Tickets Traveloka - Onli_2df141/div_New_css-1dbjc4n r-1fuqb1j r-d045u9 r-14_d79d43'))
WebUI.click(findTestObject('Object Repository/Page_Cheap Flights Tickets Traveloka - Onli_2df141/div_Pay with Mandiri Virtual Account'))

// Close browser
WebUI.closeBrowser()
