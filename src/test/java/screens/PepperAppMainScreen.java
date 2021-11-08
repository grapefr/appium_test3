package screens;

import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PepperAppMainScreen extends BaseScreen{

    public PepperAppMainScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    /**메인화면에서의 Element 정리*/
    By spanMenuButtonBy = By.xpath("//*[@id=\"myMain\"]/div[2]/div/div[1]/button");
    By menuBy = By.xpath("//*[@id=\"header\"]/div/div[2]/div/button");
    By qLimitSerchBtnBy = By.xpath("//*[@id=\"qLimitSerchBtn\"]");
    By qLoanBtnBy = By.xpath("//*[@id=\"qLoanBtn\"]");
    By qAccountBtnBy = By.xpath("//*[@id=\"qAccountBtn\"]");

    By qLimitSerchBtnBy_id = By.id("qLimitSerchBtn");
    By qLoanBtnBy_id = By.id("qLoanBtn");
    By qAccountBtnBy_id = By.id("qAccountBtn");

    /**Actions
     * 가운데 Main 버튼 누르기
     * memu 버튼 누르기
     * 한도조회 버튼 누르기
     * 대출신청 버튼 누르기
     * 계좌개설 버튼 누르기
    */
    
    public void changeContext2Web() {
    	changeContextWeb();
    }
    public void changeContext2Natvie() {
    	changeContextNative();
    }

    public void myMain(){
        if (waitAndFindElement(spanMenuButtonBy).isDisplayed()) {
            waitAndFindElement(spanMenuButtonBy).click();
        }
    }

    public void menu(){
        if (waitAndFindElement(menuBy).isDisplayed()) {
            waitAndFindElement(menuBy).click();
        }
    }

        

    public void limitSerch(){
        if (waitAndFindElement(qLimitSerchBtnBy).isDisplayed()) {
            waitAndFindElement(qLimitSerchBtnBy).click();
        }       
    }

    public void loanBtnBy(){
        if (waitAndFindElement(qLoanBtnBy).isDisplayed()) {
            waitAndFindElement(qLoanBtnBy).click();
        }       
    }

    public void accountBtnBy(){
        if (waitAndFindElement(qAccountBtnBy).isDisplayed()) {
            waitAndFindElement(qAccountBtnBy).click();
        }       
    }
    
}
