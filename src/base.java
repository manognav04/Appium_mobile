import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		File f = new File("src");
		File fs = new File(f, "ApiDemos-debug.apk");

		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "firstTry");
		dc.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");
		dc.setCapability(MobileCapabilityType.VERSION, "9.0");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<> (new URL("http://127.0.0.1:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

}
