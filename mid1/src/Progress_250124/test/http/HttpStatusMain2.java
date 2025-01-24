package Progress_250124.test.http;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HttpStatusMain2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("HTTP CODE : ");
        int inputValue = Integer.parseInt(br.readLine());
        HttpStatus2.compareCode(inputValue);
    }
}