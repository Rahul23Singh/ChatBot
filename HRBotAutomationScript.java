package HR_Bot;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HRBotAutomationScript {

	public WebDriver driver;

	@BeforeClass
	public void PreCondition() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chatBot\\exeFolder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://botuat.maxlifeinsurance.com/empapp?key1=authorize_eapp_001&key2=pmhom3698&key3=IOS&key4=eapp");
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void childHealthCarePolicy() throws InterruptedException {

		WebElement HiPriyankaDefaultMessage = driver.findElement(By.xpath("//p[text()='Hi Priyanka']"));
		WebElement howCanIHelp = driver.findElement(By.xpath("//p[contains(text(),' I can help you with following options')]"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(700);
		if (HiPriyankaDefaultMessage.isDisplayed() == true && howCanIHelp.isDisplayed() == true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		Thread.sleep(700);
		WebElement checkHRPolicies = driver.findElement(By.xpath("//a[contains(text(),'HR Policies')]"));
		if (checkHRPolicies.isDisplayed()) {
			checkHRPolicies.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement HRPolicyDefaultMessage = driver.findElement(By.xpath("//p[contains(text(),'How can I help you with HR Policies today?')]"));
			if (HRPolicyDefaultMessage.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			WebElement childHealthCareWebelement = driver.findElement(By.xpath("(//a[contains(text(),'Child Healthcare Policy')])[1]"));
			if (childHealthCareWebelement.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			childHealthCareWebelement.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement childHealthCareDefaultMessage = driver.findElement(By.xpath("(//p[contains(text(),'How can I help you with Child Healthcare Policy Please select from following options or just type in...')])[1]"));
			if (childHealthCareDefaultMessage.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			WebElement eligibility = driver.findElement(By.xpath("//a[contains(text(),'Eligibility')]"));
			if (eligibility.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			eligibility.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement EligibilityResponse = driver.findElement(By.xpath("//p[contains(text(),'Please note that only children of employee')]"));
			if (EligibilityResponse.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			WebElement TravelExpenses = driver.findElement(By.xpath("//a[contains(text(),'Travel Expenses')]"));
			if (TravelExpenses.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			TravelExpenses.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement TravelExpensesResponse = driver.findElement(By.xpath("//p[contains(text(),'One parent will be provided accommodation and travel expenses. The other parent can come and stay on his or her own cost.')]"));
			if (TravelExpensesResponse.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			WebElement SupportTenure = driver.findElement(By.xpath("//a[contains(text(),'Support Tenure')]"));
			if (SupportTenure.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			SupportTenure.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement SupportTenureResponse = driver.findElement(By.xpath("//p[contains(text(),'There is no time limit to the hospitalization provided. But this is primarily for surgery purposes and if any specific treatment is required')]"));
			if (SupportTenureResponse.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			WebElement TreatmentEligibility = driver.findElement(By.xpath("//a[contains(text(),'Treatment Eligibility')]"));
			if (TreatmentEligibility.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			TreatmentEligibility.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement TreatmentEligibilityResponse = driver.findElement(By.xpath(
					"//p[contains(text(),'Employe cannot avail of reimbursements for treatment done elsewhere. This benefit is meant for supporting an employee during his time of need. The employee will need to come to Max Hospitals in Delhi for medical care for his child.')]"));
			if (TreatmentEligibilityResponse.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			WebElement SupportingDocuments = driver.findElement(By.xpath("//a[contains(text(),'Supporting Documents')]"));
			if (SupportingDocuments.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			SupportingDocuments.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement SupportingDocumentsResponse = driver.findElement(By.xpath(
					"//p[contains(text(),'The MIF rep in MAXLI will require you to provide us with the birth certificate of the child along with the case history of the problem and the doctor’s recommendation. Please also provide your contact details so that MIF or a Max doctor can get in touch with you directly for clarifying any questions that they might have.')]"));
			if (SupportingDocumentsResponse.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			WebElement AdmissionProcess = driver.findElement(By.xpath("//a[contains(text(),'Admission Process')]"));
			if (AdmissionProcess.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			AdmissionProcess.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement AdmissionProcessResponse = driver.findElement(By.xpath(
					"//p[contains(text(),'Please note that the process of checking and clarifying can take upto 7 working days to speed up the process employees are requested to share details of medical care / history and doctor recommendation upfront with the OH who will share the same with us.')]"));
			if (AdmissionProcessResponse.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			WebElement DiseasesCoverage = driver.findElement(By.xpath("//a[contains(text(),'Diseases Coverage')]"));
			if (DiseasesCoverage.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			DiseasesCoverage.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement DiseasesCoverageResponse = driver.findElement(By.xpath("//p[contains(text(),'As per the initiative any MAXLI employee')]"));
			if (DiseasesCoverageResponse.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			WebElement PostTreatment = driver.findElement(By.xpath("//a[contains(text(),'Post Treatment')]"));
			if (PostTreatment.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			PostTreatment.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement PostTreatmentResponse = driver.findElement(By.xpath("//p[contains(text(),'Post treatment medication is not included in this benefit.')]"));
			if (PostTreatmentResponse.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			WebElement PolicyDocument = driver.findElement(By.xpath("//a[contains(text(),'Policy Document')]"));
			if (PolicyDocument.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			PolicyDocument.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement PolicyDocumentResponse = driver.findElement(By.xpath("//p[contains(text(),'Here is the Child Healthcare Policy document for your perusal.')]"));
			if (PolicyDocumentResponse.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			WebElement inputTextField = driver.findElement(By.xpath("//input[@ng-model='inputText']"));
			inputTextField.sendKeys("fjjjjjkkxkfxkfxkfxkxk36436");
			WebElement clickButton = driver.findElement(By.xpath("//img[@class='send']"));
			clickButton.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement sorryMessage = driver.findElement(By.xpath("//p[contains(text(),'Sorry we could not find an answer. Here is the Child Healthcare Policy document for your persual')]"));
			WebElement PDFDocument = driver.findElement(By.xpath("//p[contains(text(),'Child Healthcare Policy Document')]"));
			if (sorryMessage.isDisplayed() == true && PDFDocument.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(500);
			WebElement RefreshButton = driver.findElement(By.xpath("//img[@src='img/homeicon.svg']"));
			RefreshButton.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} else {
			System.out.println("HR Policies is not present");
		}

	}

	@Test(priority = 2)
	public void companyAssetPolicy() throws InterruptedException {

		WebElement HiPriyankaDefaultMessage = driver.findElement(By.xpath("//p[text()='Hi Priyanka']"));
		WebElement howCanIHelp = driver.findElement(By.xpath("//p[contains(text(),' I can help you with following options')]"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(700);
		if (HiPriyankaDefaultMessage.isDisplayed() == true && howCanIHelp.isDisplayed() == true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		Thread.sleep(700);
		WebElement checkHRPolicies = driver.findElement(By.xpath("//a[contains(text(),'HR Policies')]"));
		if (checkHRPolicies.isDisplayed()) {
			checkHRPolicies.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement HRPolicyDefaultMessage = driver.findElement(By.xpath("//p[contains(text(),'How can I help you with HR Policies today?')]"));
			if (HRPolicyDefaultMessage.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			WebElement companyAssetPolicyButton = driver.findElement(By.xpath("(//a[text()='Company Asset Policy'])[1]"));

			if (companyAssetPolicyButton.isDisplayed() == true) {
				companyAssetPolicyButton.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement companyAssetPolicyClickDefaultMessage = driver.findElement(By.xpath("(//p[contains(text(),'How can I help you with Company Asset Policy Please select from following options or just type in...')])[1]"));
				if (companyAssetPolicyClickDefaultMessage.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				// Checking cloud button and clicking in queue
				WebElement eligibility = driver.findElement(By.xpath("//a[contains(text(),'Eligibility')]"));
				if (eligibility.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				eligibility.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement EligibilityResponse = driver
						.findElement(By.xpath("//p[contains(text(),'All full time employees on the payroll of Max Life at Band 3 or above have an option to purchase furniture, electronics or car through the Company Asset Scheme. ')]"));
				if (EligibilityResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement process = driver.findElement(By.xpath("//a[contains(text(),'Process')]"));
				if (process.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				process.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement processResponse = driver.findElement(By.xpath(
						"//p[contains(text(),'1. Employees wishing to purchase assets are required to submit filled Asset Purchase Requisition form where they undertake to buy back the asset at the end of the stipulated period or if they resign at the buyback value as determined by Max Life.')]"));
				if (processResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement TaxCompanyScheme = driver.findElement(By.xpath("//a[contains(text(),'Tax Company Scheme')]"));
				if (TaxCompanyScheme.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				TaxCompanyScheme.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement TaxCompanySchemeResponse = driver.findElement(By.xpath(
						"//p[contains(text(),'As per Rule 3(7) (vii) of the new perquisite rules, the value of any personal benefit to the employee from the use by the employee or any member of his household of furniture and other appliances (other than laptops and computers) shall be determined to be 10% of the original cost of such asset paid or payable by Max Life , as reduced by the amount, if any, paid or recovered from the employee for such use')]"));
				if (TaxCompanySchemeResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement RecoveryScheme = driver.findElement(By.xpath("//a[contains(text(),'Recovery Scheme')]"));
				if (RecoveryScheme.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				RecoveryScheme.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement RecoverySchemeResponse = driver.findElement(By.xpath("//p[contains(text(),'Company will recover 10% of original cost of the asset in the beginning of the year')]"));
				if (RecoverySchemeResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement ExitScheme = driver.findElement(By.xpath("//a[contains(text(),'Exit Scheme')]"));
				if (ExitScheme.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				ExitScheme.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement ExitSchemeResponse = driver
						.findElement(By.xpath("//p[contains(text(),'If employees leaves before the depreciation period is over for the asset purchased under the company asset scheme, employee will have to buy back the asset from Max Life.')]"));
				if (ExitSchemeResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement Assetbuyback = driver.findElement(By.xpath("//a[contains(text(),'Asset buyback')]"));
				if (Assetbuyback.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				Assetbuyback.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement AssetbuybackResponse = driver.findElement(By.xpath("//p[contains(text(),'1. In case, for any reason, including but not limited to the termination/resignation of the employee, employee should buy back all assets purchased under the company asset scheme.')]"));
				if (AssetbuybackResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement Relocate = driver.findElement(By.xpath("//a[contains(text(),'Relocate')]"));
				if (Relocate.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				Relocate.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement RelocateResponse = driver.findElement(By.xpath("//p[contains(text(),'Any and all costs incurred on account of movement – transportation, registration, any taxes, service tax will have to be borne by the employee.')]"));
				if (RelocateResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement UpgradeAsset = driver.findElement(By.xpath("//a[contains(text(),'Upgrade Asset')]"));
				if (UpgradeAsset.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				UpgradeAsset.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement UpgradeAssetResponse = driver
						.findElement(By.xpath("//p[contains(text(),'Employee can upgrade to a new car/asset before the depreciation period is over but the employee would need to first buy back the asset from Max Life.')]"));
				if (UpgradeAssetResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement PersonalAssets = driver.findElement(By.xpath("//a[contains(text(),'Personal Assets')]"));
				if (PersonalAssets.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				PersonalAssets.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement PersonalAssetsResponse = driver
						.findElement(By.xpath("//p[contains(text(),'1. Employee cannot avail reimbursement under the Flexible Benefits Plan for personal assets.')]"));
				if (PersonalAssetsResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement Movement = driver.findElement(By.xpath("//a[contains(text(),'Movement')]"));
				if (Movement.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				Movement.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement MovementREsponse = driver.findElement(By.xpath("//p[contains(text(),'In case employee moves to other Max Group company,  employee/the new company would have to buy back the asset from Max Life.')]"));
				if (MovementREsponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement PolicyDocument = driver.findElement(By.xpath("//a[contains(text(),'Policy Document')]"));
				if (PolicyDocument.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				PolicyDocument.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement PolicyDocumentResponse = driver.findElement(By.xpath("//p[contains(text(),'Here is the Company Asset Policy document for your perusal.')]"));
				if (PolicyDocumentResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement inputTextField = driver.findElement(By.xpath("//input[@ng-model='inputText']"));
				inputTextField.sendKeys("ksikffwgfiwfgifgwigfig53525");
				WebElement clickButton = driver.findElement(By.xpath("//img[@class='send']"));
				clickButton.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement sorryMessage = driver.findElement(By.xpath("//p[contains(text(),'Sorry we could not find an answer. Here is the Company Asset Policy document for your persual')]"));
				WebElement PDFDocument = driver.findElement(By.xpath("//p[contains(text(),'Child Healthcare Policy Document')]"));
				if (sorryMessage.isDisplayed() == true && PDFDocument.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(500);
				WebElement RefreshButton = driver.findElement(By.xpath("//img[@src='img/homeicon.svg']"));
				RefreshButton.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			} else {
				System.out.println("HR Policies is not present");
			}

		}

	}

	@Test(priority = 3)
	public void WorkingHourPolicy() throws InterruptedException {
		WebElement HiPriyankaDefaultMessage = driver.findElement(By.xpath("//p[text()='Hi Priyanka']"));
		WebElement howCanIHelp = driver.findElement(By.xpath("//p[contains(text(),' I can help you with following options')]"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(700);
		if (HiPriyankaDefaultMessage.isDisplayed() == true && howCanIHelp.isDisplayed() == true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		Thread.sleep(700);
		WebElement checkHRPolicies = driver.findElement(By.xpath("//a[contains(text(),'HR Policies')]"));
		if (checkHRPolicies.isDisplayed()) {
			checkHRPolicies.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement HRPolicyDefaultMessage = driver.findElement(By.xpath("//p[contains(text(),'How can I help you with HR Policies today?')]"));
			if (HRPolicyDefaultMessage.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			WebElement WorkingHourPolicyButton = driver.findElement(By.xpath("(//a[contains(text(),'Working Hour Policy')])[1]"));
			if (WorkingHourPolicyButton.isDisplayed()) {
				WorkingHourPolicyButton.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement WorkingHourPolicyClickDefaultMessage = driver.findElement(By.xpath("(//p[contains(text(),'How can I help you with Working Hour Policy Please select from following options or just type in...')])[1]"));
				if (WorkingHourPolicyClickDefaultMessage.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				// Checking cloud button and clicking in queue
				WebElement LightsOut = driver.findElement(By.xpath("//a[contains(text(),'Lights-Out')]"));
				if (LightsOut.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				LightsOut.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement LightsOutResponse = driver.findElement(By.xpath("//p[contains(text(),'Lights-out means that all offices would be closed on the 1st & 3rd Wednesday of every month at 6:30 pm (GO) & 6:00 pm (HO).')]"));
				if (LightsOutResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement Applicability = driver.findElement(By.xpath("//a[contains(text(),'Applicability')]"));
				if (Applicability.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				Applicability.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement ApplicabilityResponse = driver.findElement(By.xpath("//p[contains(text(),'Lights-out is only applicable on the first & third Wednesday of every month.')]"));
				if (ApplicabilityResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement WorkTimings = driver.findElement(By.xpath("//a[contains(text(),'Work Timings')]"));
				if (WorkTimings.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WorkTimings.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement WorkTimingsResponse = driver.findElement(By.xpath("//p[contains(text(),'Max Life has defined working hours for all offices and the office head cannot change the work timings.  ')]"));
				if (WorkTimingsResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement LateWorking = driver.findElement(By.xpath("//a[contains(text(),'Late Working')]"));
				if (LateWorking.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				LateWorking.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement LateWorkingResponse = driver.findElement(By.xpath("//p[contains(text(),'No female employee, contractors, advisors or agents should be working beyond 8:00 pm in any day of the year')]"));
				if (LateWorkingResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement WorkingHours = driver.findElement(By.xpath("//a[contains(text(),'Working Hours')]"));
				if (WorkingHours.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WorkingHours.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement WorkingHoursResponse = driver.findElement(By.xpath("//p[contains(text(),'Work hours are mentioned below:')]"));
				if (WorkingHoursResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement PolicyDocument = driver.findElement(By.xpath("//a[contains(text(),'Policy Document')]"));
				if (PolicyDocument.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				PolicyDocument.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement PolicyDocumentResponse = driver.findElement(By.xpath("//p[contains(text(),'Here is the Child Healthcare Policy document for your perusal.')]"));
				if (PolicyDocumentResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement inputTextField = driver.findElement(By.xpath("//input[@ng-model='inputText']"));
				inputTextField.sendKeys("hdjejdjdjdj3252hsh");
				WebElement clickButton = driver.findElement(By.xpath("//img[@class='send']"));
				clickButton.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement sorryMessage = driver.findElement(By.xpath("//p[contains(text(),'Sorry we could not find an answer. Here is the Company Asset Policy document for your persual')]"));
				WebElement PDFDocument = driver.findElement(By.xpath("//p[contains(text(),'Child Healthcare Policy Document')]"));
				if (sorryMessage.isDisplayed() == true && PDFDocument.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}

			} else {
				System.out.println("HR Policies is not present");
			}
			Thread.sleep(500);
			WebElement RefreshButton = driver.findElement(By.xpath("//img[@src='img/homeicon.svg']"));
			RefreshButton.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}

	}
	@Test(priority = 4)
	public void companyAssetPolicy() throws InterruptedException {

		WebElement HiPriyankaDefaultMessage = driver.findElement(By.xpath("//p[text()='Hi Priyanka']"));
		WebElement howCanIHelp = driver.findElement(By.xpath("//p[contains(text(),' I can help you with following options')]"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(700);
		if (HiPriyankaDefaultMessage.isDisplayed() == true && howCanIHelp.isDisplayed() == true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		Thread.sleep(700);
		WebElement checkHRPolicies = driver.findElement(By.xpath("//a[contains(text(),'HR Policies')]"));
		if (checkHRPolicies.isDisplayed()) {
			checkHRPolicies.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement HRPolicyDefaultMessage = driver.findElement(By.xpath("//p[contains(text(),'How can I help you with HR Policies today?')]"));
			if (HRPolicyDefaultMessage.isDisplayed() == true) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
			Thread.sleep(700);
			WebElement companyAssetPolicyButton = driver.findElement(By.xpath("(//a[text()='Company Asset Policy'])[1]"));

			if (companyAssetPolicyButton.isDisplayed() == true) {
				companyAssetPolicyButton.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement companyAssetPolicyClickDefaultMessage = driver.findElement(By.xpath("(//p[contains(text(),'How can I help you with Company Asset Policy Please select from following options or just type in...')])[1]"));
				if (companyAssetPolicyClickDefaultMessage.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				// Checking cloud button and clicking in queue
				WebElement eligibility = driver.findElement(By.xpath("//a[contains(text(),'Eligibility')]"));
				if (eligibility.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				eligibility.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement EligibilityResponse = driver
						.findElement(By.xpath("//p[contains(text(),'All full time employees on the payroll of Max Life at Band 3 or above have an option to purchase furniture, electronics or car through the Company Asset Scheme. ')]"));
				if (EligibilityResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement process = driver.findElement(By.xpath("//a[contains(text(),'Process')]"));
				if (process.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				process.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement processResponse = driver.findElement(By.xpath(
						"//p[contains(text(),'1. Employees wishing to purchase assets are required to submit filled Asset Purchase Requisition form where they undertake to buy back the asset at the end of the stipulated period or if they resign at the buyback value as determined by Max Life.')]"));
				if (processResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement TaxCompanyScheme = driver.findElement(By.xpath("//a[contains(text(),'Tax Company Scheme')]"));
				if (TaxCompanyScheme.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				TaxCompanyScheme.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement TaxCompanySchemeResponse = driver.findElement(By.xpath(
						"//p[contains(text(),'As per Rule 3(7) (vii) of the new perquisite rules, the value of any personal benefit to the employee from the use by the employee or any member of his household of furniture and other appliances (other than laptops and computers) shall be determined to be 10% of the original cost of such asset paid or payable by Max Life , as reduced by the amount, if any, paid or recovered from the employee for such use')]"));
				if (TaxCompanySchemeResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement RecoveryScheme = driver.findElement(By.xpath("//a[contains(text(),'Recovery Scheme')]"));
				if (RecoveryScheme.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				RecoveryScheme.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement RecoverySchemeResponse = driver.findElement(By.xpath("//p[contains(text(),'Company will recover 10% of original cost of the asset in the beginning of the year')]"));
				if (RecoverySchemeResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement ExitScheme = driver.findElement(By.xpath("//a[contains(text(),'Exit Scheme')]"));
				if (ExitScheme.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				ExitScheme.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement ExitSchemeResponse = driver
						.findElement(By.xpath("//p[contains(text(),'If employees leaves before the depreciation period is over for the asset purchased under the company asset scheme, employee will have to buy back the asset from Max Life.')]"));
				if (ExitSchemeResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement Assetbuyback = driver.findElement(By.xpath("//a[contains(text(),'Asset buyback')]"));
				if (Assetbuyback.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				Assetbuyback.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement AssetbuybackResponse = driver.findElement(By.xpath("//p[contains(text(),'1. In case, for any reason, including but not limited to the termination/resignation of the employee, employee should buy back all assets purchased under the company asset scheme.')]"));
				if (AssetbuybackResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement Relocate = driver.findElement(By.xpath("//a[contains(text(),'Relocate')]"));
				if (Relocate.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				Relocate.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement RelocateResponse = driver.findElement(By.xpath("//p[contains(text(),'Any and all costs incurred on account of movement – transportation, registration, any taxes, service tax will have to be borne by the employee.')]"));
				if (RelocateResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement UpgradeAsset = driver.findElement(By.xpath("//a[contains(text(),'Upgrade Asset')]"));
				if (UpgradeAsset.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				UpgradeAsset.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement UpgradeAssetResponse = driver
						.findElement(By.xpath("//p[contains(text(),'Employee can upgrade to a new car/asset before the depreciation period is over but the employee would need to first buy back the asset from Max Life.')]"));
				if (UpgradeAssetResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement PersonalAssets = driver.findElement(By.xpath("//a[contains(text(),'Personal Assets')]"));
				if (PersonalAssets.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				PersonalAssets.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement PersonalAssetsResponse = driver
						.findElement(By.xpath("//p[contains(text(),'1. Employee cannot avail reimbursement under the Flexible Benefits Plan for personal assets.')]"));
				if (PersonalAssetsResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement Movement = driver.findElement(By.xpath("//a[contains(text(),'Movement')]"));
				if (Movement.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				Movement.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement MovementREsponse = driver.findElement(By.xpath("//p[contains(text(),'In case employee moves to other Max Group company,  employee/the new company would have to buy back the asset from Max Life.')]"));
				if (MovementREsponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement PolicyDocument = driver.findElement(By.xpath("//a[contains(text(),'Policy Document')]"));
				if (PolicyDocument.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				PolicyDocument.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement PolicyDocumentResponse = driver.findElement(By.xpath("//p[contains(text(),'Here is the Company Asset Policy document for your perusal.')]"));
				if (PolicyDocumentResponse.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(700);
				WebElement inputTextField = driver.findElement(By.xpath("//input[@ng-model='inputText']"));
				inputTextField.sendKeys("ksikffwgfiwfgifgwigfig53525");
				WebElement clickButton = driver.findElement(By.xpath("//img[@class='send']"));
				clickButton.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebElement sorryMessage = driver.findElement(By.xpath("//p[contains(text(),'Sorry we could not find an answer. Here is the Company Asset Policy document for your persual')]"));
				WebElement PDFDocument = driver.findElement(By.xpath("//p[contains(text(),'Child Healthcare Policy Document')]"));
				if (sorryMessage.isDisplayed() == true && PDFDocument.isDisplayed() == true) {
					Assert.assertTrue(true);
				} else {
					Assert.assertFalse(false);
				}
				Thread.sleep(500);
				WebElement RefreshButton = driver.findElement(By.xpath("//img[@src='img/homeicon.svg']"));
				RefreshButton.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			} else {
				System.out.println("HR Policies is not present");
			}

		}

	}
}