# AutomationTest-Traveloka


![gambar](https://github.com/user-attachments/assets/212e6373-a95b-41b5-9b10-e2b08edf6eff)
![gambar](https://github.com/user-attachments/assets/2392a703-191c-4728-831a-40d0dfd3fc78)

ANSWER:
1.	 Test cases for the Search hotel scenario:
a	Check-in date should be not less than today and max 30 days from todayb. 
b	Duration of stay, max 5 nights
c	Room must be at least 1 adult (max 5 adults in 1 room)
d	Children (max 5 years old and max 2 children in 1 room) must be accompanied by at least 1 adult
Test Case	TC_ID	Test Summary	Action Step	Expected Result
Check-in date	TC_001	Validate Check-in Date is Today	1.	Open Traveloka application
2.	Select check-in date as today.
3.	Click search	The system accepts the date and displays hotel search results
	TC_002	Validate Check-in Date is Tomorrow	1.	Open Traveloka application
2.	Select check-in date as tomorrow.
3.	Click search	The system accepts the date and displays hotel search results
	TC_004	Validate Check-in Date is Yesterday	1.	Open Traveloka application
2.	Select check-in date as yesterday.
3.	Click search	The system does not allow selecting the date, and the search button is disabled
	TC_003	Validate Check-in Date is 30 Days from Today	1.	Open Traveloka application
2.	Select check-in date as 30 days from today.
3.	Click search	The system accepts the date and displays hotel search results
	TC_005	Validate Check-in Date is More Than 30 Days from Today	1.	Open Traveloka application
2.	Select check-in date more than 30 days from today.
3.	Click search	The system does not allow selecting the date, and the search button is disabled
Duration of stay	TC_006	Validate stay duration of 1 night	1.	Open Traveloka application.
2.	Select check-in date and stay duration of 1 night.
3.	Click search	The system accepts the duration and displays hotel search results
	TC_007	Validate stay duration of 2 nights	1.	Open Traveloka application.
2.	Select check-in date and stay duration of 2 night.
3.	Click search	The system accepts the duration and displays hotel search results
	TC_008	Validate stay duration of 0 nights	1.	Open Traveloka application.
2.	Select check-in date and stay duration of 2 night.
3.	Click search	The system does not allow selecting the duration, and the search button is disabled
	TC_009	Validate stay duration of 5 nights	1.	Open Traveloka application.
2.	Select check-in date and stay duration of 2 night.
3.	Click search	The system accepts the duration and displays hotel search results
	TC_010	Validate stay duration of more than 5 nights	1.	Open Traveloka application
2.	Select check-in date and stay duration of more than 5 nights
3.	Click search	The system does not allow selecting the duration, and the search button is disabled
Room Occupants (Adults)	TC_011	Validate 1 adult in 1 room	1.	Open Traveloka application
2.	Select 1 adult in 1 room
3.	Click search	The system accepts the number of adults and displays hotel search results
	TC_012	Validate 3 adults in 1 room	1.	Open Traveloka application
2.	Select 3 adults in 1 room
3.	Click search	The system accepts the number of adults and displays hotel search results
	TC_013	Validate 5 adults in 1 room	1.	Open Traveloka application
2.	Select 3 adults in 1 room
3.	Click search	The system accepts the number of adults and displays hotel search results
	TC_014	Validate 0 adults in 1 room	1.	Open Traveloka application
2.	Select 0 adult in 1 room
3.	Click search	The system does not allow selecting the number of adults, and the search button is disabled
	TC_015	Validate more than 5 adults in 1 room	1.	Open Traveloka application
2.	Select more than 5 adults in 1 room
3.	Click search	The system does not allow selecting the number of adults, and the search button is disabled
Room Occupants (Children)	TC_016	Validate 1 child under 5 years old accompanied by 1 adult	1.	Open Traveloka application<
2.	Select 1 adult and 1 child under 5 years old in 1 room
3.	Click search	The system accepts the number of adults and children and displays hotel search results
	TC_017	Validate 2 children under 5 years old accompanied by 1 adult	1.	Open Traveloka application
2.	Select 1 adult and 2 children under 5 years old in 1 room
3.	Click search	The system accepts the number of adults and children and displays hotel search results
	TC_018	Validate 2 children under 5 years old accompanied by 2 adults	1.	Open Traveloka application
2.	Select 2 adults and 2 children under 5 years old in 1 room
3.	Click search	The system accepts the number of adults and children and displays hotel search results
	TC_019	Validate 3 children under 5 years old accompanied by 1 adult	1.	Open Traveloka application
2.	Select 1 adult and 3 children under 5 years old in 1 room
3.	Click search	The system does not allow selecting the number of children, and the search button is disabled
	TC_020	Validate 2 children under 5 years old without an adult	1.	Open Traveloka application
2.	Select 2 children under 5 years old without an adult in 1 room
3.	Click search	The system does not allow selecting the number of children without an adult, and the search button is disabled
	TC_021	Validate 2 children over 5 years old accompanied by 1 adult	1.	Open Traveloka application
2.	Select 1 adult and 2 children over 5 years old in 1 room
3.	Click search	The system does not allow selecting the number of children over 5 years old, and the search button is disabled

2.	Analyze anomaly on screenshot below and elaborate whether it’s a Front-End (FE) or Back-End (BE) bug:
a.	Elaborate your analysis.
Analysis of Anomaly
Error Found:
a.	In the left screenshot, the user selected Jakarta as the location. However, in the right screenshot, the search results display locations in Bali.

Bug Classification:
1.	Front-End (FE) Bug: If the issue is caused by a mistake in the user interface code resulting in incorrect location display, then it is a front-end bug. For example, errors in JavaScript logic governing how search results are displayed.

2.	Back-End (BE) Bug: If the issue is due to errors in the application logic on the server that sends incorrect location data, then it is a back-end bug. For instance, the server sending search results for Bali despite the user selecting Jakarta.

b.	create the bug report.
Title: Search Result Showing Improper Location
Description:
In the application search interface, the user selects the location of Jakarta, but the search results display lodging in Bali. This can cause confusion for users who are looking for accommodation in the actual desired location.


Steps:
1. Open the app and enter the search interface.
2. Select the location of Jakarta.
3. Enter the check-in and check-out dates, and the number of guests.
4. Click the search button.
5. Look at the search results and make sure the location displayed matches the user's selection.
Expected Result:
The search results display lodging in Jakarta according to the location selected by the user.
Actual Result:
The search results display lodging in Bali, even though the user selected the Jakarta location.

3.	Automation script from test case
Language: Groovy
Automation Tool: Katalon Studio
// Open browser and navigate to Traveloka website
WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.traveloka.com/en-id')

// Select Car Rental tab
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_Car Rental'))

// Select rental location
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_Your Rental Location'))
WebUI.setText(findTestObject('Object Repository/Page_Traveloka - Car Rental/input_Your Rental Location'), 'Jakarta')
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_Jakarta'))

// Select rental start date
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_Rental Start Date'))
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_21'))

// Select start time
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/input_Start Time'))
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_07:00'))

// Select rental end date
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_Rental End Date'))
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_22'))

// Select end time
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/input_End Time'))
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_08:00'))

// Confirm date selection
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_Done'))

// Click search car button
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/button_Search Car'))

// Select a car
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/h3_Toyota Calya'))

// Select a car provider
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_4 providers available'))
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/button_Continue'))

// Select rental office for pick-up
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_Please Select Below Options'))
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_Rental Office'))

// Select drop-off location
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/img_Drop-off Location'))
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/h3_Drop-off Location'))
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_Rental Office'))
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_Continue'))

// Input optional pick-up/drop-off notes
WebUI.setText(findTestObject('Object Repository/Page_Traveloka - Car Rental/textarea_Tolong tepat waktu'), 'Tolong tepat waktu')

// Click Continue button
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/button_Continue'))

// Fill contact details
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_Contact Details'))
WebUI.setText(findTestObject('Object Repository/Page_Traveloka - Car Rental/input_Phone Number'), '89789090998')
WebUI.setText(findTestObject('Object Repository/Page_Traveloka - Car Rental/input_Email'), 'aulianurtika12@gmail.com')

// Fill driver details
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_Driver Details'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Traveloka - Car Rental/select_Title'), 'MRS', true)
WebUI.setText(findTestObject('Object Repository/Page_Traveloka - Car Rental/input_First Name'), 'Aulia Nur')
WebUI.setText(findTestObject('Object Repository/Page_Traveloka - Car Rental/input_Phone Number'), '89789090998')

// Continue to special request
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/button_Continue'))
WebUI.setText(findTestObject('Object Repository/Page_Traveloka - Car Rental/textarea_Special Request'), 'Tidak ada')
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/button_Continue to Payment'))

// Confirm all rental requirements
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_Check Requirements'))
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_Check All'))
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/button_Save'))
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/button_Continue to Payment'))

// Choose payment method
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/h1_How would you like to pay'))
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_Virtual Account'))
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_New Virtual Account'))
WebUI.click(findTestObject('Object Repository/Page_Traveloka - Car Rental/div_Pay with Mandiri Virtual Account'))

// Close browser
WebUI.closeBrowser()

4.	How to find elements/selectors from the web user interface
To find elements/selectors, you can follow these steps:
1.	Right-click the element and select "Inspect" (Chrome) or "Inspect Element" (Firefox) to open Developer Tools and highlight the element's HTML code. 
2.	Look for unique attributes like `id`, `class`, or `name`.
3.	Use the unique `id` if available
4.	If not, use `class` or a combination of other attribute
5.	ID Selector**: `#elementID`
6.	Class Selector**: `.elementClass`
7.	Attribute Selector**: `[attribute='value']`
8.	XPath**: `//tagname[@attribute='value']`

Pseudocode or logic step to solve the following game using an automated test
BEGIN

    OPEN browser

    NAVIGATE TO ' https://zzzscore.com/1to50/en/'
    
    FOR i FROM 1 TO 100 DO
        
        SET xpath TO "//*[@id='grid']/div[text()='" + i + "']"
        
   
        WAIT UNTIL element identified by xpath IS present
        
        CLICK element identified by xpath
    END FOR
    
   
    CLOSE browser

END



