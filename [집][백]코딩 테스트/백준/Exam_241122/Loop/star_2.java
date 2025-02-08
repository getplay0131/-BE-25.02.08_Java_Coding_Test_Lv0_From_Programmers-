package Exam_241122.Loop;

import java.io.*;

public class star_2 {
    public static void main(String[] args) throws IOException {
        //    정수를 입력받기
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int nums = Integer.parseInt(scan.readLine());
        for (int i = 1; i <= nums; i++) {
            for (int k = 0; k < nums-i; k++) {
            System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
                System.out.println();
        }
        writer.flush();
        writer.close();

    }
}