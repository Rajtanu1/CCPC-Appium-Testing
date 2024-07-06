import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class UserProfileTestSuite extends BaseClass {
	
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
	
    @Test(description="A script for testcase with id 'TC_User-profile_001' for user profile screen.")
    public void TCUserProfile001() {
    	// Performing a user login
		try {
			userLogin();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Clicking on profile icon to navigate to user profile
		MobileElement profileIcon = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\nTab 5 of 5\"]"));
		profileIcon.click();
		
		MobileElement[] arrayOfProfileOptions = new MobileElement[5];
		arrayOfProfileOptions[0] = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Edit Profile\"]"));
		arrayOfProfileOptions[1] = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Help\"]"));
		arrayOfProfileOptions[2] = driver.findElement(By.xpath("//android.view.View[@content-desc=\"About Us\"]"));
		arrayOfProfileOptions[3] = driver.findElement(By.xpath("//android.view.View[@content-desc=\"FAQ\"]"));
		arrayOfProfileOptions[4] = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Settings\"]"));
		
		for (MobileElement option : arrayOfProfileOptions) {
			String isClickable = option.getAttribute("clickable");
			System.out.println(isClickable);
			Assert.assertEquals(isClickable, "true");
		}
    }
    
    @Test(description="A script for testcase with id 'TC_User-profile_002' for user profile screen.")
    public void TCUserProfile002() throws InterruptedException {
    	// Performing a user login
		try {
			userLogin();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Clicking on profile icon to navigate to user profile
		MobileElement profileIcon = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\nTab 5 of 5\"]"));
		profileIcon.click();
		Thread.sleep(2000);
	
		// Logout out from account
		MobileElement logoutOption = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Log Out\"]"));
		logoutOption.click();
		Thread.sleep(1000);	
    }
}
