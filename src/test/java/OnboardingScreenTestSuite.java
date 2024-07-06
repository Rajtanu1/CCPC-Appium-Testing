import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class OnboardingScreenTestSuite extends BaseClass {
	
	  @Test(description="A script for testcase with id 'TC_Onboarding-screen_001' for onboarding screen.")
      public void TCOnboardingScreen001() throws InterruptedException {
    	  MobileElement NEXTButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='NEXT >']"));
    	  
    	  // Clicking the NEXT button twice
    	  NEXTButton.click();
    	  NEXTButton.click();
    	  Thread.sleep(3000);
      }
	  
	  @Test(description="A script for testcase with id 'TC_Onboarding-screen_002' for onboarding screen.")
	  public void TCOnboardingScreen002() throws InterruptedException {
          MobileElement SKIPButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='SKIP']"));
    	  
    	  // Clicking the SKIP button
    	  SKIPButton.click();
    	  Thread.sleep(3000);
	  }
	  
	  @Test(description="A script for testcase with id 'TC_Onboarding-screen_003' for onboarding screen.")
	  public void TCOnboardingScreen003() throws InterruptedException {
		  MobileElement SKIPButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='SKIP']"));
    	  MobileElement GetStartedButton;
    	  
    	  // Clicking the SKIP button
    	  SKIPButton.click();
    	  Thread.sleep(1000);
    	     	  
    	  // Clicking on the GetStarted button
    	  GetStartedButton = driver.findElement(By.xpath("//android.view.View[@content-desc='Get Started ']"));
    	  GetStartedButton.click();
    	  Thread.sleep(3000);
	  }
	  
	  @Test(description="A script for testcase with id 'TC_Onboarding-screen_004' for onboarding screen.")
	  public void TCOnboardingScreen004() throws InterruptedException {
		  MobileElement[] arrayOfDotIndicators = new MobileElement[3];
		  int indexOfDotToBeClicked = 0;
		  arrayOfDotIndicators[0] = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]"));
		  arrayOfDotIndicators[1] = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]"));;
		  arrayOfDotIndicators[2] = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]"));
          
		  for (MobileElement dot : arrayOfDotIndicators) {	
			  
			 if (indexOfDotToBeClicked == 2) {
				//clicking on the first dot
				 arrayOfDotIndicators[0].click();
				 break;
			 } else {
				 indexOfDotToBeClicked++;
				 arrayOfDotIndicators[indexOfDotToBeClicked].click();
			 }
		  }
		  Thread.sleep(3000);
	  }
}
