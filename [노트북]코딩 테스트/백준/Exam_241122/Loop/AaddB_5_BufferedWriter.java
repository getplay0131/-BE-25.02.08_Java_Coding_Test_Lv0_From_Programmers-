package Exam_241122.Loop;

import java.io.*;

public class AaddB_5_BufferedWriter {
    public static void main(String[] args)throws IOException {
//    버퍼드리더와 라이터 호출
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
//        입력값 확인할 변수 선언
    String str;
//        입력값이 공백이 아닐 때 반복문 수행
 while ((str=scan.readLine()) != null) {

//     변수에 입력받은 값중 첫번째, 세번째 값을 -'0'을 이용해 해당 정수로 변환 후 저장
//     2번째 값은 공백이기에 제외
     int a =str.charAt(0) -'0';
     int b =str.charAt(2) -'0';
//     결과값 출력
//     버퍼드라이터 사용시에는 개행문자를 입력해 줄을 바꿔주어야 한다
     writer.write((a+b)+"\n");
 }
// 버퍼드 라이터 비우기 및 종료
 writer.flush();
 writer.close();
    }
}