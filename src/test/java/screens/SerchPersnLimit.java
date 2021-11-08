package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class SerchPersnLimit extends BaseScreen{

	public SerchPersnLimit(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
    /**본인인증 화면 Element 정리*/
    By textConfirmBy = By.xpath("//*[@text='확인']");
    By textNextBy = By.xpath("//*[@text='다음']");
    By textAllowBy = By.xpath("//android.widget.Button[@text='허용']");
	
    By navCreditId = By.id("navCredit");
	By allAgree = By.xpath("//*[@id=\"allAgree\"]");
	By allAgree2 = By.xpath("//*[@id=\"footer\"]/div/div/button");
	By agree = By.xpath("//*[@id=\"agree\"]");
	By btnSave = By.xpath("//*[@id=\"btnSave\"]");
	
	By select_cust = By.xpath("//*[@id=\"select_cust\"]");
	By sallery = By.id("android:id/text1");
	By next = By.xpath("//*[@id=\"btn2\"]");
    
	public void changeContext2Web() {
    	changeContextWeb();
    }
    public void changeContext2Natvie() {
    	changeContextNative();
    }
    
	public void click_navCredit() {
        if (waitAndFindElement(navCreditId).isDisplayed()) {
            waitAndFindElement(navCreditId).click();
        }
	}
	
    public void check_agreement(){
        
    	//약관 동의
    	if (waitAndFindElement(allAgree).isDisplayed()) {
            waitAndFindElement(allAgree).click();
        }
        if (waitAndFindElement(allAgree2).isDisplayed()) {
            waitAndFindElement(allAgree2).click();
        }
        if (waitAndFindElement(allAgree).isDisplayed()) {
            waitAndFindElement(allAgree).click();
        }
        if (waitAndFindElement(agree).isDisplayed()) {
            waitAndFindElement(agree).click();
        }
        if (waitAndFindElement(btnSave).isDisplayed()) {
            waitAndFindElement(btnSave).click();
        }
    }
        public void input_personal(){
        //개인정보 입력
        if (waitAndFindElement(select_cust).isDisplayed()) {
            waitAndFindElement(select_cust).click();
        }
        if (waitAndFindElement(sallery).isDisplayed()) {
            waitAndFindElement(sallery).click();
        }
        if (waitAndFindElement(next).isDisplayed()) {
            waitAndFindElement(next).click();
        }
    }
}