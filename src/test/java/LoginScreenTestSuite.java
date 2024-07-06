import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class LoginScreenTestSuite extends BaseClass {
	
    @Test(description="A script for testcase with id 'TC_User-login_001' for user login screen.")	
	public void TCUserLogin001() throws InterruptedException{
		MobileElement SKIPButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='SKIP']"));
		String validEmail = "dummy@gmail.com";
		String validPassword = "dummy6";
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

		// Login with valid email and password
		emailField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
		passwordField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
		LoginButton = driver.findElement(By.xpath("(//android.view.View[@content-desc='Login'])[2]"));
		emailField.click();
		emailField.sendKeys(validEmail);
		passwordField.click();
		passwordField.sendKeys(validPassword);
		LoginButton.click();
		Thread.sleep(4000);
	}
    
    @Test(description="A script for testcase with id 'TC_User-login_002' for user login screen.")
    public void TCUserLogin002() throws InterruptedException {
    	MobileElement SKIPButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='SKIP']"));
    	String validEmail = "dummy@gmail.com";
		String invalidPassword = "invalid";
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

		// Login with valid email and invalid password 
		emailField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
		passwordField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
		LoginButton = driver.findElement(By.xpath("(//android.view.View[@content-desc='Login'])[2]"));
		emailField.click();
		emailField.sendKeys(validEmail);
		passwordField.click();
		passwordField.sendKeys(invalidPassword);
		LoginButton.click();
		Thread.sleep(4000);
    }
    
    @Test(description="A script for testcase with id 'TC_User-login_003' for user login screen.")
    public void TCUserLogin003() throws InterruptedException {
    	MobileElement SKIPButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='SKIP']"));
    	String invalidEmail = "invalid@gmail.com";
		String validPassword = "dummy6";
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

		// Login with invalid email and valid password 
		emailField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
		passwordField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
		LoginButton = driver.findElement(By.xpath("(//android.view.View[@content-desc='Login'])[2]"));
		emailField.click();
		emailField.sendKeys(invalidEmail);
		passwordField.click();
		passwordField.sendKeys(validPassword);
		LoginButton.click();
		Thread.sleep(3000);
    }
      
    @Test(description="A script for testcase with id 'TC_User-login_004' for user login screen.")
    public void TCUserLogin004() throws InterruptedException {
    	MobileElement SKIPButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='SKIP']"));
    	String validEmail = "dummy@gmail.com";

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

		// Login without password
		emailField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
		passwordField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
		LoginButton = driver.findElement(By.xpath("(//android.view.View[@content-desc='Login'])[2]"));
		emailField.click();
		emailField.sendKeys(validEmail);
		passwordField.click();
		passwordField.sendKeys("");
		LoginButton.click();
		Thread.sleep(3000);
    }
    
    @Test(description="A script for testcase with id 'TC_User-login_005' for user login screen.")
    public void TCUserLogin005() throws InterruptedException {
    	MobileElement SKIPButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='SKIP']"));
		String validPassword = "dummy6";
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

		// Login without email 
		emailField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
		passwordField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
		LoginButton = driver.findElement(By.xpath("(//android.view.View[@content-desc='Login'])[2]"));
		emailField.click();
		emailField.sendKeys("");
		passwordField.click();
		passwordField.sendKeys(validPassword);
		LoginButton.click();
		Thread.sleep(3000);
    }
    
    @Test(description="A script for testcase with id 'TC_User-login_006' for user login screen.")
    public void TCUserLogin006() throws InterruptedException {
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

		// Login without email & password
		emailField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
		passwordField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
		LoginButton = driver.findElement(By.xpath("(//android.view.View[@content-desc='Login'])[2]"));
		emailField.click();
		emailField.sendKeys("");
		passwordField.click();
		passwordField.sendKeys("");
		LoginButton.click();
		Thread.sleep(3000);
    }
    
    @Test(description="A script for testcase with id 'TC_User-login_007' for user login screen.")  
    public void TCUserLogin007() throws InterruptedException {
    	MobileElement SKIPButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='SKIP']"));
    	String validEmail = "dummy@gmail.com";
		String validPassword = "dummy6";
		MobileElement GetStartedButton;
		MobileElement emailField;
		MobileElement passwordField;
		MobileElement eyeIcon;

		// Clicking the SKIP button
		SKIPButton.click();
		Thread.sleep(1000);

		// Click on the GetStarted button
		GetStartedButton = driver.findElement(By.xpath("//android.view.View[@content-desc='Get Started ']"));
		GetStartedButton.click();

		// Entering login details
		eyeIcon = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]/android.widget.Button"));
		emailField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
		passwordField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
		emailField.click();
		emailField.sendKeys(validEmail);
		passwordField.click();
		passwordField.sendKeys(validPassword);
		
		// Toggling password visibility
		eyeIcon.click();
		Thread.sleep(2000);
		eyeIcon.click();
    }
    
    @Test(description="A script for testcase with id 'TC_User-login_008' for user login screen.")
    public void TCUserLogin008() throws InterruptedException {
    	MobileElement SKIPButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='SKIP']"));
		MobileElement GetStartedButton;
		MobileElement forgotPasswordOption;

		// Clicking the SKIP button
		SKIPButton.click();
		Thread.sleep(1000);

		// Click on the GetStarted button
		GetStartedButton = driver.findElement(By.xpath("//android.view.View[@content-desc='Get Started ']"));
		GetStartedButton.click();
		forgotPasswordOption = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Forgot Password\"]"));
		
		// Click on Forgot Password
		forgotPasswordOption.click();		
		Thread.sleep(2000);
    }
    
    @Test(description="A script for testcase with id 'TC_User-login_010' for user login screen.")
    public void TCUserLogin010() throws InterruptedException {
    	MobileElement SKIPButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='SKIP']"));
		MobileElement GetStartedButton;
		MobileElement googleLoginIcon;
		MobileElement gmailAccount;

		// Clicking the SKIP button
		SKIPButton.click();
		Thread.sleep(1000);

		// Click on the GetStarted button
		GetStartedButton = driver.findElement(By.xpath("//android.view.View[@content-desc='Get Started ']"));
		GetStartedButton.click();
		
		// Login using google
		googleLoginIcon = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[2]"));
		googleLoginIcon.click();
		Thread.sleep(4000);
		
		// Selecting the google account to login with
		gmailAccount = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]"));
		gmailAccount.click();
		Thread.sleep(8000);
    }     
}

