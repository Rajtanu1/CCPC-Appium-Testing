import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class InternshipScreenTestSuite extends BaseClass{
	
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
		Thread.sleep(3000);
	}
	
	@Test(description="A script for testcases with ids' TC_Internship-screen_001, TC_Internship-screen_002 for internship screen.")
	public void TCInternshipScreen001_002() throws InterruptedException{
		
		/***      
		Note: This script covers both the testcases with ids':
		   - TC_Internship-screen_001
		   - TC_Internship-screen_002
		***/
		
		
	    // Performing a user login
		try {
			userLogin();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Clicking on internship icon to navigate to internship screen
		MobileElement internshipIcon = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Intership\nTab 1 of 5\"]"));
	    internshipIcon.click();
	    
	    List<MobileElement> listOfViewDetailsButtons = driver.findElementsByAccessibilityId("View details");
	    
		for (MobileElement button : listOfViewDetailsButtons) {
			int totalNoOfButtonsBeingDisplayed = 8;
			int totalNoOfButtonsAccessible = listOfViewDetailsButtons.size();
			
			// Clicking on every 'Apply for Internship' button to verify if it's clickable/responsive
			button.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			// Verifying if the total no. of buttons displayed on screen are accessible in the script
			Assert.assertEquals(totalNoOfButtonsAccessible ,totalNoOfButtonsBeingDisplayed);
	    } 
	}
	
	@Test(description="A script for testcases with ids' TC_Internship-screen_003, TC_Internship-screen_004 for internship screen.")
	public void TCInternshipScreen003_004() throws InterruptedException{
		
		/***      
		Note: This script covers both the testcases with ids':
		   - TC_Internship-screen_003
		   - TC_Internship-screen_004
		***/
		
		
		// Performing a user login
   		try {
   			userLogin();
   		} catch (InterruptedException e) {
   			e.printStackTrace();
   		}
	   		
	   	// Clicking on internship icon to navigate to internship screen
	    MobileElement internshipIcon = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Intership\nTab 1 of 5\"]"));
	    internshipIcon.click();
	    
	    List<MobileElement> listOfApplyForInternshipButtons = driver.findElementsByAccessibilityId("Apply for Internship");
	    
		for (MobileElement button : listOfApplyForInternshipButtons) {
			int totalNoOfButtonsBeingDisplayed = 8;
			int totalNoOfButtonsAccessible = listOfApplyForInternshipButtons.size();
			
			// Clicking on every 'Apply for Internship' button to verify if it's clickable/responsive
			button.click();
			Thread.sleep(8000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			// Verifying if the total no. of buttons displayed on screen are accessible in the script
			Assert.assertEquals(totalNoOfButtonsAccessible, totalNoOfButtonsBeingDisplayed);
	    } 
	}
}
