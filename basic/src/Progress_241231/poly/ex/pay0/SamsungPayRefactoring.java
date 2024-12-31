package Progress_241231.poly.ex.pay0;

public class SamsungPayRefactoring implements PayKinds {
    @Override
    public boolean pay(int amount) {
        System.out.println("삼성 페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}