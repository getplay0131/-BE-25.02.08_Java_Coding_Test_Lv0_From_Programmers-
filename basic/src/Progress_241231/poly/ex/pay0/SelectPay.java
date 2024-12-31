package Progress_241231.poly.ex.pay0;

public class SelectPay {
public static PayKinds paySelect(String option){
    if (option != null && option.isEmpty()) {
        System.out.println("올바른 값을 입력해주세요.");
        return new DefaultPayRefactoring();
    }
    if (option.equals("kakao")) {
        return new KakaoPayRefactoring();
    } else if (option.equals("naver")) {
        return new NaverPayRefactoring();
    } else if (option.equals("samsung")) {
        return new SamsungPayRefactoring();
    } else if (option.equals("apple")) {
        return new ApplePayRefactoring();
    } else {
        return new DefaultPayRefactoring();
    }
}
}