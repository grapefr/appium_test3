package cucumber.steps;

import utilities.ThreadLocalDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class JobsDetailsSteps extends BaseSteps {

    @Before
    public void presetup() {
        //각 driver 내 screen 객체들을 미리 생성해둔다
        preset(ThreadLocalDriver.getTLDriver());
    }
    
    @Given("비회원이 APP 메인 화면까지 진입")
    public void launchApp () {
    	
    	//메인화면까지 들어가는 방법은 아래와 같다
        PreAppMainScreen.confirm();
        PreAppMainScreen.allow();
        PreAppMainScreen.allow();
        PreAppMainScreen.next();
        PreAppMainScreen.next();
        PreAppMainScreen.next();
        PreAppMainScreen.ok();
        PreAppMainScreen.ok();

    }
    @When("한도조회 버튼클릭한다")
    public void clickMainButton() throws InterruptedException {

    	PepperAppMainScreen.changeContext2Web();;
    	PepperAppMainScreen.myMain();
    	PepperAppMainScreen.limitSerch();
    	
    }
    @When("신용대출 한도조회 버튼을 클릭한다")
    public void clickPersonalLoan() throws InterruptedException {
    	SerchPersnLimit.click_navCredit();
    }
    @When("본인인증을 수행한다")
    public void checkSelf() {
    	CheckMyself.check();
    }
    @When("약관에 동의한다")
    public void check_agreement() {
    	SerchPersnLimit.check_agreement();
    }
    @When("개인정보를 입력한다")
    public void input_personal() {
    	SerchPersnLimit.input_personal();
    }
    @Then("한도를 확인한다")
    public void read_limit() {
    	System.out.println("여기까지 오기만 해도 굉장히 장하시네요");
    }
}
