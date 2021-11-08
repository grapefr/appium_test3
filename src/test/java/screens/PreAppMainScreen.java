package screens;

import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PreAppMainScreen extends BaseScreen {
    

    public PreAppMainScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }


    /**메인화면에서의 Element 정리*/
    By textConfirmBy = By.xpath("//*[@text='확인']");
    By textNextBy = By.xpath("//*[@text='다음']");
    By textAllowBy = By.xpath("//android.widget.Button[@text='허용']");

    By idConfirmBy = By.xpath("//*[@id='btnAppGuideOk']");
    
    By ConfirmById = By.id("text_btn_confirm");
    By AllowById = By.id("com.android.packageinstaller:id/permission_allow_button");
    By BtnSplashNextById = By.id("btnSplashNext");
    By BtnSplashOkById = By.id("btnSplashOk");
    By BtnAppGuideOkById = By.id("btnAppGuideOk");
    By BtnAppGuideCloseById = By.id("btnAppGuideClose");

/*  ID Sample
 * kr.pepper.digitalbank:id/text_btn_confirm // 최초 권한 확인 사항 "확인"
 * com.android.packageinstaller:id/permission_allow_button
 * com.android.packageinstaller:id/permission_allow_button
 * btnSplashNext // 다음
 * btnSplashOk // 완료
 * btnAppGuideOk // 확인
 * btnAppGuideClose // 다시 보지 않겠습니다.
    By qLimitSerchBtnBy_id = By.id("qLimitSerchBtn");
    By qLoanBtnBy_id = By.id("qLoanBtn");
    By qAccountBtnBy_id = By.id("qAccountBtn");
*/

    /** Action */
    public void confirm(){
        if (waitAndFindElement(ConfirmById).isDisplayed()) {
            waitAndFindElement(ConfirmById).click();
        }
    }

    public void allow(){
        if (waitAndFindElement(AllowById).isDisplayed()) {
            waitAndFindElement(AllowById).click();
        }
    }
    
    public void next(){
        if (waitAndFindElement(textNextBy).isDisplayed()) {
            waitAndFindElement(textNextBy).click();
        }
    }
    

    public void ok(){
        if (waitAndFindElement(textConfirmBy).isDisplayed()) {
            waitAndFindElement(textConfirmBy).click();
        }
    }
    
    public void complete(){
        if (waitAndFindElement(textConfirmBy).isDisplayed()) {
            waitAndFindElement(textConfirmBy).click();
        }
    }
}


