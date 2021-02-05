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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\septian\\Downloads\\id.co.myhomecredit_10112_apps.evozi.com.apk', true)

//Swipe right image

Mobile.swipe(870, 1285, 81, 1251 //supposedly Right to Left
    )

Mobile.swipe(870, 1285, 81, 1251 //supposedly Right to Left
    )

Mobile.swipe(870, 1285, 81, 1251 //supposedly Right to Left
    )

Mobile.scrollToText('Jika anda memiliki pertanyaan tentang Kebijakan ini, silahkan hubungi layanan pelanggan kami di: (021) 29539600.')

// Daftaf

Mobile.tap(findTestObject('Register/android.widget.TextView0 - Setuju  Lanjutkan'), 0)

// Isi form register
Mobile.tap(findTestObject('Register/android.widget.Spinner0 - 3'), 0)

Mobile.scrollToText('26')

Mobile.tap(findTestObject('Register/android.widget.CheckedTextView0 - 26'), 0)

Mobile.tap(findTestObject('Register/android.widget.Spinner0 - Februari'), 0)

Mobile.tap(findTestObject('Register/android.widget.CheckedTextView0 - September'), 0)

Mobile.tap(findTestObject('Register/android.widget.Spinner0 - 2021'), 0)

Mobile.scrollToText('1997')

Mobile.tap(findTestObject('Register/android.widget.CheckedTextView0 - 1997'), 0)

// Change with new number
Mobile.setText(findTestObject('Register/android.widget.EditText0'), '82298619241', 0)

Mobile.setText(findTestObject('Register/android.widget.EditText0 (1)'), '121902', 0)

Mobile.setText(findTestObject('Register/android.widget.EditText0 (2)'), '121902', 0)

Mobile.tap(findTestObject('Register/android.widget.Button0 - Lanjutkan'), 0)

Mobile.tap(findTestObject('Register/android.widget.Button0 - Lanjutkan (1)'), 0)

// Supposed to be input manually for input otp
Mobile.setText(findTestObject('Register/android.widget.EditText0 (3)'), '4', 0)

Mobile.setText(findTestObject('Register/android.widget.EditText0 (4)'), '1', 0)

Mobile.setText(findTestObject('Register/android.widget.EditText0 (5)'), '3', 0)

Mobile.setText(findTestObject('Register/android.widget.EditText0 (6)'), '1', 0)

Mobile.setText(findTestObject('Register/android.widget.EditText0 (7)'), '6', 0)

Mobile.setText(findTestObject('Register/android.widget.EditText0 (8)'), '5', 0)

// Daftar

Mobile.tap(findTestObject('Register/android.widget.Button0 - Daftar'), 0)

Mobile.closeApplication()

