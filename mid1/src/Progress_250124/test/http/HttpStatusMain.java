package Progress_250124.test.http;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Progress_250124.test.http.*;

public class HttpStatusMain {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("HTTP CODE : ");
        int inputValue = Integer.parseInt(br.readLine());
        HttpStatus.compareCode(inputValue);
    }
}