@MainView
  Feature: 비회원 간편한도조회
    Scenario: 비회원이 APP을 실행하여 간편 메인 버튼을 누른다
      Given 비회원이 APP 메인 화면까지 진입
      When 한도조회 버튼클릭한다
      When 신용대출 한도조회 버튼을 클릭한다
      When 본인인증을 수행한다
      When 약관에 동의한다
      When 개인정보를 입력한다
      Then 한도를 확인한다
