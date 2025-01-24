package Progress_250124.test.ex1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AuthGradeMain3 {
    public static void main(String[] args) throws Exception {
        AuthGrade[] grades = AuthGrade.values();
        StringBuilder gradeOption = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        '%s'가 있는 자리에 printMsgGradeArray 메서드의 반환값이 삽입됩니다
        System.out.printf("당신의 등급을 입력하세요 [%s] : ", printMsgGradeArray(grades, gradeOption));
        String inputValue = br.readLine();
        AuthGrade authGrade = AuthGrade.valueOf(inputValue.toUpperCase());
        authGrade.compareGrade(authGrade);
        br.close();
    }

    public static void printArrays(AuthGrade[] grades) {
        for (AuthGrade grade : grades) {
            grade.printInfo(grade);
        }
    }

    public static String printMsgGradeArray(AuthGrade[] grades, StringBuilder sb) {

        for (AuthGrade grade : grades) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(grade.name());
        }
        return sb.toString();
    }
}