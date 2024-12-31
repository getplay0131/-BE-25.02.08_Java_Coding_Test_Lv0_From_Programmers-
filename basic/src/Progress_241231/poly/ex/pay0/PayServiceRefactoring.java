package Progress_241231.poly.ex.pay0;

public class PayServiceRefactoring {
    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        if ((option != null && option.isEmpty()) && amount <= 0) {
            System.out.println("올바른 값을 입력해주세요.");
            return;
        }
        PayKinds pays = SelectPay.paySelect(option);
        boolean result = pays.pay(amount);

        if (result) {
            System.out.println("결제가 성공 했습니다.");
            System.out.println(" ==================== ");
        } else {
            System.out.println("결제가 실패 했습니다.");
            System.out.println(" ==================== ");
        }
    }
}