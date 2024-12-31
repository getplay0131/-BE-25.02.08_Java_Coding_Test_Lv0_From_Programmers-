package Progress_241231.poly.ex.pay0;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayMain2 {
    public static void main (String[] args) throws IOException {
        PayServiceRefactoring payService = new PayServiceRefactoring();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
        System.out.print("결제 수단을 입력하세요: ");
        String option = br.readLine();
            if (option == null && option.isEmpty()) {
                System.out.println("입력값이 유효하지 않습니다.");
                break;
            }
            if (option.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        System.out.print("결제 금액을 입력하세요:");
        int amounts = Integer.parseInt(br.readLine());

        payService.processPay(option,amounts);
        }

    }
}