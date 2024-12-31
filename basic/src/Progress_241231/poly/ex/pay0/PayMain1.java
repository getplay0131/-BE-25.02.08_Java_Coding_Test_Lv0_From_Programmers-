package Progress_241231.poly.ex.pay0;

public class PayMain1 {
    public static void main (String[] args) {
        PayServiceRefactoring payService = new PayServiceRefactoring();

        //kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);
//naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);
        //samsung 결제
        String payOption3 = "samsung";
        int amount3 = 10000;
        payService.processPay(payOption3, amount3);
//apple 결제
        String payOption4 = "apple";
        int amount4 = 10000;
        payService.processPay(payOption4, amount4);
//잘못된 결제 수단 선택
        String payOption5 = "bad";
        int amount5 = 15000;
        payService.processPay(payOption5, amount5);
    }
}