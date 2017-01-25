package com.OpenStack;

import org.testng.annotations.Test;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class OpenStackUI {

	public WebDriver testdriver;
	public WebDriverWait wait;
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	public StringConfig conf=new StringConfig();

	@BeforeTest
	public void beforeTestMethod(){

		try {
			DOMConfigurator.configure("log4j.xml");
			Log.info("Automation workflow has started");
			System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
			testdriver=new ChromeDriver();
			wait=new WebDriverWait(testdriver, 50);
			testdriver.manage().window().maximize();
			testdriver.get(conf.url);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_username']"))).sendKeys(conf.username);
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_password']"))).sendKeys(conf.password);
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='loginBtn']"))).click();
			System.out.println("Logged in to OpenStaqck Cloud Forms Web Application");
			//Log.debug("Logged in to OpenStaqck Cloud Forms");
			Log.info("Logged in to OpenStaqck Cloud Forms Web Application");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority=1)
	public void Workflow1() throws Exception{

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sidebar-accordion-identity']/li[1]/a"))).click();
		System.out.println("clicked on Projects");
		//Log.debug("clicked on Projects");
		Log.info("clicked on Projects");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tenants__action_create']"))).click();
		System.out.println("Create Projects");
		//Log.debug("Create Projectss");
		Log.info("Create Projects");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_name']"))).sendKeys(conf.projectname);
		System.out.println("Name Enter");
		//Log.debug("Name Enter");
		Log.info("Name Enter");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_description']"))).sendKeys(conf.projectdescription);
		System.out.println("Description Enter");
		//Log.debug("Description Enter");
		Log.info("Description Enter");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='modal_wrapper']/div/form/div/div/div[3]/input"))).click();
		//Log.debug("clicked on Projects");
		Log.info("clicked on Projects");
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_metadata_items']"))).sendKeys(conf.metadataitems);
		//Log.debug("enter meta");
		Log.info("Set the Meta Value:" + " " + conf.metadataitems);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_cores']"))).sendKeys(conf.cores);
		//Log.debug("enter cores ");
		Log.info("Set the Core Value:" + " " + conf.cores);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_instances']"))).sendKeys(conf.instances);
		//Log.debug("enter instances");
		Log.info("Set the Instance Value:" + " " + conf.instances);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_injected_files']"))).sendKeys(conf.injectedfiles);
		//Log.debug("enter injected files");
		Log.info("Set the no of Injected files:" + " " + conf.injectedfiles);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_injected_file_content_bytes']"))).sendKeys(conf.injectedfilecontentbytes);
		//Log.debug("enter injected files content");
		Log.info("Set the no of Injected file content:" + " " + conf.injectedfilecontentbytes);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_volumes']"))).sendKeys(conf.volumes);
		//Log.debug("enter volumes");
		Log.info("Set the Volume value:" + " " + conf.volumes);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_snapshots']"))).sendKeys(conf.snapshots);
		//Log.debug("enter the snapshots");
		Log.info("Set the Snapshots value:" + " " + conf.snapshots);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_gigabytes']"))).sendKeys(conf.gigabytes);
		//Log.debug("enter the gigabytes");
		Log.info("Set the Snapshots value:" + " " + conf.snapshots);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_ram']"))).sendKeys(conf.ram);
		//Log.debug("Set the Ram Value" + " " + conf.ram);
		Log.info("Set the Ram Value:" + " " + conf.ram);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_floating_ips']"))).sendKeys(conf.floatingips);
		Log.debug("clicked on Projects Link");
		Log.info("clicked on Projects");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_fixed_ips']"))).sendKeys(conf.fixedips);
		Log.debug("clicked on Projects");
		Log.info("clicked on Projects");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_security_groups']"))).sendKeys(conf.securitygroups);
		Log.debug("clicked on Projects");
		Log.info("clicked on Projects");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_security_group_rules']"))).sendKeys(conf.securitygrouprules);
		Log.debug("clicked on Projects");
		Log.info("clicked on Projects");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='modal_wrapper']/div/form/div/div/div[3]/input"))).click();
		Log.debug("clicked on Projects");
		Log.info("clicked on Projects");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sidebar-accordion-identity']/li[2]/a"))).click();
		System.out.println("clicked on Users");
		Log.debug("clicked on Users");
		Log.info("clicked on Users");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='users__action_create']"))).click();
		System.out.println("Create Projects");
		Log.debug("Create Projects");
		Log.info("Create Projects");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_name']"))).sendKeys(conf.createusername);
		Thread.sleep(1000);
		System.out.println("User Name");
		Log.debug("User Name");
		Log.info("User Name");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_description']"))).sendKeys(conf.createuserdescription);
		Thread.sleep(1000);
		System.out.println("User Description");
		Log.debug("User Description");
		Log.info("User Description");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_email']"))).sendKeys(conf.useremail);
		Thread.sleep(1000);
		System.out.println("User Email");
		Log.debug("User Email");
		Log.info("User Email");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_password']"))).sendKeys(conf.userpassword);
		Thread.sleep(1000);
		System.out.println("User Password");
		Log.debug("User Password");
		Log.info("User Password");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_confirm_password']"))).sendKeys(conf.confirmpassword);
		Thread.sleep(1000);
		System.out.println("User Confirm Password");
		Log.debug("User Confirm Password");
		Log.info("User Confirm Password");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='create_user_form']/div[1]/div[2]/div[1]/fieldset/div[8]/div/div/div/button"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Automation')]"))).click();
		Thread.sleep(1000);
		System.out.println("User Select Created Project");
		Log.debug("User Select Created Project");
		Log.info("User Select Created Project");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='create_user_form']/div[1]/div[2]/div[1]/fieldset/div[9]/div/div/button"))).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@data-select-value,'3dc625defff74d7487e71e7339c60a87')]"))).click();
		//System.out.println("User Select Created Project");
		//Log.debug("User Select Created Project");
		//Log.info("User Select Created Project");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='create_user_form']/div[2]/input"))).click();
		System.out.println("User Gets Created");
		Log.debug("User Gets Created");
		Log.info("User Gets Created");
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='navbar-collapse']/ul[2]/li[1]/a/span[1]"))).click();
		System.out.println("Log Out Initiated");
		Log.debug("Log Out Initiated");
		Log.info("Log Out Initiated");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='editor_list']/li[6]/a"))).click();
		Thread.sleep(1000);
		System.out.println("Log Out button Clicked");
		Log.debug("Log Out button Clicked");
		Log.info("Log Out button Clicked");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_username']"))).sendKeys(conf.createusername);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_password']"))).sendKeys(conf.userpassword);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='loginBtn']"))).click();
		System.out.println("Logged in to OpenStaqck Cloud Forms By Created User");
		Log.debug("Logged in to OpenStaqck Cloud Forms By Created Use" + conf.createusername);
		Log.info("Logged in to OpenStaqck Cloud Forms By Created Use" + conf.userpassword);
		Log.info("WorkFlow is Successfully Automated"); 

		//Select project = new Select (wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//select[contains(@id,'id_project')]"))));
		//project.selectByVisibleText("UI Automation");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='create_user_form']/div[1]/div[2]/div[1]/fieldset/div[8]/div/div/div/button"))).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='create_user_form']/div[1]/div[2]/div[1]/fieldset/div[8]/div/div/div/button"))).sendKeys("UI Automation");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='create_user_form']/div[1]/div[2]/div[1]/fieldset/div[8]/div/div/div/button"))).sendKeys(Keys.ENTER);

		/*Thread.sleep(2000);
		Select project = new Select (wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_project']"))));
		project.selectByVisibleText("UI Automation");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='create_user_form']/div[1]/div[2]/div[1]/fieldset/div[9]/div/div/button"))).click();
		Thread.sleep(2000);
		Select role = new Select (wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='id_role_id']"))));
		role.selectByVisibleText("User");*/
		/*Select profile = new Select (wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='fcol1']"))));
		profile.selectByVisibleText("Profile");
		Select contains = new Select (wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='fop1']"))));
		contains.selectByVisibleText("contains");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='fval1']"))).sendKeys("IAM Super User");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='editPage']/div[3]/table/tbody/tr/td[2]/input[1]"))).click();
		System.out.println("User list saved");*/
		//testTable();
	}

}
/*
	@Test(priority=2)
	public void agreement(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='01rb0000000H4Zs_Tab']/a"))).click();
		System.out.println("Clicked Agreement tab");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='hotlist']/table/tbody/tr/td[2]/input"))).click();
		System.out.println("clicked new button");
		Select recordType=new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("p3"))));
		recordType.selectByVisibleText("Agreement [International]");
		System.out.println("International Agreement dropdown");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='bottomButtonRow']/input[1]"))).click();
		System.out.println("continue");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Name"))).sendKeys("Agreement_selenium");
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date date=new Date();
		String date1=sdf.format(date);
		System.out.println(""+date1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("00Nb0000002D2mY"))).sendKeys(date1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("00Nb0000002D2mY"))).submit();
		System.out.println("date done");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("00Nb0000002DH4g"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='bottomButtonRow']/input[1]"))).click();
		System.out.println("Agreement has been created");

	}

	@Test(priority=3)
	public void verifyRelatedList()
	{

		try {
			List<WebElement> list=testdriver.findElements(By.className("listHoverLinks"));
			System.out.println("list size::"+list.size());

			for(int i=0; i<list.size(); i++){

				WebElement relatedList=list.get(i);
				String ab=relatedList.getText();
				System.out.println("relatedList.getText()::"+ab);			
				List<String> arr=new ArrayList<>();
				arr.add("Agreement Key Informations");
				arr.add("Agreement Scopes");
				arr.add("Opportunities");
				arr.add("Implementation Plans");
				arr.add("Related Agreements");
				arr.add("Agreement - Customer Team Members");
				arr.add("Notes & Attachments");
				arr.add("Agreement Addendum");
				arr.add("Agreement Scopes");
				arr.add("Agreement History");
				arr.add("Agreement Scope Exclusions");

				String[] arr=new String[11];
				arr[0]="Agreement Key Informations";
				arr[1]="Agreement Scopes";
				arr[2]="Opportunities";
				arr[3]="Implementation Plans";
				arr[4]="Related Agreements";
				arr[5]="Agreement - Customer Team Members";
				arr[6]="Notes & Attachments";
				arr[7]="Agreement Addendum";
				arr[8]="Agreement Scopes";
				arr[9]="Agreement History";
				arr[10]="Agreement Scope Exclusions";

				for(int j=0; j<arr.size(); j++)	{

					if(ab.contains(arr.get(j))){

						System.out.println("arr[jj]::"+arr.get(j));
						System.out.println("value is present" +j);
					}
					else{
						System.out.println("value is not present");
					}
				}			


			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("dfdf"+e.getMessage());
		}
	}

	@Test(priority=4)
	public void cloneAgreement(){
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='topButtonRow']/input[6]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Name"))).sendKeys("Agreement_selenium1");
			testTakeScreenshot();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='bottomButtonRow']/input[1]"))).click();
			System.out.println("Agreement has been saved");
			testTakeScreenshot();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='topButtonRow']/input[4]"))).click();
			testTakeScreenshot();
			System.out.println("delete clicked for Agreement");
			testdriver.switchTo().alert().accept();
			System.out.println("delete alert ok");
			testTakeScreenshot();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Catch in cloneAgreement::"+e.getMessage());
		}
	}


	@Test(priority=5)
	public void addAgreementScope() {

		String agrName=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='bodyCell']/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a"))).getText();
		try{
			Assert.assertEquals(agrName,"Agreement_selenium");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='bodyCell']/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a"))).click();
			System.out.println("Agreement clicked");
			boolean disp=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("new00Nb0000002CeRm"))).isDisplayed();
			System.out.println("disp::"+disp);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("new00Nb0000002CeRm"))).click();
			System.out.println("button clicked");
			Thread.sleep(3600);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='j_id0:j_id1:AgreementScopePageBlock:j_id95:j_id96_lkwgt']/img"))).click();
		    switchWindow();
		}
		catch(Exception e){
			System.out.println("ee::"+e.getMessage());

		}
	}

	@Test(priority=6)
	public void editAgreement(){

		String agrName=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='bodyCell']/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a"))).getText();
		try{
			Assert.assertEquals(agrName,"Agreement_selenium");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='bodyCell']/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a"))).click();
			//Edit for status change to Applicable
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='topButtonRow']/input[3]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("00Nb0000002DH3h"))).sendKeys("Applicable");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='topButtonRow']/input[1]"))).click();

			//Edit for status change to Applicable - in renewal
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='topButtonRow']/input[3]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("00Nb0000002DH3h"))).sendKeys("Applicable - in renewal");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='topButtonRow']/input[1]"))).click();

			//Edit for status change to Deactivated
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='topButtonRow']/input[3]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("00Nb0000002DH3h"))).sendKeys("Deactivated");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='topButtonRow']/input[1]"))).click();

		}
		catch(Exception e){
			System.out.println("ee::"+e.getMessage());

		}

	}


	public void testTable()
	{
		WebElement simpletable =wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("list")));
		//get all row
		List<WebElement> rows = simpletable.findElements(By.tagName("tr"));
		System.out.println("Row Size"+rows.size());

		for(int j=2; j<rows.size(); j++)
		{
			System.out.println("Loop::"+j);

			try{
				if(testdriver.findElement(By.xpath(".//*[@id='ResetForm']/div[2]/table/tbody/tr[" + j + "]/td[1]/a[2]")).isDisplayed()){
					System.out.println("Login button present");
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ResetForm']/div[2]/table/tbody/tr[" + j + "]/td[1]/a[2]"))).click();
					System.out.println("Logged in Successfully");
					testTakeScreenshot();
					break;
				}
			}
			catch(Exception e){
				System.out.println("Login Link is not found for the Value : " + j);
			}
		}
	}


	public void testTakeScreenshot ()

	{
		Date d = new Date();
		SimpleDateFormat dateFormatter = new SimpleDateFormat("E y-M-d h m s a z");
		//dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
		try {
			File scrFile1=((TakesScreenshot)testdriver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile1, new File ("D:\\Gazal\\SeleniumScreenshots\\Log" + dateFormatter.format(d) + ".png"));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}  

	public void switchWindow() throws InterruptedException

	{

		try {
			String mainwindow=testdriver.getWindowHandle();
			System.out.println("mainwindow handle::"+testdriver.getWindowHandle());
			System.out.println("handles"+testdriver.getWindowHandles());
			for(String winHandle :testdriver.getWindowHandles())
			{
				testdriver.switchTo().window(winHandle);
				String Titlename =testdriver.getTitle();
				System.out.println("title::"+Titlename);

				switch(Titlename)

				{
				case "Salesforce - Unlimited Edition":
					System.out.println("You are in desired window1");
					Titlename = "";
					break;

				case "Search ~ Salesforce - Unlimited Edition":
					System.out.println("You are in desired window2");
					System.out.println (testdriver.getCurrentUrl());				
					WebElement iframeElement = testdriver.findElement(By.id("resultsFrame"));
					testdriver.switchTo().frame(iframeElement);
					testdriver.findElement(By.xpath(".//*[@id='Account_body']/table/tbody/tr[2]/th/a")).isDisplayed();
					testdriver.findElement(By.xpath(".//*[@id='Account_body']/table/tbody/tr[2]/th/a")).click();
					testdriver.switchTo().defaultContent();
					break;
				}

			}
			testdriver.switchTo().window(mainwindow);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='j_id0:j_id1:AgreementScopePageBlock:j_id65:bottom']/input[1]"))).click();

		} catch (Exception e) {
			// TODO Auto-generated catch block


			e.printStackTrace();
		} 
	}

	@AfterTest
	public void quittest()
	{
		testdriver.quit();
		System.out.println("\n@AfterTest - TestDriver Closed");
	}


}

 */