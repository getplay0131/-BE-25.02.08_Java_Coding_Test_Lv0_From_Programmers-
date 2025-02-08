package Exam_241122.Loop;

import java.io.*;

public class AaddB_5_StringBulider {
    public static void main(String[] args)throws IOException {
//    두 정수를 입력받기
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder writer = new StringBuilder();
    String str;
//        테스트 케이스 개수만큼 반복 받아 입력 받기
 while ((str=scan.readLine()) != null) {
     int a =str.charAt(0) - 48;
            int b =str.charAt(2) - 48;
            writer.append(a+b).append("\n");
 }
        System.out.print(writer);
    }
}