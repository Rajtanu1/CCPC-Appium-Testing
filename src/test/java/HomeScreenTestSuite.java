import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class HomeScreenTestSuite extends BaseClass {

	public void userLogin() throws InterruptedException {
		MobileElement SKIPButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='SKIP']"));
		MobileElement GetStartedButton;
		MobileElement emailField;
		MobileElement passwordField;
		MobileElement LoginButton;

		// Clicking the SKIP button
		SKIPButton.click();
		Thread.sleep(1000);

		// Click on the GetStarted button
		GetStartedButton = driver.findElement(By.xpath("//android.view.View[@content-desc='Get Started ']"));
		GetStartedButton.click();

		// User login with email and password 
		emailField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
		passwordField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
		LoginButton = driver.findElement(By.xpath("(//android.view.View[@content-desc='Login'])[2]"));
		emailField.click();
		emailField.sendKeys("dummy@gmail.com");
		passwordField.click();
		passwordField.sendKeys("dummy6");
		LoginButton.click();
		Thread.sleep(4000);
	}

	@Test(description="A script for testcase with id 'TC_Home-screen_001' for home screen.")
	public void TCHomeScreen001() throws InterruptedException {
        // Performing a user login
		try {
			userLogin();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		MobileElement searchBar;
		MobileElement searchField;
		// Clicking on the search bar
		searchBar = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Search\"]"));
		searchBar.click();

		// Entering a query in the search field
		searchField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText"));
		searchField.sendKeys("Business");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(2000);
		
		MobileElement parentContainerOfSearchResults = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View"));
		String isParentContainerScrollable = parentContainerOfSearchResults.getAttribute("scrollable");
		Assert.assertEquals(isParentContainerScrollable, "true");
	}

	@Test(description="A script for testcase with id 'TC_Home-screen_002' for home screen.")
	public void TCHomeScreen002() throws InterruptedException {
		// Performing a user login 
		try {
			userLogin();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Clicking on business category 
		MobileElement businessCategory = driver.findElement(By.xpath("//android.view.View[@content-desc='Business']"));
		businessCategory.click();
		
		// Verifying if business category is clickable
		String isBusinessCategoryClickable = businessCategory.getAttribute("clickable");
		Assert.assertEquals(isBusinessCategoryClickable, "true");
		Thread.sleep(1000);
	}
	
	@Test(description="A script for testcase with id 'TC_Home-screen_003' for home screen.")
	public void TCHomeScreen003() throws InterruptedException {
		// Performing a user login 
		try {
			userLogin();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		MobileElement[] arrayOfPopularJobs = new MobileElement[4];
		arrayOfPopularJobs[0] = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Backend Engineer\nWmware\nCA\nFresher\nFull-Time\"]"));
		arrayOfPopularJobs[1] = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Cloud Engineer\"]"));
	
		for (MobileElement job : arrayOfPopularJobs) {
			MobileElement descriptionTab;
			
			// Clicking on a listed job in "Popular Jobs" section
			job.click();
			Thread.sleep(2000);
			
            descriptionTab = driver.findElement(By.xpath("//android.view.View[@content-desc='Description\nTab 1 of 3']"));	
		    // Clicking on the description tab of a listed job 
			descriptionTab.click();	
			Thread.sleep(500);
			driver.navigate().back();
			Thread.sleep(2000);
		}	
	}
	
	@Test(description="A script for testcase with id 'TC_Home-screen_004' for home screen.")
	public void TCHomeScreen004() {
		// Performing a user login 
		try {
			userLogin();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Clicking on the job posting to get jod details
		MobileElement digitalMarketingInternCPCCJob = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Digital Marketing\"]"));
		digitalMarketingInternCPCCJob.click();
		
		// Verifying if the job (Digital Marketing Intern CPCC) is clickable
		String isElementClickable = digitalMarketingInternCPCCJob.getAttribute("clickable");
		Assert.assertEquals(isElementClickable, "true");	
	}
	
	@Test(description="A script for testcase with id 'TC_Home-screen_005' for home screen.")
	public void TCHomeScreen005() throws InterruptedException {
		// Performing a user login 
		try {
			userLogin();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 
		MobileElement titleHackathon202202 = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().description(\"202202-Hackathon\"))"));
		MobileElement hackathon202202Image = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[1]"));
	   
		// Clicking on the image to get Hackathon-20220 event details 
		hackathon202202Image.click();	
		Thread.sleep(2000);
	}
	
	@Test(description="A script for testcase with id 'TC_Home-screen_006' for home screen.")
	public void TCHomeScreen006() throws InterruptedException {
		// Performing a user login 
		try {
			userLogin();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		MobileElement titleIndustrialVists = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().description(\"Industrial Vists\"))"));
	    MobileElement IndustrialVistsImage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[2]"));
	   
	    // Clicking on the image to get Industrial Vists details
	    IndustrialVistsImage.click();
	    Thread.sleep(2000);
	}
	
	@Test(description="A script for testcase with id 'TC_Home-screen_007' for home screen.")
	public void TCHomeScreen007() throws InterruptedException {
		// Performing a user login 
		try {
			userLogin();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		MobileElement titleBlogs = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).flingToEnd(1)"));
	    MobileElement seeMore = driver.findElement(By.xpath("//android.view.View[@content-desc=\"See more\"]"));
	    
	    // Clicking on the see more option to open the blogs page
	    seeMore.click();
	    Thread.sleep(1000);
	}
	
	@Test(description="A script for testcase with id 'TC_Home-screen_008' for home screen.")
	public void TCHomeScreen008() throws InterruptedException {
		// Performing a user login 
		try {
			userLogin();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		MobileElement parentContainer = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).className(\"android.widget.ScrollView\")).flingToEnd(1)"));
	    MobileElement placementsImage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[3]"));
	    
	    // Clicking on the see more option to open the blogs page
	    placementsImage.click();
	    Thread.sleep(1000);
	}
}
