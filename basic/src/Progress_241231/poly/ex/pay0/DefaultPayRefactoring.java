package Progress_241231.poly.ex.pay0;

public class DefaultPayRefactoring implements PayKinds {
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 유효하지 않습니다..");
        return false;
    }
}