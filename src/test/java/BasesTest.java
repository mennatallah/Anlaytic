import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class BasesTest {
    public static void main(String[] args){
        File file = new File("src");
        File fileS = new File(file,"MAH-app-ProductionFlavor-debug-2-7-49.apk");
        DesiredCapabilities cap =new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME ,"091609f08fb51d05" );
        cap.setCapability(MobileCapabilityType.APP,fileS.getAbsolutePath());

    }
}
