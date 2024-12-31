package Progress_241231.poly.ex.sender;

public class EmailSender implements Sender {
    @Override
    public void msg(String msgs) {
        System.out.println("메일을 발송합니다 : " + msgs);
    }
}