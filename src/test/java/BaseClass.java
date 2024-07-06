import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	AndroidDriver<MobileElement> driver;
	
	@BeforeMethod
	public void setup() {
		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			URL url = new URL("http://127.0.0.1:4723/");
			
			caps.setCapability("platformName", "ANDROID");	
		    caps.setCapability("platformVersion", "9");
//		    caps.setCapability("deviceName", "emulator-5554");
		    caps.setCapability("udid", "46e79b599905");
		    caps.setCapability("automationName", "UiAutomator2");
		    caps.setCapability("appPackage", "com.example.ccpc");
		    caps.setCapability("appActivity", "com.example.ccpc.MainActivity");
		      
		    driver = new AndroidDriver<MobileElement>(url, caps);
		    System.out.println("Appium client interacting with appium server");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}     
    }
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
