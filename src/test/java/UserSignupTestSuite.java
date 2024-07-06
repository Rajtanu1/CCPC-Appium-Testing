import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class UserSignupTestSuite extends BaseClass{
   
	@Test(description="A script for testcase with id 'TC_User-signup_001' for user signup screen.")
	public void TCUserSignup001() throws InterruptedException{
		MobileElement SKIPButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='SKIP']"));
		MobileElement GetStartedButton;
		MobileElement signupOption;
		MobileElement usernameField;
		MobileElement userEmailField;
		MobileElement passwordField;
		MobileElement confirmPasswordField;
		MobileElement termsAndConditionsCheckbox;
		MobileElement signupButton;

		// Clicking the SKIP button
		SKIPButton.click();
		Thread.sleep(1000);

		// Click on the GetStarted button
		GetStartedButton = driver.findElement(By.xpath("//android.view.View[@content-desc='Get Started ']"));
		GetStartedButton.click();
		
		// Click on Sign-up link 
		signupOption = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sign up\"]"));		
		signupOption.click();
		Thread.sleep(2000);
		
		// Creating a new user with required user details 
		usernameField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
		userEmailField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
		passwordField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]"));
		confirmPasswordField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]"));
		termsAndConditionsCheckbox = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.CheckBox"));
		signupButton = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sign up\"]"));
		usernameField.click();
		usernameField.sendKeys("New User");
		userEmailField.click();
		userEmailField.sendKeys("newuser1@gmail.com");//Every time you run this script, provide a new email value in sendKeys method 
		passwordField.click();
		passwordField.sendKeys("userpassword");
		confirmPasswordField.click();
		confirmPasswordField.sendKeys("userpassword");
		termsAndConditionsCheckbox.click();
		signupButton.click();
		Thread.sleep(6000);
	}

	@Test(description="A script for testcase with id 'TC_User-signup_002' for user signup screen.")
	public void TCUserSignup002() throws InterruptedException {
		MobileElement SKIPButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='SKIP']"));
		MobileElement GetStartedButton;
		MobileElement signupOption;
		MobileElement usernameField;
		MobileElement userEmailField;
		MobileElement passwordField;
		MobileElement confirmPasswordField;
		MobileElement termsAndConditionsCheckbox;
		MobileElement signupButton;

		// Clicking the SKIP button
		SKIPButton.click();
		Thread.sleep(1000);

		// Click on the GetStarted button
		GetStartedButton = driver.findElement(By.xpath("//android.view.View[@content-desc='Get Started ']"));
		GetStartedButton.click();
		
		// Click on Sign-up link 
		signupOption = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sign up\"]"));		
		signupOption.click();
		Thread.sleep(2000);
		
		// Creating a new user with a registered email
		usernameField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
		userEmailField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
		passwordField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]"));
		confirmPasswordField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]"));
		termsAndConditionsCheckbox = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.CheckBox"));
		signupButton = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sign up\"]"));
		usernameField.click();
		usernameField.sendKeys("New User");
		userEmailField.click();
		userEmailField.sendKeys("newuser1@gmail.com");
		passwordField.click();
		passwordField.sendKeys("userpassword");
		confirmPasswordField.click();
		confirmPasswordField.sendKeys("userpassword");
		termsAndConditionsCheckbox.click();
		signupButton.click();
		Thread.sleep(3000);
	}
	
	@Test(description="A script for testcase with id 'TC_User-signup_003' for user signup screen.")
	public void TCUserSignup003() throws InterruptedException {
		MobileElement SKIPButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='SKIP']"));
		MobileElement GetStartedButton;
		MobileElement signupOption;
		MobileElement usernameField;
		MobileElement userEmailField;
		MobileElement passwordField;
		MobileElement confirmPasswordField;
		MobileElement termsAndConditionsCheckbox;
		MobileElement signupButton;
		MobileElement searchBar;

		// Clicking the SKIP button
		SKIPButton.click();
		Thread.sleep(1000);

		// Clicking on the GetStarted button
		GetStartedButton = driver.findElement(By.xpath("//android.view.View[@content-desc='Get Started ']"));
		GetStartedButton.click();
		
		// Clicking on Sign-up link 
		signupOption = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sign up\"]"));		
		signupOption.click();
		Thread.sleep(2000);
		
		// Creating a new user without accepting terms & conditions
		usernameField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
		userEmailField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
		passwordField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]"));
		confirmPasswordField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]"));	
		termsAndConditionsCheckbox = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.CheckBox"));
		signupButton = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sign up\"]"));
		usernameField.click();
		usernameField.sendKeys("New User");
		userEmailField.click();
		userEmailField.sendKeys("newuser2@gmail.com");//Every time you run this script, provide a new email value in sendKeys method
		passwordField.click();
		passwordField.sendKeys("newpassword");
		confirmPasswordField.click();
		confirmPasswordField.sendKeys("newpassword");
		signupButton.click();
		Thread.sleep(6000);
		
		//Verifying if searchbar is available
		searchBar = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Search\"]"));
		String isSearchBarDisplayed = searchBar.getAttribute("displayed");
		Assert.assertEquals(isSearchBarDisplayed, "false");
	}
	
	@Test(description="A script for testcase with id 'TC_User-signup_004' for user signup screen.")
	public void TCUserSignup004() throws InterruptedException {
		MobileElement SKIPButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='SKIP']"));
		MobileElement GetStartedButton;
		MobileElement signupOption;
		MobileElement loginOption;

		// Clicking the SKIP button
		SKIPButton.click();
		Thread.sleep(1000);

		// Clicking on the GetStarted button
		GetStartedButton = driver.findElement(By.xpath("//android.view.View[@content-desc='Get Started ']"));
		GetStartedButton.click();
		
		// Clicking on Sign-up link 
		signupOption = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sign up\"]"));		
		signupOption.click();
		Thread.sleep(2000);
		
		// Clicking on Login link
		loginOption = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Login\"]"));
		loginOption.click();
	}
	
	@Test(description="A script for testcase with id 'TC_User-signup_005' for user signup screen.")
	public void TCUserSignup005() throws InterruptedException {
		MobileElement SKIPButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='SKIP']"));
		MobileElement GetStartedButton;
		MobileElement signupOption;
		MobileElement usernameField;
		MobileElement userEmailField;
		MobileElement passwordField;
		MobileElement confirmPasswordField;
		MobileElement signupButton;

		// Clicking the SKIP button
		SKIPButton.click();
		Thread.sleep(1000);

		// Clicking on the GetStarted button
		GetStartedButton = driver.findElement(By.xpath("//android.view.View[@content-desc='Get Started ']"));
		GetStartedButton.click();
		
		// Clicking on Sign-up link 
		signupOption = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sign up\"]"));		
		signupOption.click();
		Thread.sleep(2000);
		
		// Creating a new user with a password less than 6 characters
		usernameField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
		userEmailField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
		passwordField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]"));
		confirmPasswordField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]"));
		signupButton = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sign up\"]"));
		usernameField.click();
		usernameField.sendKeys("New User");
		userEmailField.click();
		userEmailField.sendKeys("newuser2@gmail.com");
		passwordField.click();
		passwordField.sendKeys("pass");
		confirmPasswordField.click();
		confirmPasswordField.sendKeys("pass");
		signupButton.click();
		Thread.sleep(3000);
	}
}
	
