package Progress_250124.test.ex1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AuthGradeMain2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("당신의 등급을 입력하세요 : [GUEST, LOGIN, ADMIN] : ");
        String inputValue = br.readLine();
        AuthGrade authGrade = AuthGrade.valueOf(inputValue.toUpperCase());
        authGrade.compareGrade(authGrade);
    }

    public static void printArrays(AuthGrade[] grades) {
        for (AuthGrade grade : grades) {
            grade.printInfo(grade);
        }
    }
}