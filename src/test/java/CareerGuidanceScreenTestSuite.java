import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class CareerGuidanceScreenTestSuite extends BaseClass {
	
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
	
    @Test(description="A script for testcase with id 'TC_Career-guidance-screen_001' for career guidance screen.")
    public void TCCareerGuidanceScreen001() throws InterruptedException {
    	// Performing a user login
		try {
			userLogin();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Clicking on career guidance icon to navigate to career guidance page 
		MobileElement careerGuidanceIcon = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Career Guidance\nTab 4 of 5\"]"));
        careerGuidanceIcon.click();
        
        // Clicking on "Register Now" button to register for an event in career guidance screen
        MobileElement parentContainer = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")).scrollForward()"));
        MobileElement registerNowButton = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Register Now\"]"));
        registerNowButton.click();
        Thread.sleep(2000);
        
        //Verifying if "Register Now" button is still available on the screen event after registering
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")).scrollForward()"));
        registerNowButton = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Register Now\"]"));
        String isRegisterNowButtonStillDisplayed = registerNowButton.getAttribute("displayed");
        Assert.assertEquals(isRegisterNowButtonStillDisplayed, false);
    }
    
    @Test(description="A script for testcase with id 'TC_Career-guidance-screen_002' for career guidance screen.")
    public void TCCareerGuidanceScreen002() {
    	// Performing a user login
		try {
			userLogin();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Clicking on career guidance icon to navigate to career guidance page 
		MobileElement careerGuidanceIcon = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Career Guidance\nTab 4 of 5\"]"));
        careerGuidanceIcon.click();
        
        // Clicking on "Share" button to share event on supported platforms
        MobileElement parentContainer = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")).scrollForward()"));
        MobileElement shareButton = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Share\"]"));
        shareButton.click();
        
        //Verifying if "Register Now" button is clickable
        String isShareButtonClickable = shareButton.getAttribute("clickable");
        Assert.assertEquals(isShareButtonClickable, true, "'Share' button is clickable, but doesn't perform any operation.");
    }
    
    @Test(description="A script for testcase with id 'TC_Career-guidance-screen_003' for career guidance screen.")
    public void TCCareerGuidanceScreen003() throws InterruptedException{
    	// Performing a user login
		try {
			userLogin();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Clicking on career guidance icon to navigate to career guidance page 
		MobileElement careerGuidanceIcon = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Career Guidance\nTab 4 of 5\"]"));
        careerGuidanceIcon.click();
        
        // Clicking on "View Details" button to get webinar details in Completed Webinars section
        MobileElement parentContainer = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")).flingToEnd(1)")); // Used 'flingToEnd' method on a scrollable element to scroll to the end of the container/bottom of the page
        MobileElement viewDetailsButton = driver.findElement(By.xpath("(//android.view.View[@content-desc=\"View Details\"])[1]"));
        viewDetailsButton.click();
        Thread.sleep(1000);
        
        //Verifying if "View Details" button is clickable
        String isViewDetailsButtonClickable = viewDetailsButton.getAttribute("clickable");
        Assert.assertEquals(isViewDetailsButtonClickable, true);
    }
}
