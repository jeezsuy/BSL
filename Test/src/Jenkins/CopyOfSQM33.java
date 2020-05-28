package Jenkins;

import java.awt.Dimension;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.substwsdl.impl.TImportImpl;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

///import atu.testrecorder.ATUTestRecorder;

//import com.kpit.ocust.saasBot.Readfromexcel;

public class CopyOfSQM33 {

	private static final String USER_NAME = null;
	private static final String PASSWORD = null;
	private static final String RECIPIENT = null;
	WebDriver driver;

	private static String startTime;
	private static String endTime;
	private static String status;

	public static String getStartTime() {
		return startTime;
	}

	public static String getEndTime() {
		return endTime;
	}

	public static String getStatus() {
		return status;
	}

	public static String getStartgetTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static void takeSnapShot(WebDriver webdriver, String fileWithPath)
			throws Exception {

		// Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

		// Call getScreenshotAs method to create image file

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination

		File DestFile = new File(fileWithPath);

		// Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);

	}

	
	public String callMain() throws Exception {
		System.out.println("Hello");

		main(new String[] {}); // //

		return "Hello"; // return "Main Method Executed";
	}
	//private static final String CHROME_DRIVER_PATH=Jenkins_Demo.class.getClassLoader().getResource("chromedriver.exe").getPath(); 
	static int rowcount;

	@Test
	public void addBankdetails() throws Exception {
		 Path path 
         = Paths.get("C:\\Users\\"+System.getProperty("user.name")+"\\downloads\\List1.xls"); 
		 Path path1 
         = Paths.get(System.getProperty("user.dir")+"\\List1.xls");
		 Path path2 
         =  Paths.get(System.getProperty("user.dir")+"\\List2.csv");
		 
		 Path path3 
         =  Paths.get(System.getProperty("user.dir")+"\\List3.xlsx");
     // deleteIfExists File 
     try { 

         Files.deleteIfExists(path); 
         Files.deleteIfExists(path1); 
         Files.deleteIfExists(path2); 
         Files.deleteIfExists(path3); 
     } 
     catch (IOException e) { 

         // TODO Auto-generated catch block 
         e.printStackTrace(); 
     } 
//InputStream stream= getClass().getResourceAsStream("chromedriver.exe");
//		 ATUTestRecorder atuTestRecorder= new
//		 ATUTestRecorder("C:\\Users\\suyashg\\Downloads", "create_initiative",
//		 true);
//		 atuTestRecorder.start();
//		
		Format f = new SimpleDateFormat("MM/dd/yy");
		String strDate = f.format(new Date());
		System.out.println("Current Date = " + strDate);

		setStartTime(Calendar.getInstance().getTime().toString());

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\chromedriver.exe");
		driver = new ChromeDriver();
		JavascriptExecutor js;

		js = (JavascriptExecutor) driver;

		driver.get("https://eoed-dev1.fa.us2.oraclecloud.com/crmUI/faces/FuseOverview?fnd=%3B%3B%3B%3Bfalse%3B256%3B%3B%3B&fndGlobalItemNodeId=CRM_CUSTOM_CARD_INITIATIVECREATIONDETAILS_C");
		// driver.manage().window().setSize(new Dimension(1382, 744));
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 30);

		driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys(
				"Nov.admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(
				"novsqmdev1");
		driver.findElement(By.xpath("//*[@id='btnActive']")).click();
		// TimeUnit.SECONDS.sleep(3);

		// ATUTestRecorder atuTestRecorder= new
		// ATUTestRecorder("C:\\Users\\suyashg\\Downloads", "create_initiative",
		// true);
		// atuTestRecorder.stop();

		TimeUnit.SECONDS.sleep(2);

		wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
				.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_crmlm_searchId11:ExtGen_actionButton1::popEl")));
		// click on the compose button as soon as the "compose" button is
		// visible
		driver.findElement(
				By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_crmlm_searchId11:ExtGen_actionButton1::popEl"))
				.click();

		TimeUnit.SECONDS.sleep(2);
		wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
				.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_crmlm_searchId11:ExtGen_exportbtn1")));
		// click on the compose button as soon as the "compose" button is
		// visible
		driver.findElement(
				By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_crmlm_searchId11:ExtGen_exportbtn1"))
				.click();

		driver.get("https://eoed-dev1.fa.us2.oraclecloud.com/fscmUI/faces/FndOverview?fnd=%3B%3B%3B%3Bfalse%3B256%3B%3B%3B&fndGlobalItemNodeId=itemNode_procurement_supplier_qualification&_afrLoop=5032680099114443&_afrWindowMode=0&_afrWindowId=mk8k4hwjd&_adf.ctrl-state=b91lq7ofv_1&_afrFS=16&_afrMT=screen&_afrMFW=1366&_afrMFH=608&_afrMFDW=1366&_afrMFDH=768&_afrMFC=8&_afrMFCI=0&_afrMFM=0&_afrMFR=96&_afrMFG=0&_afrMFS=0&_afrMFO=0");

		ReadFromExcel rfe = new ReadFromExcel();
		//rfe.callMain_Read();
		List<String> list_supplier = rfe
				.read_data("List1", "SQM Supplier Name");
		List<String> list_site = rfe.read_data("List1", "SQM Site Name");

		List<String> list_supp_contact = rfe.read_data("List1",
				"Supplier Contact Email");
		List<String> list_title = rfe.read_data("List1", "Initiative Title");

		List<String> list_sbu = rfe.read_data("List1", "SQM SBU");
		List<String> list_q_area = rfe.read_data("List1", "Qualification Area");

		List<String> list_q_area2 = rfe.read_data("List1",
				"Qualification Area2");
		List<String> list_date = rfe.read_data("List1",
				"Date Sent - Initiative");
		List<String> eval_team1 = rfe.read_data("List1",
				"Evaluation Team Member1");
		List<String> eval_team2 = rfe.read_data("List1",
				"Evaluation Team Member2");
		List<String> list_ic_details = rfe.read_data("List1",
				"Initiative Creation Details");
		List<String> list_initiative_number = rfe.read_data("List1",
				"Initiative No.");
		List<String> list_supp_contact_name = rfe.read_data("List1",
				"Supplier Contact");
		

		String initiative_number = "";
		File file = new File(System.getProperty("user.dir")+"\\List3.xlsx");

		FileInputStream fin = new FileInputStream(file);
		XSSFWorkbook wbook = new XSSFWorkbook(fin);
		XSSFSheet sheet = wbook.getSheet("Sheet1");
		rowcount = sheet.getLastRowNum();

		for (int i = 0; i <= 2; i++) {

			//if (i == 0) {

				// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTsditasksId::icon"]
				// pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTsditasksId::icon"

				// <img
				// id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTsditasksId::icon"
				// src="/fscmUI/images/func_panellist_32_ena.png" title="Tasks"
				// alt="Tasks" class="x1mp">

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTsditasksId::icon")));
			
		// driver	.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTsditasksId::icon")).click();;

				WebElement task = driver
						.findElement(By
								.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTsditasksId::icon"));
				WebElement menu;
				boolean menuVisible = false;
				while (!menuVisible) {
					task.click();
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:RAtl1")));
				
					
					menu = driver
							.findElement(By
									.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:RAtl1"));
					if (menu.isDisplayed()) {
						menuVisible = true;
					}
				}
				
			//	_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:RAtl1
			

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:RAtl1")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:RAtl1"))
						.click();

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:soc2::content")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:soc2::content"))
						.click();
				{
					WebElement dropdown = driver
							.findElement(By
									.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:soc2::content"));
					dropdown.findElement(
							By.xpath("//option[. = '" + list_sbu.get(i) + "']"))
							.click();
				}

			

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:it1::content")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:it1::content"))
						.sendKeys(list_title.get(i));

				// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:it1::content"]

				// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:cb1"]

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:cb1")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:cb1"))
						.click();

				// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt3:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon"]
				// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon"]


				
				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon")));

//				driver.findElement(
//						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon"))
//						.click();
				
				
				
				WebElement task3 = driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon"));
				 boolean result1 = false;
				    int attempts1 = 0;
				    while(attempts1 < 2) {
				        try {
				            task3.click();
				            result1 = true;
				            break;
				        } catch(StaleElementReferenceException e) {
				        }
				        attempts1++;
				    }
				
				
				// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:qualAreaNameId::content"]


				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:qualAreaNameId::content")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:qualAreaNameId::content"))
						.sendKeys(list_q_area.get(i));

				// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:qualAreaNameId::content"]

				// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:ownerNameId::content"]

			

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:ownerNameId::content")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:ownerNameId::content"))
						.sendKeys(eval_team1.get(i));

				// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:id1::content"]
				//TimeUnit.SECONDS.sleep(1);

				

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:id1::content")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:id1::content"))
						.sendKeys(strDate);

				if (!list_q_area2.get(i).equals("null")) {

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon")));

					WebElement task4 = driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon"));
					 boolean result2 = false;
					    int attempts2 = 0;
					    while(attempts2 < 2) {
					        try {
					            task4.click();
					            result2 = true;
					            break;
					        } catch(StaleElementReferenceException e) {
					        }
					        attempts2++;
					    }
					

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:qualAreaNameId::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:qualAreaNameId::content"))
							.sendKeys(list_q_area2.get(i));
					TimeUnit.SECONDS.sleep(1);

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:ownerNameId::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:ownerNameId::content"))
							.sendKeys(eval_team2.get(i));

					// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:ownerNameId::content"]

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:id1::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:id1::content"))
							.sendKeys(strDate);

				}

				// Supplier section
				
				

				// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:create::icon"]

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:create::icon")));

				WebElement task5 = driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:create::icon"));
				 boolean result3 = false;
				    int attempts3 = 0;
				    while(attempts3 < 2) {
				        try {
				            task5.click();
				            result3 = true;
				            break;
				        } catch(StaleElementReferenceException e) {
				        }
				        attempts3++;
				    }
				

				// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierNameId::content"]

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierNameId::content")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierNameId::content"))
						.click();

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierNameId::content")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierNameId::content"))
						.sendKeys(list_supplier.get(i));

				// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierSiteId::content"]

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierSiteId::content")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierSiteId::content"))
						.click();

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierSiteId::content")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierSiteId::content"))
						.sendKeys(list_site.get(i));
				
				//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::lovIconId"]

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::lovIconId")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::lovIconId"))
						.click();
				TimeUnit.SECONDS.sleep(1);

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::dropdownPopup::popupsearch")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::dropdownPopup::popupsearch"))
						.click();

				
				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::_afrLovInternalQueryId:value20::content")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::_afrLovInternalQueryId:value20::content"))
						.sendKeys(list_supp_contact.get(i));
				
				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::_afrLovInternalQueryId::search")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::_afrLovInternalQueryId::search"))
						.click();
				
				TimeUnit.SECONDS.sleep(3);
				
				//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId_afrLovInternalTableId::db"]/table/tbody/tr/td[2]/div/table/tbody/tr/td[1]
				
				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId_afrLovInternalTableId::db")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId_afrLovInternalTableId::db"))
						.click();
				
				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::lovDialogId::ok")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::lovDialogId::ok"))
						.click();
				
				
				
				//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::lovDialogId::ok"]
				
				//_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId_afrLovInternalTableId::db
				
				
				//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId_afrLovInternalTableId::db"]/table/tbody/tr/td[1]
				
				
				//_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::_afrLovInternalQueryId:value20::content
				
			
		//s		TimeUnit.SECONDS.sleep(1000);

				// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt5:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::content"]

				// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPsv2"]/table/tbody/tr/td[1]/a/span
				WebElement element=driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPsv2"));
				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPsv2")));
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",element);

				
				//*[@id="    _FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPsv2"]/table/tbody/tr/td[1]/a/span
			//	element.click();

				// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPsb2"]/a/span

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPsb2")));

//				driver.findElement(
//						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPsb2"))
//						.click();

				TimeUnit.SECONDS.sleep(2);
				
				WebElement task1 = driver
						.findElement(By
								.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPsb2"));
				 boolean result = false;
				    int attempts = 0;
				    while(attempts < 2) {
				        try {
				            task1.click();
				            result = true;
				            break;
				        } catch(StaleElementReferenceException e) {
				        }
				        attempts++;
				    }
				
				

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:launchPopUp::yes")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:launchPopUp::yes"))
						.click();
				
				TimeUnit.SECONDS.sleep(3);
				
				
				//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:noSupplierContactPopUp::no"]
				
				//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt4:0:pt1:AP1:noSupplierContactPopUp::contentContainer"]
				
				if(!driver.findElements(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:noSupplierContactPopUp::contentContainer")).isEmpty()){
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:noSupplierContactPopUp::no")));
					//           _FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:noSupplierContactPopUp::no
					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:noSupplierContactPopUp::no"))
							.click();
					
//					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
//							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPc")));
//				
					WebElement element3=driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPc"));
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPc")));
					JavascriptExecutor js1_1 = (JavascriptExecutor) driver;
					js1_1.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",element3);

					
					//*[@id="_FOpt1:_FOr1:0:_FOSsdiitemNode_procurement_suppliers::disAcr"]
					//*[@id="_FOpt1:_FOr1:0:_FOSsdiitemNode_procurement_suppliers::tia"]
					
				
					//*[@id="_FOpt1:_UISmmLink::icon"]
					
					//*[@id="_FOpt1:_FOr1:0:_FOSsdiitemNode_procurement_suppliers::disAcr"]
					
					driver.get("https://eoed-dev1.fa.us2.oraclecloud.com/");
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("pt1:_UISmmLink::icon")));
					//*[@id="pt1:_UISmmLink::icon"]
					
				    driver.findElement(By.id("pt1:_UISmmLink::icon")).click();
				  //*[@id="pt1:nv_itemNode_procurement_suppliers"]
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("pt1:nv_itemNode_procurement_suppliers")));
				    driver.findElement(By.id("pt1:nv_itemNode_procurement_suppliers")).click();

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:_FOTsdiPrcPozSuppliersDashboard_QuickSearch::icon")));
					//           _FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:_FOTsdiPrcPozSuppliersDashboard_QuickSearch::icon" src="/fscmUI/images/func_search_32_ena.png" title="Search: Suppliers" alt="Search: Suppliers" class="x1mp">

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:_FOTsdiPrcPozSuppliersDashboard_QuickSearch::icon"))
							.click();
					
					TimeUnit.SECONDS.sleep(2);
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:_FOTRaTj_id_1:1:s3:itl31::content"]
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:_FOTRaTj_id_1:1:s3:itl31::content"]
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:_FOTRaTj_id_1:1:s3:itl31::content")));

					TimeUnit.SECONDS.sleep(2);
					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:_FOTRaTj_id_1:1:s3:itl31::content"))
							.sendKeys(list_supplier.get(i));
					
					TimeUnit.SECONDS.sleep(2);
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:_FOTRaTj_id_1:1:cil1::icon")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:_FOTRaTj_id_1:1:cil1::icon"))
							.click();
		//			CORE LABORATORIES INTERNATIONAL				
					//contacts
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:contactsTab::disAcr")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:contactsTab::disAcr"))
							.click();
					////*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt3:0:ap1:contactsTab::disAcr"]
					
					String c_name[]=list_supp_contact_name.get(i).split(",");
					
					//edit
					
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:cb300")));
					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:cb300"))
							.click();
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:cb300"]/a/span
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt3:1:ap1:cb300"]/a/span
					
					
					
					//add
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt3:1:ap1:r8:0:AT2:_ATp:create::icon"]
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:r8:0:AT2:_ATp:create::icon")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:r8:0:AT2:_ATp:create::icon"))
							.click();
					
					
					//first name
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:it9::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:it9::content"))
							.sendKeys(c_name[1]);
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt3:2:AP5:it9::content"]
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:cb300"]/a/span
					//last name
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:it8::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:it8::content"))
							.sendKeys(c_name[0]);
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt3:2:AP5:it8::content"]
					
					//email
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:it7::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:it7::content"))
							.sendKeys(list_supp_contact.get(i));
					//Check
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:r1:0:sbc1::Label0")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:r1:0:sbc1::Label0"))
							.click();
					
					//add address
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:AT3:_ATp:ctb1::icon")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:AT3:_ATp:ctb1::icon"))
							.click();
					
					//insert
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:AT3:inputText1::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:AT3:inputText1::content"))
							.sendKeys(list_site.get(i));
					
					
					//<input id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt3:1:AP5:AT3:inputText1::content" name="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt3:1:AP5:AT3:inputText1" style="width:auto" class="x25" size="30" type="text">
					
					//search
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt3:1:AP5:AT3:searchPotentialAddresses"]
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:AT3:searchPotentialAddresses")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:AT3:searchPotentialAddresses"))
							.click();
					
					TimeUnit.SECONDS.sleep(3);
					
					//select
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:AT3:AT1:_ATp:t1::db")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:AT3:AT1:_ATp:t1::db"))
							.click();
					
					//ok
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt3:1:AP5:AT3:ApplyAndDoneButton"]
					
					
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:AT3:ApplyAndDoneButton")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:AT3:ApplyAndDoneButton"))
							.click();
					
					TimeUnit.SECONDS.sleep(1);
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt3:1:AP5:AT3:AT1:_ATp:t1::db"]/table/tbody/tr/td[2]/div/table/tbody/tr/td[1]
					
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt3:1:AP5:AT3:_ATp:ctb1::icon"]
					
					
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt3:2:AP5:it7::content"]
					
					//check
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:r1:0:sbc1::Label0"]
					
				
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt3:2:AP5:r1:0:sbc1::Label0"]
					
					//save
					
					WebElement element_15=driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:APscl2"));
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:APscl2")));
					JavascriptExecutor js1_15 = (JavascriptExecutor) driver;
					js1_15.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",element_15);

					
//					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
//							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:APscl2")));
//
//					driver.findElement(
//							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:APscl2"))
//							.click();
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:APscl2"]/a
					
					//Ok
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:dialog1::ok")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:dialog1::ok"))
							.click();
					
					//<button accesskey="K" type="button" id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:dialog1::ok" class="x119 p_AFTextOnly" onclick="this.focus();return false;" _afrpdo="ok">O<span class="x11o">K</span></button>
					
					//System.out.println(c_name[0]);
					
					//Submit
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:cb4")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:cb4"))
							.click();
					
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:cb4"]/a
					
					//Ok
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOd1::msgDlg::cancel")));

					driver.findElement(
							By.id("_FOd1::msgDlg::cancel"))
							.click();
					
					
					driver.get("https://eoed-dev1.fa.us2.oraclecloud.com/fscmUI/faces/FndOverview?fnd=%3B%3B%3B%3Bfalse%3B256%3B%3B%3B&fndGlobalItemNodeId=itemNode_procurement_supplier_qualification&_afrLoop=5032680099114443&_afrWindowMode=0&_afrWindowId=mk8k4hwjd&_adf.ctrl-state=b91lq7ofv_1&_afrFS=16&_afrMT=screen&_afrMFW=1366&_afrMFH=608&_afrMFDW=1366&_afrMFDH=768&_afrMFC=8&_afrMFCI=0&_afrMFM=0&_afrMFR=96&_afrMFG=0&_afrMFS=0&_afrMFO=0");

					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTsditasksId::icon")));
				
			// driver	.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTsditasksId::icon")).click();;

					WebElement task_11 = driver
							.findElement(By
									.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTsditasksId::icon"));
					WebElement menu_11;
					boolean menuVisible_11 = false;
					while (!menuVisible_11) {
						task_11.click();
						wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
								.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:RAtl1")));
					
						
						menu_11 = driver
								.findElement(By
										.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:RAtl1"));
						if (menu_11.isDisplayed()) {
							menuVisible_11 = true;
						}
					}
					
				//	_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:RAtl1
				

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:RAtl1")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:RAtl1"))
							.click();

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:soc2::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:soc2::content"))
							.click();
					{
						WebElement dropdown = driver
								.findElement(By
										.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:soc2::content"));
						dropdown.findElement(
								By.xpath("//option[. = '" + list_sbu.get(i) + "']"))
								.click();
					}

				

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:it1::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:it1::content"))
							.sendKeys(list_title.get(i));

					// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:it1::content"]

					// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:cb1"]

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:cb1")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:cb1"))
							.click();

					// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt3:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon"]
					// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon"]


					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon")));

//					driver.findElement(
//							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon"))
//							.click();
					
					
					
					WebElement task_13 = driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon"));
					 boolean result_13 = false;
					    int attempts_13 = 0;
					    while(attempts_13 < 2) {
					        try {
					            task_13.click();
					            result_13 = true;
					            break;
					        } catch(StaleElementReferenceException e) {
					        }
					        attempts_13++;
					    }
					
					
					// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:qualAreaNameId::content"]


					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:qualAreaNameId::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:qualAreaNameId::content"))
							.sendKeys(list_q_area.get(i));

					// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:qualAreaNameId::content"]

					// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:ownerNameId::content"]

				

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:ownerNameId::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:ownerNameId::content"))
							.sendKeys(eval_team1.get(i));

					// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:id1::content"]
					//TimeUnit.SECONDS.sleep(1);

					

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:id1::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:id1::content"))
							.sendKeys(strDate);

					if (!list_q_area2.get(i).equals("null")) {

						wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
								.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon")));

						WebElement task_14 = driver.findElement(
								By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon"));
						 boolean result_14 = false;
						    int attempts_14 = 0;
						    while(attempts_14 < 2) {
						        try {
						            task_14.click();
						            result_14 = true;
						            break;
						        } catch(StaleElementReferenceException e) {
						        }
						        attempts_14++;
						    }
						

						wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
								.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:qualAreaNameId::content")));

						driver.findElement(
								By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:qualAreaNameId::content"))
								.sendKeys(list_q_area2.get(i));
						TimeUnit.SECONDS.sleep(1);

						wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
								.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:ownerNameId::content")));

						driver.findElement(
								By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:ownerNameId::content"))
								.sendKeys(eval_team2.get(i));

						// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:ownerNameId::content"]

						wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
								.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:id1::content")));

						driver.findElement(
								By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:id1::content"))
								.sendKeys(strDate);

					}

					// Supplier section
					
					

					// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:create::icon"]

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:create::icon")));

					WebElement task_15 = driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:create::icon"));
					 boolean result_15 = false;
					    int attempts_15 = 0;
					    while(attempts_15 < 2) {
					        try {
					            task_15.click();
					            result_15 = true;
					            break;
					        } catch(StaleElementReferenceException e) {
					        }
					        attempts_15++;
					    }
					

					// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierNameId::content"]

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierNameId::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierNameId::content"))
							.click();

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierNameId::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierNameId::content"))
							.sendKeys(list_supplier.get(i));

					// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierSiteId::content"]

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierSiteId::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierSiteId::content"))
							.click();

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierSiteId::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierSiteId::content"))
							.sendKeys(list_site.get(i));
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::lovIconId"]

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::lovIconId")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::lovIconId"))
							.click();
					TimeUnit.SECONDS.sleep(1);

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::dropdownPopup::popupsearch")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::dropdownPopup::popupsearch"))
							.click();

					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::_afrLovInternalQueryId:value20::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::_afrLovInternalQueryId:value20::content"))
							.sendKeys(list_supp_contact.get(i));
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::_afrLovInternalQueryId::search")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::_afrLovInternalQueryId::search"))
							.click();
					
					TimeUnit.SECONDS.sleep(3);
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId_afrLovInternalTableId::db"]/table/tbody/tr/td[2]/div/table/tbody/tr/td[1]
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId_afrLovInternalTableId::db")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId_afrLovInternalTableId::db"))
							.click();
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::lovDialogId::ok")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::lovDialogId::ok"))
							.click();
					
					
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::lovDialogId::ok"]
					
					//_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId_afrLovInternalTableId::db
					
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId_afrLovInternalTableId::db"]/table/tbody/tr/td[1]
					
					
					//_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::_afrLovInternalQueryId:value20::content
					
				
			//s		TimeUnit.SECONDS.sleep(1000);

					// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt5:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::content"]

					// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPsv2"]/table/tbody/tr/td[1]/a/span
					WebElement element_2=driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPsv2"));
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPsv2")));
					JavascriptExecutor js1_2 = (JavascriptExecutor) driver;
					js1_2.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",element_2);

					
					//*[@id="    _FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPsv2"]/table/tbody/tr/td[1]/a/span
				//	element.click();

					// *[@id="pt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPsb2"]/a/span

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPsb2")));

//					driver.findElement(
//							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPsb2"))
//							.click();

					TimeUnit.SECONDS.sleep(2);
					
					WebElement task_17 = driver
							.findElement(By
									.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPsb2"));
					 boolean result_17 = false;
					    int attempts_17 = 0;
					    while(attempts_17 < 2) {
					        try {
					            task_17.click();
					            result_17 = true;
					            break;
					        } catch(StaleElementReferenceException e) {
					        }
					        attempts_17++;
					    }
					
					

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:launchPopUp::yes")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:launchPopUp::yes"))
							.click();
					
					TimeUnit.SECONDS.sleep(3);
			//		<button type="button" id="_FOd1::msgDlg::cancel" class="x119 p_AFTextOnly" onclick="this.focus();return false;" _afrpdo="cancel">OK</button>
					
					
				
					
					
				}
				
				//*[@id="_FOd1::msgDlg::_cnt"]/div/table/tbody/tr/td/table/tbody/tr/td[2]/div
				
				if(i==0){

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOd1::msgDlg::_cnt")));

				String initiative_text = driver.findElement(
						By.id("_FOd1::msgDlg::_cnt")).getText();

				String initiative_array[] = initiative_text.split(" ");

				System.out.println("Initiative Text :" + initiative_array[1]);

				initiative_number = initiative_array[1];
				
				}

				// //*[@id="d1::msgDlg::cancel"]

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOd1::msgDlg::cancel")));
				//
				driver.findElement(By.id("_FOd1::msgDlg::cancel")).click();
				//
				//driver.navigate().refresh();
				driver.get("https://eoed-dev1.fa.us2.oraclecloud.com/fscmUI/faces/FndOverview?fnd=%3B%3B%3B%3Bfalse%3B256%3B%3B%3B&fndGlobalItemNodeId=itemNode_procurement_supplier_qualification&_afrLoop=5032680099114443&_afrWindowMode=0&_afrWindowId=mk8k4hwjd&_adf.ctrl-state=b91lq7ofv_1&_afrFS=16&_afrMT=screen&_afrMFW=1366&_afrMFH=608&_afrMFDW=1366&_afrMFDH=768&_afrMFC=8&_afrMFCI=0&_afrMFM=0&_afrMFR=96&_afrMFG=0&_afrMFS=0&_afrMFO=0");

			

/*			else {
				int j = 2 + i;

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTsditasksId::icon")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTsditasksId::icon"))
						.click();

				// *[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:RAtl1"]

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:RAtl1")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:RAtl1"))
						.click();

				// *[@id="                                                       _FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:soc2::content"]

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:soc2::content")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:soc2::content"))
						.click();
				{
					WebElement dropdown = driver
							.findElement(By
									.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:soc2::content"));
					dropdown.findElement(
							By.xpath("//option[. = '" + list_sbu.get(i) + "']"))
							.click();
				}

			

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:it1::content")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:it1::content"))
						.sendKeys(list_title.get(i));

				// *[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:it1::content"]

				// *[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:cb1"]

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:cb1")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:_FOTRaT:0:dynam1:0:cb1"))
						.click();

				// *[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt3:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon"]
				// *[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon"]

				
				//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt3:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon"]
				//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt3:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon"]
	//			         _FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt3:0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon
				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+ j+ ":0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
								+ j
								+ ":0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon"))
						.click();
				
				
				WebElement task4 = driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
								+ j
								+ ":0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon"));
				 boolean result4 = false;
				    int attempts4 = 0;
				    while(attempts4 < 2) {
				        try {
				            task4.click();
				            result4 = true;
				            break;
				        } catch(StaleElementReferenceException e) {
				        }
				        attempts4++;
				    }
				

				

				// *[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:qualAreaNameId::content"]




				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
								+ j
								+ ":0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:qualAreaNameId::content")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
								+ j
								+ ":0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:qualAreaNameId::content"))
						.sendKeys(list_q_area.get(i));

				// *[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:ownerNameId::content"]

	

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
								+ j
								+ ":0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:ownerNameId::content")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
								+ j
								+ ":0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:ownerNameId::content"))
						.sendKeys(eval_team1.get(i));

				// *[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:id1::content"]

			

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
								+ j
								+ ":0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:id1::content")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
								+ j
								+ ":0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:0:id1::content"))
						.sendKeys(strDate);
				// Supplier section

				if (!list_q_area2.get(i).equals("null")) {

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
									+ j
									+ ":0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon")));


					WebElement task5 = driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
									+ j
									+ ":0:pt1:AP1:r1:0:r1:0:AT1:_ATp:create::icon"));
					 boolean result5 = false;
					    int attempts5 = 0;
					    while(attempts5 < 2) {
					        try {
					        	task5.click();
					            result5 = true;
					            break;
					        } catch(StaleElementReferenceException e) {
					        }
					        attempts5++;
					    }
					

					

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
									+ j
									+ ":0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:qualAreaNameId::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
									+ j
									+ ":0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:qualAreaNameId::content"))
							.sendKeys(list_q_area2.get(i));


					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
									+ j
									+ ":0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:ownerNameId::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
									+ j
									+ ":0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:ownerNameId::content"))
							.sendKeys(eval_team2.get(i));

					// *[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:ownerNameId::content"]
					TimeUnit.SECONDS.sleep(1);

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
									+ j
									+ ":0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:id1::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
									+ j
									+ ":0:pt1:AP1:r1:0:r1:0:AT1:_ATp:ATt1:1:id1::content"))
							.sendKeys(strDate);

				}

				


				// *[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":pt1:AP1:r1:0:r1:0:AT2:_ATp:create::icon"]

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
								+ j
								+ ":0:pt1:AP1:r1:0:r1:0:AT2:_ATp:create::icon")));


				WebElement task6 = driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
								+ j
								+ ":0:pt1:AP1:r1:0:r1:0:AT2:_ATp:create::icon"));
				WebElement menu6;
				boolean menuVisible6 = false;
				while (!menuVisible6) {
					task6.click();
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
								+ j
								+ ":0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierNameId::content")));
				
					
					menu6 = driver
							.findElement(By
									.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
								+ j
								+ ":0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierNameId::content"));
					if (menu6.isDisplayed()) {
						menuVisible6 = true;
					}
				}


				// *[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierNameId::content"]

				

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
								+ j
								+ ":0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierNameId::content")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
								+ j
								+ ":0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierNameId::content"))
						.sendKeys(list_supplier.get(i));

				// *[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierSiteId::content"]


		

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
								+ j
								+ ":0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierSiteId::content")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
								+ j
								+ ":0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierSiteId::content"))
						.sendKeys(list_site.get(i));



				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::lovIconId")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::lovIconId"))
						.click();
				
				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::dropdownPopup::popupsearch")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::dropdownPopup::popupsearch"))
						.click();
				


				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::_afrLovInternalQueryId:value20::content")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::_afrLovInternalQueryId:value20::content"))
						.sendKeys(list_supp_contact.get(i));
				
				//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt3:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::_afrLovInternalQueryId::search"]
				
				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::_afrLovInternalQueryId::search")));

					driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::_afrLovInternalQueryId::search"))
						.click();
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt3:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::_afrLovInternalQueryId:value20::content"]
				TimeUnit.SECONDS.sleep(2);
				
				//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId_afrLovInternalTableId::db"]/table/tbody/tr/td[2]/div/table/tbody/tr/td[1]
				
				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId_afrLovInternalTableId::db")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId_afrLovInternalTableId::db"))
						.click();
				
				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::lovDialogId::ok")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":0:pt1:AP1:r1:0:r1:0:AT2:_ATp:ATt2:0:supplierContactNameId::lovDialogId::ok"))
						.click();
				
				
				
				WebElement element=driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":0:pt1:AP1:SPsv2"));
				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":0:pt1:AP1:SPsv2")));
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",element);
				
	TimeUnit.SECONDS.sleep(2);
	
	wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
			.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":0:pt1:AP1:SPsb2")));

				
				WebElement task1 = driver
						.findElement(By
								.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+ j + ":0:pt1:AP1:SPsb2"));
				 boolean result = false;
				    int attempts = 0;
				    while(attempts < 2) {
				        try {
				            task1.click();
				            result = true;
				            break;
				        } catch(StaleElementReferenceException e) {
				        }
				        attempts++;
				    }
				

				// <button accesskey="Y" type="button"
				// id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"+j+":pt1:AP1:launchPopUp::yes"
				// class="x119 p_AFTextOnly"
				// onclick="this.focus();return false;" _afrpdo="yes"><span
				// class="x11o">Y</span>es</button>

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
								+ j + ":0:pt1:AP1:launchPopUp::yes")));

				driver.findElement(
						By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt"
								+ j + ":0:pt1:AP1:launchPopUp::yes")).click();
				
				
				TimeUnit.SECONDS.sleep(3);
				
			if(!driver.findElements(By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:noSupplierContactPopUp::contentContainer")).isEmpty()){
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:noSupplierContactPopUp::no")));
					//           _FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:noSupplierContactPopUp::no
					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:noSupplierContactPopUp::no"))
							.click();
					
//					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
//							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPc")));
//				
					WebElement element3=driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPc"));
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_supplier_qualification:0:MAt2:0:pt1:AP1:SPc")));
					JavascriptExecutor js1_1 = (JavascriptExecutor) driver;
					js1_1.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",element3);

					
					//*[@id="_FOpt1:_FOr1:0:_FOSsdiitemNode_procurement_suppliers::disAcr"]
					//*[@id="_FOpt1:_FOr1:0:_FOSsdiitemNode_procurement_suppliers::tia"]
					
				
					//*[@id="_FOpt1:_UISmmLink::icon"]
					
					//*[@id="_FOpt1:_FOr1:0:_FOSsdiitemNode_procurement_suppliers::disAcr"]
					
					driver.get("https://eoed-dev1.fa.us2.oraclecloud.com/");
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("pt1:_UISmmLink::icon")));
					//*[@id="pt1:_UISmmLink::icon"]
					
				    driver.findElement(By.id("pt1:_UISmmLink::icon")).click();
				  //*[@id="pt1:nv_itemNode_procurement_suppliers"]
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("pt1:nv_itemNode_procurement_suppliers")));
				    driver.findElement(By.id("pt1:nv_itemNode_procurement_suppliers")).click();

					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:_FOTsdiPrcPozSuppliersDashboard_QuickSearch::icon")));
					//           _FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:_FOTsdiPrcPozSuppliersDashboard_QuickSearch::icon" src="/fscmUI/images/func_search_32_ena.png" title="Search: Suppliers" alt="Search: Suppliers" class="x1mp">

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:_FOTsdiPrcPozSuppliersDashboard_QuickSearch::icon"))
							.click();
					
					TimeUnit.SECONDS.sleep(2);
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:_FOTRaTj_id_1:1:s3:itl31::content"]
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:_FOTRaTj_id_1:1:s3:itl31::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:_FOTRaTj_id_1:1:s3:itl31::content"))
							.sendKeys(list_supplier.get(i));
					
					TimeUnit.SECONDS.sleep(2);
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:_FOTRaTj_id_1:1:cil1::icon")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:_FOTRaTj_id_1:1:cil1::icon"))
							.click();
		//			CORE LABORATORIES INTERNATIONAL				
					//contacts
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:contactsTab::disAcr")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:contactsTab::disAcr"))
							.click();
					////*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt3:0:ap1:contactsTab::disAcr"]
					
					String c_name[]=list_supp_contact_name.get(i).split(",");
					
					//edit
					
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:cb300")));
					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:cb300"))
							.click();
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:cb300"]/a/span
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt3:1:ap1:cb300"]/a/span
					
					
					
					//add
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt3:1:ap1:r8:0:AT2:_ATp:create::icon"]
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:r8:0:AT2:_ATp:create::icon")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:r8:0:AT2:_ATp:create::icon"))
							.click();
					
					
					//first name
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:it9::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:it9::content"))
							.sendKeys(c_name[1]);
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt3:2:AP5:it9::content"]
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:cb300"]/a/span
					//last name
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:it8::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:it8::content"))
							.sendKeys(c_name[0]);
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt3:2:AP5:it8::content"]
					
					//email
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:it7::content")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:it7::content"))
							.sendKeys(list_supp_contact.get(i));
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt3:2:AP5:it7::content"]
					
					//check
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:r1:0:sbc1::Label0"]
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:r1:0:sbc1::Label0")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:r1:0:sbc1::Label0"))
							.click();
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt3:2:AP5:r1:0:sbc1::Label0"]
					
					//save
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:APscl2")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:APscl2"))
							.click();
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP5:APscl2"]/a
					
					//Ok
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:dialog1::ok")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:dialog1::ok"))
							.click();
					
					//<button accesskey="K" type="button" id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:dialog1::ok" class="x119 p_AFTextOnly" onclick="this.focus();return false;" _afrpdo="ok">O<span class="x11o">K</span></button>
					
					//System.out.println(c_name[0]);
					
					//Submit
					
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:cb4")));

					driver.findElement(
							By.id("_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:cb4"))
							.click();
					
					
					//*[@id="_FOpt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:cb4"]/a
					
					//Ok
					wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
							.id("_FOd1::msgDlg::cancel")));

					driver.findElement(
							By.id("_FOd1::msgDlg::cancel"))
							.click();
					
					
			//		<button type="button" id="_FOd1::msgDlg::cancel" class="x119 p_AFTextOnly" onclick="this.focus();return false;" _afrpdo="cancel">OK</button>
					
					
				
					
					
				}
				

				// //*[@id="_FOd1::msgDlg::cancel"]

				wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
						.id("_FOd1::msgDlg::cancel")));

				driver.findElement(By.id("_FOd1::msgDlg::cancel")).click();

				driver.navigate().refresh();
			}*/
		}

		// *[@id="pt1:_UIShome::icon"]/g[5]/path

		driver.get("https://eoed-dev1.fa.us2.oraclecloud.com/crmUI/faces/FuseOverview?fnd=%3B%3B%3B%3Bfalse%3B256%3B%3B%3B&fndGlobalItemNodeId=CRM_CUSTOM_CARD_INITIATIVECREATIONDETAILS_C&_adf.no-new-window-redirect=true&_adf.ctrl-state=hgbguy7cq_5&_afrLoop=372838136468908&_afrWindowMode=2&_afrWindowId=null&_afrFS=16&_afrMT=screen&_afrMFW=1366&_afrMFH=625&_afrMFDW=1366&_afrMFDH=768&_afrMFC=8&_afrMFCI=0&_afrMFM=0&_afrMFR=96&_afrMFG=0&_afrMFS=0&_afrMFO=0");

		System.out.println("Initiative No" + initiative_number);

		// *[@id="d1::msgDlg::_cnt"]/div/table/tbody/tr/td/table/tbody/tr/td[2]/div

		// driver.get("https://eoed-dev1.fa.us2.oraclecloud.com/crmUI/faces/FuseOverview?fnd=%3B%3B%3B%3Bfalse%3B256%3B%3B%3B&fndGlobalItemNodeId=CRM_CUSTOM_CARD_INITIATIVECREATIONDETAILS_C&_adf.no-new-window-redirect=true&_adf.ctrl-state=hgbguy7cq_5&_afrLoop=372838136468908&_afrWindowMode=2&_afrWindowId=null&_afrFS=16&_afrMT=screen&_afrMFW=1366&_afrMFH=625&_afrMFDW=1366&_afrMFDH=768&_afrMFC=8&_afrMFCI=0&_afrMFM=0&_afrMFR=96&_afrMFG=0&_afrMFS=0&_afrMFO=0");

		for (int k = 0; k <= 2; k++) {

			// String t =list_initiative_number.get(k).substring(0, 2);

			int init_no = Integer.parseInt(initiative_number) + k;
			String ini_no = "" + init_no;
			// *[@id="_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_crmlm_searchId11:searchf:srchit::content"]
			// [@id="_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_crmlm_searchId11:searchf:srchit::content"]
			// *[@id="                                                   _FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_crmlm_searchId11:searchf:srchit::content"]
			wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
					.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_crmlm_searchId11:searchf:srchit::content")));

			driver.findElement(
					By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_crmlm_searchId11:searchf:srchit::content"))
					.clear();
			TimeUnit.SECONDS.sleep(1);

			wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
					.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_crmlm_searchId11:searchf:srchit::content")));

			driver.findElement(
					By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_crmlm_searchId11:searchf:srchit::content"))
					.sendKeys(list_ic_details.get(k));

			// *[@id="_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_crmlm_searchId11:searchf:searchb"]/img

			TimeUnit.SECONDS.sleep(2);

			wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
					.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_crmlm_searchId11:searchf:searchb")));
			driver.findElement(
					By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_crmlm_searchId11:searchf:searchb"))
					.click();

			// WebElement element = new WebDriverWait(driver,
			// 10).until(ExpectedConditions.elementToBeClickable(By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_crmlm_searchId11:searchf:searchb")));
			// ((JavascriptExecutor)driver).executeScript("arguments[0].click();",
			// element);
			// //*[@id="_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_crmlm_searchId11:ExtGen_pcl1:ExtGen_TableId11:0:ExtGen_colattr_RecordName_InitiativeCreationDetails_c1"]
			TimeUnit.SECONDS.sleep(3);

			
			//*[@id="_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_crmlm_searchId11:ExtGen_pcl1:ExtGen_TableId11:0:ExtGen_colattr_RecordName_InitiativeCreationDetails_c1"]
			wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
					.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_crmlm_searchId11:ExtGen_pcl1:ExtGen_TableId11:0:ExtGen_colattr_RecordName_InitiativeCreationDetails_c1")));

			driver.findElement(
					By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_crmlm_searchId11:ExtGen_pcl1:ExtGen_TableId11:0:ExtGen_colattr_RecordName_InitiativeCreationDetails_c1"))
					.click();

			// *[@id="_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_InitiativeNeeded_c_InitiativeCreationDetails_c1::content"]

			wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
					.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_InitiativeNeeded_c_InitiativeCreationDetails_c1::content")));

			driver.findElement(
					By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_InitiativeNeeded_c_InitiativeCreationDetails_c1::content"))
					.click();

			wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
					.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_InitiativeNeeded_c_InitiativeCreationDetails_c1::content")));

			driver.findElement(
					By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_InitiativeNeeded_c_InitiativeCreationDetails_c1::content"))
					.clear();

			wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
					.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_InitiativeNeeded_c_InitiativeCreationDetails_c1::content")));

			driver.findElement(
					By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_InitiativeNeeded_c_InitiativeCreationDetails_c1::content"))
					.sendKeys("No");

			// *[@id="_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_InitiativeNo_c_InitiativeCreationDetails_c1::content"]

			wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
					.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_InitiativeNo_c_InitiativeCreationDetails_c1::content")));

			driver.findElement(
					By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_InitiativeNo_c_InitiativeCreationDetails_c1::content"))
					.click();

			wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
					.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_InitiativeNo_c_InitiativeCreationDetails_c1::content")));

			driver.findElement(
					By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_InitiativeNo_c_InitiativeCreationDetails_c1::content"))
					.clear();

			wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
					.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_InitiativeNo_c_InitiativeCreationDetails_c1::content")));

			driver.findElement(
					By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_InitiativeNo_c_InitiativeCreationDetails_c1::content"))
					.sendKeys(ini_no);

			// *[@id="_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_DateSentInitiative_c_InitiativeCreationDetails_c1::content"]

			wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
					.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_DateSentInitiative_c_InitiativeCreationDetails_c1::content")));

			driver.findElement(
					By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_DateSentInitiative_c_InitiativeCreationDetails_c1::content"))
					.click();

			wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
					.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_DateSentInitiative_c_InitiativeCreationDetails_c1::content")));

			driver.findElement(
					By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_DateSentInitiative_c_InitiativeCreationDetails_c1::content"))
					.clear();

			wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
					.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_DateSentInitiative_c_InitiativeCreationDetails_c1::content")));

			driver.findElement(
					By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_DateSentInitiative_c_InitiativeCreationDetails_c1::content"))
					.sendKeys(strDate);

			wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
					.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_RecordProcessStatus_c_InitiativeCreationDetails_c1::content")));

			driver.findElement(
					By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_RecordProcessStatus_c_InitiativeCreationDetails_c1::content"))
					.clear();

			wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
					.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_RecordProcessStatus_c_InitiativeCreationDetails_c1::content")));

			driver.findElement(
					By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_RecordProcessStatus_c_InitiativeCreationDetails_c1::content"))
					.sendKeys("Completed");

			wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
					.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_RecordProcessMessage_c_InitiativeCreationDetails_c1::content")));

			driver.findElement(
					By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_RecordProcessMessage_c_InitiativeCreationDetails_c1::content"))
					.clear();

			wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
					.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_RecordProcessMessage_c_InitiativeCreationDetails_c1::content")));

			driver.findElement(
					By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_RecordProcessMessage_c_InitiativeCreationDetails_c1::content"))
					.sendKeys("Initiative Creation Success");

			// *[@id="_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_RecordProcessMessage_c_InitiativeCreationDetails_c1::content"]

			// *[@id="_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:ExtGen_region11:0:ExtGen_attr_RecordProcessStatus_c_InitiativeCreationDetails_c1::content"]

			// *[@id="_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:object-subtitle:ExtGen_CommitBtn11:crmButton1"]

			// *[@id="_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:object-subtitle:ExtGen_CommitCloseBtn11:crmButton1"]

			wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(By
					.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:object-subtitle:ExtGen_CommitCloseBtn11:crmButton1")));

			driver.findElement(
					By.id("_FOpt1:_FOr1:0:_FONSr2:0:_FOTsr1:0:ExtGen_pt11:ExtGen_ed1:0:ExtGen_pt11:object-subtitle:ExtGen_CommitCloseBtn11:crmButton1"))
					.click();

		}

		// atuTestRecorder.stop();

		/*
		 * setStatus("Completed");
		 * 
		 * setEndTime(Calendar.getInstance().getTime().toString());
		 * 
		 * final String username = "jeezsuyash@gmail.com"; final String password
		 * = "shreyansh111";
		 * 
		 * Properties props = new Properties(); props.put("mail.smtp.auth",
		 * true); props.put("mail.smtp.starttls.enable", true);
		 * props.put("mail.smtp.host", "smtp.gmail.com");
		 * props.put("mail.smtp.port", "587");
		 * 
		 * Session session = Session.getInstance(props, new
		 * javax.mail.Authenticator() { protected PasswordAuthentication
		 * getPasswordAuthentication() { return new
		 * PasswordAuthentication(username, password); } });
		 * 
		 * try {
		 * 
		 * String[] recipients = new String[2]; recipients[0] =
		 * "suyash.gupta@birlasoft.com" ; // recipients[1] =
		 * "Sanjay.Nagar@birlasoft.com";
		 * 
		 * Message message = new MimeMessage(session); message.setFrom(new
		 * InternetAddress("jeezsuyash@gmail.com"));
		 * message.addRecipient(Message.RecipientType.TO, new
		 * InternetAddress(recipients[0])); //
		 * message.addRecipient(Message.RecipientType.TO, new
		 * InternetAddress(recipients[1]));
		 * 
		 * // message.addRecipient(Message.RecipientType.TO, new
		 * InternetAddress(recipients[1]));
		 * 
		 * 
		 * 
		 * message.setSubject("SaasBot Execution Finished Notification");
		 * BodyPart messageBodyPart1 = new MimeBodyPart();
		 * 
		 * // message.setText(""); String message_body =
		 * "<table style= 'border: 1px solid black; width=100%'><tr><th style= 'border: 1px solid black;' >Usecase</th><th style= 'border: 1px solid black;'>Start Time</th><th style= 'border: 1px solid black;'>End Time</th><th style= 'border: 1px solid black;'>Status</th></tr><tr><td style= 'border: 1px solid black;'>Create Initiatives using SaasBot</td><td style= 'border: 1px solid black;'>"
		 * +
		 * getStartTime()+"</td><td style= 'border: 1px solid black;'>"+getEndTime
		 * ()+"</td><td style= 'border: 1px solid black;'>"+getStatus()+
		 * "</td></tr></table>";
		 * 
		 * 
		 * MimeBodyPart messageBodyPart = new MimeBodyPart();
		 * 
		 * Multipart multipart = new MimeMultipart();
		 * 
		 * messageBodyPart = new MimeBodyPart(); String file =
		 * "C:\\Users\\suyashg\\Desktop\\List1.xlsx"; String fileName =
		 * "create_initiative.xlsx"; DataSource source = new
		 * FileDataSource(file); messageBodyPart.setDataHandler(new
		 * DataHandler(source)); messageBodyPart.setFileName(fileName);
		 * messageBodyPart1.setText(message_body);
		 * messageBodyPart1.setContent(message_body,
		 * "text/html; charset=utf-8");
		 * 
		 * // message.setContent(message_body, "text/html");
		 * 
		 * 
		 * multipart.addBodyPart(messageBodyPart1);
		 * 
		 * multipart.addBodyPart(messageBodyPart);
		 * 
		 * 
		 * message.setContent(multipart); //message.setContent(messageBodyPart1,
		 * "text/html");
		 * 
		 * // message.setContent(messageBodyPart, message_body);
		 * 
		 * System.out.println("Sending");
		 * 
		 * Transport.send(message);
		 * 
		 * System.out.println("Done");
		 * 
		 * } catch (MessagingException e) { e.printStackTrace(); }
		 * 
		 * } // }
		 * 
		 * catch (Exception e){
		 * 
		 * setStatus("Failed");
		 * setEndTime(Calendar.getInstance().getTime().toString());
		 * 
		 * 
		 * e.printStackTrace(); takeSnapShot(driver,
		 * "C:\\Users\\suyashg\\Documents\\OCUST+SaasBot\\Test\\WebContent\\Input File\\error.png"
		 * ) ;
		 * 
		 * 
		 * final String username = "jeezsuyash@gmail.com"; final String password
		 * = "shreyansh111";
		 * 
		 * Properties props = new Properties(); props.put("mail.smtp.auth",
		 * true); props.put("mail.smtp.starttls.enable", true);
		 * props.put("mail.smtp.host", "smtp.gmail.com");
		 * props.put("mail.smtp.port", "587");
		 * 
		 * Session session = Session.getInstance(props, new
		 * javax.mail.Authenticator() { protected PasswordAuthentication
		 * getPasswordAuthentication() { return new
		 * PasswordAuthentication(username, password); } });
		 * 
		 * try {
		 * 
		 * String[] recipients = new String[2]; recipients[0] =
		 * "suyash.gupta@birlasoft.com" ; //recipients[1] =
		 * "Sanjay.Nagar@birlasoft.com";
		 * 
		 * Message message = new MimeMessage(session); message.setFrom(new
		 * InternetAddress("jeezsuyash@gmail.com"));
		 * message.addRecipient(Message.RecipientType.TO, new
		 * InternetAddress(recipients[0]));
		 * //message.addRecipient(Message.RecipientType.TO, new
		 * InternetAddress(recipients[1]));
		 * 
		 * // message.addRecipient(Message.RecipientType.TO, new
		 * InternetAddress(recipients[1]));
		 * 
		 * 
		 * 
		 * message.setSubject("SaasBot Execution Finished Notification");
		 * BodyPart messageBodyPart1 = new MimeBodyPart();
		 * 
		 * // message.setText(""); String message_body =
		 * "<table style= 'border: 1px solid black; width=100%'><tr><th style= 'border: 1px solid black;' >Usecase</th><th style= 'border: 1px solid black;'>Start Time</th><th style= 'border: 1px solid black;'>End Time</th><th style= 'border: 1px solid black;'>Status</th></tr><tr><td style= 'border: 1px solid black;'>List1 for Supplier at site level</td><td style= 'border: 1px solid black;'>"
		 * +
		 * getStartTime()+"</td><td style= 'border: 1px solid black;'>"+getEndTime
		 * ()+"</td><td style= 'border: 1px solid black;'>"+getStatus()+
		 * "</td></tr></table>";
		 * 
		 * 
		 * MimeBodyPart messageBodyPart = new MimeBodyPart(); MimeBodyPart
		 * messageBodyPart2 = new MimeBodyPart();
		 * 
		 * 
		 * Multipart multipart = new MimeMultipart();
		 * 
		 * messageBodyPart = new MimeBodyPart(); messageBodyPart2 = new
		 * MimeBodyPart();
		 * 
		 * String file = "C:\\Users\\suyashg\\Desktop\\List1.xlsx"; String
		 * fileName = "create_initiative.xlsx"; String file_2 =
		 * "C:\\Users\\suyashg\\Documents\\OCUST+SaasBot\\Test\\WebContent\\Input File\\error.png"
		 * ; String fileName_2 = "error.png";
		 * 
		 * DataSource source = new FileDataSource(file); DataSource source2 =
		 * new FileDataSource(file_2);
		 * 
		 * messageBodyPart.setDataHandler(new DataHandler(source));
		 * messageBodyPart2.setDataHandler(new DataHandler(source2));
		 * 
		 * messageBodyPart.setFileName(fileName);
		 * messageBodyPart2.setFileName(fileName_2);
		 * 
		 * messageBodyPart1.setText(message_body);
		 * messageBodyPart1.setContent(message_body,
		 * "text/html; charset=utf-8");
		 * 
		 * // message.setContent(message_body, "text/html");
		 * 
		 * 
		 * multipart.addBodyPart(messageBodyPart1);
		 * 
		 * multipart.addBodyPart(messageBodyPart);
		 * multipart.addBodyPart(messageBodyPart2);
		 * 
		 * 
		 * 
		 * message.setContent(multipart); //message.setContent(messageBodyPart1,
		 * "text/html");
		 * 
		 * // message.setContent(messageBodyPart, message_body);
		 * 
		 * System.out.println("Sending");
		 * 
		 * Transport.send(message);
		 * 
		 * System.out.println("Done");
		 * 
		 * } catch (MessagingException e1) { e1.printStackTrace(); } }
		 */
	}

	public String getinitiative(String ini_no) {

		return ini_no;
	}
	
	public static void main(String[] args) throws Exception {
		
		

		CopyOfSQM33 copyOfSQM33 = new CopyOfSQM33();
		copyOfSQM33.addBankdetails();

	}
}
