package utilities;

import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesUtil {
    public DesiredCapabilities getDesiredCapabilities( String udid, String platformVersion) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("udid", udid);
        desiredCapabilities.setCapability("platformVersion", platformVersion);
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appPackage", "kr.pepper.digitalbank");
        desiredCapabilities.setCapability("appActivity", "kr.pepper.digitalbank.activities.MainActivity");
        desiredCapabilities.setCapability("skipUnlock", "true");
        desiredCapabilities.setCapability("noReset", "false");
        desiredCapabilities.setCapability("unicodeKeyboard", "true");
		desiredCapabilities.setCapability("resetKeyboard", "true");
        return desiredCapabilities;
    }
}
