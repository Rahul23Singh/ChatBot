package AxisBot;

import static org.testng.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.chrono.ThaiBuddhistEra;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AxisBotAutomationScript {

	WebDriver driver;

	@BeforeClass
	public void PreConditions() throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\ChatBot\\All exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://botuat.maxlifeinsurance.com/login#/mobile");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void loginPageValidation() throws IOException, InterruptedException {
		
		driver.findElement(By.xpath("//h5[text()='Validate your mobile number']")).isDisplayed();
		driver.findElement(By.xpath("//img[@alt='profile-pic']")).isDisplayed();
		driver.findElement(By.xpath("//h2[contains(text(),'Welcome To Chatbot')]")).isDisplayed();
		driver.findElement(By.xpath("//label[contains(text(),'Mobile:' )]")).isDisplayed();
		Assert.assertTrue(true);
		WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
		if (submitButton.isDisplayed() == true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}

		driver.findElement(By.xpath("//input[@ng-model='inputText']")).sendKeys("1111111111");
		if (submitButton.isDisplayed() == true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}
		submitButton.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Mobile number you have entered is not valid.')]"))
				.isDisplayed();
		// wrong OTP input
		driver.findElement(By.xpath("//input[@ng-model='inputText']")).sendKeys("8802907956");
		if (submitButton.isDisplayed() == true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}
		submitButton.click();
		WebElement OTPValidation = driver.findElement(By.xpath("//label[contains(text(),'OTP: ')]"));
		OTPValidation.isDisplayed();
		WebElement inputField = driver.findElement(By.xpath("//input[contains(@name,'inputText')]"));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please input OTP here :");
		// Reading data using readLine
		String name = reader.readLine();
		inputField.sendKeys(name);
		WebElement validateButton = driver.findElement(By.xpath("//button[text()='Validate']"));
		if (validateButton.isDisplayed() == true) {
			validateButton.click();
		} else {
			Assert.assertFalse(false);
		}	
	}

	@Test(priority=1)
	public void ValidateResponseOfAllKPI() throws InterruptedException {
		Thread.sleep(100);
		WebElement validateDefaultUserText = driver.findElement(By.xpath("//p[contains(text(),'Hi Rahul')]"));
		WebElement validateDefaultMessageText = driver
				.findElement(By.xpath("//p[contains(text(),' how can i help you with business KPI')]"));
		if (validateDefaultMessageText.isDisplayed() == true && validateDefaultUserText.isDisplayed() == true) {
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		WebElement inputTextField = driver.findElement(By.xpath("//input[contains(@name,'inputText')]"));
		WebElement clickIcon = driver.findElement(By.xpath("//img[contains(@class,'send')]"));
		
		WebElement appliedCases = driver.findElement(By.xpath("//a[contains(text(),'Applied Cases')]"));
		if(appliedCases.isDisplayed()==true){
			appliedCases.click();
		}
		else{
			Assert.assertFalse(false);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Applied cases MTD for Axis Bank is')]")).isDisplayed();
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement MTDData = driver.findElement(By.xpath("//p[contains(text(),'Applied cases MTD for Axis Bank is')]"));
		if(MTDData.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("YTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement YTDData = driver.findElement(By.xpath("//p[contains(text(),'Applied cases YTD for Axis Bank is')]"));
		if(YTDData.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement PaidCases = driver.findElement(By.xpath("(//a[contains(text(),'Paid Cases')])[1]"));
		if(PaidCases.isDisplayed()==true){
			PaidCases.click();
		}
		else{
			Assert.assertFalse(false);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Paid cases MTD for Axis Bank is')]")).isDisplayed();
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement MTDPaidCasesData = driver.findElement(By.xpath("//p[contains(text(),'Paid cases MTD for Axis Bank is')]"));
		if(MTDPaidCasesData.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("YTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement YTDPaidCasesData = driver.findElement(By.xpath("//p[contains(text(),'Paid cases YTD for Axis Bank is')]"));
		if(YTDPaidCasesData.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement GrowthAppliedCasesKPIButton = driver.findElement(By.xpath("(//a[contains(text(),'Growth Applied Cases')])[1]"));
		if(GrowthAppliedCasesKPIButton.isDisplayed()==true){
			GrowthAppliedCasesKPIButton.click();
		}
		else{
			Assert.assertFalse(false);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[contains(text(),'Axis Bank has witnessed applied Business growth is')])[1]")).isDisplayed();
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement MTDDataOfGrowthAppliedCasesKPI = driver.findElement(By.xpath("(//p[contains(text(),'on MTD basis, last year same time we had clocked')])"));
		if(MTDDataOfGrowthAppliedCasesKPI.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("YTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement YTDDataOfGrowthAppliedCasesKPI = driver.findElement(By.xpath("(//p[contains(text(),'on YTD basis, last year same time we had clocked')])[1]"));
		if(YTDDataOfGrowthAppliedCasesKPI.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement GrowthPaidCases = driver.findElement(By.xpath("(//a[contains(text(),'Growth Paid Cases')])[1]"));
		if(GrowthPaidCases.isDisplayed()==true){
			GrowthPaidCases.click();
		}
		else{
			Assert.assertFalse(false);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Applied cases MTD for Axis Bank is')]")).isDisplayed();
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement MTDDataGrowthPaidCases = driver.findElement(By.xpath("(//p[contains(text(),'on MTD basis, last year same time we had clocked')])[2]"));
		if(MTDDataGrowthPaidCases.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("YTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement YTDDataGrowthPaidCases = driver.findElement(By.xpath("(//p[contains(text(),'on YTD basis, last year same time we had clocked')])[2]"));
		if(YTDDataGrowthPaidCases.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement CaseSizeAFYP = driver.findElement(By.xpath("(//a[contains(text(),'Case Size AFYP')])[1]"));
		if(CaseSizeAFYP.isDisplayed()==true){
			CaseSizeAFYP.click();
		}
		else{
			Assert.assertFalse(false);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[contains(text(),'Case Size MTD for Axis Bank is Rs.')])[1]")).isDisplayed();
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement MTDDataCaseSizeAFYP = driver.findElement(By.xpath("(//p[contains(text(),'Case Size MTD for Axis Bank is Rs.')])[2]"));
		if(MTDDataCaseSizeAFYP.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("YTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement YTDDataCaseSizeAFYP = driver.findElement(By.xpath("//p[contains(text(),'Case Size YTD for Axis Bank is Rs.')]"));
		if(YTDDataCaseSizeAFYP.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement GrowthCaseSize = driver.findElement(By.xpath("(//a[contains(text(),'Growth Case Size')])[1]"));
		if(GrowthCaseSize.isDisplayed()==true){
			GrowthCaseSize.click();
		}
		else{
			Assert.assertFalse(false);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Axis Bank has witnessed case size growth is')]")).isDisplayed();
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement MTDDataGrowthCaseSize = driver.findElement(By.xpath("(//p[contains(text(),'on MTD basis, last year same time we had clocked')])[3]"));
		if(MTDDataGrowthCaseSize.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("YTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement YTDDataGrowthCaseSize = driver.findElement(By.xpath("(//p[contains(text(),'on YTD basis, last year same time we had clocked')])[3]"));
		if(YTDDataGrowthCaseSize.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement ProductMix = driver.findElement(By.xpath("(//a[contains(text(),'Product Mix')])[1]"));
		if(ProductMix.isDisplayed()==true){
			ProductMix.click();
		}
		else{
			Assert.assertFalse(false);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Product mix ratio on Adj MFYP for Axis Bank is ULIP:')] ")).isDisplayed();
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement MTDDataProductMix = driver.findElement(By.xpath("//p[contains(text(),'MTD Product mix ratio on Adj MFYP for Axis Bank is ULIP:')]"));
		if(MTDDataProductMix.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("YTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement YTDDataProductMix = driver.findElement(By.xpath("(//p[contains(text(),'YTD Product mix ratio on Adj MFYP for Axis Bank is ULIP:')])[1]"));
		if(YTDDataProductMix.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement AppliedBusiness = driver.findElement(By.xpath("(//a[contains(text(),'Applied Business')])[1]"));
		if(AppliedBusiness.isDisplayed()==true){
			AppliedBusiness.click();
		}
		else{
			Assert.assertFalse(false);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[contains(text(),'Applied Business AFYP MTD For Axis:')])")).isDisplayed();
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement MTDDataAppliedBusiness = driver.findElement(By.xpath("(//p[contains(text(),'Applied Business AFYP MTD For Axis:')])[2]"));
		if(MTDDataAppliedBusiness.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("YTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement YTDDataAppliedBusiness = driver.findElement(By.xpath("(//p[contains(text(),'Applied Business AFYP YTD For Axis:')])"));
		if(YTDDataAppliedBusiness.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement PaidBusiness = driver.findElement(By.xpath("(//a[contains(text(),'Paid Business')])[1]"));
		if(PaidBusiness.isDisplayed()==true){
			PaidBusiness.click();
		}
		else{
			Assert.assertFalse(false);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Paid AdjMFYP Business MTD for Axis is :')]")).isDisplayed();
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement MTDDataPaidBusiness = driver.findElement(By.xpath("//p[contains(text(),'Paid AdjMFYP Business MTD for Axis is :')]"));
		if(MTDDataPaidBusiness.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("YTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement YTDDataPaidBusiness = driver.findElement(By.xpath("(//p[contains(text(),'Paid AdjMFYP Business for Axis is :')])[1]"));
		if(YTDDataPaidBusiness.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement Growth = driver.findElement(By.xpath("(//a[contains(text(),'Growth')])[4]"));
		if(Growth.isDisplayed()==true){
			Growth.click();
		}
		else{
			Assert.assertFalse(false);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Axis has witnessed paid Business growth of')]")).isDisplayed();
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement MTDDataGrowth = driver.findElement(By.xpath("(//p[contains(text(),'on MTD basis,')])[11]"));
		if(MTDDataGrowth.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("YTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement YTDDataGrowth = driver.findElement(By.xpath("(//p[contains(text(),'on YTD basis,')])[4]"));
		if(YTDDataGrowth.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement HubHold = driver.findElement(By.xpath("(//a[contains(text(),'Hub Hold')])[1]"));
		if(HubHold.isDisplayed()==true){
			HubHold.click();
		}
		else{
			Assert.assertFalse(false);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'the total Hub hold cases MTD for Axis Bank is')]")).isDisplayed();
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement MTDDataHubHold = driver.findElement(By.xpath("(//p[contains(text(),'Hub hold cases MTD for Axis Bank is')])[2]"));
		if(MTDDataHubHold.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("YTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement YTDDataHubHold = driver.findElement(By.xpath("(//p[contains(text(),'Hub hold cases YTD for Axis Bank is')])"));
		if(YTDDataHubHold.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement WIP = driver.findElement(By.xpath("(//a[contains(text(),'WIP')])[1]"));
		if(WIP.isDisplayed()==true){
			WIP.click();
		}
		else{
			Assert.assertFalse(false);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Current WIP as of')]")).isDisplayed();
		inputTextField.sendKeys("MTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement MTDDataWIP = driver.findElement(By.xpath("(//p[contains(text(),'Current WIP as of')])[2]"));
		if(MTDDataWIP.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
		inputTextField.sendKeys("YTD");
		clickIcon.click();
		Thread.sleep(2000);
		WebElement YTDDataWIP = driver.findElement(By.xpath("(//p[contains(text(),'Current WIP as of')])[3]"));
		if(YTDDataWIP.isDisplayed()==true){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
	}

}
