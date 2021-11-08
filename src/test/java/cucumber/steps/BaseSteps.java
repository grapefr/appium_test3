package cucumber.steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import screens.*;

public class BaseSteps {
    protected PreAppMainScreen           PreAppMainScreen;
    protected PepperAppMainScreen        PepperAppMainScreen;
    protected BaseScreen        BaseScreen;
    protected CheckMyself        CheckMyself;
    protected SerchPersnLimit        SerchPersnLimit;
    

    public void preset(AndroidDriver<MobileElement> driver) {
        
        // 각 Screen의 객체들을 미리 선언해둔다
        PreAppMainScreen = new PreAppMainScreen(driver);
        PepperAppMainScreen = new PepperAppMainScreen(driver);
        BaseScreen = new BaseScreen(driver);
        CheckMyself = new CheckMyself(driver);
        SerchPersnLimit = new SerchPersnLimit(driver);
    }
}