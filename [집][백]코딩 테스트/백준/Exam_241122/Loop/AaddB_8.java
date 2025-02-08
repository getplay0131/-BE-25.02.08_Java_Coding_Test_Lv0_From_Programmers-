package Exam_241122.Loop;

import java.io.*;

public class AaddB_8 {
    public static void main(String[] args)throws IOException {
//    두 정수를 입력받기
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

//        첫째 줄에 테스트 케이스 개수 입력 받기
        int testCase = Integer.parseInt(scan.readLine());
        int [] sumArray = new int[testCase];
        int [] num1 = new int[testCase];
        int [] num2 = new int[testCase];
//        테스트 케이스 개수만큼 반복 받아 입력 받기
        for (int i = 0; i < testCase; i++) {
            String inputNum = scan.readLine();
            String  [] nums = inputNum.split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            num1[i] = a;
            num2[i] = b;
            sumArray[i] = a+b;
            if (i == testCase-1) {
            }
        }
        for (int j = 0; j < testCase; j++) {
            writer.write("Case #" + (j+1) + ": "+ num1[j] + " + " + num2[j] + " = " + sumArray[j]+"\n");
        }

        writer.flush();
        writer.close();
    }
}