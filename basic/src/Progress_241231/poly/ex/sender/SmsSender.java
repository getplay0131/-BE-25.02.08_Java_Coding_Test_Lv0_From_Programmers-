package Progress_241231.poly.ex.sender;

public class SmsSender implements Sender {
    @Override
    public void msg(String msgs) {
        System.out.println("SMS를 발송합니다 : " + msgs);
    }
}