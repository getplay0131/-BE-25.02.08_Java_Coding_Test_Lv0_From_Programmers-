package Progress_241231.poly.ex.sender;

public class FaceBookSender implements Sender {
    @Override
    public void msg(String msgs) {
        System.out.println("페이스북에 발송합니다 : " + msgs);
    }
}