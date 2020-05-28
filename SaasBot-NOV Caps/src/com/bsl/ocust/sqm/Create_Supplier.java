package com.bsl.ocust.sqm;

import java.io.File;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.jboss.netty.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.*;

import com.sun.jna.platform.FileUtils;

public class Create_Supplier {
	
	public String callMain() throws Exception {
		System.out.println("Hello");

		main(new String[] {}); // //

		return "Hello"; // return "Main Method Executed";
	}
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                org.apache.commons.io.FileUtils.copyFile(SrcFile, DestFile);

    } 
 

	
public void Login() throws Exception{
	
	String start_time,end_time;
	Calendar calendar= Calendar.getInstance();
	start_time=calendar.getTime().toString();
	//System.out.println(calendar.getTime().toString());
	System.out.println(start_time);
	//System.out.println(calendar);
	
	//System.out.println("123");
	
		
	WebDriver driver; //((object of webd.getriver class))
		
        //Sign In
	
		//Downloads
	//C:\Users\owner\Desktop\OCUST
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\suyashg\\Downloads\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("https://ejcb-test.login.em2.oraclecloud.com/");
		 driver.manage().window().maximize();
	      
	         
		//*[@id="userid"]
	         
	         //Sign In
	        WebDriverWait wait = new WebDriverWait(driver,30);
	
	       
	       
	        driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("HCM.ADMIN");
	        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("HCM.ADMIN1");
	        driver.findElement(By.xpath("//*[@id='btnActive']")).click();

	        
	      
	        ReadFromExcel rfe = new ReadFromExcel();
			//rfe.callMain_Read();
			List<String> list_supplier = rfe
					.read_data("Book", "Supplier");
			List<String> list_site = rfe.read_data("Book", "Business Relationship");

			List<String> list_supp_contact = rfe.read_data("List1",
					"Supplier Contact Email");
			List<String> list_title = rfe.read_data("Book", "Tax Organization Type");

			
	        
			   //*[@id="pt1:_UISmmLink::icon"]
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_UISmmLink::icon")));
				 
				//home icon
				driver.findElement(By.id("pt1:_UISmmLink::icon")).click();

				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_UIShome::icon")));
				driver.findElement(By.id("pt1:_UIShome::icon")).click();
			   
			//procurement
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Procurement")));
				driver.findElement(By.linkText("Procurement")).click();
				
				//suppliers
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Suppliers")));
				driver.findElement(By.linkText("Suppliers")).click();
				
				//Regional area
				//*[@id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTsdiPrcPozSuppliersDashboard__FndTasksList::icon"]
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTsdiPrcPozSuppliersDashboard__FndTasksList::icon")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTsdiPrcPozSuppliersDashboard__FndTasksList::icon")).click();

				//create supplier
				//*[@id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTRaT:0:RAtl3"]
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTRaT:0:RAtl3")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTRaT:0:RAtl3")).click();
				
				//supplier
				//*[@id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTRaT:0:dynam1:0:it1::content"]
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTRaT:0:dynam1:0:it1::content")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTRaT:0:dynam1:0:it1::content")).sendKeys("Lee_Supplies_Demo1");
				
				
				//Business relations
				//*[@id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTRaT:0:dynam1:0:soc2::content"]
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTRaT:0:dynam1:0:soc2::content")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTRaT:0:dynam1:0:soc2::content")).click();
				
				Select drp1=new Select(driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTRaT:0:dynam1:0:soc2::content")));
				drp1.selectByIndex(2);
				
				//tax organization type
				//*[@id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTRaT:0:dynam1:0:soc1::content"]
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTRaT:0:dynam1:0:soc1::content")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTRaT:0:dynam1:0:soc1::content")).click();
				
				Select drp2=new Select(driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTRaT:0:dynam1:0:soc1::content")));
				drp2.selectByIndex(1);
				
				//create
				//[@id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTRaT:0:dynam1:0:cb1"]
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTRaT:0:dynam1:0:cb1")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:_FOTRaT:0:dynam1:0:cb1")).click();
				
				//TimeUnit.SECONDS.sleep(10);
				//addresses
				//<a id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:addressesTab::disAcr" class="xo8" href="#" onclick="return false;">Addresses</a>
				//<a id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:addressesTab::disAcr" class="xo8" href="#" onclick="return false;">Addresses</a>
				//*[@id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt4:0:ap1:addressesTab::disAcr"]
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:addressesTab::disAcr")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:addressesTab::disAcr")).click();
				
				//click n +
				//<img id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:r4:0:AT1:_ATp:create::icon" src="/fscmUI/images/applcore/fuseplus/patterns/func_add_16_ena.png" title="Create" alt="Create" class="x1qg">
				//*[@id="pt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt5:0:ap1:r4:0:AT1:_ATp:create::icon"]
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:r4:0:AT1:_ATp:create::icon")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:r4:0:AT1:_ATp:create::icon")).click();
				
				//address name
				//<input id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:it25::content" name="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:it25" style="width:auto" class="x25" size="30" maxlength="240" type="text">
				//*[@id="pt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt5:1:AP1:it25::content"]
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:it25::content")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:it25::content")).sendKeys("lee_Supplier_addr");
				
				/*//country
				//<a tabindex="-1" class="x1u6" id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:soc8::lovIconId" title="Search: Country"></a>
				
				//<a tabindex="-1" class="x1u6" id="" title="Search: Country"></a>//*[@id="pt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt5:1:AP1:soc8::lovIconId"]
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:soc8::lovIconId")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:soc8::lovIconId")).click();
				
				Select drp3=new Select(driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:soc8::lovIconId")));
				drp3.selectByIndex(3);
				*/
				
				//country send
				//<input id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:soc8::content" name="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:soc8" style="width:16em" class="x112" size="30" type="text" value="Afghanistan" role="combobox" aria-describedby="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:soc8::desc" aria-autocomplete="list" aria-owns="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:soc8::_afrautosuggestpopup" aria-expanded="false" autocomplete="off">
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:soc8::content")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:soc8::content")).sendKeys("Afghanistan");
				TimeUnit.SECONDS.sleep(3);
				//address line 1
				//<input id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:i1:0:it3::content" name="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:i1:0:it3" style="width:auto" class="x25" size="30" maxlength="240" type="text" protectionkey="PartySiteEO.Address1">
				//<input id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:i1:0:it3::content" name="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:i1:0:it3" style="width:auto" class="x25" size="30" maxlength="240" type="text" protectionkey="PartySiteEO.Address1">
				//*[@id="pt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt5:1:AP1:i1:0:it3::content"]
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:i1:0:it3::content")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:i1:0:it3::content")).sendKeys("Main Road");
				
				//city
				//<input id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:i1:2:it8::content" name="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:i1:2:it8" style="width:auto" class="x25" size="30" maxlength="60" type="text" protectionkey="PartySiteEO.City">
				//*[@id="pt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt5:1:AP1:i1:2:it8::content"]
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:i1:2:it8::content")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:i1:2:it8::content")).sendKeys("kabul");
				
				//postal code
				//<input id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:i1:3:it10::content" name="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:i1:3:it10" style="width:auto" class="x25" size="30" maxlength="60" type="text" protectionkey="PartySiteEO.PostalCode">
				//*[@id="pt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt5:1:AP1:i1:3:it10::content"]
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:i1:3:it10::content")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:i1:3:it10::content")).sendKeys("1001");
				
				TimeUnit.SECONDS.sleep(3);
				/*//address purpose
				
				//<div><span class="x14c"><input class="x1ds" type="checkbox" name="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:smc11" id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:smc11:_0" value="0" onclick="this.focus()"><label for="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:smc11:_0" class="x2m">Ordering<div class="x1dw"></div></label></span></div>
				//<label for="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:smc11:_0" class="x2m">Ordering<div class="x1dw"></div></label>
				//<label for="pt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt5:1:AP1:smc11:_0" class="x2m">Ordering<div class="x1dw"></div></label>
				//<label for="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:smc11:_0" class="x2m">Ordering<div class="x1dw"></div></label>
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:smc11:_0")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:smc11:_0")).click();
										  	*/
				//save button
				//#pt1\:_FOr1\:0\:_FOSritemNode_procurement_suppliers\:0\:MAt5\:1\:AP1\:APsv2 > a > span
				////*[@id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:APsv2"]/a/span
				//<span class="xx6">Save</span>
				////*[@id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:APsv2"]/a/span
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:APsv2")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:APsv2")).click();
				
				//scroll down
				JavascriptExecutor js = (JavascriptExecutor) driver;
				 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				 
				//cick on +
				//*[@id="pt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt5:0:AP1:r4:0:AT3:_ATp:create::icon"]
				//<img id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:r4:0:AT3:_ATp:create::icon" src="/fscmUI/images/applcore/fuseplus/patterns/func_add_16_ena.png" title="Add" alt="Add" class="x1qg">
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:r4:0:AT3:_ATp:create::icon")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:r4:0:AT3:_ATp:create::icon")).click();
				
				//site
				//<input id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:r4:0:AT3:_ATp:table3:0:inputText1::content" name="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:r4:0:AT3:_ATp:table3:0:inputText1" style="width:auto" class="x25" size="15" maxlength="15" type="text" value="">
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:r4:0:AT3:_ATp:table3:0:inputText1::content")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:r4:0:AT3:_ATp:table3:0:inputText1::content")).sendKeys("OCSUST_Test_11th_May");
				
				//*[@id="pt1:_FOr1:0:_FOSritemNode_procurement_suppliers:0:MAt5:1:ap1:cb4"]/a/span
				//save and close 
				////*[@id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:APscl2"]/a/span
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:APscl2")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:1:AP1:APscl2")).click();
				
				//ok
				//<button accesskey="K" type="button" id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:dialog1::ok" class="x119 p_AFTextOnly" onclick="this.focus();return false;" _afrpdo="ok">O<span class="x11o">K</span></button>
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:dialog1::ok")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:dialog1::ok")).click();
				
				//contacts
				//<div class="x1mn"><a id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:contactsTab::disAcr" class="xo8" href="#" onclick="return false;">Contacts</a></div>
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:contactsTab::disAcr")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:contactsTab::disAcr")).click();
				
				//+
				//<img id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:r8:0:AT2:_ATp:create::icon" src="/fscmUI/images/applcore/fuseplus/patterns/func_add_16_ena.png" title="Create" alt="Create" class="x1qg">
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:r8:0:AT2:_ATp:create::icon")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:r8:0:AT2:_ATp:create::icon")).click();


				//first name
				//<input id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:it9::content" name="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:it9" style="width:auto" class="x25" size="30" maxlength="150" type="text">
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:it9::content")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:it9::content")).sendKeys("FIRSTN");

				//last name
				//<input id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:it8::content" name="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:it8" style="width:auto" class="x25" size="30" maxlength="150" type="text">
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:it8::content")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:it8::content")).sendKeys("LASTN");

				//email
				//<input id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:it7::content" name="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:it7" style="width:auto" class="x25" size="30" maxlength="320" type="text">
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:it7::content")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:it7::content")).sendKeys("firstn@test.com");

				//user account
				//<label for="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:r1:0:sbc1::content" class="x1e0" id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:r1:0:sbc1::Label0">Create user account<div class="x1du"></div></label>

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:r1:0:sbc1::Label0")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:r1:0:sbc1::Label0")).click();

				//save and close
				//*[@id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:APscl2"]/a/span
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:APscl2")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:APscl2")).click();

				//ok
				//<button accesskey="K" type="button" id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:dialog1::ok" class="x119 p_AFTextOnly" onclick="this.focus();return false;" _afrpdo="ok">O<span class="x11o">K</span></button>
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:dialog1::ok")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:dialog1::ok")).click();
				
				/*//firstnlastn click
				//*[@id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:r8:0:AT2:_ATp:table1:0:cl1"]/a/span
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:r8:0:AT2:_ATp:table1:0:cl1")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:r8:0:AT2:_ATp:table1:0:cl1")).click();
				*/
				TimeUnit.SECONDS.sleep(3);
				//contach addresses
				//<img id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:AT3:_ATp:ctb1::icon" src="/fscmUI/images/func_documentadd_16_ena.png" title="Select and Add" alt="Select and Add" class="x1qg">
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:AT3:_ATp:ctb1::icon")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:AT3:_ATp:ctb1::icon")).click();
				
				//select 
				//*[@id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:AT3:AT1:_ATp:t1::db"]/table/tbody/tr/td[2]/div/table/tbody/tr/td[1]/span
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:AT3:AT1:_ATp:t1::db")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:AT3:AT1:_ATp:t1::db")).click();
				
				//apply
				//<button accesskey="l" id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:AT3:applyAddressButton" class="x119 p_AFTextOnly" onclick="this.focus();return false;">App<span class="x11o">l</span>y</button>
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:AT3:applyAddressButton")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:AT3:applyAddressButton")).click();
				
				//ok
				//<button accesskey="K" id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:AT3:ApplyAndDoneButton" class="x119 p_AFTextOnly" onclick="this.focus();return false;">O<span class="x11o">K</span></button>
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:AT3:ApplyAndDoneButton")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:AT3:ApplyAndDoneButton")).click();
				
				TimeUnit.SECONDS .sleep(3);
				//cancel
				//*[@id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:SPc"]/a/span
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:SPc")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:2:AP5:SPc")).click();
				
				
				
				//save and cose
				//*[@id="pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:cb4"]/a/span
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:cb4")));
				driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_procurement_suppliers:0:MAt2:0:ap1:cb4")).click();

				
				//ok
				//<button type="button" id="d1::msgDlg::cancel" class="x119 p_AFTextOnly" onclick="this.focus();return false;" _afrpdo="cancel">OK</button>
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("d1::msgDlg::cancel")));
				driver.findElement(By.id("d1::msgDlg::cancel")).click();
}
	
	public static void main(String[] args) throws Exception {
		Create_Supplier sel= new Create_Supplier();
		sel.Login();
		String end_time = Calendar.getInstance().getTime().toString();
		//System.out.println(Calendar.getInstance().getTime().toString());
		
		System.out.println(end_time);
		
	}
	

}




