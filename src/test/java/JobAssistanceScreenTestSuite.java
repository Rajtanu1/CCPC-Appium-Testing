import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class JobAssistanceScreenTestSuite extends BaseClass {
	
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
	
    @Test(description="A script for testcase with id 'TC_Job-assistance-screen_001' for job assistance screen.")
    public void TCJobAssistanceScreen001() {
        // Performing a user login
   		try {
   			userLogin();
   		} catch (InterruptedException e) {
   			e.printStackTrace();
   		}
   		
   		// Clicking on the job assistance icon to navigate to job assistance page
   		MobileElement jobAssistanceIcon = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Job Assistance\nTab 2 of 5\"]"));
   		jobAssistanceIcon.click();
   		
   		// Clicking on the image to get Industrial Events details
   		MobileElement industrialEventsImage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[2]"));
   		industrialEventsImage.click();
    }
    
    @Test(description="A script for testcase with id 'TC_Job-assistance-screen_002' for job assistance screen.")
    public void TCJobAssistanceScreen002() {
        // Performing a user login
   		try {
   			userLogin();
   		} catch (InterruptedException e) {
   			e.printStackTrace();
   		}
  		
   	    // Clicking on the job assistance icon to navigate to job assistance page
   		MobileElement jobAssistanceIcon = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Job Assistance\nTab 2 of 5\"]"));
   		jobAssistanceIcon.click();
   		
   		// Clicking on the 'Register Now' button to register for the 'Curriculum vitae Assistance'
   		MobileElement registerNowButton = driver.findElement(By.xpath("(//android.view.View[@content-desc=\"Register Now\"])[2]"));
   		registerNowButton.click();
   		
   		// Verifying if 'Register Now' button is clickable 
   		String isRegisterNowButtonClickable = registerNowButton.getAttribute("clickable");
   		Assert.assertEquals(isRegisterNowButtonClickable, "true");
    }
    
    @Test(description="A script for testcase with id 'TC_Job-assistance-screen_003' for job assistance screen.")
    public void TCJobAssistanceScreen003() throws InterruptedException{
        // Performing a user login
   		try {
   			userLogin();
   		} catch (InterruptedException e) {
   			e.printStackTrace();
   		}
  		
   	    // Clicking on the job assistance icon to navigate to job assistance page
   		MobileElement jobAssistanceIcon = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Job Assistance\nTab 2 of 5\"]"));
   		jobAssistanceIcon.click();
   		
   		// Clicking on 'Creativity Skills' course in the 'Learn without Limits' section
   		MobileElement parentScrollContainer = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollForward()"));
   		MobileElement creativitySkillsCourse = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.HorizontalScrollView[2]/android.widget.ImageView[1]"));
   		creativitySkillsCourse.click();
   		
   		// Verifying if 'Creativity Skills' course image is clickable 
   		String isCourseImageClickable = creativitySkillsCourse.getAttribute("clickable");
   		Assert.assertEquals(isCourseImageClickable, "true");
    }
    
    @Test(description="A script for testcase with id 'TC_Job-assistance-screen_004' for job assistance screen.")
    public void TCJobAssistanceScreen004() {
    	 // Performing a user login
   		try {
   			userLogin();
   		} catch (InterruptedException e) {
   			e.printStackTrace();
   		}
  		
   	    // Clicking on the job assistance icon to navigate to job assistance page
   		MobileElement jobAssistanceIcon = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Job Assistance\nTab 2 of 5\"]"));
   		jobAssistanceIcon.click();
   		
   		// Clicking on 'Register Now' button for 'Emotional Intelligence' course
   		MobileElement parentScrollContainer = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollForward()"));
   		MobileElement registerNowButton = driver.findElement(By.xpath("(//android.view.View[@content-desc=\"Register Now\"])[3]"));
   		registerNowButton.click();    
   		
    	// Verifying if 'Register Now' button is clickable 
   		String isRegisterNowButtonClickable = registerNowButton.getAttribute("clickable");
   		Assert.assertEquals(isRegisterNowButtonClickable, "true");
    }
}
