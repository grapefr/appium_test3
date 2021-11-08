package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class CheckMyself extends BaseScreen{

	public CheckMyself(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
    /**본인인증 화면 Element 정리*/
    By textConfirmBy = By.xpath("//*[@text='확인']");
    By textNextBy = By.xpath("//*[@text='다음']");
    By textAllowBy = By.xpath("//android.widget.Button[@text='허용']");
    
    By idConfirmBy = By.xpath("//*[@id='navCredit']");
    
    By allAgree_CM_031 = By.xpath("//*[@id='allAgree_CM_031']");
    By btnSetAgree = By.xpath("//*[@id='btnSetAgree']");
    By ownrNm = By.xpath("//*[@id='ownrNm']");
    By preRnno = By.xpath("//*[@id='preRnno']");
    By backRnno = By.xpath("//*[@id='backRnno']");
    By carrierTxn = By.id("carrierTxn");
    By frontCpnoTxnById = By.id("frontCpnoTxn");
    By backCpno = By.id("backCpno");
    By pre010 = By.xpath("//*[@id=\"ALERTSHOW\"]/div/div[2]/div/div/div/ul/li[1]/button");
    
    By np0Id = By.id("kr.pepper.digitalbank:id/key_four_lines_np0");
    By np1Id = By.id("kr.pepper.digitalbank:id/key_four_lines_np1");
    By np2Id = By.id("kr.pepper.digitalbank:id/key_four_lines_np2");
    By np3Id = By.id("kr.pepper.digitalbank:id/key_four_lines_np3");
    By np4Id = By.id("kr.pepper.digitalbank:id/key_four_lines_np4");
    By np5Id = By.id("kr.pepper.digitalbank:id/key_four_lines_np5");
    By np6Id = By.id("kr.pepper.digitalbank:id/key_four_lines_np6");
    By np7Id = By.id("kr.pepper.digitalbank:id/key_four_lines_np7");
    By replaceId = By.id("kr.pepper.digitalbank:id/key_four_lines_replace");
    By okId = By.id("kr.pepper.digitalbank:id/key_four_lines_ok");
    
    By skt = By.xpath("//*[@id=\"ALERTSHOW\"]/div/div[2]/div/div/div/ul/li[1]/button']");
    By kt = By.xpath("//*[@id=\"ALERTSHOW\"]/div/div[2]/div/div/div/ul/li[2]/button']");
    By lgu = By.xpath("//*[@id=\"ALERTSHOW\"]/div/div[2]/div/div/div/ul/li[3]/button']");
    By sk_second = By.xpath("//*[@id=\"ALERTSHOW\"]/div/div[2]/div/div/div/ul/li[4]/button']");
    By kt_second = By.xpath("//*[@id=\"ALERTSHOW\"]/div/div[2]/div/div/div/ul/li[5]/button']");
    By lg_second = By.xpath("//*[@id=\"ALERTSHOW\"]/div/div[2]/div/div/div/ul/li[6]/button']");
    
    By skt_text = By.xpath("//*[@text=\"SKT\"]");
    By kt_text = By.xpath("//*[@text=\"KT\"]");
    By lgu_text = By.xpath("//*[@text=\"LGU+\"]");
    
    By btnTkCertiNo = By.xpath("//*[@id=\"btnTkCertiNo\"]");
    By inptCertnNo = By.xpath("//*[@id=\"inptCertnNo\"]");
    By nextBtnMobile = By.xpath("//*[@id=\"nextBtnMobile\"]");

    public void changeContext2Web() {
    	changeContextWeb();
    }
    
    public void changeContext2Natvie() {
    	changeContextNative();
    }
    
    public void check(){
    	
    	Point point;
    	
    	//전체동의
        if (waitAndFindElement(allAgree_CM_031).isDisplayed()) {
            waitAndFindElement(allAgree_CM_031).click();
        }
        //동의 버튼 클릭
        if (waitAndFindElement(btnSetAgree).isDisplayed()) {
            waitAndFindElement(btnSetAgree).click();
        }
        //전체동의 한번 더 클릭
        if (waitAndFindElement(allAgree_CM_031).isDisplayed()) {
            waitAndFindElement(allAgree_CM_031).click();
        }
        //이름입력
        if (waitAndFindElement(ownrNm).isDisplayed()) {
            waitAndFindElement(ownrNm).sendKeys("안성오");
        }
        //주민번호 앞자리
        if (waitAndFindElement(preRnno).isDisplayed()) {
            waitAndFindElement(preRnno).sendKeys("861019");
        }
        //주민번호 뒷자리 키패드 띄우기
        if (waitAndFindElement(backRnno).isDisplayed()) {
        	waitAndFindElement(backRnno).click();
        	waitAndFindElement(backRnno).click();
        }

        // 통신사 선택하기
        if (waitAndFindElement(carrierTxn).isDisplayed()) {
        	waitAndFindElement(carrierTxn).click();
        }	
        if (waitAndFindElement(kt).isDisplayed()) {
        	waitAndFindElement(kt).click();
        }	
        
        // 앞번호 입력하기
        if (waitAndFindElement(frontCpnoTxnById).isDisplayed()) {
        	waitAndFindElement(frontCpnoTxnById).click();

        }
        if (waitAndFindElement(pre010).isDisplayed()) {
        	waitAndFindElement(pre010).click();
        }
        // 뒷번호 입력하기
        if (waitAndFindElement(backCpno).isDisplayed()) {
            waitAndFindElement(backCpno).sendKeys("31588111");
        }
        // Keypad는 Native App 이다
        changeContext2Natvie();
        //주민번호 뒷자리 입력 여기서는 그냥 1 7번 누른다
        if (waitAndFindElement(np0Id).isDisplayed()) {
            TouchAction touchAction = new TouchAction(driver);
            point = waitAndFindElement(np0Id).getLocation();
        	for ( int i =0 ; i < 7 ; i++) {
        		touchAction.tap(PointOption.point(point)).perform();
        	}
        }
        changeContext2Web();
        // 인증번호 받기 클릭
        if (waitAndFindElement(btnTkCertiNo).isDisplayed()) {
            waitAndFindElement(btnTkCertiNo).click();
        }
        // 인증번호 입력하기
        if (waitAndFindElement(inptCertnNo).isDisplayed()) {
            waitAndFindElement(inptCertnNo).sendKeys("12345678");
        }
        // 본인인증 완료 ( 다음 누르기 )
        if (waitAndFindElement(nextBtnMobile).isDisplayed()) {
            waitAndFindElement(nextBtnMobile).click();
        }
    }
}